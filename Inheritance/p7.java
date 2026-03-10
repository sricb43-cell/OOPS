package OOPS.Inheritance;
//Base class RentalVehicle
//Subclasses:
//CarRental
//BikeRental
//TruckRental
//Calculate rent per hour.
class RentalVehicle
{
    String name;
    int bill;
    int hour;
    RentalVehicle(String s,int h)
    {
        this.name =s;
        this.hour =h;
    }
    int bill()
    {
        return 0;
    }
    void details()
    {
        System.out.println("customer name :"+this.name);
        System.out.println("time :"+this.hour);
        System.out.println("total bill :"+bill());
    }
}
class CarRental extends RentalVehicle
{
    CarRental(String s,int h)
    {
        super(s,h);
    }
    int bill()
    {
        return this.hour*110;
    }
}
class BikeRental extends RentalVehicle
{
    BikeRental(String s,int h)
    {
        super(s,h);
    }
    int bill()
    {
        return this.hour*70;
    }
}
class TruckRental extends RentalVehicle
{
    TruckRental(String s,int h)
    {
        super(s,h);
    }
    int bill()
    {
        return this.hour*240;
    }
}
public class p7 {
    public static void main(String[] args) {
        RentalVehicle sk =new CarRental("sri kant kumar",3);
        sk.details();
    }

}
