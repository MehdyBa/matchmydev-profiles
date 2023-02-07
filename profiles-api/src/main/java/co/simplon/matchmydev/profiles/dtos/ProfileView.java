package co.simplon.matchmydev.profiles.dtos;

import java.time.LocalDate;

public interface ProfileView {

	Long getId();

	String getFirstName();

	String getLastName();

	String getContractType();

	LocalDate getHiringDate();

}
