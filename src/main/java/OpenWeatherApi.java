import org.Location;
import org.json.JSONObject;

public class OpenWeatherApi {



       public static void openWeatherapi (Location location) throws Exception {
           String openWeatherLink = "https://api.openweathermap.org/data/2.5/weather?lat=" + location.getLat() + "&lon=" + location.getLon() + "&units=metric&appid=29a9b093e8a39ce93b7acc545b128a04";
           String httpRequest = ApiClient.sendHttpRequest(openWeatherLink);
           System.out.println(httpRequest);

           JSONObject jsonOpenWeather = new JSONObject(httpRequest);
           JSONObject main = jsonOpenWeather.getJSONObject("main");
           Double temp = main.getDouble("temp");
           System.out.println(temp);

       }

}
