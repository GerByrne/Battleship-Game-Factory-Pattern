package com.battlegamefactory;

import javax.swing.ImageIcon;

public class Mine extends DamageItem
{
	private ImageIcon image;
	
	public Mine(ImageIcon mineImage) 
	{
	    image = mineImage;     
	}
	
	public ImageIcon getImage() 
	{
	    return image;
	}
}//end class
