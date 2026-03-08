import java.util.ArrayList;
public class removeOrder {
    public static void main(String[] args) {
        ArrayList<String>orders=new ArrayList<String>();
        orders.add("101");
          orders.add("102");
            orders.add("103");
              orders.add("104");
                orders.add("105");
                System.out.println("Orders before removal: "+orders);
                orders.remove("103");
                System.out.println("Orders after removal: "+orders);
    }
    
}
