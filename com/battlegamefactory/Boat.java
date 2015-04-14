package com.battlegamefactory;

import javax.swing.ImageIcon;

  public class Boat extends SeaVehicle 
  {
   private ImageIcon image;

	public Boat(ImageIcon boatImage) 
	{
	  image = boatImage;     
	}
	
	public ImageIcon getImage() 
	{
	  return image;
	}
  }//end class
