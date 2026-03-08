import java.util.HashSet;
public class uniquecity {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Bengaluru");
        cities.add("Hyderabad");
        cities.add("Gadag");
        cities.add("Pune"); // Duplicate city
        cities.add("Gadag");
        cities.add("Mysore"); // Duplicate city
        System.out.println("Unique Cities: " + cities);
    }
    
}
