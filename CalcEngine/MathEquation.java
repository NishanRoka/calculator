/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nishanroka
 */
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private double result;
    private char opCode;
    private static int numOfCalcs;
    private static double sumOfResults;
    
    
    public void setLeftVal(double leftVal){
        this.leftVal = leftVal;
    }
    public void setRightVal(double rightVal){
        this.rightVal = rightVal;
    }
    public void setOpCode(char opCode){
        this.opCode = opCode;
    }
    public double getResult(){
        return this.result;
    }
    
    public static double getAverage(){
        return sumOfResults/numOfCalcs;
    }
    public MathEquation(){}
    
    public MathEquation(char opCode){
        this.opCode = opCode;
    }
    
    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    
    public void execute(int leftVal, int rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
        
        result = (int)result;
    }
    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        
        execute();
    }
    
    public void execute(){
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
            numOfCalcs++; 
            sumOfResults += result;
    }
}
