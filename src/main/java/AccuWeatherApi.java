import org.Location;
import org.json.JSONArray;
import org.json.JSONObject;

public class AccuWeatherApi {

    public static void accuWeatherApi(Location location) throws Exception {

        String accuWeatherGetKey = "http://dataservice.accuweather.com/locations/v1/cities/geoposition/search?q=" + location.getLat() + "," + location.getLon() + "&apikey=miO0A4Mdtm0mp6bTnaeYuCcqzJVhGVvg";
        String httpRequest = ApiClient.sendHttpRequest(accuWeatherGetKey);
        System.out.println(httpRequest);

        JSONObject object = new JSONObject(httpRequest);
        Integer key = object.getInt("Key");
        System.out.println(key);

        String accuWeatherLink = "http://dataservice.accuweather.com/currentconditions/v1/" + key + "?apikey=miO0A4Mdtm0mp6bTnaeYuCcqzJVhGVvg";
        String httpRequest2 = ApiClient.sendHttpRequest(accuWeatherLink);
        System.out.println(httpRequest2);

        JSONArray accuWeatherArray = new JSONArray(httpRequest2);
        JSONObject accuWeatherTemperature = (JSONObject) accuWeatherArray.get(0);
        JSONObject temperature = accuWeatherTemperature.getJSONObject("Temperature");
        JSONObject metric = temperature.getJSONObject("Metric");
        Double value = metric.getDouble("Value");
        System.out.println(value);
    }
}