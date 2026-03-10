package OOPS.Inheritance;
//Base class Ride
//Subclasses:
//BikeRide
//CarRide
//AutoRide
//Calculate fare differently.
class Ride
{
    int perKmCharge;
    String name;
    int distance;
    int bill;
    Ride(String n,int distance,int perKmCharge)
    {
        this.name =n;
        this.distance =distance;
        bill =distance*perKmCharge;
    }
    void details()
    {
        System.out.println("customer name :"+this.name);
        System.out.println("distance :"+this.distance);
        System.out.println("you have to pay :"+this.bill);
    }
}
class BikeRide extends Ride
{
    BikeRide(String n,int distance)
    {
        super(n,distance,8);
    }
}
class CarRide extends Ride
{
    CarRide(String n,int distance)
    {
        super(n,distance,10);
    }
}
class AutoRide extends Ride
{
    AutoRide(String n,int distance)
    {
        super(n,distance,5);
    }
}

public class p6 {
    public static void main(String[] args) {
        Ride sri =new AutoRide("sri kant",2);
        sri.details();
    }

}
