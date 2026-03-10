package OOPS.Inheritance;
//Create a class Person with:
//name
// age
//Create a subclass Student with:
//country name
//course
//Display student details.
class Person
{
    String name;
    int age;
    Person(String n,int age)
    {
        this.name =n;
        this.age =age;
    }
    Person()
    {
        this("unknown",-1);
    }
    void details()
    {
        System.out.println("name :"+this.name);
        System.out.println("age :"+this.age);
    }
}
class Student extends Person
{
    String country_name;
    String course;
    Student(String name,int age,String country,String course)
    {
        super(name,age);
        this.country_name =country;
        this.course =course;
    }
    Student()
    {
        super();
        this.course ="none";
        this.country_name ="xxx";
    }
    @Override
    void details()
    {
        super.details();
        System.out.println("country name :"+this.country_name);
        System.out.println("course :"+this.course);
    }
}
public class p2 {
    public static void main(String[] args) {
        Student sri =new Student("sri kumar",19,"india","B.tech");
        sri.details();
    }

}

