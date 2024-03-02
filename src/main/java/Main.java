
import org.Location;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Location location = new Location();

        Scanner scanner = new Scanner(System.in);
        String country = countryInput(scanner);
        String city = cityInput(scanner);
        String postCode = postCodeInput(scanner);
        String street = streetInput(scanner);

        location.setCountry(country);
        location.setCity(city);
        location.setPostCode(postCode);
        location.setStreet(street);

        String details = location.getDetails();
        String link = "https://geocode.maps.co/search?q="+ details + "&api_key=65e2f07a7c763292633381fac5b8a44";
        String json = ApiClient.sendHttpRequest(link);
        System.out.println(json);


    }


    private static String countryInput(Scanner scanner) {
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