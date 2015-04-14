package com.battlegamefactory;

import javax.swing.ImageIcon;

  public class SeaVehicle extends Vehicle 
  {
   private ImageIcon image;
    
    //default constructor
  	public SeaVehicle(){}
    
    //user-defined constructor
  	public SeaVehicle(ImageIcon seaVehicleImage) 
    {
      image = seaVehicleImage;                
    }
    
    public ImageIcon getImage() 
    {
      return image;
    }
  }//end class
