package OOPS.Inheritance;
class animal
{
    static char type ='a';
    String name;
    int noOfLegs;
    animal(String n,int l)
    {
        this.name =n;
        this.noOfLegs =l;
    }
    void eat()
    {
        System.out.println("eating.......");
    }
}
class wild extends animal
{
    int noOfEyes;
    wild(String n,int e,int l)
    {
        super(n,l);
        this.noOfEyes =e;
    }
    void hunt()
    {
        System.out.println("hunting......");
    }
}
public class basic {
    public static void main(String[] args) {
        wild a = new wild("tiger",2,4);
        a.eat();
        System.out.println(a.noOfLegs);
        a.hunt();
    }

}

