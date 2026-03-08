import java.util.LinkedList;
public class RemoveFirstCustomers {
    public static void main(String[] args) {
        LinkedList<String> customers=new LinkedList<>();
        customers.add("harshita");
        customers.add("sadiya");
        customers.add("priya");
        System.out.println("customers before removal: "+customers);
        customers.removeFirst();
        System.out.println("customers after removal: "+customers);

    }
    
}
