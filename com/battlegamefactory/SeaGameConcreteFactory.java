package com.battlegamefactory;

import javax.swing.ImageIcon;

  public class SeaGameConcreteFactory extends BattleGameFactory 
  {  
	ImageIcon boatIcon = new ImageIcon (getClass().getClassLoader().getResource("boat.jpg"));
	ImageIcon subIcon = new ImageIcon (getClass().getClassLoader().getResource("submarine.jpg"));
	ImageIcon mineIcon = new ImageIcon (getClass().getClassLoader().getResource("mine.jpg"));
	//ImageIcon boatIcon = new ImageIcon("images/boat.jpg");
	//ImageIcon subIcon = new ImageIcon("images/submarine.jpg");
	//ImageIcon mineIcon = new ImageIcon("images/mine.jpg");
	
    public Vehicle getVehicleItem1(){
	 return new Boat(boatIcon);
    }
	    
    public Vehicle getVehicleItem2(){
	 return new Submarine(subIcon);
    }
	    
    public DamageItem getDamageItem() {     
	 return new Mine(mineIcon);
    }
  }//end class
