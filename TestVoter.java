package Task_4;

import java.util.Scanner;
public class TestVoter {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        int vid,age;
        String name;
        System.out.println("enter the voter details");
        System.out.println("enter the voter id: name: age:");
        vid=ss.nextInt();
        name=ss.next();
        age=ss.nextInt();
        Voter v=new Voter(vid,name,age);
        System.out.println(v.toString());
    }
}
