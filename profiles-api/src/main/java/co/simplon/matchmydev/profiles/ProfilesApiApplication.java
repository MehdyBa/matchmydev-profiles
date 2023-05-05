package co.simplon.matchmydev.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;

@SpringBootApplication
public class ProfilesApiApplication {

    public static void main(String[] args) {
	SpringApplication.run(ProfilesApiApplication.class, args);
	System.out.println(MediaType.IMAGE_JPEG);
    }

}
