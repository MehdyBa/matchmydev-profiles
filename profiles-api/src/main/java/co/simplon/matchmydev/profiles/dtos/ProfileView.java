package co.simplon.matchmydev.profiles.dtos;

import java.time.LocalDate;

public class ProfileView {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String identifier;

    private String jobTitle;

    private Boolean techLead;

    private String contractType;

    private LocalDate hiringDate;

    private String avatar;

    private String description;

    public ProfileView() {
	// super();
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
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

    public Boolean getTechLead() {
	return techLead;
    }

    public void setTechLead(Boolean techLead) {
	this.techLead = techLead;
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

    public String getJobTitle() {
	return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
	return "{id=" + id + ", firstName=" + firstName + ", lastName="
		+ lastName + ", email=" + email + ", identifier=" + identifier
		+ ", jobTitle=" + jobTitle + ", techLead=" + techLead
		+ ", contractType=" + contractType + ", hiringDate="
		+ hiringDate + ", avatar=" + avatar + ", description="
		+ description + "}";
    }

}
