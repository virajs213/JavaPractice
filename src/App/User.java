package App;

import java.util.Scanner;

public class User {
    private String name;
    private int id;
    private Account account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

class Account{
    private String accountNo;
    public double balance;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

interface Transaction{
    void saveUser(User user);
    void depositAmount(double depositAmount) throws InvalidBalance ;
    void withdrawAmount(double withdrawAmount) throws InsufficientBalance;
    void display();
}

class TransactionImpl implements Transaction{
    private User user;
    private double balance;

    @Override
    public void saveUser(User user) {
        this.user = user;
        balance = user.getAccount().getBalance();
        System.out.println("User Saved successfully");
    }

    @Override
    public void depositAmount(double depositAmount) throws InvalidBalance {
        if (depositAmount <= 0) {
            throw new InvalidBalance("Invalid Amount");
        }
        balance += depositAmount;
        System.out.println("Amount after deposit "+balance);
    }

    @Override
    public void withdrawAmount(double withdrawAmount) throws InsufficientBalance {
        if (balance < withdrawAmount){
            throw new InsufficientBalance("Insufficient Balance");
        }
        balance-=withdrawAmount;
        System.out.println("AMount after withraw "+balance);
    }

    @Override
    public void display() {
        System.out.println("-----------------------");
        System.out.println("Name: "+user.getName());
        System.out.println("Id: "+user.getId());
        System.out.println("Account No: "+user.getAccount().getAccountNo());
        System.out.println("Remaining Balance: "+user.getAccount().getBalance());
        System.out.println("-----------------------");
    }
}

class BankOperation{
    public static void main(String[] args) {
        Transaction transaction = new TransactionImpl();
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("Enter id");
        user.setId(sc.nextInt());
        System.out.println("Enter Name");
        user.setName(sc.next());
        System.out.println("Enter account no");
        Account account = new Account();
        account.setAccountNo(sc.next());
        System.out.println("Enter balance");
        account.setBalance(sc.nextDouble());
        user.setAccount(account);
        transaction.saveUser(user);
        transaction.display();

        int ch;
        do {
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your Choice");
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter amount for deposit");
                    try{
                        transaction.depositAmount(sc.nextDouble());
                    }catch (InvalidBalance e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter withdraw amount");
                    try {
                        transaction.withdrawAmount(sc.nextDouble());
                    }catch (InsufficientBalance e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    transaction.display();
                    break;
                default:
                    System.out.println("Exit");
            }
        }while (ch<4);


    }
}
