package com.battlegamefactory;

import javax.swing.ImageIcon;

   public abstract class Vehicle 
   {
    private ImageIcon image;

	//default constructor
	public Vehicle(){}
	
	//user-defined constructor
	public Vehicle(ImageIcon vehicleImage) 
	{
	    image = vehicleImage;     
	}	
	
	public ImageIcon getImage() 
	{
	    return image;
	}
}