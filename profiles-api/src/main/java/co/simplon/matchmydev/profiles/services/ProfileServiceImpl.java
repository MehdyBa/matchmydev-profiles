package co.simplon.matchmydev.profiles.services;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Collection;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import co.simplon.matchmydev.profiles.dtos.ProfileDetailView;
import co.simplon.matchmydev.profiles.dtos.ProfileUpdateDto;
import co.simplon.matchmydev.profiles.dtos.ProfileView;
import co.simplon.matchmydev.profiles.entities.Profile;
import co.simplon.matchmydev.profiles.repositories.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {
    private ProfileRepository profiles;

    @Value("${profiles-api.uploads.location}")
    private String uploadDir;

    public ProfileServiceImpl(ProfileRepository profiles) {
	this.profiles = profiles;
    }

    @Override
    public Collection<ProfileView> getAll() {
	return profiles.findAllProjectedBy();
    }

    @Override
    public ProfileDetailView getProfile(Long id) {
	return profiles.findProjectedById(id);
    }

    @Override
    public void update(ProfileUpdateDto inputs, Long id) {
	Profile entity = profiles.findById(id).get();
	if ((inputs.getAvatar() != null)) {
	    Path oldAvatar = Paths.get(uploadDir, entity.getAvatar());
	    oldAvatar.toFile().delete();
	    MultipartFile file = inputs.getAvatar();
	    String baseName = UUID.randomUUID().toString();
	    String fileName = baseName
		    + inputs.getAvatar().getOriginalFilename();
	    entity.setAvatar(fileName);
	    store(file, fileName);
	}
	entity.setDescription(inputs.getDescription());
	profiles.save(entity);
    }

    private void store(MultipartFile file, String fileName) {
	Path uploadPath = Paths.get(uploadDir);
	Path target = uploadPath.resolve(fileName);
	try (InputStream in = file.getInputStream()) {
	    Files.copy(in, target, StandardCopyOption.REPLACE_EXISTING);
	} catch (IOException ex) {
	    throw new RuntimeException(ex);
	}
    }
}
