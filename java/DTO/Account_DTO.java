/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author HP ADMIN
 */
public class Account_DTO {
    private String AccID;
    private String UserName;
    private String Password;
    private String EmployeeID;

    public Account_DTO() {
        
    }

    public String getAccID() {
        return AccID;
    }

    public void setAccID(String AccID) {
        this.AccID = AccID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }
    
    
}
