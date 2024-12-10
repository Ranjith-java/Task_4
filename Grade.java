package Task_4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
// Map is used to get key and value here
public class Grade {
    public static void main(String[] args) {
        Map<String,Integer> student=new LinkedHashMap<>();
        //System.out.println("enter the details of student and grade");
        Scanner s=new Scanner(System.in);
        String na="";
        int i=0;
        System.out.println("enter the name and grade");
        student.put(na=s.next(),i=s.nextInt());// put method to add elements
        student.put(na=s.next(),i=s.nextInt());
        student.put(na=s.next(),i=s.nextInt());
        student.put(na=s.next(),i=s.nextInt());
        System.out.println(student.keySet()); // will display all key entered
        System.out.println(student.values()); // will display all value entered
        System.out.println("enter the name to be deleted");
        student.remove(na=s.next()); // will remove the element based on key
        System.out.println(student.keySet());
        System.out.println(student.values());
        System.out.println("enter any name to get grade");
        System.out.println(student.get(na=s.next())); // will display value based on key
    }
}
