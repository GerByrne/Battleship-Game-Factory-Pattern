package com.battlegamefactory;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class GameTest extends JFrame implements ActionListener { 	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BattleGameFactory battle = null;	
	private CalcRandomNum seaRandomNum;
	private CalcRandomNum landRandomNum;
	private Border loweredbevel = BorderFactory.createLoweredBevelBorder();
    private Border raisedbevel = BorderFactory.createRaisedBevelBorder();
    private JComboBox battleCombo;
	private JComboBox levelCombo;	
	private String[] comboStrArray = {"Choose Game", "Sea Game", "Land Game"};
	private String[] levelStrArray = {"1", "2", "3"};
	private JPanel gameGrid, topPanel, topLeftPanel, topCenterPanel, topRightPanel, bottomPanel; 
    private JButton HowTo, Reset, Quit;
    private Container cp;     
    private JButton[] gridButtons;    					
    private JLabel levelLabel, livesLeftLabel;
    private int gameSize = 5, livesInt = 3, winCount = 0;    //gameSize can be manually dynamically changed to set the default size of the game.
       
    public GameTest() 
    {
        super("Battle Guessing Game");        
        createAndShowGui();
    }//end constructor

////////////////////////////////////////////////////// GUI Method ///////////////////////////////////////////////////////////////////////////////
    
    private void createAndShowGui() 
    {   
    	gridButtons = new JButton[gameSize*gameSize];    	
    	seaRandomNum = new CalcRandomNum();				// create a new instance of the seaRandomNum class to get a set of random numbers 
    	seaRandomNum.randomNumbers(); 					//completes the new sea set of random numbers by pointing to randomNumbers()
    	landRandomNum = new CalcRandomNum();			  // create a new instance of the landRandomNum class to get a set of random numbers
    	landRandomNum.randomNumbers();					  //completes the new land set of random numbers by pointing to randomNumbers()
    	cp = getContentPane();    	
        
    	// create top panel
        topPanel = new JPanel(new GridLayout(1,3)); 						        
        topLeftPanel = new JPanel();
        topLeftPanel.setBackground(Color.CYAN);
        topCenterPanel = new JPanel();
        topRightPanel = new JPanel();
        topRightPanel.setBackground(Color.CYAN);
        livesLeftLabel = new JLabel();
        livesLeftLabel.setFont(new Font("Helvetica", Font.BOLD, 22));
    	livesLeftLabel.setText("LIVES : 3");
    	topCenterPanel.add(livesLeftLabel);
    	topCenterPanel.setBackground(Color.CYAN);
		HowTo = new JButton("How to Play");
		HowTo.addActionListener(this);
		levelLabel = new JLabel("Level");
		levelLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
		levelCombo = new JComboBox();									//This combo box is for the user to set the size/level of the game. There are 3 options.
		for (int i=0;i<levelStrArray.length;i++)
   	    {
		 levelCombo.addItem(levelStrArray[i]);
		 levelCombo.addItemListener(new LevelOptionListener());
  	    }//end of for loop
		topRightPanel.add(levelLabel);
		topRightPanel.add(levelCombo);
		topLeftPanel.add(HowTo);
		topPanel.add(topLeftPanel);
		topPanel.add(topCenterPanel);
		topPanel.add(topRightPanel);
		                        
        // create gameGrid panel        
        gameGrid = new JPanel(new GridLayout(gameSize,gameSize));        
        gameGrid.setBorder(raisedbevel);
        GameButtons();
        
        // create bottom panel        
        bottomPanel = new JPanel();
        Reset = new JButton("Reset");
        Quit = new JButton("Quit"); 
        battleCombo = new JComboBox(); 									//This combo box is for the user to set the battle type (concrete factory) of the game. Sea or Land.
        for (int i=0;i<comboStrArray.length;i++)
    	 {
          battleCombo.addItem(comboStrArray[i]);
          battleCombo.addItemListener(new BattleOptionListener());
    	 }//end of for loop         
        bottomPanel.add(Reset);
        bottomPanel.add(battleCombo);           //add combo box for concrete factory option  
        bottomPanel.add(Quit);
        Reset.addActionListener(this);
        Quit.addActionListener(this);                
        
        cp.add(topPanel,BorderLayout.NORTH);     
        cp.add(gameGrid, BorderLayout.CENTER);         
        cp.add(bottomPanel, BorderLayout.SOUTH);                
        setBounds(200,200, 550,600);
        setVisible(true);        
    }//end setGUI method

////////////////////////////////////////////////////// Action Listener ///////////////////////////////////////////////////////////////////////////////
    
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();       
        
        if (battleCombo.getSelectedIndex()==1)	
        {
     	 if (obj == gridButtons[seaRandomNum.randomNum1]){	
     	    gridButtons[seaRandomNum.randomNum1].setIcon(battle.getVehicleItem1().getImage());     	    
     	    winCount++; }
    	
     	 if (obj == gridButtons[seaRandomNum.randomNum2]) {
     	    gridButtons[seaRandomNum.randomNum2].setIcon(battle.getVehicleItem2().getImage());
     	    winCount++; }
     	
     	 if (obj == gridButtons[seaRandomNum.randomNum3]) {
      	    gridButtons[seaRandomNum.randomNum3].setIcon(battle.getDamageItem().getImage());
      	    livesInt--;
			String livesStr = Integer.toString(livesInt);
			livesLeftLabel.setText("LIVES : " + livesStr);}
     	
     	 if (obj == gridButtons[seaRandomNum.randomNum4]) {
      	    gridButtons[seaRandomNum.randomNum4].setIcon(battle.getDamageItem().getImage());
      	    livesInt--;
			String livesStr = Integer.toString(livesInt);
			livesLeftLabel.setText("LIVES : " + livesStr);}
     	
     	 if (obj == gridButtons[seaRandomNum.randomNum5]) {
      	    gridButtons[seaRandomNum.randomNum5].setIcon(battle.getVehicleItem1().getImage());
      	    winCount++; }
     	
     	 if (obj == gridButtons[seaRandomNum.randomNum6]) {
      	    gridButtons[seaRandomNum.randomNum6].setIcon(battle.getVehicleItem2().getImage());
      	    winCount++; }
     	
     	 if (obj == gridButtons[seaRandomNum.randomNum7]) {
      	    gridButtons[seaRandomNum.randomNum7].setIcon(battle.getDamageItem().getImage());
      	    livesInt--;
			String livesStr = Integer.toString(livesInt);
			livesLeftLabel.setText("LIVES : " + livesStr);
     	 }//gridButtons[seaRandomNum.randomNum7].removeActionListener(this);}
     	
     	 if (obj == gridButtons[seaRandomNum.randomNum8]) {
      	    gridButtons[seaRandomNum.randomNum8].setIcon(battle.getVehicleItem1().getImage());
      	    winCount++; }
     	
     	 if (obj == gridButtons[seaRandomNum.randomNum9]) {
      	    gridButtons[seaRandomNum.randomNum9].setIcon(battle.getVehicleItem2().getImage());
      	    winCount++; }
		     if(gameSize>5){    	 
		     	if (obj == gridButtons[seaRandomNum.randomNum10]) {     		
		      	    gridButtons[seaRandomNum.randomNum10].setIcon(battle.getVehicleItem1().getImage());
		      	    winCount++; }
		     	
		     	 if (obj == gridButtons[seaRandomNum.randomNum11]) {
		     		gridButtons[seaRandomNum.randomNum11].setIcon(battle.getDamageItem().getImage());
		      	    livesInt--;
					String livesStr = Integer.toString(livesInt);
					livesLeftLabel.setText("LIVES : " + livesStr);}
		     	 
		     	 if (obj == gridButtons[seaRandomNum.randomNum12]) {	
		      	    gridButtons[seaRandomNum.randomNum12].setIcon(battle.getVehicleItem2().getImage());
		      	    winCount++; }		     	
		     	
				       if(gameSize>6){      	
				     	 if (obj == gridButtons[seaRandomNum.randomNum13]) {
				     		gridButtons[seaRandomNum.randomNum13].setIcon(battle.getDamageItem().getImage());
				      	    livesInt--;
							String livesStr = Integer.toString(livesInt);
							livesLeftLabel.setText("LIVES : " + livesStr);}
				     	 
				     	 if (obj == gridButtons[seaRandomNum.randomNum14]) {	
				      	    gridButtons[seaRandomNum.randomNum14].setIcon(battle.getVehicleItem2().getImage());
				      	    winCount++; }
				     	 
				     	if (obj == gridButtons[seaRandomNum.randomNum15]) {     		
				      	    gridButtons[seaRandomNum.randomNum15].setIcon(battle.getVehicleItem1().getImage());
				      	    winCount++; }
				     	
				     	 if (obj == gridButtons[seaRandomNum.randomNum16]) {
				     		gridButtons[seaRandomNum.randomNum16].setIcon(battle.getDamageItem().getImage());
				      	    livesInt--;
							String livesStr = Integer.toString(livesInt);
							livesLeftLabel.setText("LIVES : " + livesStr);} 
				    }//end if game size < 6
		       }//end if game size < 5   	 
        }//end if battleCombo index is 1 (i.e Sea Game is chosen)
        
       
        else if (battleCombo.getSelectedIndex()==2)	//(battle != null)
        {
     	 if (obj == gridButtons[landRandomNum.randomNum1]){ 
     	    gridButtons[landRandomNum.randomNum1].setIcon(battle.getVehicleItem1().getImage());     	    
     	    winCount++; }
    	
     	 if (obj == gridButtons[landRandomNum.randomNum2]) {
     	    gridButtons[landRandomNum.randomNum2].setIcon(battle.getVehicleItem2().getImage());
     	    winCount++; }
     	
     	 if (obj == gridButtons[landRandomNum.randomNum3]) {
      	    gridButtons[landRandomNum.randomNum3].setIcon(battle.getDamageItem().getImage());
      	    livesInt--;
			String livesStr = Integer.toString(livesInt);
			livesLeftLabel.setText("LIVES : " + livesStr);}
     	
     	 if (obj == gridButtons[landRandomNum.randomNum4]) {
      	    gridButtons[landRandomNum.randomNum4].setIcon(battle.getDamageItem().getImage());
      	    livesInt--;
			String livesStr = Integer.toString(livesInt);
			livesLeftLabel.setText("LIVES : " + livesStr);}
     	
     	 if (obj == gridButtons[landRandomNum.randomNum5]) {
      	    gridButtons[landRandomNum.randomNum5].setIcon(battle.getVehicleItem1().getImage());
      	    winCount++; }
     	
     	 if (obj == gridButtons[landRandomNum.randomNum6]) {
      	    gridButtons[landRandomNum.randomNum6].setIcon(battle.getVehicleItem2().getImage());
      	    winCount++; }
     	
     	 if (obj == gridButtons[landRandomNum.randomNum7]) {
      	    gridButtons[landRandomNum.randomNum7].setIcon(battle.getDamageItem().getImage());
      	    livesInt--;
			String livesStr = Integer.toString(livesInt);
			livesLeftLabel.setText("LIVES : " + livesStr);}
     	
     	 if (obj == gridButtons[landRandomNum.randomNum8]) {
      	    gridButtons[landRandomNum.randomNum8].setIcon(battle.getVehicleItem1().getImage());
      	    winCount++; }
     	
     	 if (obj == gridButtons[landRandomNum.randomNum9]) {
      	    gridButtons[landRandomNum.randomNum9].setIcon(battle.getVehicleItem2().getImage());
      	    winCount++; } 
		     if(gameSize>5){ 
		     	 if (obj == gridButtons[landRandomNum.randomNum10]) {     		
		      	    gridButtons[landRandomNum.randomNum10].setIcon(battle.getVehicleItem1().getImage());
		      	    winCount++; }
		     	
		     	 if (obj == gridButtons[landRandomNum.randomNum11]) {
		     		gridButtons[landRandomNum.randomNum11].setIcon(battle.getDamageItem().getImage());
		      	    livesInt--;
					String livesStr = Integer.toString(livesInt);
					livesLeftLabel.setText("LIVES : " + livesStr);}
		     	 
		     	 if (obj == gridButtons[landRandomNum.randomNum12]) {	
		      	    gridButtons[landRandomNum.randomNum12].setIcon(battle.getVehicleItem2().getImage());
		      	    winCount++; }
		     	
		     	 if (obj == gridButtons[landRandomNum.randomNum13]) {     		
		      	    gridButtons[landRandomNum.randomNum13].setIcon(battle.getVehicleItem1().getImage());
		      	    winCount++; }
			        if(gameSize>6){
			     	  if (obj == gridButtons[landRandomNum.randomNum14]) {
			     	  	 gridButtons[landRandomNum.randomNum14].setIcon(battle.getDamageItem().getImage());
			      	     livesInt--;
						 String livesStr = Integer.toString(livesInt);
						 livesLeftLabel.setText("LIVES : " + livesStr);}
			     	 
			     	  if (obj == gridButtons[landRandomNum.randomNum15]) {	
			      	     gridButtons[landRandomNum.randomNum15].setIcon(battle.getVehicleItem2().getImage());
			      	     winCount++; }
			     	 
			     	  if (obj == gridButtons[landRandomNum.randomNum16]) {     		
			      	     gridButtons[landRandomNum.randomNum16].setIcon(battle.getVehicleItem1().getImage());
			      	     winCount++; }
			     	
			     	  if (obj == gridButtons[landRandomNum.randomNum17]) {
			     		 gridButtons[landRandomNum.randomNum17].setIcon(battle.getDamageItem().getImage());
			      	     livesInt--;
						 String livesStr = Integer.toString(livesInt);
						 livesLeftLabel.setText("LIVES : " + livesStr);}
			        }//end if game size < 6
		      }//end if game size < 5  
        }//end else if battleCombo index is 2 (i.e Land Game is chosen)
        
        if (obj == Quit)
            System.exit(0);
        
        if (obj == Reset)
        	//gameGrid.setBackground(Color.BLUE);//gameGrid.setLayout(new GridLayout(6,6));
        	clearSelection();   
        
        if (livesInt == 0)
    		gameLostMessage();
    		
        if (winCount == 6)
    		gameWinMessage();
        	
    	if(e.getActionCommand().equals("How to Play"))
    		howToPlayMessage();
    		
    }// end actionPerformed
    
