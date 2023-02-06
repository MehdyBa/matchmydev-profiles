package co.simplon.matchmydev.profiles.dtos;

import java.time.LocalDate;

public class ProfileView {

	private Long id;

	private String firstName;

	private String lastName;

	private String contractType;

	private LocalDate hiringDate;

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

	@Override
	public String toString() {
		return "ProfileView [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", contractType=" + contractType
				+ ", hiringDate=" + hiringDate + "]";
	}
}