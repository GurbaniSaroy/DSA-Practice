import java.util.HashMap;
// package hashmap;

public class Introduction {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("Canada", 200);
        map.put("USA", 300);
        map.put("Australia", 400);
        map.put("UK", 500);

        System.out.println(map.size());
        System.out.println("printing map" + map);
        System.out.println("Map.get India" + map.get("India"));

        System.out.println("map.containskey USA"+map.containsKey("USA"));
    }
}
