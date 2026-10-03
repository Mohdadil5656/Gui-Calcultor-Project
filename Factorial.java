package com.adil.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Factorial implements ActionListener
	{
	    private Frame frm;
	    private Button btn1, clr, btn2;
	    private Label l1, l2, l3;
	    private TextField tf1, tf2, tf3;

	    public Factorial()
	    {
	        frm = new Frame();

	        btn1 = new Button("Fact");
	        btn2 = new Button(" - ");
	        clr = new Button("Clear");

	        l1 = new Label("Enter the n1 : ");
	        l2 = new Label("Enter the n2 : ");
	        l3 = new Label(" Result  : ");

	        tf1 = new TextField();
	        tf2 = new TextField();
	        tf3 = new TextField();
	    }

	    public void action()
	    {
	        frm.setVisible(true);
	        frm.setLayout(null);
	        frm.setTitle("Factorial");
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

	        l1.setBounds(30, 100, 100, 40);
	        l2.setBounds(30, 145, 100, 40);
	        l3.setBounds(30, 190, 100, 40);

	        frm.add(l1);
	        frm.add(l2);
	        frm.add(l3);

	        tf1.setBounds(130, 100, 100, 40);
	        tf2.setBounds(130, 145, 100, 40);
	        tf3.setBounds(130, 190, 100, 40);

	        frm.add(tf1);
	        frm.add(tf2);
	        frm.add(tf3);

	        btn1.setBounds(30, 235, 50, 40);
	        btn1.addActionListener(this);
	        btn1.setBackground(Color.ORANGE);
	        frm.add(btn1);

	        btn2.setBounds(30 + 55, 235, 50, 40);
	        btn2.addActionListener(this);
	        btn2.setBackground(Color.green);
	        frm.add(btn2);

	        clr.setBounds(30 + 55 + 55, 235, 70, 40);
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

	            if(!s1.isBlank())
	            {
	                int n1 = Integer.parseInt(s1);
	                int fact = 1;

	                for(int i = 1; i <= n1; i++)
	                {
	                    fact = fact * i;
	                }

	                tf3.setText(fact + "");
	            }
	            else
	            {
	                System.out.println(" Field is blank");
	                tf3.setText("0");
	            }
	        }

	        if(e.getSource() == btn2)
	        {
	            tf1.setText("");
	            tf2.setText("");
	            tf3.setText("");
	        }

	        else if(e.getSource() == clr)
	        {
	            tf1.setText("");
	            tf2.setText("");
	            tf3.setText("");
	        }
	    }
	}


