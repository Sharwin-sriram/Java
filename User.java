import java.util.Scanner;


interface BankDetails {
    public float setDeposit();
    public float getBalance();
    public void getDisplay();
    public float setWithdraw();
}

abstract class Bank implements BankDetails{
    final private String Name;
    final private String Accnum;
    private float balance = 0;

    public Bank(String Name, String Accnum, float balance) {
        this.Name = Name;
        this.Accnum = Accnum;
        this.balance = balance;
    }

    float setDeposit(float amount) {
        return balance += amount;
    }

    @Override
    public float getBalance() {
        return balance;
    }

    public float setWithdraw(float amount) {
        if (amount > balance) {
            return balance;
        } else {
            float remaining = balance -= amount;
            System.out.println("Amount has been withdrew sucessfully");
            return remaining;
        }
    }

    @Override
    public void getDisplay() {
        System.out.println("Owner Name: " + Name);
        System.out.println("Account Number: " + Accnum);
        System.out.println("Balance: " + balance);
    }
}

public class User extends Bank {
    public User(String nam,String Acc,float bal){
        super(nam, Acc, bal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create a user!!");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your account number: ");
        String AccNum = (String) sc.nextLine();
        float balance = 0;
        System.out.println("Initial Balance :" + balance);
        Bank user = new User(name, AccNum, balance);
        while (true) {
            System.out.println("\nWhat would you like to do");
            System.out.println("1. Deposit");
            System.out.println("2. View Balance");
            System.out.println("3. Withdraw");
            System.out.println("4. View Details");
            System.out.print("\nYour Option :");
            try {
                int input = sc.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.print("Enter the Amount to deposit :");
                    float DepositAmount = sc.nextFloat();
                    float Amount = user.setDeposit(DepositAmount);
                    System.out.println("Amount of " + Amount + " is Deposited");
                }
                case 2 -> {
                    System.out.print("Balance :");
                    float a = user.getBalance();
                    System.out.println(a);
                }
                case 3 -> {
                    System.out.print("Enter an amount to Withdraw");
                    float withdraw = sc.nextFloat();
                    user.setWithdraw(withdraw);
                }
                case 4 -> {
                    System.out.println("\nAccount Details : \n");
                    user.getDisplay();
                }
                default -> throw new AssertionError();
            }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        
    }
    @Override
    public float setDeposit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDeposit'");
    }
    @Override
    public float setWithdraw() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setWithdraw'");
    }
}