/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nishanroka
 */
public interface MathProcessor {
    String SEPARATOR = " ";
    String getKeyWord();
    double doCalculation(double leftVal, double rightVal);
}
