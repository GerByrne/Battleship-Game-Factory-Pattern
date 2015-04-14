package com.battlegamefactory;

import javax.swing.ImageIcon;

  public class LandVehicle extends Vehicle 
  {
   private ImageIcon image;
    
    //default constructor
  	public LandVehicle(){}
    
    //user-defined constructor
  	public LandVehicle(ImageIcon landVehicleImage) 
    {
      image = landVehicleImage;     
    }
    
    public ImageIcon getImage() 
    {
      return image;
    }
  }//end class

