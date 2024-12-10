package Task_4;


// stack is used as collection to collect integer
import java.util.Stack;
import java.util.Scanner;
public class Stacksolution {
    public static void main(String[] args) {
        Stack<Integer> value = new Stack();
            Scanner s=new Scanner(System.in);
            int i;
            // push method to add elements to stack
        value.push(i=s.nextInt());
        value.push(i=s.nextInt());
        value.push(i=s.nextInt());
        value.push(i=s.nextInt());
        value.push(i=s.nextInt());
        System.out.println("size of the stack");
        System.out.println(value.size());// gives size after adding the elements
        System.out.println("First element in stack");
        System.out.println(value.peek());// gives first element in stack
        System.out.println("deleting the first element ");
        System.out.println(value.pop());// delete the first element in stack
        System.out.println(value.peek());// after deleteing the element next in stack will be first
        System.out.println("size of the stack");
        System.out.println(value.size());
        if(!value.empty()){ // if loop to check stack is empty or not
            System.out.println("stack is filled");
        }else {
            System.out.println("stack is empty");
        }
    }
}