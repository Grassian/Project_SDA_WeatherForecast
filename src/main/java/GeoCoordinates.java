import org.Location;
import org.json.JSONArray;
import org.json.JSONObject;

public class GeoCoordinates {


public static void setGeoCoordinates (Location location) throws Exception {
    String getLattitudeAndLongitude = "https://geocode.maps.co/search?q=" + location.getDetails() + "&api_key=65e2f07a7c763292633381fac5b8a44";
    String json = ApiClient.sendHttpRequest(getLattitudeAndLongitude);

    JSONArray content = new JSONArray(json);
    JSONObject jsonObject = (JSONObject) content.get(0);
    String lat = jsonObject.getString("lat");
        System.out.println(lat);
    String lon = jsonObject.getString("lon");
    System.out.println(lon);

    location.setLat(lat);
    location.setLon(lon);

}
}
