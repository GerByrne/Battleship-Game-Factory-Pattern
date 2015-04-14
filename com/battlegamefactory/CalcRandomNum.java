package com.battlegamefactory;

/****************************************************************************/
/*	This class calculates 9 random numbers for the grid of squares which	*/
/*	will be split up into 9 sections.										*/
/****************************************************************************/
public class CalcRandomNum {
	int randomNum1, randomNum2, randomNum3, randomNum4, randomNum5, randomNum6, randomNum7, randomNum8, randomNum9, 
		randomNum10, randomNum11, randomNum12, randomNum13, randomNum14, randomNum15, randomNum16, randomNum17;

	public void randomNumbers(){
    	randomNum1 = (int)(Math.random()*10000)%3+0;  
    	randomNum2 = (int)(Math.random()*10000)%3+3;  
    	randomNum3 = (int)(Math.random()*10000)%3+6; 
    	randomNum4 = (int)(Math.random()*10000)%3+9;  
    	randomNum5 = (int)(Math.random()*10000)%2+12; 
    	randomNum6 = (int)(Math.random()*10000)%3+14; 
    	randomNum7 = (int)(Math.random()*10000)%3+17; 
    	randomNum8 = (int)(Math.random()*10000)%2+20; 
    	randomNum9 = (int)(Math.random()*10000)%3+22;
    	// These random numbers are for extending the game to level 2
    	randomNum10 = (int)(Math.random()*10000)%3+25;
    	randomNum11 = (int)(Math.random()*10000)%3+28;
    	randomNum12 = (int)(Math.random()*10000)%3+31;
    	randomNum13 = (int)(Math.random()*10000)%3+34;
    	// These random numbers are for extending the game to level 3
    	randomNum14 = (int)(Math.random()*10000)%3+37;
    	randomNum15 = (int)(Math.random()*10000)%3+40;
    	randomNum16 = (int)(Math.random()*10000)%3+43;
    	randomNum17 = (int)(Math.random()*10000)%3+46;    	
    }    

}

