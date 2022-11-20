package co.simplon.matchmydev.profiles.dtos;

public class ProfileUpdateDto {

    private String avatar;

    private String description;

    public ProfileUpdateDto() {
	// super();
    }

    public String getAvatar() {
	return avatar;
    }

    public void setAvatar(String avatar) {
	this.avatar = avatar;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    @Override
    public String toString() {
	return "{avatar=" + avatar + ", description=" + description + "}";
    }

}