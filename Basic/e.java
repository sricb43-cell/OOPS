package OOPS.Basic;
// constructor concept
class Studentsc
{
  private   String name;
  private   int standard;
    private char section;
    private int rollNo;
    Studentsc(String s,int c,int r,char se)
    {
        this.name =s;
        this.standard =c;
        this.rollNo =r;
        this.section =se;
    }
    void details()
    {
        System.out.println("name :"+this.name);
        System.out.println("roll no :"+this.rollNo);
        System.out.println("standard :"+this.standard);
        System.out.println("section :"+this.section);
    }
    void updateName(String s)
    {
        this.name =s;
    }
}
public class e {
    public static void main(String[] args) {
        Studentsc sri =new Studentsc("sri kant",12,34,'a');
        sri.updateName("sris");
        sri.details();
    }

}

