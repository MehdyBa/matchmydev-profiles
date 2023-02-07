package co.simplon.matchmydev.profiles.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.matchmydev.profiles.dtos.ProfileView;
import co.simplon.matchmydev.profiles.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Collection<ProfileView> findAllProjectedBy();

}
