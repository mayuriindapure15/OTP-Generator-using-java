import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
import java.util.Random;
import  java.lang.Integer ;
/*
<applet code="OtpDemo" height=500 width=500>
</applet>
*/


public class OtpDemo extends JApplet  implements ActionListener
{
	JButton b;
	JLabel Jl;
	Random random=new Random();
	int rm;
	JLabel l,l2;
	JTextField t1;
	JButton b1;
	String getOtp;
	String getrm;
	public void init()
	{	
		
		setLayout(null);
		b=new JButton("GenerateOTP");
		b.setBounds(150,150,200,50);
		add(b);
		Jl=new JLabel();
		Jl.setBounds(159,200,300,50);
		add(Jl);
		setSize(400,400);
		b.addActionListener(this);
		
		l=new JLabel("Enter the OTP");
		l.setBounds(50,200,100,90);
		add(l);
		t1=new JTextField();	
		t1.setBounds(190,235,150,30);
		add(t1);
		b1=new JButton("Verify");
		b1.setBounds(150,300,150,50);
		add(b1);
		l2=new JLabel("Authontication");
		l2.setBounds(150,400,200,100);
		add(l2);
		b1.addActionListener(this);
		
		
	}
	


               public void actionPerformed(ActionEvent ae)
	{

		if(ae.getSource()==b)
		{
			rm=random.nextInt();
			Jl.setText(""+rm);
			
		}
		if(ae.getSource()==b1)
		{	
			try{
			getOtp=t1.getText();	
			getrm=Jl.getText();
			if(getOtp.equals(getrm))
			{
				//showStatus("Verified");
				l2.setText("Verified");	
			}
			else
			{
				l2.setText("OTP not getting match");	
			}
			}
			catch(Exception e){}
		}
	}
	



}



 