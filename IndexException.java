package Task_4;

import java.util.Arrays;
import java.util.Scanner;
public class IndexException {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String[] weekdays={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        System.out.println("enter the day to find position");
        int value=s.nextInt();
        try{
            System.out.println(weekdays[value]);

            }catch(Exception e){
            throw new Exception("please enter the numeric value ranges 0 to 6");

        }
    }
}
