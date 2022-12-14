/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nishanroka
 */
public class Adder extends CalculateBase implements MathProcessor{
    
    public Adder(){}
    
    public Adder(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }
    
    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyWord() {
        return "add";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
    
}