//////////////////////////////////// Reset Method /////////////////////////////////////////    
    
    public void clearSelection() {
    	livesLeftLabel.setText("LIVES : 3");
    	livesInt = 3;
    	winCount = 0;
    	//battle = null;
        for (int i = 0; i < gridButtons.length; i++)
	   	 {   	  
        	gridButtons[i].setIcon(null);
	   	 }        
    }

///////////////////////////////// GameButtons Method /////////////////////////////////////
    //This method initializes and adds buttons to the game grid panel. It is called 
    //both in the createAndShowGUI method and LevelOptionListener itemListener.   
    public void GameButtons()
    {     						
     for(int i = 0; i < gridButtons.length; ++i)
     { 
      gridButtons[i] = new JButton();
      gridButtons[i].setBorder(loweredbevel); 
      gridButtons[i].setBackground(Color.WHITE);
      gridButtons[i].setFocusPainted(false);      
      gameGrid.add(gridButtons[i]);
      gridButtons[i].addActionListener(this);      
     }
    }//end of GameButton method

////////////////////////////////How to Play Message //////////////////////////////////////
    
    public void howToPlayMessage(){
		 String message = " Choose Sea Game or Land Game from the dropdown menu. Then try to "
		   				   +"\n find all of the 6 vehicles before you find the 3 Sea Mines or Road Blocks. "
		   				   +"\n You have 3 lives. Each Mine or Road Block discovered represents a live "
		 				   +"\n lost. You can choose a new level game at any time. Good Luck! ";

	     JOptionPane.showMessageDialog(null, message + "\n\n", "Game help... ", JOptionPane.PLAIN_MESSAGE);	     
	}//end of helpMessage dialog method
    
