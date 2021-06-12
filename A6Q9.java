package assignments;
import java.util.Scanner;

public class A6Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an int");
        int max = input.nextInt();
        System.out.println("Enter another integer");
        int x = input.nextInt();

        System.out.println(maxx(max,x));
        maxx(max,x);
    }
    static int  maxx(int max,int x){
        if (max > x)
        {
            return x;
        }
        else
        {
            return max;
    }}
}
