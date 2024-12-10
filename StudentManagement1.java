package Task_4;
import java.lang.Exception;


import java.util.Scanner;
public class StudentManagement1{
    public static int rollno,age;
    public static String name,course;
        public void info(int ro, String n, int a, String cour)  { // mehtod to send the user input to Student class
        rollno = ro;
        name = n;
        age = a;
        course = cour;
        Student1 ss=new Student1(rollno,name,age,course);
            System.out.println(ss.toString());
    }
    public static void main(String[] args) throws AgeException { // age exception is user defined exception
        Scanner s=new Scanner(System.in);
        StudentManagement1 s1=new StudentManagement1();
        System.out.println("enter the student details");
        System.out.println("enter rollno name age course");
        rollno=s.nextInt();

        try {                       // try catch block to check is name contains any special character
            name = s.next();
            if(name.contains("$")|| name.contains("@")|| name.contains("_")||name.contains("%")|| name.contains("!")|| name.contains("&")){
               throw new Exception("Name no valid exception");
            }
            } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {                       // try catch block to check the age range not between 15 to 21
            age = s.nextInt();
            if((age>=15 && age<=21)){
                throw new AgeException("Age not with in range exception");
               }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        course=s.next();
        s1.info(rollno,name,age,course);

    }
}
