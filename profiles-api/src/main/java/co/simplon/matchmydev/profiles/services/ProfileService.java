package co.simplon.matchmydev.profiles.services;

import java.util.Collection;

import co.simplon.matchmydev.profiles.dtos.ProfileDetailView;
import co.simplon.matchmydev.profiles.dtos.ProfileUpdateDto;
import co.simplon.matchmydev.profiles.dtos.ProfileView;

public interface ProfileService {

    ProfileDetailView getProfile(Long id);

    Collection<ProfileView> getAll();

    void update(ProfileUpdateDto inputs, Long id);
}
