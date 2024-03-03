
import org.Location;
import org.json.JSONArray;
import org.json.JSONObject;

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

        JSONArray content = new JSONArray(json);
        JSONObject jsonObject = (JSONObject) content.get(0);
        String lat = jsonObject.getString("lat");
        System.out.println(lat);
        String lon = jsonObject.getString("lon");
        System.out.println(lon);

//        https://api.openweathermap.org/data/2.5/weather?lat=52.229676&lon=21.012229&appid=29a9b093e8a39ce93b7acc545b128a04

        String openWeatherApi = location.getDetails();
        String weatherLink1 = "https://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&units=metric&appid=29a9b093e8a39ce93b7acc545b128a04";
        String json2 = ApiClient.sendHttpRequest(weatherLink1);
        System.out.println(json2);

        JSONObject jsonOpenWeather = new JSONObject(json2);
        JSONObject main = jsonOpenWeather.getJSONObject("main");
        Double temp = main.getDouble("temp");
        System.out.println(temp);
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