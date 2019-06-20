class Super
{
   public void methodA()
   {
     System.out.println("Base class method");
   }
}

class Sub extends Super // exist in this class so its local for 
{
   public void methodB()// 
   {
     System.out.println("Child class method");
   }
  
public static void main(String args[])// main in sub classa
   {
     Sub obj = new Sub();
     obj.methodA(); //calling super class method
     obj.methodB(); //calling local method 
  }
}