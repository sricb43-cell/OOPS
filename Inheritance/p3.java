package OOPS.Inheritance;
//Create base class Shape with method:
//calculateArea()
//Create subclass Rectangle with:
//length
//width
//Override the area method.
class shape
{
   int calculateArea()
    {
        return 0;
    }
    void printArea()
    {
        System.out.println("area is :"+this.calculateArea());
    }
}
class Rectangle extends shape
{
    Rectangle(int l ,int w)
    {
        this.width =w;
        this.length =l;
    }
    int length;
    int width;
    @Override
    int calculateArea()
    {
        return this.length*this.width;
    }

}
public class p3 {
    public static void main(String[] args) {
        Rectangle s = new Rectangle(3,4);
        s.printArea();
        s.printArea();
    }
}

