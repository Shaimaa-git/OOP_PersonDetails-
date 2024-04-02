import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name:");
        String first= scanner.nextLine();

        System.out.println("Enter the last name:");
        String last= scanner.nextLine();

        PersonDetails personalDetails = new PersonDetails(first, last);
        System.out.println("The full name is: "+personalDetails.fullName());

        scanner.close();
    }
}