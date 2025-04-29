import java.util.Random;

public class DiceGame {

    public static void main(String[] args) {
        // Dice roll simulation
        Random dice = new Random();
        int roll1 = dice.nextInt(6) + 1; // Rolls a number between 1 and 6
        int roll2 = dice.nextInt(6) + 1;
        int roll3 = dice.nextInt(6) + 1;
        int total = roll1 + roll2 + roll3;

        // Display dice rolls
        System.out.println("Dice roll: " + roll1 + " + " + roll2 + " + " + roll3);

        // Check for triples
        if (roll1 == roll2 && roll2 == roll3) {
            System.out.println("You rolled triples! +6 bonus to total!");
            total += 6;
        }
        // Check for doubles
        else if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
            System.out.println("You rolled doubles! +2 bonus to total!");
            total += 2;
        }

        // Win or lose check
        if (total >= 15) {
            System.out.println("You win!");
        } else {
            System.out.println("Sorry, you lose.");
        }

        // Subscription expiration check
        int daysUntilExpiration = dice.nextInt(12); // Random number between 0 and 11
        int discountPercentage = 0;

        // Determine discount based on expiration
        if (daysUntilExpiration == 1) {
            discountPercentage = 20;
        }
        if (daysUntilExpiration <= 5) {
            discountPercentage = 10;
        }

        // Subscription expired or close to expiry
        if (daysUntilExpiration < 1) {
            System.out.println("Your subscription has expired!");
        }
        else if (daysUntilExpiration == 1) {
            System.out.println("Your subscription expires within a day!");
            System.out.println("Renew now and save " + discountPercentage + "%!");
        }
        else if (daysUntilExpiration <= 5) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Renew now and save " + discountPercentage + "%!");
        }
        else if (daysUntilExpiration <= 10) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Your subscription will expire soon. Renew now!");
        }
    }
}

