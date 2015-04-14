package com.battlegamefactory;

import javax.swing.ImageIcon;

  public class Car extends LandVehicle 
  {
   private ImageIcon image;

	public Car(ImageIcon carImage) 
	{
	  image = carImage;     
	}
	
	public ImageIcon getImage() 
	{
	  return image;
	}
  }//end class