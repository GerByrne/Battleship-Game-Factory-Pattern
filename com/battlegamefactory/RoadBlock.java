package com.battlegamefactory;

import javax.swing.ImageIcon;

  public class RoadBlock extends DamageItem 
  {
   private ImageIcon image;
   
    public RoadBlock(ImageIcon roadBlockImage) 
	{
	    image = roadBlockImage;     
	}
	
	public ImageIcon getImage() 
	{
	    return image;
	}
  }//end class

