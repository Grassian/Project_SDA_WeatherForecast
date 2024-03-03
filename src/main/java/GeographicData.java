import java.util.Scanner;

public class GeographicData {
    public static String countryInput(Scanner scanner) {
        System.out.println("Please provide the name of the country: ");
        return scanner.next();
    }

    public static String cityInput(Scanner scanner) {
        System.out.println("Please provide the name of the city: ");
        return scanner.next();
    }

    public static String postCodeInput(Scanner scanner) {
        System.out.println("Please provide the post code: ");
        return scanner.next();
    }

    public static String streetInput(Scanner scanner) {
        System.out.println("Please provide the street name: ");
        return scanner.next();
    }

}
