package co.simplon.matchmydev.profiles.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.matchmydev.profiles.database.DataBase;
import co.simplon.matchmydev.profiles.dtos.ProfileCreateDto;
import co.simplon.matchmydev.profiles.dtos.ProfileUpdateDto;
import co.simplon.matchmydev.profiles.dtos.ProfileView;
import co.simplon.matchmydev.profiles.entities.Profile;

@RestController
@RequestMapping("/profiles")
@CrossOrigin
public class ProfileController {

	@PostMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void create(@RequestBody ProfileCreateDto inputs) {
		Profile profile = new Profile();
		profile.setFirstName(inputs.getFirstName());
		profile.setLastName(inputs.getLastName());
		profile.setContractType(inputs.getContractType());
		profile.setHiringDate(inputs.getHiringDate());
		DataBase.saveProfile(profile);
		System.out.println(profile);
	}

	@PatchMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@RequestBody ProfileUpdateDto inputs,
			@PathVariable("id") Long id) {
		Profile profile = DataBase.findOne(id);
		profile.getFirstName();
		profile.getLastName();
		profile.getContractType();
		profile.getHiringDate();
		profile.setAvatar(inputs.getAvatar());
		profile.setDescription(inputs.getDescription());
		DataBase.updateProfile(profile);
		System.out.println(profile);

	}

	@GetMapping
	public Collection<ProfileView> getAll() {
		Collection<Profile> profiles = DataBase.findAll();
		Collection<ProfileView> views = new ArrayList<>();
		for (Profile profile : profiles) {
			ProfileView view = buildProfileView(profile);
			views.add(view);
		}
		return views;
	}

	private static ProfileView buildProfileView(Profile profile) {
		ProfileView view = new ProfileView();
		view.setId(profile.getId());
		view.setFirstName(profile.getFirstName());
		view.setLastName(profile.getLastName());
		view.setContractType(profile.getContractType());
		view.setHiringDate(profile.getHiringDate());
		view.setAvatar(profile.getAvatar());
		view.setDescription(profile.getDescription());
		return view;
	}

}
