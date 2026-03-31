class BankAccount{
    private double balance;
      void getBalance(){
        System.out.println("Balance is"+balance);
      }
    void deposit(int amount){
        balance=balance+amount;
        getBalance();
    }
    void withdraw(int amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Amount withdrawn"+amount);
        
        }
        else{
            System.out.println("Balance insufficient");
        }
        getBalance();
        
    }



}

public class bank{
    public static void main(String[]args){
        BankAccount b1=new BankAccount();
        b1.deposit(1000);
        
        b1.withdraw(500);
    
    

    }
}