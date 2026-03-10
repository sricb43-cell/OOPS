package OOPS.Inheritance;
//Base class FoodItem
//name
//price
//Subclass Pizza
//size
//toppings
//Display order details.
class FoodItem
{
    int balance =0;
    String name;
    int piece;
    FoodItem(String s,int p)
    {
        this.name =s;
        this.piece =p;
    }
    void orderDetails()
    {
        System.out.println("customer name :"+this.name);
        System.out.println("item quantity :"+this.piece);
        System.out.println("you have to pay :"+this.balance);
    }
}
class Pizza extends FoodItem
{
    static int pizza =100;
    int pizzaBill;
    Pizza(String s ,int piece)
    {
        super(s,piece);
        pizzaBill =piece*pizza;
        balance +=pizzaBill;
    }
}
public class p5 {
    public static void main(String[] args) {
        Pizza sri =new Pizza("sri kant",2);
        sri.orderDetails();
        sri.orderDetails();
    }

}
