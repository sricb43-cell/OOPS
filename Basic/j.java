package OOPS.Basic;
// private constructor
class mens {
    int age;
    String name;

    private mens(String s, int age) {
        this.name = s;
        this.age = age;
    }

     static mens create(String s, int age) {
        return new mens(s, age);
    }

    void display() {
        System.out.println("name :" + this.name);
        System.out.println("age :" + this.age);
    }
}

public class j {
    public static void main(String[] args) {
        mens sri = mens.create("sri", 18);
        sri.display();
    }
}
