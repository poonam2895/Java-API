/**
* The techno program implements an application that
* can be used as a billing software.
*
* @authors  Poonam Verma
*		    Ankit Rohilla
* @version 1.0 
*/
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*; 
import javax.swing.JTable;  

class techno implements MouseListener,ActionListener
{
	int i=0;
	int j=0,k,n=0,total=0;
	int counter=1;
	JFrame f;
	JPanel p1,p2,p3,p4,p5,p6;
	JPanel scr2,east,west,p21,p22,p23;
	JPanel bp1,bp2,bp3,east1,west1;
	JButton pro,log,clr,lout,adp,pri,bac,paid;
	Label l1,l2,l3,l4,empty,empty1,l5,l6;
	TextField tf1,tf2,tf3;
	Font font,font2,font3,font4;
	GridLayout gl,gl2;
	BorderLayout bl,b2;
	JScrollPane sp;
	JTable jt;
	String login,psw,s1,s2;
	String[] choice={"Select..","WD_HDD_1tb","SANDISK PD 32gb","SEGABYTE HDD 4TB","HP MOUSE","ASUS gtx","LOGITEC KEYBOARD","INTEX HEADPHONES","DVD DRIVE","KEYBOARD+MOUSE COMBO","JOYSTICK"};
	String[] price={"0","5999.00","380.00","8655.00","499.00","10999.00","799.00","1400.00","1199.00","900.00","800.00"};
	int[] cost={0,5999,380,8655,499,10999,799,1400,1199,900,800};
	JComboBox cb;
	String data[][]=new String[20][3];
	JMenuBar m;
	JMenu m1,m2;
	
