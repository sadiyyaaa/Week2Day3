import java.util.ArrayList;
public class StudentMarksManager {
    public static void main(String[] args) {
        ArrayList<Integer>marks=new ArrayList<Integer>();
        marks.add(96);
        marks.add(58);
        marks.add(32);
        marks.add(61);
        marks.add(85);
        for(int mark:marks){
            System.out.println(mark);
        }
        System.out.println(marks);
        int sum=0;
        for(int mark :marks){
             sum=sum+mark;
        }
            double average=(double)sum/marks.size();
            System.out.println("Average marks: "+average);
        }
    }
    

