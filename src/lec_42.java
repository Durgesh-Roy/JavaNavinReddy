class mobile {
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand+" " + price + " "+name);
    }

    // we cannot use directly non-static variable inside  static method,
    //so we will pass the object as reference.
    // now we can refer all the properties of that object.
    public static void show1(mobile obj){
        System.out.println(obj.brand+" " + obj.price + " "+name);
    }
}
public class lec_42 {
    // From starting we are using static keyword with main function. But why?
    // because if we don't use static keyword with main function
    // then for calling main function we will have to create the object
    // of respective class(here lec_42) that means we can't call main without
    // the object of lec_42 class name(here). But we all know that the main
    // function is starting point of execution and if execution will not start
    // then how we can make the object of respective class here(lec_42);
    // is
    public static void main(String[] args) {
        mobile obj1=new mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        mobile.name="SmartPhone";

        mobile obj2=new mobile();
        obj2.brand="Samsung";
        obj2.price=1200;
        mobile.name="phone";

        mobile.show1(obj1);
    }
}
