import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.print("Enter a day of the week: ");
        try(Scanner scanner = new Scanner(System.in)) {
            String response = scanner.nextLine().toUpperCase();

            Day day = Day.valueOf(response);



            switch (day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("Weekday");
                case SATURDAY,
                     SUNDAY -> System.out.println("Weekend");

            }


        }
        catch (IllegalArgumentException e){
            System.out.println("Please enter a valid day");
        }

    }
}
