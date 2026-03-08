import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CompareSetSizes {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        int numbers[] = {10, 20, 30, 20, 40, 10};

        for(int num : numbers) {
            hashSet.add(num);
            linkedHashSet.add(num);
            treeSet.add(num);
        }

        System.out.println("HashSet: " + hashSet);
        System.out.println("Size of HashSet: " + hashSet.size());

        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        System.out.println("TreeSet: " + treeSet);
        System.out.println("Size of TreeSet: " + treeSet.size());
    }
}