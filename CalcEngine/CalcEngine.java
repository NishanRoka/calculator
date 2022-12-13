//import java.io.*;
import java.util.*;
/**
 *
 * @author nishanroka
 */
public class CalcEngine {
    public static void main(String[] args){
        //executeInteractively();
        performCalc();
     
    }
    static void executeInteractively(){
        System.out.println("Enter an opertation and two numbers: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        doFinal(parts);
    }
    
    private static void doFinal(String[] parts){
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);
        CalculateBase calculation = doCalculation(operation,leftVal,rightVal);
        calculation.calculate();
        System.out.println("Operation : " + operation);
        System.out.println("Result of the calculation: " + calculation.getResult() );
        
    }
    
    private static CalculateBase doCalculation(MathOperation operation, double leftVal, double rightVal){
        CalculateBase calculation = null;
        switch(operation){
            case ADD:
                calculation = new Adder(leftVal,rightVal);
                break;
            case SUBTRACT:
                calculation = new Subtractor(leftVal,rightVal);
                break;
            case DIVIDE:
                calculation = new Divider(leftVal,rightVal);
                break;
            case MULTIPLY:
                calculation = new Multiplier(leftVal, rightVal);
                break;
            case POWER:
                calculation = new PowerOf(leftVal,rightVal);
                break;
    
        }
        return calculation;
    }
    
    static void doCalculation(CalculateBase calculation){
        calculation.calculate();
        System.out.println("Result of the calculation: " + calculation.getResult());
    }
     
    static void performCalc(){
        /**double[] leftVal = {20d,30d,40d,50d};
        double[] rightVal = {20d,30d,40d,50d};
        char[] opCodes = {'a', 'd', 's', 'm'};
        double[] results = new double[opCodes.length];*/
        
        
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('a',20, 40);
        equations[1] = new MathEquation('d',120, 40);
        equations[2] = new MathEquation('s',40, 40);
        equations[3] = new MathEquation('m',50, 50);
        
        for(MathEquation equation: equations){
            equation.execute();
            System.out.println("result = " + equation.getResult());
       
        }
        
        System.out.println();
        System.out.println("The average is " + MathEquation.getAverage());
        
        System.out.println();
        System.out.println("Overloading the methods");
        System.out.println();
        
        MathEquation eq = new MathEquation('d');
        eq.execute(80,4);
        System.out.println("The result of doubles is " + eq.getResult());
        
        int left = 33;
        int right = 2;
        eq.execute(left,right);
        System.out.println("The result of integers is " + eq.getResult());
        
        
        
        
        
        
        /**for(int i = 0; i < opCodes.length; i++){
            results[i]=performOperation(leftVal[i],rightVal[i],opCodes[i]);
        }
        for(double currentResults: results){
            System.out.println(currentResults);
        }*/
     }   

    
        
        
    
    /**private static MathEquation create(double leftVal ,double rightVal, char opCode){
        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);
        return equation;
    }*/
    
    
    /**
    static double performOperation(double leftVal, double rightVal, char opCode){
        double result;
        switch(opCode){
            case 'a': 
                result = leftVal + rightVal;
                break;
        
                
            case 'd':
                result = rightVal !=0? leftVal/rightVal:0d;
                break;
        
                
            case 's':
                result = leftVal - rightVal;
                break;
        
                
            case 'm':
                result = leftVal * rightVal;
                break;
        
                
            default: 
                System.out.println("invalid opCode: " + opCode);  
                result = 0d;
                break;
             }
            return result;
        
        }*/
   
}
