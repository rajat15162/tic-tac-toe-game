import javax.swing.*;
import java.util.*;

import java.awt.*;
import java.awt.event.*;
public class TicTacToe   {

	Random dice;
	 Container c;
	 JFrame frame;
	 JButton btn1;
	JButton btn2;
	 JLabel label,label1;
	 JButton btn3,btn4,btn5,btn6,btn7;
	 public boolean player1Won = false;
	 public boolean player2Won= false;
	 public boolean AIWon= false;
	 public boolean playerWon= false;
	 public boolean computerWon= false;
	 public boolean player1Turn = true;
	
	 public boolean AITurn = false;
	 public boolean playerTurn = true;
	 public boolean computerTurn = false;
	 String value1,value2;
	String str,check;
	int t = 0,option;
	
	Font f,f1,f2;

	 JButton[] b = new JButton[9];
	 JButton[] b1=new JButton[9];
	 JButton[] b2=new JButton[9];
	 JButton[] b3=new JButton[9];
	 
	
		public TicTacToe()
		{
			
			dice = new Random();
			
		
		frame = new JFrame();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(450,100,700,500);
		
		 c = frame.getContentPane();
		c.setBackground(Color.BLACK);
		frame.setLayout(null);
		
		 label = new JLabel("Tic-Tac-Toe");
		label.setBounds(225,100,300,30);
		
		f = new Font("Sans-Serif",Font.BOLD,30);
		 f1 = new Font("Arial",Font.BOLD,40);
		label.setFont(f1);
		label.setForeground(Color.YELLOW);
		frame.add(label);
		
		 btn1 = new JButton("START");
		
		 btn2 = new JButton("EXIT");
		 label1 = new JLabel("OUTPUT");
		 
		 
		
		Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		btn1.setCursor(cur);
		btn2.setCursor(cur);
		
		
		btn1.setBounds(250,200,150,30);
		btn1.setBackground(Color.GREEN);
		btn1.setFont(f);
		btn1.setForeground(Color.RED);
		frame.add(btn1);
		
		btn2.setBounds(250,300,150,30);
		btn2.setBackground(Color.GREEN);
		btn2.setFont(f);
		frame.add(btn2);
		btn2.setForeground(Color.RED);
		
		
		btn1.addActionListener( new ActionListener(){
			
			public void actionPerformed(ActionEvent event){
				
		
				c.removeAll();
				
				c.repaint();
				
			 btn3 = new JButton("User1 vs User2");
				 btn4 = new JButton("User vs CPU");
			btn5 = new JButton("CPU vs Al Bot");
			 btn6 = new JButton("User vs Al bot");
				btn7 = new JButton("Exit");
				Cursor cur = new Cursor(Cursor.HAND_CURSOR);
				btn3.setCursor(cur);
				btn4.setCursor(cur);
				btn5.setCursor(cur);
				btn6.setCursor(cur);
				btn7.setCursor(cur);
				
				btn3.setBounds(50,100,150,30);
				btn4.setBounds(50,150,150,30);
				btn5.setBounds(50,200,150,30);
				btn6.setBounds(50,250,150,30);
				btn7.setBounds(50,300,150,30);
				
				btn3.setBackground(Color.GREEN);
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				btn7.setBackground(Color.GREEN);
				
				btn3.setForeground(Color.RED);
				btn4.setForeground(Color.RED);
				btn5.setForeground(Color.RED);
				btn6.setForeground(Color.RED);
				btn7.setForeground(Color.RED);
				
				label1.setBounds(350,400,500,30);
				label1.setForeground(Color.RED);
				label1.setBackground(Color.GREEN);
				 f2 = new Font("Arial",Font.ITALIC,20);
				label1.setFont(f2);
				frame.add(btn3);
				frame.add(btn4);
				frame.add(btn5);
				frame.add(btn6);
				frame.add(btn7);
				frame.add(label1);
			
				int	x=300,y=50,j=0;
				for(int i=0;i<9;i++,x+=100,j++){
				 b[i]=new JButton();
				if(j==3)
				{j=0; y+=100; x=300;}
				 b[i].setBounds(x,y,100,100);
			//	frame.add(b[i]);
			
				}
				
				
				int	x1=300,y1=50,j1=0;
				for(int i1=0;i1<9;i1++,x1+=100,j1++){
				 b1[i1]=new JButton();
				if(j1==3)
				{j1=0; y1+=100; x1=300;}
				 b1[i1].setBounds(x1,y1,100,100);
			//	frame.add(b[i]);
			
				}
				
				
				int	x2=300,y2=50,j2=0;
				for(int i2=0;i2<9;i2++,x2+=100,j2++){
				 b2[i2]=new JButton();
				if(j2==3)
				{j2=0; y2+=100; x2=300;}
				 b2[i2].setBounds(x2,y2,100,100);
			//	frame.add(b[i]);
			
				}
				
				int	x3=300,y3=50,j3=0;
				for(int i3=0;i3<9;i3++,x3+=100,j3++){
				 b3[i3]=new JButton();
				if(j3==3)
				{j3=0; y3+=100; x3=300;}
				 b3[i3].setBounds(x3,y3,100,100);
			//	frame.add(b[i]);
			
				}
				
				
				
				
				
				
				
				
								
				
				 btn3.addActionListener( new ActionListener(){
						
						public void actionPerformed(ActionEvent event){
							for(int i =0;i<9;i++)
							{
								b[i].setText("");
							
								frame.remove(b1[i]);
								frame.remove(b3[i]);
								frame.add(b[i]);
								
							}
							player1Won = false;
							player2Won= false;
							player1Turn = true;
							btnAction(event);
							JTextField field1 = new JTextField();
							JTextField field2 = new JTextField();
							
							
							Object[] message = {
							    "User 1:", field1,
							    "User 2:", field2,
							    
							};
					        option = JOptionPane.showConfirmDialog(frame, message, "Enter user names", JOptionPane.OK_CANCEL_OPTION);
							
							
							     
					if(option == JOptionPane.CANCEL_OPTION)		
					{
						for(int i =0;i<9;i++)
							b[i].setText("");
							btn3.setBackground(Color.GREEN);
							btn4.setBackground(Color.GREEN);
							btn5.setBackground(Color.GREEN);
							btn6.setBackground(Color.GREEN);
							label1.setText("");
							
							
						

							
						
						
					}

						
					
					 if (option == JOptionPane.OK_OPTION){
						 int a=1;
					 
						while(a==1)
						{     
							
							value1 = field1.getText();
						     value2 = field2.getText();
							
						
							     if(value1.isEmpty() || value2.isEmpty())
							     {
							    	 JOptionPane.showMessageDialog(frame,
											    "Please enter valid name",
											    "Error",
											    JOptionPane.PLAIN_MESSAGE);
							    	 
							    	 option = JOptionPane.showConfirmDialog(frame, message, "Enter user names", JOptionPane.OK_CANCEL_OPTION);
							    	 
							     }
							     
							     else if(option == JOptionPane.CANCEL_OPTION)		
									{
										for(int i =0;i<9;i++)
											b[i].setText("");
											btn3.setBackground(Color.GREEN);
											btn4.setBackground(Color.GREEN);
											btn5.setBackground(Color.GREEN);
											btn6.setBackground(Color.GREEN);
											label1.setText("");
											a--;
											
											
										

											
										
										
									}

										
							     
							     else
							    	 a--;
							    	 
						}}
							     
						
						
							

							      if (option == JOptionPane.OK_OPTION){
								
							    label1.setText(value1 + " 's turn");
								b[0].addActionListener(new ActionListener() {
									
									public void actionPerformed(ActionEvent e) {
										b0(e);
									}
								});
								
								
	b[1].addActionListener(new ActionListener() {
									
									public void actionPerformed(ActionEvent e) {
										b1(e);
									}
								});
	
	
	b[2].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b2(e);
		}
	});

	
	
	
	b[3].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b3(e);
		}
	});
	
	
	
	b[4].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b4(e);
		}
	});
	
	
	
	b[5].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b5(e);
		}
	});
	
	
	b[6].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b6(e);
		}
	});
	
	
	b[7].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b7(e);
		}
	});
	
	
	b[8].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b8(e);
		}
	});
						}
							
								
								
							
						}
					});
				

				 btn4.addActionListener( new ActionListener(){
						
						public void actionPerformed(ActionEvent event){
							for(int i =0;i<9;i++)
								{b1[i].setText("");
								
								frame.remove(b[i]);
								frame.remove(b3[i]);
								frame.add(b1[i]);
								}
							player1Won = false;
							player2Won= false;
							playerWon=false;
							computerWon=false;
									
							player1Turn = true;
							playerTurn=true;
							btnAction(event);
							JTextField field1 = new JTextField();
							
							
							
							Object[] message = {
							    "User :", field1,
							   
							    
							};
					      option = JOptionPane.showConfirmDialog(frame, message, "Enter user name", JOptionPane.OK_CANCEL_OPTION);
							
							
							     
							   
						
						
						     
							if(option == JOptionPane.CANCEL_OPTION)		
							{
								for(int i =0;i<9;i++)
									b1[i].setText("");
									btn3.setBackground(Color.GREEN);
									btn4.setBackground(Color.GREEN);
									btn5.setBackground(Color.GREEN);
									btn6.setBackground(Color.GREEN);
									label1.setText("");
									
									
								

									
								
								
							}

								
							
							 if (option == JOptionPane.OK_OPTION){
								 int a=1;
							 
								while(a==1)
								{     
									
									value1 = field1.getText();
								     
								
									     if(value1.isEmpty())
									     {
									    	 JOptionPane.showMessageDialog(frame,
													    "Please enter valid name",
													    "Error",
													    JOptionPane.PLAIN_MESSAGE);
									    	 
									    	 option = JOptionPane.showConfirmDialog(frame, message, "Enter user name", JOptionPane.OK_CANCEL_OPTION);
									    	 
									     }
									     
									     else  if(option == JOptionPane.CANCEL_OPTION)		
											{
												for(int i =0;i<9;i++)
													b1[i].setText("");
													btn3.setBackground(Color.GREEN);
													btn4.setBackground(Color.GREEN);
													btn5.setBackground(Color.GREEN);
													btn6.setBackground(Color.GREEN);
													label1.setText("");
													a--;
													
													
												

													
												
												
											}

												
									     
									     else
									    	 a--;
									    	 
								}}
									     
								
								
									
						
						
							

							      if (option == JOptionPane.OK_OPTION){
								
							    label1.setText(value1 + " 's turn");
								b1[0].addActionListener(new ActionListener() {
									
									public void actionPerformed(ActionEvent e) {
										b0btn4(e);
									}
								});
								
								
	b1[1].addActionListener(new ActionListener() {
									
									public void actionPerformed(ActionEvent e) {
										b1btn4(e);
									}
								});
	
	
	b1[2].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b2btn4(e);
		}
	});

	
	
	
	b1[3].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b3btn4(e);
		}
	});
	
	
	
	b1[4].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b4btn4(e);
		}
	});
	
	
	
	b1[5].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b5btn4(e);
		}
	});
	
	
	b1[6].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b6btn4(e);
		}
	});
	
	
	b1[7].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b7btn4(e);
		}
	});
	
	
	b1[8].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b8btn4(e);
		}
	});
						}
							
								
						}
					});
				
				 

				 btn5.addActionListener( new ActionListener(){
						
						public void actionPerformed(ActionEvent event){
							
							btnAction(event);
						}
					});
				 

				 btn6.addActionListener( new ActionListener(){
						
					 public void actionPerformed(ActionEvent event){
							for(int i =0;i<9;i++)
							{
								b3[i].setText("");
								
								frame.remove(b1[i]);
								frame.remove(b2[i]);
								frame.add(b3[i]);
								
								
							}
							player1Won = false;
							player2Won= false;
							playerWon=false;
							computerWon=false;
							AIWon=false;
							playerTurn=true;
							
							
							btnAction(event);
							JTextField field1 = new JTextField();
							
							
							
							Object[] message = {
							    "User :", field1
							   
							    
							};
					        option = JOptionPane.showConfirmDialog(frame, message, "Enter user names", JOptionPane.OK_CANCEL_OPTION);
							
							
							     
					if(option == JOptionPane.CANCEL_OPTION)		
					{
						for(int i =0;i<9;i++)
							b3[i].setText("");
							btn3.setBackground(Color.GREEN);
							btn4.setBackground(Color.GREEN);
							btn5.setBackground(Color.GREEN);
							btn6.setBackground(Color.GREEN);
							label1.setText("");
							
							
						

							
						
						
					}

						
					
					 if (option == JOptionPane.OK_OPTION){
						 int a=1;
					 
						while(a==1)
						{     
							
							value1 = field1.getText();
						    
							
						
							     if(value1.isEmpty())
							     {
							    	 JOptionPane.showMessageDialog(frame,
											    "Please enter valid name",
											    "Error",
											    JOptionPane.PLAIN_MESSAGE);
							    	 
							    	 option = JOptionPane.showConfirmDialog(frame, message, "Enter user names", JOptionPane.OK_CANCEL_OPTION);
							    	 
							     }
							     
							     else if(option == JOptionPane.CANCEL_OPTION)		
									{
										for(int i =0;i<9;i++)
											b3[i].setText("");
											btn3.setBackground(Color.GREEN);
											btn4.setBackground(Color.GREEN);
											btn5.setBackground(Color.GREEN);
											btn6.setBackground(Color.GREEN);
											label1.setText("");
											a--;
											
											
										

											
										
										
									}

										
							     
							     else
							    	 a--;
							    	 
						}}
							     
						
						
							

							      if (option == JOptionPane.OK_OPTION){
							    	//  b3[0].setText("X");
							   label1.setText(value1 + " 's turn");
							   // System.out.println("mm");
								b3[0].addActionListener(new ActionListener() {
									
									public void actionPerformed(ActionEvent e) {
										
										btn6b0(e);
									}
								});
								
								
	b3[1].addActionListener(new ActionListener() {
		
									public void actionPerformed(ActionEvent e) {
										//System.out.println("kya");
										btn6b1(e);
									}
								});
								
							//	b3[1].addActionListener(this);
	
	
	b3[2].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			btn6b2(e);
			System.out.println("nn");
		}
	});

	
	
	
	b3[3].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			btn6b3(e);
		}
	});
	
	
	
	b3[4].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			btn6b4(e);
		}
	});
	
	
	
	b3[5].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			btn6b5(e);
		}
	});
	
	
	b3[6].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			btn6b6(e);
		}
	});
	
	
	b3[7].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			btn6b7(e);
		}
	});
	
	
	b3[8].addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			btn6b8(e);
		}
	});
							      }
							
								
								
							
						}
					});
				 

				 btn7.addActionListener( new ActionListener(){
						
						public void actionPerformed(ActionEvent event){
							
							
							System.exit(0);
						}
					});
				 

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

			}
		});
		
		
		
		
		
     btn2.addActionListener( new ActionListener(){
			
			public void actionPerformed(ActionEvent event){
				
				System.exit(0);
				
			}
		});
     
     
     
		}
		
		
		public void btnAction(ActionEvent event)
		{
			/*JButton bb = (JButton)event.getSource();
			bb.setBackground(Color.YELLOW);*/
			
			if(event.getSource()==btn3)
			{
				btn3.setBackground(Color.YELLOW);
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				
			}
			
			if(event.getSource()==btn4)
			{
				btn4.setBackground(Color.YELLOW);
				btn3.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				
			}

			
			if(event.getSource()==btn5)
			{
				btn5.setBackground(Color.YELLOW);
				btn4.setBackground(Color.GREEN);
				btn3.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				
			}

			
			if(event.getSource()==btn6)
			{
				btn6.setBackground(Color.YELLOW);
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn3.setBackground(Color.GREEN);
				
			}

			
			
			
			
		
		}
		
		
		public void checkForWin(int m){
			if(m==1)
			{
			if(b[0].getText().equals("X")){
				
				if(b[3].getText().equals("X")){
					if(b[6].getText().equals("X")){
						player1Won = true;
						player2Won = false;
						
						
					}
				}
			}
			
if(b[0].getText().equals("X")){
				
				if(b[4].getText().equals("X")){
					if(b[8].getText().equals("X")){
						player1Won = true;
						player2Won = false;
						
						
					}
				}
			}


if(b[0].getText().equals("X")){
	
	if(b[1].getText().equals("X")){
		if(b[2].getText().equals("X")){
			player1Won = true;
			player2Won = false;
			
			
		}
	}
}


if(b[2].getText().equals("X")){
	
	if(b[4].getText().equals("X")){
		if(b[6].getText().equals("X")){
			player1Won = true;
			player2Won = false;
			
			
		}
	}
}
    

if(b[2].getText().equals("X")){
	
	if(b[5].getText().equals("X")){
		if(b[8].getText().equals("X")){
			player1Won = true;
			player2Won = false;
			
			
		}
	}
}



if(b[6].getText().equals("X")){
	
	if(b[7].getText().equals("X")){
		if(b[8].getText().equals("X")){
			player1Won = true;
			player2Won = false;
			
		}
	}
}



if(b[3].getText().equals("X")){
	
	if(b[4].getText().equals("X")){
		if(b[5].getText().equals("X")){
			player1Won = true;
			player2Won = false;
			
			
		}
	}
}


if(b[1].getText().equals("X")){
	
	if(b[4].getText().equals("X")){
		if(b[7].getText().equals("X")){
			player1Won = true;
			player2Won = false;
			
			
		}
	}
}

if(b[0].getText().equals("0")){
	
	if(b[3].getText().equals("0")){
		if(b[6].getText().equals("0")){
			player1Won = false;
			player2Won  =  true;
			
			
		}
	}
}

if(b[0].getText().equals("0")){
	
	if(b[4].getText().equals("0")){
		if(b[8].getText().equals("0")){
			player1Won = false;
			player2Won  =  true;
			
			
		}
	}
}


if(b[0].getText().equals("0")){

if(b[1].getText().equals("0")){
if(b[2].getText().equals("0")){
	player1Won = false;
	player2Won  =  true;


}
}
}


if(b[2].getText().equals("0")){

if(b[4].getText().equals("0")){
if(b[6].getText().equals("0")){
	player1Won = false;
	player2Won  =  true;


}
}
}


if(b[2].getText().equals("0")){

if(b[5].getText().equals("0")){
if(b[8].getText().equals("0")){
	player1Won = false;
	player2Won  =  true;

}
}
}



if(b[6].getText().equals("0")){

if(b[7].getText().equals("0")){
if(b[8].getText().equals("0")){
	player1Won = false;
	player2Won  =  true;


}
}
}



if(b[3].getText().equals("0")){

if(b[4].getText().equals("0")){
if(b[5].getText().equals("0")){
	player1Won = false;
	player2Won  =  true;

}
}
}


if(b[1].getText().equals("0")){

if(b[4].getText().equals("0")){
if(b[7].getText().equals("0")){
	player1Won = false;
	player2Won  =  true;


}
}
}
			}




		if(m==2){
			
			
			if(b1[0].getText().equals("X")){
				
				if(b1[3].getText().equals("X")){
					if(b1[6].getText().equals("X")){
						playerWon = true;
						computerWon = false;
						
						
					}
				}
			}

			if(b1[0].getText().equals("X")){
				
				if(b1[4].getText().equals("X")){
					if(b1[8].getText().equals("X")){
						playerWon = true;
						computerWon = false;
						
						
					}
				}
			}

if(b1[0].getText().equals("X")){

if(b1[1].getText().equals("X")){
if(b1[2].getText().equals("X")){
	playerWon = true;
	computerWon = false;


}
}
}


if(b1[2].getText().equals("X")){

if(b1[4].getText().equals("X")){
if(b1[6].getText().equals("X")){
	playerWon = true;
	computerWon = false;


}
}
}


if(b1[2].getText().equals("X")){

if(b1[5].getText().equals("X")){
if(b1[8].getText().equals("X")){
	playerWon = true;
	computerWon = false;


}
}
}



if(b1[6].getText().equals("X")){

if(b1[7].getText().equals("X")){
if(b1[8].getText().equals("X")){
	playerWon = true;
	computerWon = false;
}
}
}



if(b1[3].getText().equals("X")){

if(b1[4].getText().equals("X")){
if(b1[5].getText().equals("X")){
	playerWon = true;
	computerWon = false;

}
}
}


if(b1[1].getText().equals("X")){

if(b1[4].getText().equals("X")){
if(b1[7].getText().equals("X")){
	playerWon = true;
	computerWon = false;


}
}
}

if(b1[0].getText().equals("0")){

if(b1[3].getText().equals("0")){
if(b1[6].getText().equals("0")){
playerWon = false;
computerWon  =  true;


}
}
}

if(b1[0].getText().equals("0")){

if(b1[4].getText().equals("0")){
if(b1[8].getText().equals("0")){
	playerWon = false;
	computerWon  =  true;


}
}
}


if(b1[0].getText().equals("0")){

if(b1[1].getText().equals("0")){
if(b1[2].getText().equals("0")){
	playerWon = false;
	computerWon  =  true;


}
}
}


if(b1[2].getText().equals("0")){

if(b1[4].getText().equals("0")){
if(b1[6].getText().equals("0")){
	playerWon = false;
	computerWon  =  true;


}
}
}


if(b1[2].getText().equals("0")){

if(b1[5].getText().equals("0")){
if(b1[8].getText().equals("0")){
	playerWon = false;
	computerWon  =  true;
}
}
}



if(b1[6].getText().equals("0")){

if(b1[7].getText().equals("0")){
if(b1[8].getText().equals("0")){
	playerWon = false;
	computerWon  =  true;


}
}
}



if(b1[3].getText().equals("0")){

if(b1[4].getText().equals("0")){
if(b1[5].getText().equals("0")){
	playerWon = false;
	computerWon  =  true;
}
}
}


if(b1[1].getText().equals("0")){

if(b1[4].getText().equals("0")){
if(b1[7].getText().equals("0")){
	playerWon = false;
	computerWon  =  true;


}
}
}


			}
		
if(m==4){
			
			
			if(b3[0].getText().equals("X")){
				
				if(b3[3].getText().equals("X")){
					if(b3[6].getText().equals("X")){
						AIWon = true;
						playerWon = false;
						
						
					}
				}
			}

			if(b3[0].getText().equals("X")){
				
				if(b3[4].getText().equals("X")){
					if(b3[8].getText().equals("X")){
						AIWon = true;
						playerWon = false;
						
						
					}
				}
			}

if(b3[0].getText().equals("X")){

if(b3[1].getText().equals("X")){
if(b3[2].getText().equals("X")){
	AIWon = true;
	playerWon = false;


}
}
}


if(b3[2].getText().equals("X")){

if(b3[4].getText().equals("X")){
if(b3[6].getText().equals("X")){
	AIWon = true;
	playerWon = false;


}
}
}


if(b3[2].getText().equals("X")){

if(b3[5].getText().equals("X")){
if(b3[8].getText().equals("X")){
	AIWon = true;
	playerWon = false;


}
}
}



if(b3[6].getText().equals("X")){

if(b3[7].getText().equals("X")){
if(b3[8].getText().equals("X")){
	AIWon = true;
	playerWon = false;
}
}
}



if(b3[3].getText().equals("X")){

if(b3[4].getText().equals("X")){
if(b3[5].getText().equals("X")){
	AIWon = true;
	playerWon = false;

}
}
}


if(b3[1].getText().equals("X")){

if(b3[4].getText().equals("X")){
if(b3[7].getText().equals("X")){
	AIWon = true;
	playerWon = false;


}
}
}

if(b3[0].getText().equals("0")){

if(b3[3].getText().equals("0")){
if(b3[6].getText().equals("0")){
	AIWon = false;
	playerWon = true;


}
}
}

if(b3[0].getText().equals("0")){

if(b3[4].getText().equals("0")){
if(b3[8].getText().equals("0")){
	AIWon = false;
	playerWon = true;


}
}
}


if(b3[0].getText().equals("0")){

if(b3[1].getText().equals("0")){
if(b3[2].getText().equals("0")){
	AIWon = false;
	playerWon = true;


}
}
}


if(b3[2].getText().equals("0")){

if(b3[4].getText().equals("0")){
if(b3[6].getText().equals("0")){
	AIWon = false;
	playerWon = true;


}
}
}


if(b3[2].getText().equals("0")){

if(b3[5].getText().equals("0")){
if(b3[8].getText().equals("0")){
	AIWon = false;
	playerWon = true;
}
}
}



if(b3[6].getText().equals("0")){

if(b3[7].getText().equals("0")){
if(b3[8].getText().equals("0")){
	AIWon = false;
	playerWon = true;


}
}
}



if(b3[3].getText().equals("0")){

if(b3[4].getText().equals("0")){
if(b3[5].getText().equals("0")){
	AIWon = false;
	playerWon = true;
}
}
}


if(b3[1].getText().equals("0")){

if(b3[4].getText().equals("0")){
if(b3[7].getText().equals("0")){
	AIWon = false;
	playerWon = true;


}
}
}


			}

		
		}


		
		
		
		
		
		







		




		
		
		
		
		
		public void b0(ActionEvent e){
			int f=1;
			if(b[0].getText().equals("")){
				
				if(player1Turn == true){
					 
					b[0].setText("X");
					checkForWin(1);
					player1Turn = false;
					if(gameOver(1))
					{   for(int i =0;i<9;i++)
						b[i].setText("");
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					label1.setText("");
						whoWin(1);
						f=0;
					}
					else if(!gameOver(1))
							label1.setText(value2 + " 's turn");
					
					
					
					
				}
				else if(f==1)
				{
					b[0].setText("0");
					checkForWin(1);
					player1Turn = true;
					if(gameOver(1))
					{   for(int i =0;i<9;i++)
						b[i].setText("");
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					label1.setText("");
						whoWin(1);
					}
					else if(!gameOver(1))
					label1.setText(value1 + " 's turn");
				}
			}
		}
		
		
