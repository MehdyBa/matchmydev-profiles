package co.simplon.matchmydev.profiles.dtos;

public class ProfileUpdateDto {

    private String description;

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    @Override
    public String toString() {
	return "ProfileUpdateDto [description=" + description + "]";
    }

    public ProfileUpdateDto() {
    }

}
