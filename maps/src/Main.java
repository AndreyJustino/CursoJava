import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("username", "andrey");
        map.put("email", "andrey@mail.com");
        map.put("senha", "senha123");

        for (String keys: map.keySet()){
            System.out.println(keys + " : " + map.get(keys));
        }

        System.out.println("--------------------------------------------------------");

        map.remove("email");
        map.put("senha", "12345");

        for (String keys : map.keySet()){
            System.out.println(keys + " : " + map.get(keys));
        }

        System.out.println("--------------------------------------------------------");

        System.out.println("Contains 'senha' key: " + map.containsKey("senha"));
        System.out.println("Contains '12345' value: " + map.containsValue("12345"));
    }
}