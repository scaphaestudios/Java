 

public class Argum {
    
    
    static class Inner{
            
       
       int method (int a , int b)
       {
           int x ;
           x=(a*b);
           return x;
       }
         }
  
    
    public static void main(String ab[])
    {
        int a =30;
        int b=20;
        Test obj = new Test();
        
        System.out.println(obj.method(a,b));
        
        Argum.Inner obj1;
      obj1 = new Argum.Inner();
       
        System.out.println(obj1.method(a,b));
    }
    
}
class Test{
    
    
  
    int method(int a , int b){
        
        int x;
        x=a+b;
        return x;
        
    }
    
}