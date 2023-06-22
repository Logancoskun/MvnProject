package Practice;

import org.json.JSONObject;

public class parseJson {
    public static void main(String[] args) {

        // Parse JSON data
        String jsonData = "{name: John Doe, age: 30, email: johndoe@example.com, address: 301 Tall}";
        JSONObject jsonObject = new JSONObject(jsonData);
        String name = jsonObject.getString("name");
        int age = jsonObject.getInt("age");
        String email = jsonObject.getString("email");
        String address = jsonObject.getString("address");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);

    }
}


