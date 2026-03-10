package OOPS.Inheritance;
//Base class Loan
//Subclasses:
//HomeLoan
//CarLoan
//EducationLoan
//Each calculates EMI differently.
class Loan
{
    String name;
    double amount;
    double time;
    double interest;
    double interestAmount;
    boolean add =false;
    Loan(String n,double a,double t)
    {
        this.amount =a;
        this.time =t;
        this.name =n;
    }
    void addInterest()
    {
        if (!add)
        {
            interestAmount =amount*time*interest/100;
            amount =amount+interestAmount;
            add =true;
        }
    }
    double calEmi()
    {
        addInterest();
        return amount/(time*12);
    }
    void details()
    {
        System.out.println("customer name :"+this.name);
        System.out.println("time :"+this.time*12+"months");
        System.out.println("you have to pay :"+calEmi());
    }
}
class EducationLoan extends Loan
{
    EducationLoan(String s,double a,double time)
    {
        super(s,a,time);
        interest =1;
    }
}
class HomeLoan extends Loan
{
    HomeLoan(String s,double a,double time)
    {
        super(s,a,time);
        interest =5;
    }
}
class CarLoan extends Loan
{
    CarLoan(String s,double a,double time)
    {
        super(s,a,time);
        interest =6;
    }
}
public class p8 {
    public static void main(String[] args) {
        Loan sri =new CarLoan("Sri kant kumar",800000,2);
        sri.details();
    }

}

