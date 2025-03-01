import java.util.Scanner; 

public class EvenOddChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int getIntegerInput;
        
        System.out.println("Enter an integer:");
        getIntegerInput = input.nextInt();
        
        if (getIntegerInput % 2 == 0) {
            System.out.println(getIntegerInput + " is an Even number");
        } else {
            System.out.println(getIntegerInput + " is an Odd number");
        }
    }
}