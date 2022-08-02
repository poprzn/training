package org.fasttrackit.homework.course3;

import java.util.Date;

public class Professor {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Date dateOfHiring;
    private String emailAddress;
    private boolean isPhd;

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(Date dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isPhd() {
        return isPhd;
    }

    public void setPhd(boolean phd) {
        isPhd = phd;
    }


    }