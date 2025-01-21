class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a*b;
    }
}
class AdvCalc extends Calc{
    public int mult(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
class veryAdvCalc extends AdvCalc{
    public int pow(int a,int b){
        return (int)Math.pow(a,b);
    }
}
public class lec_54 {
    public static void main(String[] args) {

        // AdvCalc have all the properties of Calc
        //veryAdvCalc have all the properties of AdvCalc i.e. of Calc also(bcz AdvCalc also inherited properties of Calc);
        //this is called as multilevel inheritence
        //because AdvCalc inheriting all the properties of Calc and veryAdvCalc inherit all the properties of AdvCalc.

        veryAdvCalc calc=new veryAdvCalc();
        int addition=calc.add(4,5);
        int mult=calc.mult(2,4);
        int pow=calc.pow(4,2);
        System.out.println(addition+" " +mult+ " " + pow);
    }
}
