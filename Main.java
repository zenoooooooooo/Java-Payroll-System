import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    private static void initialize() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Pick a job type: \n\n1. Full Time\n2. Part Time\n\nAnswer: ");

        String jobType = sc.nextLine();
        int duration = 0;
        double rate = 0;
        double income = 0;

        try {
            switch (jobType) {
                case "1":
                    System.out.println("How many days do you work?");
                    duration = sc.nextInt();
                    System.out.println("How much do you earn per day?");
                    rate = sc.nextDouble();
                    FullTime ft = new FullTime(duration, rate);
                    ft.getIncome();
                break;
                case "2":
                    System.out.println("How many days do you work?");
                    duration = sc.nextInt();
                    System.out.println("How much do you earn per day?");
                    rate = sc.nextDouble();
                    PartTime pt = new PartTime(duration, rate);
                    pt.getIncome();
                break;
                default:
                    System.out.println("\nPlease only select numbers 1 or 2\n");
                    initialize();
                break;
            }
        } catch (InputMismatchException ex) {
            System.out.println("Please enter a valid data type");
            initialize();
         }
    }

    public static void main(String[] args) {
        initialize();
    }
}