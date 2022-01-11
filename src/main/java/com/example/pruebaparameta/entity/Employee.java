package com.example.pruebaparameta.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String lastName;

    @Column(name = "type_document")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String typeDocument;

    @Column(name = "num_document")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String numDocument;

    @Column(name = "birthday_date")
    @NotEmpty(message = "El campo no debe estar vacio")
    private Date birthdayDate;

    @Column(name = "date_joining_Company")
    @NotEmpty(message = "El campo no debe estar vacio")
    private Date dateJoiningCompany;

    @Column(name = "job_title")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String jobTitle;

    @Column(name = "salary")
    @NotEmpty(message = "El campo no debe estar vacio")
    private Double salary;

    @Column(insertable = false)
    private String age;

    @Column(insertable = false)
    private String companySeniority;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String typeDocument, String numDocument,
                    Date birthdayDate, Date dateJoiningCompany, String jobTitle,
                    Double salary, String age, String companySeniority) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeDocument = typeDocument;
        this.numDocument = numDocument;
        this.birthdayDate = birthdayDate;
        this.dateJoiningCompany = dateJoiningCompany;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.age = age;
        this.companySeniority = companySeniority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getNumDocument() {
        return numDocument;
    }

    public void setNumDocument(String numDocument) {
        this.numDocument = numDocument;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public Date getDateJoiningCompany() {
        return dateJoiningCompany;
    }

    public void setDateJoiningCompany(Date dateJoiningCompany) {
        this.dateJoiningCompany = dateJoiningCompany;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCompanySeniority() {
        return companySeniority;
    }

    public void setCompanySeniority(String companySeniority) {
        this.companySeniority = companySeniority;
    }
}
