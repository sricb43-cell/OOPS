package OOPS.Basic;
// concept of getter and setter
class Employee
{
   private String name;
   private int id;
   void details()
   {
       System.out.println("name :"+this.name);
       System.out.println("id :"+this.id);
   }
   void setName(String s)
   {
       this.name =s;
   }
   void setId(int id)
   {
       this.id =id;
   }
   String getName()
   {
       return this.name;
   }
   int getId()
   {
       return this.id;
   }
}
public class c {
    public static void main(String[] args) {
        Employee sri = new Employee();
        // sri.name ="sri kant kumar";
        // sri.id =4;
       // System.out.println(sri.name);
        //this will not work due to this is private
        sri.setId(4);
        sri.setName("sri kant kumar");
        System.out.println(sri.getId());
        System.out.println(sri.getName());
        sri.details();

    }

}