public void b1(ActionEvent e){
			int f=1;
			if(b[1].getText().equals("")){
				
				if(player1Turn == true){
					 
					b[1].setText("X");
					checkForWin(1);
					player1Turn = false;
					if(gameOver(1))
					{   for(int i =0;i<9;i++)
						b[i].setText("");
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					label1.setText("");
						whoWin(1);
						f=0;
					}
					else if(!gameOver(1))
					label1.setText(value2 + " 's turn");
					
					
					
				}
				else if(f==1)
				{
					b[1].setText("0");
					checkForWin(1);
					player1Turn = true;
					if(gameOver(1))
					{   for(int i =0;i<9;i++)
						b[i].setText("");
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					label1.setText("");
						whoWin(1);
					}
					else if(!gameOver(1))
					label1.setText(value1 + " 's turn");
				}
			}
		}


public void b2(ActionEvent e){
	int f=1;
	if(b[2].getText().equals("")){
		
		if(player1Turn == true){
			 
			b[2].setText("X");
			checkForWin(1);
			player1Turn = false;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
				f=0;
			}
			else if(!gameOver(1))
			label1.setText(value2 + " 's turn");
			
			
		}
		else if(f==1)
		{
			b[2].setText("0");
			checkForWin(1);
			player1Turn = true;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
			}
			else if(!gameOver(1))
			label1.setText(value1 + " 's turn");
		}
	}
}



