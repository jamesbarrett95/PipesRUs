/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jjair
 */
abstract public class Pipes {
    
    protected double height, diameter;
    protected int grade, colour;
    protected boolean insulation, reinforcement, resistance;
    
    public Pipes(double pHei, double pDia, int pGrade, int pColour, 
            boolean pInsul,boolean pReinforce, boolean pResis) {
        
        //Assigns the objects variables
        height = pHei * 39.37;
        diameter = pDia;
        grade = pGrade;
        colour = pColour;
        insulation = pInsul;
        reinforcement = pReinforce;
        resistance = pResis;
      
    }
    
    //Calculates the outside volume of the tube. 
    protected double outerVolume() {
        return Math.PI * Math.pow((getRadius()), 2) * height;
    }
    
    //Calculates the inside volume of the tube. The inside is 90% the outside
    //volume.
    protected double innerVolume() {
        return Math.PI * Math.pow((getRadius() * 0.9),2) * height;
    }
    
    protected double plasticVolume() {
        return outerVolume() - innerVolume();
    }
    
    //Returns height entry.
    protected double getHeight() {
        return height;
    }
    
    //Returns diameter entry.
    protected double getDiameter() {
        return diameter;
    }
    
    protected double getRadius(){
        return diameter/2;
    }
    
    //Returns the grade of the pipe.
    protected int getGrade() {
        return grade;
    }
    
    //returns the colour of the pipe. 0 - Grey, 1 - One colour 2 - Two colours
    protected int getColor() {
        return colour;
    }
    
    //Returns whether the pipe has insulation.
    protected boolean getInsulation() {
        return insulation;
    }
    
    //Returns whether the pipe has reinforcement.
    protected boolean getReinforcement() {
        return reinforcement;
    }
    //Returns whether the pipe has chemical resistance. 
    protected boolean getChemResistance() {
        return resistance;
    }
    
    //Sets the pipe grades.
    protected void setGrade(int gradeIn) {
        //Validates the grade to check its valid.
        if (gradeIn > 5 || gradeIn < 1) {
            System.out.println("Invalid grade entry set, Pipe Class");
        } else {
            grade = gradeIn;
        }
    }
    
    //Sets the pipe colour.
    protected void setColor(int colourIn) {
        //Validates the colour to check its valid.
        if(colourIn > 2 || colourIn < 1) {
            System.out.println("Invalid colour entry set, Pipe Class");
        } else {
            colour = colourIn;
        }
    }
    
    //Calculates the base cost of the pipes selected.
    //NEED TO CALCULATE IN INCHES
    protected double baseCost() {
        double baseCost;
        switch(grade) {
            case 1:
                baseCost = this.plasticVolume() * 0.3;
                break;
            case 2:
                baseCost = this.plasticVolume() * 0.32;
                break;
            case 3:
                baseCost = this.plasticVolume() * 0.35;
                break;
            case 4:
                baseCost = this.plasticVolume() * 0.40;
                break;
            case 5:
                baseCost = this.plasticVolume() * 0.46;
                break;
            default:
                baseCost = 0.0;
                break;
        }
        return baseCost;
    }
    
    //Calculates the final cost of the pipes.
    //NEED TO CALCULATE IN INCHES.
    protected double finalCost() {
        double finalCost = this.baseCost();
        
        if(colour == 1) {
            finalCost += this.baseCost() * 0.12; 
        } else if (colour == 2) {
            finalCost += this.baseCost() * 0.17;
        }
        
        if(insulation == true) {
            finalCost += this.baseCost() * 0.14;
        }
        
        if(reinforcement == true) {
            finalCost += this.baseCost() * 0.15;
        }
        
        if(resistance == true) {
            finalCost += this.baseCost() * 0.12;
        }
       
        return Math.round((finalCost) * 100) / 100.0;
    }
    
    public abstract void getPipeType();
}
