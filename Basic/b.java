package OOPS.Basic;
// access all properties and methods
class Students
{
    String name;
    int standard;
    char section;
    int rollNo;

    void details()
    {
        System.out.println("name : " + this.name);
        System.out.println("standard : " + this.standard);
        System.out.println("section : " + this.section);
        System.out.println("roll no : " + this.rollNo);
    }
}

public class b {
    public static void main(String[] args) {
        Students sri = new Students();
        sri.name = "sri kant";
        sri.standard = 12;
        sri.rollNo = 23;
        sri.section = 'A';
        System.out.println(sri.name);
        sri.details();
    }
}