public void b3(ActionEvent e){
	int f=1;
	if(b[3].getText().equals("")){
		
		if(player1Turn == true){
			 
			b[3].setText("X");
			checkForWin(1);
			player1Turn = false;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
				f=0;
			}
			else if(!gameOver(1))
			label1.setText(value2 + " 's turn");
			
		}
		else if(f==1)
		{
			b[3].setText("0");
			checkForWin(1);
			player1Turn = true;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
			}
			else if(!gameOver(1))
			label1.setText(value1 + " 's turn");
		}
	}
}
		


public void b4(ActionEvent e){
	int f=1;
	if(b[4].getText().equals("")){
		
		if(player1Turn == true){
			 
			b[4].setText("X");
			checkForWin(1);
			player1Turn = false;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
				f=0;
			}
			
			else if(!gameOver(1))
			
			label1.setText(value2 + " 's turn");
			
		}
		else if(f==1)
		{
			b[4].setText("0");
			checkForWin(1);
			player1Turn = true;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
			}
			else if(!gameOver(1))
			label1.setText(value1 + " 's turn");
		}
	}
}


public void b5(ActionEvent e){
	int f=1;
	if(b[5].getText().equals("")){
		
		if(player1Turn == true){
			 
			b[5].setText("X");
			checkForWin(1);
			player1Turn = false;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
				f=0;
			}
			else if(!gameOver(1))
			label1.setText(value2 + " 's turn");
			
			
		}
		else if(f==1)
		{
			b[5].setText("0");
			checkForWin(1);
			player1Turn = true;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
			}
			else if(!gameOver(1))
			label1.setText(value1 + " 's turn");
		}
	}
}
		
public void b6(ActionEvent e){
	int f=1;
	if(b[6].getText().equals("")){
		
		if(player1Turn == true){
			 
			b[6].setText("X");
			checkForWin(1);
			player1Turn = false;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
				f=0;
			}
			else if(!gameOver(1))
			label1.setText(value2 + " 's turn");
			
			
		}
		else if(f==1)
		{
			b[6].setText("0");
			checkForWin(1);
			player1Turn = true;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
			}
			else if(!gameOver(1))
			label1.setText(value1 + " 's turn");
		}
	}
}



