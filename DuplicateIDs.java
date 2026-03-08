import java.util.HashSet;
public class DuplicateIDs {
    public static void main(String[] args) {
        HashSet<String> ids = new HashSet<>();
        ids.add("ID101");
        ids.add("ID102");
        ids.add("ID103");
        ids.add("ID101");// Duplicate ID
        ids.add("ID104");
        ids.add("ID102");// Duplicate ID
System.out.println("Unique IDs: " + ids);
    }
    
}
