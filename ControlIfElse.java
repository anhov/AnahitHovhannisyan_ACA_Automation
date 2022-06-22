import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ControlIfElse {

    public static void main(String[] args) throws IOException {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        int number = Integer.parseInt(reader.readLine());

//        if (number < 100) {
//            System.out.println("The number is less than 100");
//        } else if (number == 100){
//            System.out.println("The number is equal to 100");
//        }else {
//            System.out.println("The number is more than 100");
//        }
//    }
        switch (number) {
            case 99:
                System.out.println("number is 99");
                break;
            case 88:
                System.out.println("number is 88");
                break;
            case 77:
                System.out.println("number is 77");
                break;
            case 66:
                System.out.println("number is 66");
                break;
            case 55:
                System.out.println("number is 55");
                break;
            case 44:
                System.out.println("number is 44");
                break;
            case 33:
                System.out.println("number is 33");
                break;
            default:
                if (number < 33 && number > 22){
                    System.out.println("The number is in range 23 - 32");
                } else {
                    System.out.println(number);
                }

        }
    }
}