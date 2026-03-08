import java.util.ArrayList;
public class searchstdname {
    public static void main(String[] args) {
        ArrayList<String> studentnames =new ArrayList <String>();
        studentnames.add("harshita");
        studentnames.add("sadiya");
        studentnames.add("priya");
        studentnames.add("Rahul");
        String search ="Rahul";
        if(studentnames.contains("Rahul")){
            System.out.println("Rahul exits in the list");
        }
    else {
        System.out.println("Rahul does not exist in the list");
    }
    
}
}