public void b7(ActionEvent e){
	int f=1;
	if(b[7].getText().equals("")){
		
		if(player1Turn == true){
			 
			b[7].setText("X");
			checkForWin(1);
			player1Turn = false;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
				f=0;
			}
			else if(!gameOver(1))
			label1.setText(value2 + " 's turn");
			
			
		}
		else if(f==1)
		{
			b[7].setText("0");
			checkForWin(1);
			player1Turn = true;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
			}
			else if(!gameOver(1))
			label1.setText(value1 + " 's turn");
		}
	}
}

public void b8(ActionEvent e){
	int f=1;
	if(b[8].getText().equals("")){
		
		if(player1Turn == true){
			 
			b[8].setText("X");
			checkForWin(1);
			player1Turn = false;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
				f=0;
			}
			else if(!gameOver(1))
			label1.setText(value2 + " 's turn");
			
			
		}
		else if(f==1)
		{
			b[8].setText("0");
			checkForWin(1);
			player1Turn = true;
			if(gameOver(1))
			{   for(int i =0;i<9;i++)
				b[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(1);
			}
			else if(!gameOver(1))
			label1.setText(value1 + " 's turn");
		}
	}
}


     public static void main(String[] args) {
	
		new TicTacToe();
	
		

	}
     
     
     
    public boolean gameOver(int m) {
    
    if(m==1)
    {
   
     if( player1Won==true || player2Won==true ){
    	 
    	 return true;
     
    }
     
     t=0;
 	for(int i=0;i<9;i++){
 		str = b[i].getText();
 	   if(  str.length() > 0 ){
 		   t++;
 		   
 	   }
 	    
 	}
 	
 	if(t==9)
 	{
 		return true;
 	}
     
     return false;
    
    }
    
    
    if(m==2)
    {
    
     if( playerWon==true || computerWon==true){
    	 
    	 return true;
     
    }
     
     t=0;
 	for(int i=0;i<9;i++){
 		str = b1[i].getText();
 	   if( str.length() > 0 ){
 		   t++;
 		   
 	   }
 	   
 	    
 	}
 	if(t==9)
 		return true;
     else 
    	 return false;
    
    }
    
    
    
    if(m==4)
    {
    
     if( playerWon==true || AIWon==true){
    	 
    	 return true;
     
    }
     
     t=0;
 	for(int i=0;i<9;i++){
 		str = b1[i].getText();
 	   if( str.length() > 0 ){
 		   t++;
 		   
 	   }
 	   
 	    
 	}
 	if(t==9)
 		return true;
     else 
    	 return false;
    
    }
    return false;
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void b0btn4(ActionEvent e){
		int f=1;
		if(b1[0].getText().equals("")){
			
			if(playerTurn == true){
				 
				b1[0].setText("X");
				checkForWin(2);
				playerTurn = false;
				if(gameOver(2))
				{   for(int i =0;i<9;i++)
					b1[i].setText("");
				btn3.setBackground(Color.GREEN);
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				label1.setText("");
					whoWin(2);
					f=0;
				}
				
				else if(!gameOver(2))
						label1.setText(" CPU 's turn");
				
				
				
				
			}
		if(f==1){	
			int number; int v=1;
			
				number=dice.nextInt(9);
				while(v==1)
				{
				if(b1[number].getText().equals(""))
				{
					b1[number].setText("0");
					
					checkForWin(2);
					playerTurn = true;
					if(gameOver(2))
					{   for(int i =0;i<9;i++)
						b1[i].setText("");
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					label1.setText("");
						whoWin(2);
					}
					
					else if(!gameOver(2))
					{  

						label1.setText(value1 + " 's turn");
					}
					v--;
				}
				else
				{
					number=dice.nextInt(9);
				}
				}
					
			}
		}
	
    }
    
    
 public void b1btn4(ActionEvent e){
		int f=1;
		if(b1[1].getText().equals("")){
			
			if(playerTurn == true){
				 
				b1[1].setText("X");
				checkForWin(2);
				playerTurn = false;
				if(gameOver(2))
				{   for(int i =0;i<9;i++)
					b1[i].setText("");
				btn3.setBackground(Color.GREEN);
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				label1.setText("");
					whoWin(2);
					f=0;
				}
				else if(!gameOver(2))
						label1.setText(" CPU 's turn");
				
				
				
				
			}
		if(f==1)	{
			int number; int v=1;
			
				number=dice.nextInt(9);
				while(v==1)
				{
				if(b1[number].getText().equals(""))
				{
					b1[number].setText("0");
					
					checkForWin(2);
					playerTurn = true;
					if(gameOver(2))
					{   for(int i =0;i<9;i++)
						b1[i].setText("");
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					label1.setText("");
						whoWin(2);
					}
					else if(!gameOver(2))
					{  

						label1.setText(value1 + " 's turn");
					}
					v--;
				}
				else
				{
					number=dice.nextInt(9);
				}
				}
					
			}
		}
	
 }
 
 
 public void b2btn4(ActionEvent e){
		int f=1;
		if(b1[2].getText().equals("")){
			
			if(playerTurn == true){
				 
				b1[2].setText("X");
				checkForWin(2);
				playerTurn = false;
				if(gameOver(2))
				{   for(int i =0;i<9;i++)
					b1[i].setText("");
				btn3.setBackground(Color.GREEN);
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				label1.setText("");
					whoWin(2);
					f=0;
				}
				else if(!gameOver(2))
						label1.setText(" CPU 's turn");
				
				
				
				
			}
		if(f==1){
			int number; int v=1;
			
				number=dice.nextInt(9);
				while(v==1)
				{
				if(b1[number].getText().equals(""))
				{
					b1[number].setText("0");
					
					checkForWin(2);
					playerTurn = true;
					if(gameOver(2))
					{   for(int i =0;i<9;i++)
						b1[i].setText("");
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					label1.setText("");
						whoWin(2);
					}
					else if(!gameOver(2))
					{  

						label1.setText(value1 + " 's turn");
					}
					v--;
				}
				else
				{
					number=dice.nextInt(9);
				}
				}
					
			}
		}
 }
	
 
 
 
 
 
 
 public void b3btn4(ActionEvent e){
		int f=1;
		if(b1[3].getText().equals("")){
			
			if(playerTurn == true){
				 
				b1[3].setText("X");
				checkForWin(2);
				playerTurn = false;
				if(gameOver(2))
				{   for(int i =0;i<9;i++)
					b1[i].setText("");
				btn3.setBackground(Color.GREEN);
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				label1.setText("");
					whoWin(2);
					f=0;
				}
				else if(!gameOver(2))
						label1.setText(" CPU 's turn");
				
				
				
				
			}
		if(f==1){	
			int number; int v=1;
			
				number=dice.nextInt(9);
				while(v==1)
				{
				if(b1[number].getText().equals(""))
				{
					b1[number].setText("0");
					
					checkForWin(2);
					playerTurn = true;
					if(gameOver(2))
					{   for(int i =0;i<9;i++)
						b1[i].setText("");
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					label1.setText("");
						whoWin(2);
					}
					else if(!gameOver(2))
					{  

						label1.setText(value1 + " 's turn");
					}
					v--;
				}
				else
				{
					number=dice.nextInt(9);
				}
				}
					
			}
		
	}
 }
 
 
 
 
 public void b4btn4(ActionEvent e){
		int f=1;
		if(b1[4].getText().equals("")){
			
			if(playerTurn == true){
				 
				b1[4].setText("X");
				checkForWin(2);
				playerTurn = false;
				if(gameOver(2))
				{   for(int i =0;i<9;i++)
					b1[i].setText("");
				btn3.setBackground(Color.GREEN);
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				label1.setText("");
					whoWin(2);
					f=0;
				}
				else if(!gameOver(2))
						label1.setText(" CPU 's turn");
				
				
				
				
			}
		if(f==1){
			int number; int v=1;
			
				number=dice.nextInt(9);
				while(v==1)
				{
				if(b1[number].getText().equals(""))
				{
					b1[number].setText("0");
					
					checkForWin(2);
					playerTurn = true;
					if(gameOver(2))
					{   for(int i =0;i<9;i++)
						b1[i].setText("");
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					label1.setText("");
						whoWin(2);
					}
					
					else if(!gameOver(2))
					{  

						label1.setText(value1 + " 's turn");
					}
					
					v--;
				}
				else
				{
					number=dice.nextInt(9);
				}
				}
					
			}
		}
 }
 
 
 
 
 
 public void b5btn4(ActionEvent e){
		int f=1;
		if(b1[5].getText().equals("")){
			
			if(playerTurn == true){
				 
				b1[5].setText("X");
				checkForWin(2);
				
				playerTurn = false;
				if(gameOver(2))
				{   for(int i =0;i<9;i++)
					b1[i].setText("");
				btn3.setBackground(Color.GREEN);
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				label1.setText("");
					whoWin(2);
					f=0;
				}
				else if(!gameOver(2))
						label1.setText(" CPU 's turn");
				
				
				
				
			}
		if(f==1){
			int number; int v=1;
			
				number=dice.nextInt(9);
				while(v==1)
				{
				if(b1[number].getText().equals(""))
				{
					b1[number].setText("0");
					
					checkForWin(2);
					playerTurn = true;
					if(gameOver(2))
					{   for(int i =0;i<9;i++)
						b1[i].setText("");
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					label1.setText("");
						whoWin(2);
					}
					else if(!gameOver(2))
					{  

						label1.setText(value1 + " 's turn");
					}
					v--;
				}
				else
				{
					number=dice.nextInt(9);
				}
				}
					
			
		}
	}}
 
 
 public void b6btn4(ActionEvent e){
		int f=1;
		if(b1[6].getText().equals("")){
			
			if(playerTurn == true){
				 
				b1[6].setText("X");
				checkForWin(2);
				playerTurn = false;
				if(gameOver(2))
				{   for(int i =0;i<9;i++)
					b1[i].setText("");
				btn3.setBackground(Color.GREEN);
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				label1.setText("");
					whoWin(2);
					f=0;
				}
				else if(!gameOver(2))
						label1.setText(" CPU 's turn");
				
				
				
				
			}
			if(f==1){
			int number; int v=1;
			
				number=dice.nextInt(9);
				while(v==1)
				{
				if(b1[number].getText().equals(""))
				{
					b1[number].setText("0");
					
					checkForWin(2);
					playerTurn = true;
					if(gameOver(2))
					{   for(int i =0;i<9;i++)
						b1[i].setText("");
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					label1.setText("");
						whoWin(2);
					}
					else if(!gameOver(2))
					{  

						label1.setText(value1 + " 's turn");
					}
					
					v--;
				}
				else
				{
					number=dice.nextInt(9);
				}
				}
					
			
		}
	}
 }
 
 
 public void b7btn4(ActionEvent e){
		int f=1;
		if(b1[7].getText().equals("")){
			
			if(playerTurn == true){
				 
				b1[7].setText("X");
				checkForWin(2);
				playerTurn = false;
				if(gameOver(2))
				{   for(int i =0;i<9;i++)
					b1[i].setText("");
				btn3.setBackground(Color.GREEN);
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				label1.setText("");
					whoWin(2);
					f=0;
				}
				else if(!gameOver(2))
						label1.setText(" CPU 's turn");
				
				
				
				
			}
		if(f==1)	{
			int number; int v=1;
			
				number=dice.nextInt(9);
				while(v==1)
				{
				if(b1[number].getText().equals(""))
				{
					b1[number].setText("0");
					
					checkForWin(2);
					playerTurn = true;
					if(gameOver(2))
					{   for(int i =0;i<9;i++)
						b1[i].setText("");
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					label1.setText("");
						whoWin(2);
					}
					else if(!gameOver(2))
					{  

						label1.setText(value1 + " 's turn");
					}
					v--;
				}
				else
				{
					number=dice.nextInt(9);
				}
				
			}
		}
	}
 }
 
 
 
 public void b8btn4(ActionEvent e){
		int f=1;
		if(b1[8].getText().equals("")){
			
			if(playerTurn == true){
				 
				b1[8].setText("X");
				checkForWin(2);
				playerTurn = false;
				if(gameOver(2))
				{   for(int i =0;i<9;i++)
					b1[i].setText("");
				btn3.setBackground(Color.GREEN);
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				label1.setText("");
					whoWin(2);
					f=0;
				}
				else if(!gameOver(2))
				{     


						label1.setText(" CPU 's turn");
						
				}
				
				
				
				
			}
		if(f==1)	
		{
			int number; int v=1;
			
			
				number=dice.nextInt(9);
				while(v==1)
				{
				if(b1[number].getText().equals(""))
				{
					b1[number].setText("0");
					
					checkForWin(2);
					playerTurn = true;
					if(gameOver(2))
					{   for(int i =0;i<9;i++)
						b1[i].setText("");
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					label1.setText("");
						whoWin(2);
					
					}
					
					else if(!gameOver(2))
					{  

						label1.setText(value1 + " 's turn");
					}
					
					
					v--;
				}
				else
				{
					number=dice.nextInt(9);
				}
				}
					
			}
		}}
 
 
 
 
 
 
 
 public void btn6b0(ActionEvent e){
		int f=1;
		int k=0;
		if(b3[0].getText().equals("")){
			
			if(playerTurn==true)
			{
			b3[0].setText("0");
			checkForWin(4);
			playerTurn=false;
		
			if(gameOver(4))
			{   for(int i =0;i<9;i++)
				b3[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(4);
				f=0;
			}
			else if(!gameOver(4))
					label1.setText(" AI 's turn");
			}
			
		if(f==1){	
			 
			
				int score=0,number;
				number=dice.nextInt(9);
				int v=1;
				if(b3[0].getText().equals("") && k==0){
					
					 score= hasWon(0);
					 if(score==10)
					 {
						 b3[0].setText("X");
						 k=1;
					 }
					 else if(score== -10)
					 {
						 b3[0].setText("X");
						 k=1;
					 }
			}
				
				
				 if(b3[1].getText().equals("") && k==0){
					
						 score= hasWon(1);
						 if(score==10)
						 {
							 b3[1].setText("X");
							 k=1;
						 }
						 else if(score== -10){
							 b3[1].setText("X");k=1;
						 }
				}
				
				 if(b3[2].getText().equals("") && k==0){
					
					 score= hasWon(2);
					 if(score==10){
						 b3[2].setText("X");k=1;
					 }
					 else if(score== -10){
						 b3[2].setText("X");k=1;
					 }
			}
				 if(b3[3].getText().equals("")&& k==0){
					
					 score= hasWon(3);
					 if(score==10){
						 b3[3].setText("X");k=1;
					 }
					 else if(score== -10){
						 b3[3].setText("X");k=1;
					 }
			}
				
				 if(b3[4].getText().equals("")&& k==0){
					
					 score= hasWon(4);
					 if(score==10){
						 b3[4].setText("X");k=1;
					 }
					 else if(score== -10){
						 b3[4].setText("X");k=1;
					 }
			}
				
				 if(b3[5].getText().equals("")&& k==0){
					
					 score= hasWon(5);
					 if(score==10){
						 b3[5].setText("X");k=1;
					 }
					 else if(score== -10){
						 b3[5].setText("X");k=1;
					 }
			}
					
				 if(b3[6].getText().equals("")&& k==0){
					
					 score= hasWon(6);
					 if(score==10){
						 b3[6].setText("X");k=1;
					 }
					 else if(score== -10){
						 b3[6].setText("X");k=1;
					 }
			}
				if(b3[7].getText().equals("")&& k==0){
					
					 score= hasWon(7);
					 if(score==10){
						 b3[7].setText("X");k=1;
					 }
					 else if(score== -10){
						 b3[7].setText("X");k=1;
					 }
			}
						
				 if(b3[8].getText().equals("")&& k==0){
					
					 score= hasWon(8);
					 if(score==10){
						 b3[8].setText("X");k=1;
					 }
					 else if(score== -10){
						 b3[8].setText("X");k=1;
					 }
			}
					
				 if(score==0&& k==0){
					
					while(v==1){
						
						if(b3[number].getText().equals("")){
							b3[number].setText("X");
							v--;
							k=1;
						}
						number=dice.nextInt(9);
					}
				}
					
				checkForWin(4);
				playerTurn=true;
				if(gameOver(4))
				{   for(int i =0;i<9;i++)
					b3[i].setText("");
				btn3.setBackground(Color.GREEN);
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				label1.setText("");
					whoWin(4);
					
				}
				else if(!gameOver(4))
					label1.setText(value1+" turn");
				
				}
				
				
				
				
				
			

		
				 
				
				
				
				
			
			
		}
	
 }
 
 
public void btn6b1(ActionEvent e){
	
	int f=1;
	int k=0;
	if(b3[1].getText().equals("")){
		if(playerTurn==true)
		{
		
		b3[1].setText("0");
		checkForWin(4);
		playerTurn=false;
		//AITurn = true;
		if(gameOver(4))
		{   for(int i =0;i<9;i++)
			b3[i].setText("");
		btn3.setBackground(Color.GREEN);
		btn4.setBackground(Color.GREEN);
		btn5.setBackground(Color.GREEN);
		btn6.setBackground(Color.GREEN);
		label1.setText("");
			whoWin(4);
			f=0;
		}
		else if(!gameOver(4))
				label1.setText(" AI 's turn");
		
	}
	if(f==1){	
		  
		
			int score=0,number;
			number=dice.nextInt(9);
			int v=1;
			if(b3[0].getText().equals("") && k==0){
				
				 score= hasWon(0);
				 if(score==10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
				 else if(score== -10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
		}
			 if(b3[1].getText().equals("")&& k==0){
				
				 score= hasWon(1);
				 if(score==10)
				 {
					 b3[1].setText("X");
					 k=1;
				 }
				 else if(score== -10){
					 b3[1].setText("X");k=1;
				 }
			}
			
			 if(b3[2].getText().equals("")&& k==0){
				
				 score= hasWon(2);
				 if(score==10){
					 b3[2].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[2].setText("X");k=1;
				 }
		}
			if(b3[3].getText().equals("")&& k==0){
				
				 score= hasWon(3);
				 if(score==10){
					 b3[3].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[3].setText("X");k=1;
				 }
		}
			
			if(b3[4].getText().equals("")&& k==0){
				
				 score= hasWon(4);
				 if(score==10){
					 b3[4].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[4].setText("X");k=1;
				 }
		}
			
			if(b3[5].getText().equals("")&& k==0){
				
				 score= hasWon(5);
				 if(score==10){
					 b3[5].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[5].setText("X");k=1;
				 }
		}
				
			if(b3[6].getText().equals("")&& k==0){
				
				score= hasWon(6);
				 if(score==10){
					 b3[6].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[6].setText("X");k=1;
				 }
		}
			if(b3[7].getText().equals("")&& k==0){
				
				score= hasWon(7);
				 if(score==10){
					 b3[7].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[7].setText("X");k=1;
				 }
		}	
			
			
			if(b3[8].getText().equals("")&& k==0){
				
				 score= hasWon(8);
				 if(score==10){
					 b3[8].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[8].setText("X");k=1;
				 }
		}
				
			if(score==0 && k==0){
				
				while(v==1){
					
					if(b3[number].getText().equals("")){
						b3[number].setText("X");
						v--;
					}
					number=dice.nextInt(9);
				}
			}
				
			checkForWin(4);
			playerTurn=true;
			if(gameOver(4))
			{   for(int i =0;i<9;i++)
				b3[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(4);
				
			}
			else if(!gameOver(4))
				label1.setText(value1+" turn");
			
			}
			
			
			
			
			
		

	
			 
			
			
			
			
		
		
	}
	
		
}


public void btn6b2(ActionEvent e){

	int f=1;int k=0;
	if(b3[2].getText().equals("")){
		if(playerTurn==true){
		
		
		b3[2].setText("0");
		checkForWin(4);
		playerTurn=false;
		//AITurn = true;
		if(gameOver(4))
		{   for(int i =0;i<9;i++)
			b3[i].setText("");
		btn3.setBackground(Color.GREEN);
		btn4.setBackground(Color.GREEN);
		btn5.setBackground(Color.GREEN);
		btn6.setBackground(Color.GREEN);
		label1.setText("");
			whoWin(4);
			f=0;
		}
		else if(!gameOver(4))
				label1.setText(" AI 's turn");
		}
		
	if(f==1){	
		 
		
			int score=0,number;
			number=dice.nextInt(9);
			int v=1;
			
			if(b3[0].getText().equals("") && k==0){
				
				 score= hasWon(0);
				 if(score==10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
				 else if(score== -10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
		}
			if(b3[1].getText().equals("")&& k==0){
				
				 score= hasWon(1);
				 if(score==10)
				 {
					 b3[1].setText("X");
					 k=1;
				 }
				 else if(score== -10){
					 b3[1].setText("X");k=1;
				 }
			}
			
			if(b3[2].getText().equals("")&& k==0){
				
				 score= hasWon(2);
				 if(score==10){
					 b3[2].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[2].setText("X");k=1;
				 }
		}
			if(b3[3].getText().equals("")&& k==0){
				
				 score= hasWon(3);
				 if(score==10){
					 b3[3].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[3].setText("X");k=1;
				 }
		}
			
			if(b3[4].getText().equals("")&& k==0){
				
				 score= hasWon(4);
				 if(score==10){
					 b3[4].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[4].setText("X");k=1;
				 }
		}
			
			if(b3[5].getText().equals("")&& k==0){
				
				 score= hasWon(5);
				 if(score==10){
					 b3[5].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[5].setText("X");k=1;
				 }
		}
				
			if(b3[6].getText().equals("")&& k==0){
				
				score= hasWon(6);
				 if(score==10){
					 b3[6].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[6].setText("X");k=1;
				 }
		}
			if(b3[7].getText().equals("")&& k==0){
				
				score= hasWon(7);
				 if(score==10){
					 b3[7].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[7].setText("X");k=1;
				 }
		}
			
			
			if(b3[8].getText().equals("")&& k==0){
				
				 score= hasWon(8);
				 if(score==10){
					 b3[8].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[8].setText("X");k=1;
				 }
		}
				
			 if(score==0  && k==0){
				
				while(v==1){
					
					if(b3[number].getText().equals("")){
						b3[number].setText("X");
						v--;
					}
					number=dice.nextInt(9);
				}
			}
				
			checkForWin(4);
			playerTurn=true;
			if(gameOver(4))
			{   for(int i =0;i<9;i++)
				b3[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(4);
				
			}
			else if(!gameOver(4))
				label1.setText(value1+" turn");
			
			}
			
			
			
			
			
		

	
			 
			
			
			
			
		
		
	}
}
	






public void btn6b3(ActionEvent e){

	int f=1; int k=0;
	if(b3[3].getText().equals("")){
		if(playerTurn==true){
		
		b3[3].setText("0");
		checkForWin(4);
		playerTurn=false;
		//AITurn = true;
		if(gameOver(4))
		{   for(int i =0;i<9;i++)
			b3[i].setText("");
		btn3.setBackground(Color.GREEN);
		btn4.setBackground(Color.GREEN);
		btn5.setBackground(Color.GREEN);
		btn6.setBackground(Color.GREEN);
		label1.setText("");
			whoWin(4);
			f=0;
		}
		else if(!gameOver(4))
				label1.setText(" AI 's turn");
		
		}
	if(f==1){	
		 
		
			int score=0,number;
			number=dice.nextInt(9);
			int v=1;
			
			if(b3[0].getText().equals("") && k==0){
				
				 score= hasWon(0);
				 if(score==10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
				 else if(score== -10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
		}
			if(b3[1].getText().equals("") && k==0){
				
				 score= hasWon(1);
				 if(score==10)
				 {
					 b3[1].setText("X");
					 k=1;
				 }
				 else if(score== -10){
					 b3[1].setText("X");k=1;
				 }
			}
			
			if(b3[2].getText().equals("") && k==0){
				
				 score= hasWon(2);
				 if(score==10){
					 b3[2].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[2].setText("X");k=1;
				 }
		}
			if(b3[3].getText().equals("") && k==0){
				
				 score= hasWon(3);
				 if(score==10){
					 b3[3].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[3].setText("X");k=1;
				 }
		}
			
			if(b3[4].getText().equals("") && k==0){
				
				 score= hasWon(4);
				 if(score==10){
					 b3[4].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[4].setText("X");k=1;
				 }
		}
			
			if(b3[5].getText().equals("") && k==0){
				
				 score= hasWon(5);
				 if(score==10){
					 b3[5].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[5].setText("X");k=1;
				 }
		}
				
			if(b3[6].getText().equals("") && k==0){
				
				score= hasWon(6);
				 if(score==10){
					 b3[6].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[6].setText("X");k=1;
				 }
		}
			if(b3[7].getText().equals("") && k==0){
				
				score= hasWon(7);
				 if(score==10){
					 b3[7].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[7].setText("X");k=1;
				 }
		}
					
			if(b3[8].getText().equals("") && k==0){
				
				 score= hasWon(8);
				 if(score==10){
					 b3[8].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[8].setText("X");k=1;
				 }
		}
				
			 if(score==0 && k==0){
				
				while(v==1){
					
					if(b3[number].getText().equals("")){
						b3[number].setText("X");
						v--;
					}
					number=dice.nextInt(9);
				}
			}
			checkForWin(4);
			playerTurn=true;
			if(gameOver(4))
			{   for(int i =0;i<9;i++)
				b3[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(4);
				
			}
			else if(!gameOver(4))
				label1.setText(value1+" turn");
				
			}
			
			
			
			
			
		

	
			 
			
			
			
			
		
		
	}
}




public void btn6b4(ActionEvent e){
	int f=1; int k=0;
	if(b3[4].getText().equals("")){
		if(playerTurn==true){
		
		b3[4].setText("0");
		checkForWin(4);
		playerTurn=false;
	
		if(gameOver(4))
		{   for(int i =0;i<9;i++)
			b3[i].setText("");
		btn3.setBackground(Color.GREEN);
		btn4.setBackground(Color.GREEN);
		btn5.setBackground(Color.GREEN);
		btn6.setBackground(Color.GREEN);
		label1.setText("");
			whoWin(4);
			f=0;
		}
		else if(!gameOver(4))
				label1.setText(" AI 's turn");
		}
		
	if(f==1){	
		 
		
			int score=0,number;
			number=dice.nextInt(9);
			int v=1;
			
			if(b3[0].getText().equals("") && k==0){
				
				 score= hasWon(0);
				 if(score==10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
				 else if(score== -10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
		}
			if(b3[1].getText().equals("") && k==0){
				
				 score= hasWon(1);
				 if(score==10)
				 {
					 b3[1].setText("X");
					 k=1;
				 }
				 else if(score== -10){
					 b3[1].setText("X");k=1;
				 }
			}
			
			if(b3[2].getText().equals("") && k==0){
				
				 score= hasWon(2);
				 if(score==10){
					 b3[2].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[2].setText("X");k=1;
				 }
		}
			if(b3[3].getText().equals("") && k==0){
				
				 score= hasWon(3);
				 if(score==10){
					 b3[3].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[3].setText("X");k=1;
				 }
		}
			
			if(b3[4].getText().equals("") && k==0){
				
				 score= hasWon(4);
				 if(score==10){
					 b3[4].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[4].setText("X");k=1;
				 }
		}
			
			if(b3[5].getText().equals("") && k==0){
				
				 score= hasWon(5);
				 if(score==10){
					 b3[5].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[5].setText("X");k=1;
				 }
		}
				
			if(b3[6].getText().equals("") && k==0){
				
				score= hasWon(6);
				 if(score==10){
					 b3[6].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[6].setText("X");k=1;
				 }
		}
			if(b3[7].getText().equals("") && k==0){
				
				score= hasWon(7);
				 if(score==10){
					 b3[7].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[7].setText("X");k=1;
				 }
		}
					
			if(b3[8].getText().equals("") && k==0){
				
				 score= hasWon(8);
				 if(score==10){
					 b3[8].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[8].setText("X");k=1;
				 }
		}
				
			 if(score==0 && k==0){
				
				while(v==1){
					
					if(b3[number].getText().equals("")){
						b3[number].setText("X");
						v--;
					}
					number=dice.nextInt(9);
				}
			}
				
						checkForWin(4);
						playerTurn=true;
			if(gameOver(4))
			{   for(int i =0;i<9;i++)
				b3[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(4);
				
			}
			else if(!gameOver(4))
				label1.setText(value1+" turn");

			}
			
			
			
			
			
		

	
			 
			
			
			
			
		
		
	}

}





public void btn6b5(ActionEvent e){
	
	
	int f=1; int k=0;
	if(b3[5].getText().equals("")){
		
		if(playerTurn==true){
		b3[5].setText("0");
		checkForWin(4);
	playerTurn=false;
		if(gameOver(4))
		{   for(int i =0;i<9;i++)
			b3[i].setText("");
		btn3.setBackground(Color.GREEN);
		btn4.setBackground(Color.GREEN);
		btn5.setBackground(Color.GREEN);
		btn6.setBackground(Color.GREEN);
		label1.setText("");
			whoWin(4);
			f=0;
		}
		else if(!gameOver(4))
				label1.setText(" AI 's turn");
		}
		
	if(f==1){	
		 
		
			int score=0,number;
			number=dice.nextInt(9);
			int v=1;
			if(b3[0].getText().equals("") && k==0){
				
				 score= hasWon(0);
				 if(score==10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
				 else if(score== -10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
		}
			if(b3[1].getText().equals("")  && k==0){
				
				 score= hasWon(1);
				 if(score==10)
				 {
					 b3[1].setText("X");
					 k=1;
				 }
				 else if(score== -10){
					 b3[1].setText("X");k=1;
				 }
			}
			
			if(b3[2].getText().equals("") && k==0){
				
				 score= hasWon(2);
				 if(score==10){
					 b3[2].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[2].setText("X");k=1;
				 }
		}
			if(b3[3].getText().equals("")  && k==0){
				
				 score= hasWon(3);
				 if(score==10){
					 b3[3].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[3].setText("X");k=1;
				 }
		}
			
			if(b3[4].getText().equals("")  && k==0){
				
				 score= hasWon(4);
				 if(score==10){
					 b3[4].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[4].setText("X");k=1;
				 }
		}
			
			if(b3[5].getText().equals("")  && k==0){
				
				 score= hasWon(5);
				 if(score==10){
					 b3[5].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[5].setText("X");k=1;
				 }
		}
				
			if(b3[6].getText().equals("")  && k==0){
				
				score= hasWon(6);
				 if(score==10){
					 b3[6].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[6].setText("X");k=1;
				 }
		}
			if(b3[7].getText().equals("")  && k==0){
				
				score= hasWon(7);
				 if(score==10){
					 b3[7].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[7].setText("X");k=1;
				 }
		}
					
			if(b3[8].getText().equals("")  && k==0){
				
				 score= hasWon(8);
				 if(score==10){
					 b3[8].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[8].setText("X");k=1;
				 }
		}
				
			 if(score==0  && k==0){
				
				while(v==1){
					
					if(b3[number].getText().equals("")){
						b3[number].setText("X");
						v--;
					}
					number=dice.nextInt(9);
				}
			}
				
			checkForWin(4);
			playerTurn=true;
			if(gameOver(4))
			{   for(int i =0;i<9;i++)
				b3[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(4);
				
			}
			else if(!gameOver(4))
				label1.setText(value1+" turn");
			
			}
			
			
			
			
			
		

	
			 
			
			
			
			
		
		
	}

}




public void btn6b6(ActionEvent e){
	int f=1; int k=0;
	if(b3[6].getText().equals("")){
		if(playerTurn==true){
		
		b3[6].setText("0");
		checkForWin(4);
	playerTurn=false;
		if(gameOver(4))
		{   for(int i =0;i<9;i++)
			b3[i].setText("");
		btn3.setBackground(Color.GREEN);
		btn4.setBackground(Color.GREEN);
		btn5.setBackground(Color.GREEN);
		btn6.setBackground(Color.GREEN);
		label1.setText("");
			whoWin(4);
			f=0;
		}
		else if(!gameOver(4))
				label1.setText(" AI 's turn");
		}
		
	if(f==1){	
		 
		
			int score=0,number;
			number=dice.nextInt(9);
			int v=1;
			
			if(b3[0].getText().equals("") && k==0){
				
				 score= hasWon(0);
				 if(score==10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
				 else if(score== -10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
		}
			if(b3[1].getText().equals("")  && k==0){
				
				 score= hasWon(1);
				 if(score==10)
				 {
					 b3[1].setText("X");
					 k=1;
				 }
				 else if(score== -10){
					 b3[1].setText("X");k=1;
				 }
			}
			
			if(b3[2].getText().equals("")  && k==0){
				
				 score= hasWon(2);
				 if(score==10){
					 b3[2].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[2].setText("X");k=1;
				 }
		}
			if(b3[3].getText().equals("")  && k==0){
				
				 score= hasWon(3);
				 if(score==10){
					 b3[3].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[3].setText("X");k=1;
				 }
		}
			
			if(b3[4].getText().equals("")  && k==0){
				
				 score= hasWon(4);
				 if(score==10){
					 b3[4].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[4].setText("X");k=1;
				 }
		}
			
			if(b3[5].getText().equals("") && k==0){
				
				 score= hasWon(5);
				 if(score==10){
					 b3[5].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[5].setText("X");k=1;
				 }
		}
				
			if(b3[6].getText().equals("") && k==0){
				
				score= hasWon(6);
				 if(score==10){
					 b3[6].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[6].setText("X");k=1;
				 }
		}
			
			if(b3[7].getText().equals("") && k==0){
				
				score= hasWon(7);
				 if(score==10){
					 b3[7].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[7].setText("X");k=1;
				 }
		}
					
			if(b3[8].getText().equals("")&& k==0){
				
				 score= hasWon(8);
				 if(score==10){
					 b3[8].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[8].setText("X");k=1;
				 }
		}
				
			if(score==0 && k==0){
				
				while(v==1){
					
					if(b3[number].getText().equals("")){
						b3[number].setText("X");
						v--;
					}
					number=dice.nextInt(9);
				}
			}
				
			checkForWin(4);
			playerTurn=true;
			if(gameOver(4))
			{   for(int i =0;i<9;i++)
				b3[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(4);
				
			}
			else if(!gameOver(4))
				label1.setText(value1+" turn");
			
			}
			
			
			
			
			
		

	
			 
			
			
			
			
		
		
	}

}


public void btn6b7(ActionEvent e){
	int f=1; int k=0;
	if(b3[7].getText().equals("")){
		
		if(playerTurn==true){
		b3[7].setText("0");
		checkForWin(4);
	playerTurn=false;
		if(gameOver(4))
		{   for(int i =0;i<9;i++)
			b3[i].setText("");
		btn3.setBackground(Color.GREEN);
		btn4.setBackground(Color.GREEN);
		btn5.setBackground(Color.GREEN);
		btn6.setBackground(Color.GREEN);
		label1.setText("");
			whoWin(4);
			f=0;
		}
		else if(!gameOver(4))
				label1.setText(" AI 's turn");
		}
		
	if(f==1){	
		 
		
			int score=0,number;
			number=dice.nextInt(9);
			int v=1;
			if(b3[0].getText().equals("") && k==0){
				
				 score= hasWon(0);
				 if(score==10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
				 else if(score== -10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
		}
			if(b3[1].getText().equals("") && k==0){
				
				 score= hasWon(1);
				 if(score==10)
				 {
					 b3[1].setText("X");
					 k=1;
				 }
				 else if(score== -10){
					 b3[1].setText("X");k=1;
				 }
			}
			
			if(b3[2].getText().equals("") && k==0){
				
				 score= hasWon(2);
				 if(score==10){
					 b3[2].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[2].setText("X");k=1;
				 }
		}
			if(b3[3].getText().equals("") && k==0){
				
				 score= hasWon(3);
				 if(score==10){
					 b3[3].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[3].setText("X");k=1;
				 }
		}
			
			if(b3[4].getText().equals("") && k==0){
				
				 score= hasWon(4);
				 if(score==10){
					 b3[4].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[4].setText("X");k=1;
				 }
		}
			
			if(b3[5].getText().equals("") && k==0){
				
				 score= hasWon(5);
				 if(score==10){
					 b3[5].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[5].setText("X");k=1;
				 }
		}
				
			if(b3[6].getText().equals("") && k==0){
				
				score= hasWon(6);
				 if(score==10){
					 b3[6].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[6].setText("X");k=1;
				 }
		}
			
			if(b3[7].getText().equals("") && k==0){
				
				score= hasWon(7);
				 if(score==10){
					 b3[7].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[7].setText("X");k=1;
				 }
		}
					
			if(b3[8].getText().equals("") && k==0){
				
				 score= hasWon(8);
				 if(score==10){
					 b3[8].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[8].setText("X");k=1;
				 }
		}
				
			 if(score==0 && k==0){
				
				while(v==1){
					
					if(b3[number].getText().equals("")){
						b3[number].setText("X");
						v--;
					}
					number=dice.nextInt(9);
				}
			}
				
			checkForWin(4);
			playerTurn=true;
			if(gameOver(4))
			{   for(int i =0;i<9;i++)
				b3[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(4);
				
			}
			else if(!gameOver(4))
				label1.setText(value1+" turn");
			
			}
			
			
			
			
			
		

	
			 
			
			
			
			
		
		
	}

}



public void btn6b8(ActionEvent e){
	int k=0;
	
	int f=1;
	if(b3[8].getText().equals("")){
		if(playerTurn==true){
		
		b3[8].setText("0");
		checkForWin(4);
	    playerTurn=false;
		if(gameOver(4))
		{   for(int i =0;i<9;i++)
			b3[i].setText("");
		btn3.setBackground(Color.GREEN);
		btn4.setBackground(Color.GREEN);
		btn5.setBackground(Color.GREEN);
		btn6.setBackground(Color.GREEN);
		label1.setText("");
			whoWin(4);
			f=0;
		}
		else if(!gameOver(4))
				label1.setText(" AI 's turn");
		}
		
	if(f==1){	
		 
		
			int score=0,number;
			number=dice.nextInt(9);
			int v=1;
			if(b3[0].getText().equals("") && k==0){
				
				 score= hasWon(0);
				 if(score==10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
				 else if(score== -10)
				 {
					 b3[0].setText("X");
					 k=1;
				 }
		}
			if(b3[1].getText().equals("") && k==0){
				
				 score= hasWon(1);
				 if(score==10)
				 {
					 b3[1].setText("X");
					 k=1;
				 }
				 else if(score== -10){
					 b3[1].setText("X");k=1;
				 }
			}
			
			if(b3[2].getText().equals("") && k==0){
				
				 score= hasWon(2);
				 if(score==10){
					 b3[2].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[2].setText("X");k=1;
				 }
		}
			if(b3[3].getText().equals("") && k==0){
				
				 score= hasWon(3);
				 if(score==10){
					 b3[3].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[3].setText("X");k=1;
				 }
		}
			
			if(b3[4].getText().equals("") && k==0){
				
				 score= hasWon(4);
				 if(score==10){
					 b3[4].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[4].setText("X");k=1;
				 }
		}
			
			if(b3[5].getText().equals("") && k==0){
				
				 score= hasWon(5);
				 if(score==10){
					 b3[5].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[5].setText("X");k=1;
				 }
		}
				
			if(b3[6].getText().equals("") && k==0){
				
				score= hasWon(6);
				 if(score==10){
					 b3[6].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[6].setText("X");k=1;
				 }
		}
			if(b3[7].getText().equals("") && k==0){
				
				score= hasWon(7);
				 if(score==10){
					 b3[7].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[7].setText("X");k=1;
				 }
		}
			
			
			if(b3[8].getText().equals("") && k==0){
				
				 score= hasWon(8);
				 if(score==10){
					 b3[8].setText("X");k=1;
				 }
				 else if(score== -10){
					 b3[8].setText("X");k=1;
				 }
		}
				
			if(score==0 && k==0){
				
				while(v==1){
					
					if(b3[number].getText().equals("")){
						b3[number].setText("X");
						v--;
					}
					number=dice.nextInt(9);
				}
			}
				
			checkForWin(4);
			playerTurn=true;
			if(gameOver(4))
			{   for(int i =0;i<9;i++)
				b3[i].setText("");
			btn3.setBackground(Color.GREEN);
			btn4.setBackground(Color.GREEN);
			btn5.setBackground(Color.GREEN);
			btn6.setBackground(Color.GREEN);
			label1.setText("");
				whoWin(4);
				
			}
			else if(!gameOver(4))
				label1.setText(value1+" turn");
			
			}
			
			
			
			
			
		

	
			 
			
			
			
			
		
		
	}

}
 
 public void whoWin(int m){
	 
	 
	 if(m==1)
	 {
		 if(player1Won == true)
			{
			JOptionPane.showMessageDialog(frame,
				    value1 +" Won",
				    "Result",
				    JOptionPane.PLAIN_MESSAGE);
			
			
			}
			else if(player2Won == true)
			{
				JOptionPane.showMessageDialog(frame,
					    value2+" Won",
					    "Result",
					    JOptionPane.PLAIN_MESSAGE);
				
				
			}
			
			else if(t==9)
				{JOptionPane.showMessageDialog(frame,
					    "Its a tie !",
					    "Result",
					    JOptionPane.PLAIN_MESSAGE);
				
				
				}
	 }
 
	
 
 if(m==2)
 {
	 
	 if(playerWon == true)
	 {
	 JOptionPane.showMessageDialog(frame,
	     value1 +" Won",
	     "Result",
	     JOptionPane.PLAIN_MESSAGE);
	 label1.setText("");

	 }
	 else if(computerWon == true)
	 {
	 JOptionPane.showMessageDialog(frame,
	 	    "CPU Won",
	 	    "Result",
	 	    JOptionPane.PLAIN_MESSAGE);
	 label1.setText("");

	 }

	 else if(t==9)
	 {JOptionPane.showMessageDialog(frame,
	 	    "Its a tie !",
	 	    "Result",
	 	    JOptionPane.PLAIN_MESSAGE);
	 label1.setText("");
	

	 }
 }
 
 
 
 if(m==4)
 {
	 
	 if(playerWon == true)
	 {
	 JOptionPane.showMessageDialog(frame,
	     value1 +" Won",
	     "Result",
	     JOptionPane.PLAIN_MESSAGE);
	 label1.setText("");

	 }
	 else if(AIWon == true)
	 {
	 JOptionPane.showMessageDialog(frame,
	 	    "AI Won",
	 	    "Result",
	 	    JOptionPane.PLAIN_MESSAGE);
	 label1.setText("");

	 }

	 else if(t==9)
	 {JOptionPane.showMessageDialog(frame,
	 	    "Its a tie !",
	 	    "Result",
	 	    JOptionPane.PLAIN_MESSAGE);
	 label1.setText("");
	

	 }
 }
 
}
 
 public int hasWon(int n)
 {
	 int score =0;
	 if(n==1){
			
			if(b3[4].getText().equals("X"))
				if(b3[7].getText().equals("X"))
					
					score = 10;
					

					if(b3[0].getText().equals("X"))
						if(b3[2].getText().equals("X"))
							
							score = 10;
					

					if(b3[4].getText().equals("0"))
						if(b3[7].getText().equals("0"))
							
							score = -10;
					
					if(b3[0].getText().equals("0"))
						if(b3[2].getText().equals("0"))
							
							score = -10;
							
							
					
			
					
				}
			
	 
	 
	 if(n==2){
			
			if(b3[0].getText().equals("X"))
				if(b3[1].getText().equals("X"))
					
					score = 10;
					

					if(b3[5].getText().equals("X"))
						if(b3[8].getText().equals("X"))
							
							score = 10;
					
					
					if(b3[4].getText().equals("X"))
						if(b3[6].getText().equals("X"))
							
							score = 10;
					

					if(b3[0].getText().equals("0"))
						if(b3[1].getText().equals("0"))
							
							score = -10;
					
					if(b3[5].getText().equals("0"))
						if(b3[8].getText().equals("0"))
							
							score = -10;
					
					if(b3[4].getText().equals("0"))
						if(b3[6].getText().equals("0"))
							
							score = -10;
					
							
							
					
			
					
				}
			
	 
	 if(n==3){
			
			if(b3[0].getText().equals("X"))
				if(b3[6].getText().equals("X"))
					
					score = 10;
					

					if(b3[4].getText().equals("X"))
						if(b3[5].getText().equals("X"))
							
							score = 10;
					

					if(b3[0].getText().equals("0"))
						if(b3[6].getText().equals("0"))
							
							score = -10;
					
					if(b3[4].getText().equals("0"))
						if(b3[5].getText().equals("0"))
							
							score = -10;
							
							
					
			
					
				}
	 
	 if(n==0){
			
			if(b3[1].getText().equals("X"))
				if(b3[2].getText().equals("X"))
					
					score = 10;
					

					if(b3[3].getText().equals("X"))
						if(b3[6].getText().equals("X"))
							
							score = 10;
					
					if(b3[4].getText().equals("X"))
						if(b3[8].getText().equals("X"))
							
							score = 10;
					

					if(b3[1].getText().equals("0"))
						if(b3[2].getText().equals("0"))
							
							score = -10;
					
					if(b3[3].getText().equals("0"))
						if(b3[6].getText().equals("0"))
							
							score = -10;
					
					if(b3[4].getText().equals("0"))
						if(b3[8].getText().equals("0"))
							
							score = -10;
							
							
					
			
					
				}
	 
	 if(n==4){
			
			if(b3[1].getText().equals("X"))
				if(b3[7].getText().equals("X"))
					
					score = 10;
					

					if(b3[3].getText().equals("X"))
						if(b3[5].getText().equals("X"))
							
							score = 10;
					
					if(b3[0].getText().equals("X"))
						if(b3[8].getText().equals("X"))
							
							score = 10;
					

					if(b3[1].getText().equals("0"))
						if(b3[7].getText().equals("0"))
							
							score = -10;
					
					if(b3[3].getText().equals("0"))
						if(b3[5].getText().equals("0"))
							
							score = -10;
					
					if(b3[0].getText().equals("0"))
						if(b3[8].getText().equals("0"))
							
							score = -10;
							
							
					
			
					
				}
	 
	 
	 if(n==5){
			
			if(b3[2].getText().equals("X"))
				if(b3[8].getText().equals("X"))
					
					score = 10;
					

					if(b3[4].getText().equals("X"))
						if(b3[3].getText().equals("X"))
							
							score = 10;
					

					if(b3[2].getText().equals("0"))
						if(b3[8].getText().equals("0"))
							
							score = -10;
					
					if(b3[4].getText().equals("0"))
						if(b3[3].getText().equals("0"))
							
							score = -10;
							
							
					
			
					
				}
	 
	 
	 if(n==6){
			
			if(b3[7].getText().equals("X"))
				if(b3[8].getText().equals("X"))
					
					score = 10;
					

					if(b3[0].getText().equals("X"))
						if(b3[3].getText().equals("X"))
							
							score = 10;
					
					if(b3[4].getText().equals("X"))
						if(b3[2].getText().equals("X"))
							
							score = 10;
					

					if(b3[7].getText().equals("0"))
						if(b3[8].getText().equals("0"))
							
							score = -10;
					
					if(b3[0].getText().equals("0"))
						if(b3[3].getText().equals("0"))
							
							score = -10;
					
					if(b3[4].getText().equals("0"))
						if(b3[2].getText().equals("0"))
							
							score = -10;
							
							
					
			
					
				}
	 
	 
	 if(n==7){
			
			if(b3[6].getText().equals("X"))
				if(b3[8].getText().equals("X"))
					
					score = 10;
					

					if(b3[4].getText().equals("X"))
						if(b3[1].getText().equals("X"))
							
							score = 10;
					

					if(b3[6].getText().equals("0"))
						if(b3[8].getText().equals("0"))
							
							score = -10;
					
					if(b3[4].getText().equals("0"))
						if(b3[1].getText().equals("0"))
							
							score = -10;
							
							
					
			
					
				}
	 
	 
	 if(n==8){
			
			if(b3[7].getText().equals("X"))
				if(b3[6].getText().equals("X"))
					
					score = 10;
					

					if(b3[2].getText().equals("X"))
						if(b3[5].getText().equals("X"))
							
							score = 10;
					
					if(b3[4].getText().equals("X"))
						if(b3[0].getText().equals("X"))
							
							score = 10;
					

					if(b3[0].getText().equals("0"))
						if(b3[4].getText().equals("0"))
							
							score = -10;
					
					if(b3[2].getText().equals("0"))
						if(b3[5].getText().equals("0"))
							
							score = -10;
					
					if(b3[7].getText().equals("0"))
						if(b3[6].getText().equals("0"))
							
							score = -10;
							
							
					
			
					
				}
	 
	 
	 
	 
	 
	 
	 
	 
		
		

return score;
	 
 }
 
 
 
}





	
	



