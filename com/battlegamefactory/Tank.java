package com.battlegamefactory;

import javax.swing.ImageIcon;

  public class Tank extends LandVehicle 
  {
   private ImageIcon image;

	public Tank(ImageIcon tankImage) 
	{
	  image = tankImage;     
	}
	
	public ImageIcon getImage() 
	{
	  return image;
	}
  }//end class
