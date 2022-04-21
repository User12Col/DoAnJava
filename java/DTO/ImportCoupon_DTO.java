/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author HP ADMIN
 */
public class ImportCoupon_DTO {
    private String ImportID;
    private String SupplierID;
    private String ImportDate;
    private String EmployeeID;
    public ImportCoupon_DTO(){
        
    }

    public String getImportID() {
        return ImportID;
    }

    public void setImportID(String ImportID) {
        this.ImportID = ImportID;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getImportDate() {
        return ImportDate;
    }

    public void setImportDate(String ImportDate) {
        this.ImportDate = ImportDate;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }
    
}
