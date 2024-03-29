public class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int c,int d){
        return c-d;
    }
}
public class AdvCalc extends Calc{
    public int mul(int e,int f){
        return e*f;
    }
    public int div(int g,int h){
        return g/h;
    }
}
public class inheritance{
    public static void main(String[] args){
        AdvCalc obj= new AdvCalc();
        int r1=obj.add(6, 4);
        int r2=obj.sub(5, 2);
        int r3=obj.mul(4, 5);
        int r4=obj.div(100, 20);
        System.out.println(r1+" "+r2+" "+r3+" "+r4);
    }
}
