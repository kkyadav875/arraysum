import java.util.Scanner;

class lb {
public static void main ( String [] args){

public static Integer getValue(Integer minValue, Integer maxValue) {
        Scanner input;
        input = new Scanner(System.in);
        int value;
        while (true) {
			
			
 System.out.println("Please enter a value");
            if(!input.hasNextInt()) {
                System.out.println("That's not a number!");
                input.next(); // this is important!
            }
            value = input.nextInt();
            if ((value >= minValue) && (value <= maxValue)) {
                return value;
            } else {
                System.out.println("Wrong value please provide a valid input");
            }
        }

    }
}
}