//////////////////////////////// Game Lost Message //////////////////////////////////////
   
    public void gameLostMessage(){
    	
		 String message = "\nGame Over!  You Lose. Click Reset to Try again";
				 		
	     JOptionPane.showMessageDialog(null, message + "\n\n", "Game Over... ", JOptionPane.PLAIN_MESSAGE);   
    	
	}//end of OverMessage dialog method
    
////////////////////////////////Game Win Message //////////////////////////////////////
    
	public void gameWinMessage(){
	
		String message = "\nGame Over!  You Win. Click Reset to Play Again";
	
		JOptionPane.showMessageDialog(null, message + "\n\n", "Game Over... ", JOptionPane.PLAIN_MESSAGE);   

	}//end of OverMessage dialog method
        
//////////////////////////////// Main Method //////////////////////////////////////
    
    static public void main(String args[]) 
    {
     new GameTest();
    }
    
//////////////////////// BattleOptionListener //////////////////////////////////////
    
    class BattleOptionListener implements ItemListener 
    {
      public void itemStateChanged(ItemEvent e)  
      {        
       if (battleCombo.getSelectedIndex()==1){    	   
		 // creating an instance of BattleGameFactory as SeaGameConcreteFactory and clear previous 
    	 clearSelection(); battle = new SeaGameConcreteFactory();}
       
       else if (battleCombo.getSelectedIndex()==2){    
         // creating an instance of BattleGameFactory as LandGameConcreteFactory and clear previous 
    	 clearSelection(); battle = new LandGameConcreteFactory();}
       
       else {battle = null; clearSelection();}			//this else is for 'Choose Game' which is at index 0 and resets it.
      }
    } 	       
    
///////////////////////////////////////////// LevelOptionListener ////////////////////////////////////////
    
    class LevelOptionListener implements ItemListener {
    	//Refreshing the gameGrid panel is achieved with container.setVisible(false); container.revalidate(); container.setVisible(true);
		public void itemStateChanged(ItemEvent e) {
			clearSelection(); battleCombo.getSelectedIndex();
			gameSize = levelCombo.getSelectedIndex()+5;  
			//if (levelCombo.getSelectedIndex()==2){    	
		    	cp.setVisible(false);
		    	for(int i = 0; i < gridButtons.length; ++i)
		        { 
		    	 gameGrid.remove(gridButtons[i]);
		        }
		    	cp.revalidate();
				gridButtons = new JButton[gameSize*gameSize];				
		    	GameButtons();		    	
		    	gameGrid.setLayout(new GridLayout(gameSize, gameSize));
		    	cp.setVisible(true);			
		}//end event listener method
    }//end LevelOptionListener inner class
    
}//end of GameTest class

