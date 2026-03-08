import java.util.LinkedList;
public class RemoveLastTask {
    public static void main(String[] args) {
        LinkedList<String> tasks=new LinkedList<>();
        tasks.add("Complete Java HomeWork");
        tasks.add("Prepare for Java Exam");
        tasks.add("Go to sleep");
        System.out.println("Tasks before removal: "+tasks);
        tasks.removeLast();
        System.out.println("Tasks after removal: "+tasks);
    }
    
}
