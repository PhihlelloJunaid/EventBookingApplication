package za.ac.cput.util;

public class Helper {
    public static boolean isNullOrEmpty(String str) {

        return str == null || str.isEmpty();
    }

    public static boolean isNullOrZero(Integer num) {
        return num == null || num == 0;

    }
}