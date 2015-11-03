/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jjair
 */
public class TypeZero extends Pipes {
    
    //public void Pipes() {}
    //public TypeFive() {}
    
    public TypeZero() {
        super(0.0, 0.0,1, 1, false, false, false);
    }
    
    @Override
    public void getPipeType() {
        System.out.println("Pipe Type: Type ZERO");
    }
}
