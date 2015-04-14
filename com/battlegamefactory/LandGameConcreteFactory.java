package com.battlegamefactory;

import javax.swing.ImageIcon;

  public class LandGameConcreteFactory extends BattleGameFactory 
  {
	ImageIcon carIcon = new ImageIcon (getClass().getClassLoader().getResource("car.jpg"));
	ImageIcon tankIcon = new ImageIcon (getClass().getClassLoader().getResource("tank.jpg"));
	ImageIcon roadBlockIcon = new ImageIcon (getClass().getClassLoader().getResource("roadBlock.jpg"));
	  
	//ImageIcon carIcon = new ImageIcon("images/tank.jpg");
	//ImageIcon tankIcon = new ImageIcon("images/car.jpg");
	//ImageIcon roadBlockIcon = new ImageIcon("images/roadBlock.jpg");
	
    public Vehicle getVehicleItem1(){
     return new Car(carIcon);
    }
    
    public Vehicle getVehicleItem2(){
     return new Tank(tankIcon);
    }
        
    public DamageItem getDamageItem() {     
   	 return new RoadBlock(roadBlockIcon);
   	}      
  }//end class
