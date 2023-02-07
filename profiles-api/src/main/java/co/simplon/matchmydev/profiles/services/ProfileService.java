package co.simplon.matchmydev.profiles.services;

import java.util.Collection;

import co.simplon.matchmydev.profiles.dtos.ProfileView;

public interface ProfileService {

	Collection<ProfileView> getAll();
}