	public techno()
	{
		font=new Font("SansSerif",Font.BOLD,20);
		font2=new Font("SansSerif",Font.BOLD,32);
		font3=new Font("Times New Roman",Font.BOLD,15);
		font4=new Font("Times New Roman",Font.BOLD,14);
		
		//first screen of the application
		
		gl=new GridLayout(2,1);
		f=new JFrame();
		f.setVisible(true);
		l1=new Label("     Welcome To TechnoShop");
		l1.setFont(font);
		pro=new JButton("PROCEED");
		pro.setPreferredSize(new Dimension(100,40));
		p1=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		p1.setLayout(gl);
		JLabel logo=new JLabel(new ImageIcon("C:\\Users\\POONAM\\Desktop\\Project\\ts.jpg"));
		logo.setLayout(new FlowLayout());
		p6.add(logo);
		p1.add(p6);
		p6.add(l1);
		p1.add(p5);
		p5.add(pro);
		f.add(p1);
		p5.setBackground(new Color(77,180,180));
		m=new JMenuBar();
		m1=new JMenu("About Us");
		m2=new JMenu("Contact Us");
		m.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		m.add(m2);
		m.add(m1);
		f.setJMenuBar(m);
		
		
		
		//second screen of the application
		
		p2=new JPanel();
		p21=new JPanel();
		p22=new JPanel();
		p23=new JPanel();
		scr2=new JPanel();
		east=new JPanel();
		west=new JPanel();
		f.add(p1);
		p1.setVisible(true);
		gl2=new GridLayout(3,2);
		b2=new BorderLayout();
		l2=new Label("LOGIN_ID");
		l2.setFont(font3);
		l3=new Label("PASSWORD");
		l3.setFont(font3);
		log=new JButton("LOGIN");
		clr=new JButton("CLEAR");
		tf1=new TextField(15);
		tf2=new TextField(15);
		tf2.setEchoChar('*');
		scr2.setLayout(b2);
		scr2.add(p2,"Center");
		p2.setLayout(gl2);
		p2.add(p21);
		p21.setBackground(new Color(77,169,180));
		p2.add(p22);
		p22.setBackground(new Color(77,172,180));
		p2.add(p23);
		p23.setBackground(new Color(77,177,180));
		p21.add(l2);
		p21.add(tf1);
		tf1.setFont(font3);
		p22.add(l3);
		p22.add(tf2);
		tf2.setFont(font3);
		p23.add(log);
		p23.add(clr);
		scr2.add(east,"East");
		JLabel logo1=new JLabel(new ImageIcon("C:\\Users\\POONAM\\Desktop\\Project\\pic31.jpg"));
		logo1.setLayout(new FlowLayout());
		east.add(logo1);
		scr2.add(west,"West");
		JLabel logo2=new JLabel(new ImageIcon("C:\\Users\\POONAM\\Desktop\\Project\\pic41.jpg"));
		logo2.setLayout(new FlowLayout());
		west.add(logo2);
		
		
		//third screen of the application
		
		p3=new JPanel();
		bp1=new JPanel();
		bp2=new JPanel();
		bp3=new JPanel();
		bl=new BorderLayout();
		l4=new Label("PRODUCTS");
		l4.setFont(font4);
		empty=new Label("                                  ");
		empty1=new Label("                                         ");
		l5=new Label("SUB_TOTAL");
		l5.setFont(font4);
		lout=new JButton("LOGOUT");
		lout.setFont(font4);
		adp=new JButton("ADD MORE PRODUCTS");
		adp.setFont(font4);
		pri=new JButton("PRINT");
		pri.setFont(font4);
		paid=new JButton("NEXT CUSTOMER");
		paid.setFont(font4);
		tf3=new TextField(15);
		
		cb=new JComboBox(choice);
		p3.setLayout(bl);
		p3.add(bp1,"North");
			bp1.add(paid);
			bp1.add(empty1);
			bp1.add(l4);
			bp1.add(cb);
			bp1.add(lout);        
			p3.add(bp2,"South");
			bp2.add(adp);
			bp2.add(pri);
			p3.add(bp3,"Center");
			bp3.setBackground(new Color(77,120,250));
			bp2.setBackground(Color.lightGray);
			bp2.add(empty);
			bp2.add(l5);
			bp2.add(tf3);

		
		//last screen of the application
		
			p4=new JPanel();
			east1=new JPanel();
			west1=new JPanel();
			p4.setLayout(new BorderLayout());
			JLabel background=new JLabel(new ImageIcon("C:\\Users\\POONAM\\Desktop\\Project\\ts.jpg"));
			p4.add(background,"Center");
			background.setLayout(new FlowLayout());
			l6=new Label("                             		      Have A Nice Day!");
			p4.add(l6,"North");
			l6.setBackground(new Color(77,177,180));
			l6.setFont(font2);
			bac=new JButton("BACK TO LOGIN PAGE");
			bac.setFont(font3);
			p4.add(bac,"South");
			JLabel logo3=new JLabel(new ImageIcon("C:\\Users\\POONAM\\Desktop\\Project\\second.jpg"));
			logo3.setLayout(new FlowLayout());
			west1.add(logo3);
			p4.add(west1,"West");
			JLabel logo4=new JLabel(new ImageIcon("C:\\Users\\POONAM\\Desktop\\Project\\first.jpg"));
			logo4.setLayout(new FlowLayout());
			east1.add(logo4);
			p4.add(east1,"East");
		
		
		f.setLocation(250,160);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(880,390);
		f.setResizable(false);
		f.setTitle("TechnoShop BILLING SYSTEM");
		f.setVisible(true);
		
		//Registering MouseListener & ActionListener
		
		pro.addMouseListener(this);
		log.addMouseListener(this);
		clr.addMouseListener(this);
		adp.addMouseListener(this);
		lout.addMouseListener(this);
		bac.addMouseListener(this);
		pri.addMouseListener(this);
		cb.addActionListener(this);
		m1.addMouseListener(this);
		m2.addMouseListener(this);
		paid.addMouseListener(this); 

	}
	
		//Event Handling
		
