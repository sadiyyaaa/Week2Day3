import java.util.LinkedList;
public class TaskList {
    public static void main(String[] args) {
        LinkedList<String> tasks=new LinkedList<>();
        tasks.add("Complete Java HomeWork");
        tasks.add("Prepare for Java Exam");
        tasks.add("Go to sleep");
        System.out.println("First Task: "+tasks.getFirst());
        System.out.println("Last Task: "+tasks.getLast());
    }
    
}
