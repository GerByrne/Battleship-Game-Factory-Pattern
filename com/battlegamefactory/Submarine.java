package com.battlegamefactory;

import javax.swing.ImageIcon;

  public class Submarine extends SeaVehicle 
  {
   private ImageIcon image;

	public Submarine(ImageIcon submarineImage) 
	{
	  image = submarineImage;     
	}
	
	public ImageIcon getImage() 
	{
	  return image;
	}
  }//end class
