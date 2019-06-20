
public class Check {
    
    int a=23;
    int b=45;
    String h="hello";
    double c=34.0;
    
}
class Child extends Check{
    
    public static void main(String ab[]){
        
       Child obj = new Child();
       System.out.println(obj.a +" " + obj.b +" " + obj.h + " " + obj.c);
    }
}