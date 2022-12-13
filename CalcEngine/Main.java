/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author nishanroka
 */
public class Main {
    public static void main(String[] args) {
        double[] val1 = {420, 17, 7, 40};
        double[] val2 = {420,17, 7, 30};
        char[] opCodes = {'d', 'a', 'm', 's'};
        double [] result = new double[opCodes.length];
       
        if(args.length ==0) {
            for(int i = 0; i <opCodes.length; i++) {
            result[i]= execute( val1[i], val2[i], opCodes[i]);
            }
            for(double currentResult: result)
            System.out.println(currentResult);
            
        }else if(args.length == 1 && args[0].equals("interactive"))
            executeInteractively();
        
        else if(args.length == 3)
            handleCommandLine(args);
        
        else
            System.out.println("Enter correct op code:");
        
    }
    
    static void executeInteractively(){
        System.out.println("Enter an operation and two numbers");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }
    
    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        double val1 = valueFromWord(parts[1]);
        double val2 = valueFromWord(parts[2]);
        double result = execute(val1, val2, opCode);
        displayResult(opCode, val1, val2, result);
    }
    
    private static void displayResult(char opCode, double val1, double val2, double result) {
        char symbol = symbolFromOpCode(opCode);
        StringBuilder builder = new StringBuilder(20);
        builder.append(val1);
        builder.append(" ");
        builder.append(symbol);
        builder.append(" ");
        builder.append(val2);
        builder.append(" = ");
        builder.append(result);
        String output = String.format("%.3f %c %.3f = %.3f", val1, symbol,val2, result );
        System.out.println(output);
        
    }
    private static char symbolFromOpCode(char opCode){
        char[] opCodes = {'d','a','m','s'};
        char[] symbols = {'/','+','m','s'};
        char symbol = ' ';
        for(int index = 0; index < opCodes.length; index++){
            if(opCode == opCodes[index]){
                symbol = symbols[index];
                break;
            }
        }
        return symbol;
    }
        
     
    
    static char opCodeFromString(String operationName) {
        char opCode = operationName.charAt(0);
        return opCode;
    }
    
    static double valueFromWord(String word){
        String[] numberWords = {
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"
        };
        double value = 0d;
        for (int index = 0; index < numberWords.length; index++){
            if(word.equals(numberWords[index])){
            value = index;
            break;
            }
        }
        return value;
        
    }
    
    
    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double val1 = Double.parseDouble(args[1]);
        double val2 = Double.parseDouble(args[2]);
        double result = execute(val1, val2, opCode);
        System.out.println(result);
        
    }
    
    
    static double execute(double val1, double val2, char opCode) {
        double result;
        switch(opCode){
                case('d'):
                    result= val2 != 0? val1/ val2: 0.0d;
                
                case('a'):
                    result = val1 + val2;
                
                case('m'):
                    result = val1 * val2;
                
                case('s'):
                    result = val1 - val2;
                   
                default:
                    System.out.println("Invalid opCode: " + opCode);
                    result = 0.0;
              }  
        return result;    

        }
        
}
  

    

