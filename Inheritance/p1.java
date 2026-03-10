package OOPS.Inheritance;
//Create a base class Vehicle with attributes:
//speed
//fuelType
//Create a child class Car that adds:
//numberOfDoors
//Display vehicle details.
class Vehicle
{
    String name;
    int maxx_speed;
    char fuel_type;
    Vehicle()
    {
        this("unknown",0,'x');
    }
    Vehicle(String nm,int speed,char fuel)
    {
        this.fuel_type =fuel;
        this.maxx_speed =speed;
        this.name =nm;
    }
    void details()
    {
        System.out.println("name :"+this.name);
        System.out.println("maximum speed :"+this.maxx_speed);
        System.out.println("fuel :"+this.fuel_type);
        System.out.println("note :d for diesel p for petrol");
    }
}
class Car extends Vehicle
{
     String vehicle_name ="car";
    int noOfDoors;
    Car()
    {
        super();
        this.noOfDoors =-1;
    }
    Car(String name,int speed,char fuel,int door)
    {
        super(name,speed,fuel);
        this.noOfDoors =door;
    }
    @Override
    void details()
    {
        System.out.println("vehicle :"+vehicle_name);
        super.details();
        System.out.println("no of door :"+this.noOfDoors);
    }
}
public class p1 {
    public static void main(String[] args) {
        Car sk =new Car("audi",120,'d',6);
        sk.details();
        System.out.println(sk.vehicle_name);
    }

}


