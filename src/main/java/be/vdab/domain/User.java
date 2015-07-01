package be.vdab.domain;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String birthDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String email;

    @Enumerated(EnumType.STRING)
    private ServiceLevel serviceLevel;

    private String phoneNumber;

    private String accountNumber;
    /**
     * Used by JPA.
     */
    public User() {
    }

    public User(String accountNumber, String birthDate, String email, String firstName, Gender gender, String lastName, String phoneNumber, ServiceLevel serviceLevel) {
        this.accountNumber = accountNumber;
        this.birthDate = birthDate;
        this.email = email;
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.serviceLevel = serviceLevel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }
}
