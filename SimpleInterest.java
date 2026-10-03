package com.adil.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleInterest implements ActionListener
	{
	    private Frame frm;
	    private Button btn1, clr;
	    private Label l1, l2, l3, l4;
	    private TextField tf1, tf2, tf3, tf4;

	    public SimpleInterest()
	    {
	        frm = new Frame();

	        btn1 = new Button(" Calculate ");
	        clr = new Button(" CLR ");

	        l1 = new Label("Principal : ");
	        l2 = new Label("Rate : ");
	        l3 = new Label("Time : ");
	        l4 = new Label("Interest : ");

	        tf1 = new TextField();
	        tf2 = new TextField();
	        tf3 = new TextField();
	        tf4 = new TextField();
	    }

	    public void action()
	    {
	        frm.setVisible(true);
	        frm.setLayout(null);
	        frm.setTitle("Simple Interest");
	        frm.setBounds(100, 100, 400, 500);

	        frm.addWindowListener(new WindowAdapter()
	        {
	            @Override
	            public void windowClosing(WindowEvent e)
	            {
	                frm.dispose();
	                System.exit(0);
	            }
	        });

	        l1.setBounds(30, 80, 100, 40);
	        l2.setBounds(30, 125, 100, 40);
	        l3.setBounds(30, 170, 100, 40);
	        l4.setBounds(30, 215, 100, 40);

	        frm.add(l1);
	        frm.add(l2);
	        frm.add(l3);
	        frm.add(l4);

	        tf1.setBounds(140, 80, 120, 40);
	        tf2.setBounds(140, 125, 120, 40);
	        tf3.setBounds(140, 170, 120, 40);
	        tf4.setBounds(140, 215, 120, 40);

	        frm.add(tf1);
	        frm.add(tf2);
	        frm.add(tf3);
	        frm.add(tf4);

	        btn1.setBounds(30, 275, 100, 40);
	        btn1.addActionListener(this);
	        btn1.setBackground(Color.GREEN);
	        frm.add(btn1);

	        clr.setBounds(145, 275, 80, 40);
	        clr.setBackground(Color.RED);
	        clr.setForeground(Color.WHITE);
	        clr.addActionListener(this);
	        frm.add(clr);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e)
	    {
	        if(e.getSource() == btn1)
	        {
	            String s1 = tf1.getText();
	            String s2 = tf2.getText();
	            String s3 = tf3.getText();

	            if(!(s1.isBlank() || s2.isBlank() || s3.isBlank()))
	            {
	                double p = Double.parseDouble(s1);
	                double r = Double.parseDouble(s2);
	                double t = Double.parseDouble(s3);

	                double si = (p * r * t) / 100;

	                tf4.setText(si + "");
	            }
	            else
	            {
	                System.out.println(" Field is blank");
	                tf4.setText("0");
	            }
	        }

	        else if(e.getSource() == clr)
	        {
	            tf1.setText("");
	            tf2.setText("");
	            tf3.setText("");
	            tf4.setText("");
	        }
	    }
	}


