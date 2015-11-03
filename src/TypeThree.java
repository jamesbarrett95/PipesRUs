/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jjair
 */
public class TypeThree extends Pipes {
    
    //public void Pipes() {}
    //public TypeThree() {}
    
    public TypeThree(double pHei, double pDia, int pGrade, boolean pResis) {
        super(pHei, pDia, pGrade, 2, false, false, pResis);
    }
    
    @Override
    public void getPipeType() {
        System.out.println("Pipe Type: Type THREE");
    }
}
