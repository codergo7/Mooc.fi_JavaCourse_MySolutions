
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter=0;
        int sum=0;
        while(true){
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());
            if (a==0){
                break;
            }
            counter++;
            sum += a;
        }
        System.out.println("Average of the numbers: " + (double)sum/counter);
        

    }
}
