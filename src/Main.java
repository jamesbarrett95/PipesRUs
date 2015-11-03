/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;

/**
 *
 * @author jjair
 */
public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Pipes pipe1 = new TypeZero();
        boolean pChem,pInsul, pRein, again = true;
        double pLength, pDia;
        int pGrade,pSetColour = 0, pQuantity;
        String pChemInput,pColourInput,pInsulInput, pReinInput, againAnswer;
        Scanner console = new Scanner(System.in);

        //Begin User input for pipes.
        do {

            System.out.println("Enter pipe size: ");
            pLength = console.nextDouble();

            System.out.println("--------------------");

            System.out.println("Enter pipe diameter: ");
            pDia = console.nextDouble();

            System.out.println("--------------------");

            System.out.println("Enter pipe grade: ");
            pGrade = console.nextInt();
            console.nextLine();

            System.out.println("--------------------");
            
            System.out.println("Do you want the pipe to have colour? (Y/N)");
            pColourInput = console.nextLine();
            
            if(pColourInput.charAt(0) == 'y' || pColourInput.charAt(0) == 'Y') {
                 System.out.println("----------");
                System.out.println("How many colours? (1/2)");
                pSetColour = console.nextInt();
                console.nextLine();
            }
            
            System.out.println("--------------------");

            System.out.println("Insulation? (Y/N)");
            pInsulInput = console.nextLine();
            
            pInsul = false;
            if (pInsulInput.charAt(0) == 'Y' || pInsulInput.charAt(0) == 'y') {
                pInsul = true;
            }
            
            System.out.println("--------------------");

            System.out.println("Reinforcement? (Y/N)");
            pReinInput = console.nextLine();
            
            pRein = false;
            if (pReinInput.charAt(0) == 'Y' || pReinInput.charAt(0) == 'y') {
                pRein = true;
            }
            
            System.out.println("--------------------");

            System.out.println("Chemical Resistance? (Y/N)");
            pChemInput = console.nextLine();
            
            pChem = false;
            if (pChemInput.charAt(0) == 'Y' || pChemInput.charAt(0) == 'y') {
                pChem = true;
            }
            
            System.out.println("--------------------");
            
            System.out.println("Quantity of pipes?");
            pQuantity = console.nextInt();
            console.nextLine();

            System.out.println("--------------------");

            System.out.println("Add another pipe? (Y/N)");
            againAnswer = console.nextLine();

            System.out.println("--------------------");

            again = false;
            if (againAnswer.charAt(0) == 'Y' || againAnswer.charAt(0) == 'y') {
                again = true;
            }
            
        } while (again);
        
        //Conditions for pipe selection!
        if(pGrade <= 3 && pGrade >= 1 && pSetColour == 0 && pInsul == false && pRein == false){
            pipe1 = new TypeOne(pLength, pDia, pGrade, pChem);
        } else if (pGrade <= 3 && pGrade >= 2 && pSetColour == 1 && pInsul == false && pRein == false) {
            pipe1 = new TypeTwo(pLength, pDia, pGrade, pChem);
        } else if (pGrade <= 5 && pGrade >= 2 && pSetColour == 2 && pInsul == false && pRein == false) {
            pipe1 = new TypeThree(pLength, pDia, pGrade, pChem);
        } else if (pGrade <= 5 && pGrade >= 2 && pSetColour == 2 && pInsul == true && pRein == false) {
            pipe1 = new TypeFour(pLength, pDia, pGrade, pChem);
        } else if (pGrade <= 5 && pGrade >= 3 && pSetColour == 2 && pInsul == true && pRein == true) {
            pipe1 = new TypeFive(pLength, pDia, pGrade, pChem);
        } else {
            System.out.println("Invalid entry, no compatiable pipes found. Main Class");
        }
        
        
        System.out.println("Base Cost: £" + pipe1.baseCost());
        System.out.println("Final Cost: £" + pipe1.finalCost());
        pipe1.getPipeType();
    }
}
