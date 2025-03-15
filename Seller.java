// Assignment 2
// Exercise 2
// 10 August 2022

public class Seller {
    public String ID;
    public String name;
    public String location;
    public String product;
    public Money unit_price;
    public int number_of_units;

    public Seller(String inpID, String inpname, String inplocation, String inpproduct, Money inpunit_price, int inpnumber_of_units){
        this.ID = inpID;
        this.name = inpname;
        this.location = inplocation;
        this.product = inpproduct;
        this.unit_price = inpunit_price;
        this.number_of_units = inpnumber_of_units;

    }

    public String getID(){
        return this.ID;
    }

    public String getName(){
        return this.name;
    }
    
    public String getLocation(){
        return this.location;
    }
    
    public String getProduct(){
        return this.product;
    }

    public Money getUnitPrice(){
        return this.unit_price;
    }

    public int getNumberOfUnits(){
        return this.number_of_units;
    }

    void compiled(){
        System.out.println("The seller has been successfully created:");
        System.out.println("ID of the seller: " + ID);
        System.out.println("Name of the seller: " + name);
        System.out.println("Location of the seller: " + location);
        System.out.println("The product to sell: " + product);
        System.out.println("Product unit price: " + unit_price);
        System.out.println("The number of available units: " + number_of_units);
    }
}