	public void mouseClicked(MouseEvent me)
	{
		if(me.getSource()==pro)
		{
			p1.setVisible(false);
			scr2.setVisible(true);
			f.add(scr2);
			f.setVisible(true);
		}
		else if(me.getSource()==log)
		{
				login="techno2017";
				psw="ts0123";
				s1=tf1.getText();
				s2=tf2.getText();
			if(s1.equals(login)&& s2.equals(psw))
			{
			scr2.setVisible(false);
			p3.setVisible(true);
			f.add(p3);
			f.setVisible(true);
			JOptionPane.showMessageDialog(f,"Please select the product(s) from the Dropdown List. \nThen press PRINT");
			tf1.setText(null);
			tf2.setText(null);
			}
			else
			{
				JOptionPane.showMessageDialog(f,"Access Denied. \nYou have entered an invalid username/password");
			}
		}
		
		else if(me.getSource()==clr)
		{
			try
			{
				p2.setVisible(true);
				scr2.add(p2);
				f.add(scr2);
				f.setVisible(true);
				tf1.setText(null);
				tf2.setText(null);
			}
			catch(Exception e)
			{
			}
			
		}
		else if(me.getSource()==lout)
		{
			p3.setVisible(false);
			if(n!=0)
			{
				sp.setVisible(false);
				sp.getViewport().remove(jt);
			}
			pri.setText("PRINT");
			p4.setVisible(true);
			f.add(p4);
			f.setVisible(true);
		}
		else if(me.getSource()==bac)
		{
			p4.setVisible(false);
			data=new String[10][3];
			cb.removeAllItems();
			i=0;
			counter=1;
			total=0;
			tf3.setText("");
			scr2.setVisible(true);
			for(int i=0;i<10;i++)
			cb.addItem(choice[i]);
			f.add(scr2);
			f.setVisible(true);
		}		
		else if(me.getSource()==pri)
			{
				if(n!=0)
				{
					String column[]={"S.NO","PRODUCT","PRICE"};
					jt=new JTable(data,column);
					jt.setBounds(30,40,200,300);          
					sp=new JScrollPane(jt);    
					bp3.add(sp);
					bp3.setVisible(true);
					f.setVisible(true);
					String tot=Integer.toString(total);
					tf3.setText(tot+".00");
				}
				else
					JOptionPane.showMessageDialog(f,"Please select atleast one product.");
			}
		else if(me.getSource()==adp)
		{
			sp.getViewport().remove(jt);
			pri.setText("RE-PRINT");
			JOptionPane.showMessageDialog(f,"Select other items you want.\nThen press RE-PRINT");
			p3.setVisible(true);
			cb.removeAllItems();
			for(int i=0;i<10;i++)
			cb.addItem(choice[i]);
			f.add(p3);
			f.setVisible(true);
		}
		else if(me.getSource()==m1)
		{
			JOptionPane j=new JOptionPane();
			j.showOptionDialog(null,"Hello! This is TechnoShop v1.0 \nA Technological Shop to offer customers a better service and build loyalty.\n\nThis program is free software; you can redistribute it and/or modify it under the\nterms of the GNU General Public License as published by the Free Software Foundation;\neither version 2 of the License, or (at your option) any later version.\n\nAuthors:\nPOONAM VERMA\nANKIT ROHILLA","About TechnoShop", j.DEFAULT_OPTION,j.INFORMATION_MESSAGE, null, new Object[]{}, null);
			
		}
		else if(me.getSource()==m2)
		{
			JOptionPane y=new JOptionPane();
			y.showOptionDialog(null,"technoShop2k17@gmail.com \n\n(+91)9876543210 \n(+91)8978675645","Contact Us",y.DEFAULT_OPTION,y.INFORMATION_MESSAGE, null, new Object[]{}, null);
			
		}
		else if(me.getSource()==paid)
		{
			p3.setVisible(false);
			i=0;
			j=0;
			if(n!=0)
			{
				sp.setVisible(false);
				sp.getViewport().remove(jt);
				total=0;
			}
			cb.removeAllItems();
			tf3.setText(null);
			for(int i=0;i<10;i++)
			cb.addItem(choice[i]);
			pri.setText("PRINT");
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<3;j++)
				data[i][j]=null;
			}
			counter=1;
			p3.setVisible(true);
			f.add(p3);
			f.setVisible(true);
		}
	}
	public void mouseReleased(MouseEvent me)
	{

	}
	public void mouseEntered(MouseEvent me)
	{
		
	}
	public void mouseExited(MouseEvent me)
	{
		
	}
	public void mousePressed(MouseEvent me)
	{

	}
	public void actionPerformed(ActionEvent ie)
	{
			try
			{
				String ch="";
				String s=(String)cb.getSelectedItem();
				for(String st:choice)
				{
					if(((String)cb.getSelectedItem()).equals(st) && ((cb.getSelectedIndex())!=0))
				{
					ch=Integer.toString(counter);
					data[i][j]=ch;
					data[i][j+1]=((String)cb.getSelectedItem());
					for(k=1;k<10;k++)
					{
						if(((String)cb.getSelectedItem()).equals(choice[k]))
							 n=k;
					}
					data[i][j+2]=price[n];
					total=total+cost[n];
					j=0;
					counter++;
					i++;
				}
				}
			}
			catch(Exception e)
			{	
			}
	}
		
		//main() Class defined
		
	public static void main(String args[])
		{
			techno t=new techno();
		}
}
