/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author HP ADMIN
 */
public class ImportDetail_DTO {
    private String ImportID;
    private String ProductID;
    private int Quantity;
    private String Price;
    public ImportDetail_DTO(){
        
    }

    public String getImportID() {
        return ImportID;
    }

    public void setImportID(String ImportID) {
        this.ImportID = ImportID;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }
    
}
