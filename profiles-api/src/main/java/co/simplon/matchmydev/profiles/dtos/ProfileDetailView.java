package co.simplon.matchmydev.profiles.dtos;

import java.time.LocalDate;

public interface ProfileDetailView {
    Long getId();

    String getFirstName();

    String getLastName();

    String getEmail();

    String getIdentifier();

    String getAvatar();

    String getDescription();

    String getJobTitle();

    String getContractTypeName();

    LocalDate getHiringDate();

}
