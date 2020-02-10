package NormalCalculator;

public class HandlingException extends Exception{
    String a;
   HandlingException(String b) {
       super(b);
       a=b;
   }
   public String toString(){
     return (a) ;
  }
}
