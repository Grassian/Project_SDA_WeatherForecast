
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        countryInput(scanner);
        cityInput(scanner);
        postCodeInput(scanner);
        streetInput(scanner);




    }


    private static void countryInput(Scanner scanner) {
        System.out.println("Please provide the name of the country: ");
        String country = scanner.next();
    }

    public static void cityInput(Scanner scanner) {
        System.out.println("Please provide the name of the city: ");
        String city = scanner.next();
    }

    public static void postCodeInput(Scanner scanner) {
        System.out.println("Please provide the post code: ");
        String postCode = scanner.next();
    }

    public static void streetInput(Scanner scanner) {
        System.out.println("Please provide the street name: ");
        String street = scanner.next();


    }
}