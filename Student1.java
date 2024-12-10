package Task_4;
import java.lang.Exception;
public class Student1{
    public int roll,age;
    public String name,course;

    public Student1(){ //default constructor

    }
    public Student1(int rno,String n,int ag,String c){ //parameterised constructor
        roll =rno;
        name=n;
        age=ag;
        course=c;
    }
public String toString(){
        return roll+" "+name+" "+age+" "+course ;
}
}

