package co.simplon.matchmydev.profiles.dtos;

import java.time.LocalDate;

public class ProfileCreateDto {

    private String firstName;

    private String lastName;

    private String email;

    private String identifier;

    private String contractType;

    private LocalDate hiringDate;

    private Boolean techLead;

    private String jobTitle;

    private String avatar;

    private String description;

    public ProfileCreateDto() {
	super();
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getContractType() {
	return contractType;
    }

    public void setContractType(String contractType) {
	this.contractType = contractType;
    }

    public LocalDate getHiringDate() {
	return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
	this.hiringDate = hiringDate;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getIdentifier() {
	return identifier;
    }

    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }

    public Boolean getTechLead() {
	return techLead;
    }

    public void setTechLead(Boolean techLead) {
	this.techLead = techLead;
    }

    public String getJobTitle() {
	return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
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
	return "{firstName=" + firstName + ", lastName=" + lastName + ", email="
		+ email + ", identifier=" + identifier + ", contractType="
		+ contractType + ", hiringDate=" + hiringDate + ", techLead="
		+ techLead + ", jobTitle=" + jobTitle + ", avatar=" + avatar
		+ ", description=" + description + "}";
    }

}
