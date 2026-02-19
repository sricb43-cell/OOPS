package OOPS.Basic;
// default constructor
class Employees1
{
    // default constructor automatically invoked
    // gives default values for all
    String name; // null
    int id; //0
    // update default constructor
    Employees1()
    {
        this.name ="unknown";
        this.id =-1;
    }
    void details()
    {
        System.out.println("name :"+this.name);
        System.out.println("id :"+this.id);
    }
}
public class g {
    public static void main(String[] args) {
        Employees1 sri =new Employees1();
        sri.details();
    }

}
