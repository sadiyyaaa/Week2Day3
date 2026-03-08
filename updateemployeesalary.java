import java.util.ArrayList;
public class updateemployeesalary {
    public static void main(String[] args) {
       ArrayList<Integer> salaries=new ArrayList<>();
       salaries.add(20000);
       salaries.add(30000);
       salaries.add(40000);
       salaries.add(50000);
       System.out.println("salaries before update: "+salaries);
       salaries.set(2, 45000);
         System.out.println("salaries after update: "+salaries);
    }
    
}
