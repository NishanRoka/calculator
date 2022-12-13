/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nishanroka
 */
public class PowerOf extends CalculateBase implements MathProcessor{

    public PowerOf(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public String getKeyWord() {
        return "power";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }

    @Override
    public void calculate() {
        double value = Math.pow(getLeftVal(), getRightVal());
        setResult(value);
    }
    
}
