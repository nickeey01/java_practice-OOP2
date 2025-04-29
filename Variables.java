public class Variables {
    void showInterest(){
        double amount;
        double interest;
        amount = 1800.00;
        System.out.println("The initial amount is:" +amount);
        interest=4.0;
        amount = amount*(100+interest)/100;
        System.out.println("Amount after 1 year:" +amount);
        amount = amount*(100+interest)/100;
        System.out.println("Amount after 2 years:" +amount);
    }
    public static void main(String[]args) {
        Variables variable = new Variables();
        variable.showInterest();
    }
}
