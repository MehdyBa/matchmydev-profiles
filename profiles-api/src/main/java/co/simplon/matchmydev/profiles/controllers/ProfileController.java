package co.simplon.matchmydev.profiles.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.matchmydev.profiles.dtos.ProfileDetailView;
import co.simplon.matchmydev.profiles.dtos.ProfileUpdateDto;
import co.simplon.matchmydev.profiles.dtos.ProfileView;
import co.simplon.matchmydev.profiles.services.ProfileService;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    private ProfileService service;

    public ProfileController(ProfileService service) {

	this.service = service;
    }

    @GetMapping
    public Collection<ProfileView> getAll() {

	return service.getAll();
    }

    @GetMapping("/{id}")
    public ProfileDetailView getProfile(@PathVariable("id") Long id) {
	return service.getProfile(id);
    }

    @PatchMapping("/{id}")
    public void update(@ModelAttribute ProfileUpdateDto inputs,
	    @PathVariable("id") Long id) {
	service.update(inputs, id);

	System.out.println(inputs.getAvatar().getOriginalFilename());

    }

}
