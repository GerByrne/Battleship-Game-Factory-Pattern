package com.battlegamefactory;

import javax.swing.ImageIcon;

  public abstract class DamageItem 
  {
   private ImageIcon image;

	//default constructor
	public DamageItem(){}
	
	//user-defined constructor
	public DamageItem(ImageIcon damageItemImage) 
	{
	    image = damageItemImage;    
	}	
	
	public ImageIcon getImage() 
	{
	    return image;
	}
  }
