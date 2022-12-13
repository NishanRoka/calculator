/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nishanroka
 */
public class AddingInstance {
    public static void main(String[] args){
        Adder add = new Adder(4, 5);
        
        //add.calculate();
        System.out.println(add.getResult());
    }
    
}
