package NormalCalculator;

public class Operations{
    static double plus_op(double number1,double number2 ){
        return number1+number2;
    }
    static double minus_op(double number1,double number2 ){
        return number1-number2;
    }
    static double multiplication_op(double number1,double number2 ){
        return number1*number2;
    }
    static double division_op(double number1,double number2 ){
        try{
            if(number2==0){
             throw new HandlingException("Can't divide by zero");
            }
            else{
                return number1/number2;
            }
        }
        catch(HandlingException e){
            System.out.println(e);
            return number1/number2;
        }
    }
   
}
