package OOPS.Basic;
//constructor overloading
class men
{
    String name;
    int age;
    men()
    {
        this.name ="Unknown";
        this.age =0;
    }
    men(int a)
    {
        this.name ="Unknown";
        this.age =a;
    }
    men(String s)
    {
        this.name =s;
        this.age =0;
    }
    men(String s,int age)
    {
        this.name =s;
        this.age =age;
    }
    void details()
    {
        System.out.println("name :"+this.name);
        System.out.println("age :"+this.age);
    }
}
public class i {
    public static void main(String[] args) {
        // call constructor based on parameter given
        men sri =new men(23);
        men sk = new men("sri");
        men s =new men();
        men sri_kant = new men("sri kant kumar",18);
        sri.details();
        sk.details();
        s.details();
        sri_kant.details();
    }

}
