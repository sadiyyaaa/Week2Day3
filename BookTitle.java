import java.util.LinkedHashSet;
public class BookTitle {
    public static void main(String[] args) {
        LinkedHashSet<String> BT= new LinkedHashSet<>();
        BT.add("The Great Gatsby");
        BT.add("To Kill a Mockingbird");
        BT.add("1984");
        BT.add("The Catcher in the Rye");
        BT.add("The Great Gatsby"); // Duplicate title
        System.out.println("Unique Book Titles: " + BT);
    }
    
}
