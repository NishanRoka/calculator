/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nishanroka
 */
public class Multiplier extends CalculateBase{
    public Multiplier(double leftVal,double rightVal){
        super(leftVal, rightVal);
        
    }
    @Override
    public void calculate(){
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
    
}
