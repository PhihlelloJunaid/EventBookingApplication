//PHIHLELLO jUNAID MAROGA
//STUDENT :219354359
//
package za.ac.cput.domain;

public class Customer {
    private String address;
    private int contactNumber;

    public Customer(){

    }
    public Customer (String address , int  contactNumber){
        this.address = address;
        this.contactNumber =contactNumber;
    }
    public String getAddress(){
        return address;
    }
    public int getContactNumber (){
        return contactNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
