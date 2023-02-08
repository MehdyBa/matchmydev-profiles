package co.simplon.matchmydev.profiles.dtos;

import java.time.LocalDate;

import co.simplon.matchmydev.profiles.entities.ContractType;

public interface ProfileView {
	Long getId();

	String getFirstName();
	// String getProfileFirstName();

	String getLastName();

	ContractType getName();

	LocalDate getHiringDate();
}
