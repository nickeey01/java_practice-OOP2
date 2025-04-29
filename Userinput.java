import java.util.*;
public class Userinput {
    Scanner scanner = new Scanner(System.in);

    void showDetails() {
        String name;
        int yob, age;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your year of birth: ");
        yob = scanner.nextInt();
        age = 2025 - yob;

        System.out.println("Hello, " + name + "!");
        System.out.println("Your age is: " + age);
    }

    public static void main (String[] args) {
        Userinput user = new Userinput();
        user.showDetails();
    }
}
