class Human{
    private int age =11;
    private String name="Himanshu";
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    void setAge(int a){
        age=a;
    }void setName(String n){
        name=n;
    }
}
public class lec_44 {
    public static void main(String[] args) {
        Human obj=new Human();
        System.out.println(obj.getAge());
        obj.setAge(30);
        System.out.println(obj.getAge());
        obj.setName("Middle");
        System.out.println(obj.getName());
    }
}
