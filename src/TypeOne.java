/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jjair
 */
public class TypeOne extends Pipes {
    
    //public void Pipes() {}
    //public TypeOne() {}
    
    public TypeOne(double pHei, double pDia, int pGrade, boolean pResis) {
        super(pHei, pDia, pGrade, 0, false, false, pResis);
    }
    
    @Override
    public void getPipeType() {
        System.out.println("Pipe Type: Type ONE");
    }
}
