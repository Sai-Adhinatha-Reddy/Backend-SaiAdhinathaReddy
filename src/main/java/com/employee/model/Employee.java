package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    private long id;
    private String employeeName;
    private String emailId;
    private String password;
    private String confirmPassword;
    private String phoneNumber;
    private String role;
 
    public Employee() {
  
    }
 
    public Employee(String employeeName, String emailId, String password, String confirmPassword, String phoneNumber, String role) {
         this.employeeName = employeeName;
         this.emailId = emailId;
         this.password = password;
         this.confirmPassword = confirmPassword;
         this.phoneNumber = phoneNumber;
         this.role = role;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name = "employee_name", nullable = false)
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    @Column(name = "email_address", nullable = false)
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
 
    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name = "confirm_password", nullable = false)
    public String getConfirmPassword() {
        return confirmPassword;
    }
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
    @Column(name = "phone_number", nullable = false)
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Column(name = "role", nullable = false)
    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
    public String toString() {
        return "Employee [id=" + id + ", employeeName=" + employeeName + ", emailId=" + emailId + ", password=" + password + ", confirmPassword=" + confirmPassword
       + ", phoneNumber=" + phoneNumber +", role=" + role +"]";
    }
 
}
