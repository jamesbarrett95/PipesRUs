/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jjair
 */
public class TypeFour extends Pipes {
    
    //public void Pipes() {}
    //public TypeFour() {}
    
    public TypeFour(double pHei, double pDia, int pGrade, boolean pResis) {
        super(pHei, pDia, pGrade, 2, true, false, pResis);
    }
    
    @Override
    public void getPipeType() {
        System.out.println("Pipe Type: Type Four");
    }
}
