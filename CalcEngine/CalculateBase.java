/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nishanroka
 */
public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;
    
    public CalculateBase(){}
    
    public CalculateBase(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    
    public void setLeftVal(double leftVal){
        this.leftVal = leftVal;
    }
    public double getLeftVal(){
        return this.leftVal;
    }
    
    public void setRightVal(double rightVal){
        this.rightVal = rightVal;
    }
    
    public double getRightVal(){
        return this.rightVal;
    }
    
    public void setResult(double result){
        this.result = result;
    }
    public double getResult(){
        return this.result;
    }
    
    public abstract void calculate();
}
