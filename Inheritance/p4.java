package OOPS.Inheritance;
// Create base class Account
//accountNumber
//balance
//Subclass SavingsAccount
//interestRate
//Add interest calculation.
class Account
{
    String holderName;
    double balance;
    int accountNo;
    Account(String n,double b,int accountNo)
    {
        this.accountNo =accountNo;
        this.balance =b;
        this.holderName =n;
    }
    void display()
    {
        System.out.println("name :"+this.holderName);
        System.out.println("account no."+this.accountNo);
        System.out.println("balance :"+this.balance);
    }
}
class SavingsAccount extends Account
{
    double interest;
    double interestAmount;
    boolean addInterest =false;
    SavingsAccount(String n,double b,int accountNO,int i)
    {
        super(n,b,accountNO);
        this.interest =i;
    }
    void updateBalance()
    {
        if(!addInterest)
        {
            interestAmount =balance*interest/100;
            balance=balance+interestAmount;
            addInterest =true;
        }
    }
    void display()
    {
        updateBalance();
        super.display();
    }
}
public class p4 {
    public static void main(String[] args) {
        SavingsAccount sk =new SavingsAccount("sri kumar",1000,1,10);
        sk.display();
        sk.display();
    }

}
