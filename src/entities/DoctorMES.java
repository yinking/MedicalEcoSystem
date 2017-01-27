/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author GladysWang
 */
@Entity
@Table(name = "doctorMES")
public class DoctorMES implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "doctors_id")
    private String doctorsId;
    @Column(name = "doctors_first_name")
    private String doctorsFirstName;
    @Column(name = "doctors_last_name")
    private String doctorsLastName;
    @Column(name = "department_id")
    private int departmentId;
    @Column(name = "designation")
    private String designation;
    @Column(name = "blood_group")
    private String bloodGroup;
    @Column(name = "gender")
    private String gender;
    @Column(name = "email")
    private String email;
    @Column(name = "academic_qualification")
    private String academicQualification;
    @Column(name = "specialization")
    private String specialization;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "id_number")
    private String idNumber;
    @Column(name = "registration_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "kra_pin")
    private String kraPin;
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    public DoctorMES() {
    }

    public DoctorMES(String doctorsId) {
        this.doctorsId = doctorsId;
    }

    public DoctorMES(String doctorsId, String doctorsFirstName, String doctorsLastName, int departmentId, String designation, String bloodGroup, String gender, String email, String academicQualification, String specialization, String phoneNumber, String idNumber, Date registrationDate, String city, String state, String nationality, String postalCode, String kraPin, Date dateOfBirth) {
        this.doctorsId = doctorsId;
        this.doctorsFirstName = doctorsFirstName;
        this.doctorsLastName = doctorsLastName;
        this.departmentId = departmentId;
        this.designation = designation;
        this.bloodGroup = bloodGroup;
        this.gender = gender;
        this.email = email;
        this.academicQualification = academicQualification;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
        this.idNumber = idNumber;
        this.registrationDate = registrationDate;
        this.city = city;
        this.state = state;
        this.nationality = nationality;
        this.postalCode = postalCode;
        this.kraPin = kraPin;
        this.dateOfBirth = dateOfBirth;
    }

    public String getDoctorsId() {
        return doctorsId;
    }

    public void setDoctorsId(String doctorsId) {
        this.doctorsId = doctorsId;
    }

    public String getDoctorsFirstName() {
        return doctorsFirstName;
    }

    public void setDoctorsFirstName(String doctorsFirstName) {
        this.doctorsFirstName = doctorsFirstName;
    }

    public String getDoctorsLastName() {
        return doctorsLastName;
    }

    public void setDoctorsLastName(String doctorsLastName) {
        this.doctorsLastName = doctorsLastName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAcademicQualification() {
        return academicQualification;
    }

    public void setAcademicQualification(String academicQualification) {
        this.academicQualification = academicQualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getKraPin() {
        return kraPin;
    }

    public void setKraPin(String kraPin) {
        this.kraPin = kraPin;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    

    @Override
    public String toString() {
        return "entities.DoctorMES[ doctorsId=" + doctorsId + " ]";
    }
    
}
