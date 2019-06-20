class T
   { //local variable
     int studentId; 
     //constructor 
     T(int studentId) 
     { // this keyword for local variable,,,,,,
         //asigning value to  local variable
       this.studentId=studentId; 
     } 
     // method
      int getId() 
     { // returning value of local variable
       return studentId; 
     } 
   } // class with name constructor// class with name constructor
    class Constructor 
   { 
     public static void main(String args[]) 
     { 
       T t=new T(50); 
       System.out.println(t.studentId); 
       System.out.println(t.getId()); 
     } 
   } 
