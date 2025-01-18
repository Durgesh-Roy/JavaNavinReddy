class Calculator{
    int add(int a,int b){
        return a+b;
    }
}
class obj{
    public static String playMusic(){
        return "Music Playing...";
    }
    public static String getMeAPen(int cost){
        if(cost>=10){
            return "pen";
        }else{
            return "Go and bring more money";
        }
    }
}
public class demo {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        int a=4;
        int b=1;
        System.out.println(calc.add(a,b));

        String music=obj.playMusic();
        System.out.println(music);
        int cost=5;
        System.out.println(obj.getMeAPen(cost));
        System.out.println("After taking 5 more rupees i got "+ obj.getMeAPen(10));


    }
}
