
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        
        while(!text.equals("")){

            String[] arrayStr = text.split(" ");
            
            for (int i = 0; i < arrayStr.length; i++) {
                System.out.println(arrayStr[i]);

            }
            text = scanner.nextLine();
        }

    }
}
