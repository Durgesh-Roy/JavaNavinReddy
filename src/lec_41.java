class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }
}
public class lec_41 {
    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile.name="SmartPhone";  // Static method should be declared by their class name.

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1200;
        obj1.show();
        obj2.show();
        System.out.println();
        // As name is a static variable so whenever we will change it,
        //  it's value will change for every object.
        Mobile.name="phone";
        obj1.show();
        obj2.show();
    }
}