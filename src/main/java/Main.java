
import org.Location;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Location location = new Location();

        Scanner scanner = new Scanner(System.in);
        String country = GeographicData.countryInput(scanner);
        String city = GeographicData.cityInput(scanner);
        String postCode = GeographicData.postCodeInput(scanner);
        String street = GeographicData.streetInput(scanner);

        location.setCountry(country);
        location.setCity(city);
        location.setPostCode(postCode);
        location.setStreet(street);

        GeoCoordinates.setGeoCoordinates(location);
        OpenWeatherApi.openWeatherapi(location);
        AccuWeatherApi.accuWeatherApi(location);

    }

}