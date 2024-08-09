import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("src/main/resources/sample.json")) {
            // Parse the JSON file
            Object obj = jsonParser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;

            // Get the array of employees
            JSONArray employeeArray = (JSONArray) jsonObject.get("employee");

            // Print the entire content
            System.out.println("Employee Data:");
            for (Object empObj : employeeArray) {
                JSONObject employee = (JSONObject) empObj;
                System.out.println("ID: " + employee.get("id"));
                System.out.println("Name: " + employee.get("name"));
                System.out.println("City: " + employee.get("city"));

                JSONObject address = (JSONObject) employee.get("address");
                System.out.println("Street: " + address.get("street"));
                System.out.println("Postal Code: " + address.get("postalCode"));
                System.out.println("State: " + address.get("state"));

                System.out.println(); // Print an empty line for better readability
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
