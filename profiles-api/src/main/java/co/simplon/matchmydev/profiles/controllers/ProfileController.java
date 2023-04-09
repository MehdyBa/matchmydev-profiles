package co.simplon.matchmydev.profiles.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
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

    @GetMapping("/my")
    public ProfileDetailView getProfile() {
	return service.getProfile(1L);
    }

    @PatchMapping("/my")
    public void update(@ModelAttribute ProfileUpdateDto inputs) {
	service.update(inputs, 1L);
	System.out.println("Avatar envoyé en input : " + inputs.getAvatar());
	System.out.println(
		"description envoyée en input : " + inputs.getDescription());

    }

}
