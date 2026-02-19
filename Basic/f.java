package OOPS.Basic;
// parameterized constructor
class Studentsk {
    private String name;
    private int standard;
    private char section;
    private int rollNo;

    Studentsk(String s, int c, int r, char se) {
        this.name = s;
        this.standard = c;
        this.rollNo = r;
        this.section = se;
    }

    void details() {
        System.out.println("name :" + this.name);
        System.out.println("roll no :" + this.rollNo);
        System.out.println("standard :" + this.standard);
        System.out.println("section :" + this.section);
    }
}
public class f {
    public static void main(String[] args) {
       Studentsk sri =new Studentsk("Sri Kant Kumar",12,25,'A');
       sri.details();
    }
}
