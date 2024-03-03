import org.Location;
import org.json.JSONObject;

public class OpenWeatherApi {



       public static void openWeatherapi (Location location) throws Exception {
           String openWeatherLink = "https://api.openweathermap.org/data/2.5/weather?lat=" + location.getLat() + "&lon=" + location.getLon() + "&units=metric&appid=29a9b093e8a39ce93b7acc545b128a04";
           String httpRequest = ApiClient.sendHttpRequest(openWeatherLink);
           System.out.println(httpRequest);

           JSONObject jsonOpenWeather = new JSONObject(httpRequest);
           JSONObject main = jsonOpenWeather.getJSONObject("main");
           JSONObject wind = jsonOpenWeather.getJSONObject("wind");
           Double temp = main.getDouble("temp");
           Integer humidity = main.getInt("humidity");
           Integer pressure = main.getInt("pressure");
           Double windspeed = wind.getDouble("speed");
           System.out.println("Temperature from OpenWeather states it is: " + temp);
           System.out.println("Humidity from OpenWeather states it is: " + humidity);
           System.out.println("Air pressure from OpenWeather states it is: " + pressure);
           System.out.println("Wind speed from OpenWeather states it is: " + windspeed);

       }

}
