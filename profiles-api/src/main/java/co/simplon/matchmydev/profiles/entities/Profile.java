package co.simplon.matchmydev.profiles.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "profiles")
public class Profile extends AbstractEntity {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "identifier")
	private String identifier;

	@Column(name = "tech_lead")
	private Boolean techLead;

	@JoinColumn(name = "contract_id")
	@ManyToOne
	private ContractType contractType;

	@Column(name = "hiring_date")
	private LocalDate hiringDate;

	@Column(name = "avatar")
	private String avatar;

	@Column(name = "description")
	private String description;

	@Column(name = "job_title")
	private String jobTitle;

	public Profile() {
		// super();
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

	public ContractType getContractType() {
		return contractType;
	}

	public void setContractType(ContractType contractType) {
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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Profile [firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", identifier=" + identifier
				+ ", techLead=" + techLead + ", contractType=" + contractType
				+ ", hiringDate=" + hiringDate + ", avatar=" + avatar
				+ ", description=" + description + ", jobTitle=" + jobTitle
				+ "]";
	}

}
