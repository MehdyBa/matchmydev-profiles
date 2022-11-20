package co.simplon.matchmydev.profiles.database;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import co.simplon.matchmydev.profiles.entities.Profile;

public class DataBase {

    private static Long profileId = 0L;

    private static final Map<Long, Profile> PROFILES = new HashMap<>();

    public static void saveProfile(Profile profile) {
	profileId++;
	profile.setId(profileId);
	PROFILES.put(profileId, profile);
    }

    public static Profile findOne(Long profileId) {
	return PROFILES.get(profileId);
    }

    public static void updateProfile(Profile profile) {
	profileId = profile.getId();
	PROFILES.put(profileId, profile);
    }

    public static Collection<Profile> findAll() {
	return PROFILES.values();
    }

}
