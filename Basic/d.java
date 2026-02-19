package OOPS.Basic;
// static keyword in class
class Employees
{
    static String companyName;
    String name;
    int id;
   static void displayCompany()
    {
        System.out.println(Employees.companyName);
    }
    void printDetails()
    {
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(Employees.companyName);
    }
}
public class d {
    public static void main(String[] args) {
        Employees sri = new Employees();
        Employees.companyName ="microhard";
        sri.name ="sri kant";
        sri.id =5;
        Employees.displayCompany();
        sri.printDetails();
    }
}


// static keyword belongs to class not object
//In languages like Java and C++, the static keyword means the member belongs to the class itself, not to individual objects.
//normally:
//Each object has its own copy of instance variables.
//Instance methods require an object to be called.
//With static:
//There is only one copy shared by all objects.
//You can access it without creating an object.
