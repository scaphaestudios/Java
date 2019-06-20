class Super
{
  public void methodA()
  {
     System.out.println("method of Class A");
  }
}
class Test extends Super
{
  public void methodB()
  {
     System.out.println("method of Class B");
  }
}
class C extends Super
{
 public void methodC()
 {
 System.out.println("method of Class C");
 }
}
class D extends Super
{
  public void methodD()
  {
     System.out.println("method of Class D");
  }
}
class MyClass{
    
    
    // main class
  //itx not the part

  public static void main(String args[])
  {
     Test obj1 = new Test(); // b class ka object bnaya hai 
     C obj2 = new C();// c class ka object bnaya hai ,, to call method of c
     D obj3 = new D(); // d class ka object bnaya hai 
     obj1.methodA();
     obj1.methodA();
     obj2.methodA();
     obj3.methodA();
  }
}
