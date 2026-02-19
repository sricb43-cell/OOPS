package OOPS.Basic;
// copy constructor
class man{
    String name;
    int age;
    man(String s,int age)
    {
        this.name =s;
        this.age =age;
    }
    void details()
    {
        System.out.println("name :"+this.name);
        System.out.println("age :"+this.age);
    }
    //copy constructor
    man(man s)
    {
        this.name =s.name;
        this.age =s.age;
    }
}
public class h {
    public static void main(String[] args) {
        man sri =new man("sri kant kumar",18);
        man sk =new man("s kumar",14);
        man s =new man(sri);
        sri.details();
        sk.details();
        s.details(); // copies all data type of sri object
    }

}
//note:
// A copy constructor copies values, it does NOT link the objects together.
//After copying, both objects are separate in memory.
