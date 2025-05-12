public class MainApplication {
    public static void main(String[] args) {

        Admin curAdmin = new Admin(5678, "Johnson", "xa1@LW42%3");
        User curUser = new User(4455, "Lisa");

        // Perform operations using Update and View classes
        curAdmin.performOperation(new Update()); // Admin updates the data.
        curUser.performOperation(new View());    // User views the data.
    }
}
