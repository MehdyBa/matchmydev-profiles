package co.simplon.matchmydev.profiles.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.matchmydev.profiles.dtos.ProfileView;

@RestController
@RequestMapping("/profiles")
@CrossOrigin
public class ProfileController {

	@GetMapping
	public Collection<ProfileView> getAll() {

		Collection<ProfileView> views = new ArrayList<>();

		ProfileView firstView = new ProfileView();
		firstView.setId(1L);
		firstView.setFirstName("Massi");
		firstView.setLastName("The King");
		firstView.setContractType("Intern");
		LocalDate hiringDate = LocalDate.now();
		firstView.setHiringDate(hiringDate);
		views.add(firstView);

		return views;
	}

}
