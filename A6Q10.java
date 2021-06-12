package assignments;
import java.util.Scanner;

public class A6Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        isEven(num);
    }
    static int isEven(int num){
        if (num % 2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    return  0;}
}
