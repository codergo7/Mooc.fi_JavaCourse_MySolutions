
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>  strs = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            strs.add(input);
        }
        
        strs.stream().forEach(i -> {
            System.out.println(i);});
                

    }
}
