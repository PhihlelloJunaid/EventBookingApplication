package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {
    public static Customer createCustomer(String address, int contactNumber) {
        if (isValidAddress(address) || isValidContactNumber(contactNumber)) {
            return null;
        }


        return new Customer.Builder()
                .setAddress(address.trim())
                .setContactNumber(contactNumber)
                .build();

    }

    private static boolean isValidAddress(String address) {
        return !Helper.isNullOrEmpty(address) && address.length() >= 5 && address.length() < 100 && address.matches(".*[a-zA-Z]+.*]");

    }

    private static boolean isValidContactNumber(int contactNumber) {
        String numStr = String.valueOf(contactNumber);
        return contactNumber >= 0 && numStr.length() == 10 && numStr.matches("[0-9]*");

    }

}
