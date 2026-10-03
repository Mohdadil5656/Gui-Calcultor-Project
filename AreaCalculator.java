package com.adil.gui;

import java.awt.*;
import java.awt.event.*;

public class AreaCalculator implements ActionListener
	{
	    private Frame frm;
	    private Label l1, l2, l3;
	    private TextField tf1, tf2, tf3;
	    private Button circle, rectangle, square, clr;

	    public AreaCalculator()
	    {
	        frm = new Frame();

	        l1 = new Label("Value 1 : ");
	        l2 = new Label("Value 2 : ");
	        l3 = new Label("Area : ");

	        tf1 = new TextField();
	        tf2 = new TextField();
	        tf3 = new TextField();

	        circle = new Button(" Circle ");
	        rectangle = new Button(" Rectangle ");
	        square = new Button(" Square ");
	        clr = new Button(" CLR ");

	        // Label Colors
	        l1.setBackground(Color.PINK);
	        l1.setForeground(Color.BLACK);

	        l2.setBackground(Color.YELLOW);
	        l2.setForeground(Color.BLACK);

	        l3.setBackground(Color.GREEN);
	        l3.setForeground(Color.BLACK);

	        // TextField Colors
	        tf1.setBackground(Color.LIGHT_GRAY);
	        tf2.setBackground(Color.WHITE);
	        tf3.setBackground(Color.CYAN);

	        // Button Colors
	        circle.setBackground(Color.BLUE);
	        circle.setForeground(Color.WHITE);

	        rectangle.setBackground(Color.ORANGE);
	        rectangle.setForeground(Color.BLACK);

	        square.setBackground(Color.MAGENTA);
	        square.setForeground(Color.WHITE);

	        clr.setBackground(Color.RED);
	        clr.setForeground(Color.WHITE);
	    }

	    public void action()
	    {
	        frm.setVisible(true);
	        frm.setLayout(null);
	        frm.setTitle("Area Calculator");
	        frm.setBounds(100, 100, 500, 500);

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

	        frm.add(l1);
	        frm.add(l2);
	        frm.add(l3);

	        tf1.setBounds(140, 80, 100, 40);
	        tf2.setBounds(140, 125, 100, 40);
	        tf3.setBounds(140, 170, 100, 40);

	        frm.add(tf1);
	        frm.add(tf2);
	        frm.add(tf3);

	        circle.setBounds(30, 230, 80, 40);
	        rectangle.setBounds(120, 230, 90, 40);
	        square.setBounds(220, 230, 80, 40);
	        clr.setBounds(310, 230, 60, 40);

	        circle.addActionListener(this);
	        rectangle.addActionListener(this);
	        square.addActionListener(this);
	        clr.addActionListener(this);

	        frm.add(circle);
	        frm.add(rectangle);
	        frm.add(square);
	        frm.add(clr);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e)
	    {
	        if(e.getSource() == circle)
	        {
	            double radius = Double.parseDouble(tf1.getText());

	            double area = 3.14 * radius * radius;

	            tf3.setText(area + "");
	        }

	        if(e.getSource() == rectangle)
	        {
	            double length = Double.parseDouble(tf1.getText());
	            double width = Double.parseDouble(tf2.getText());

	            double area = length * width;

	            tf3.setText(area + "");
	        }

	        if(e.getSource() == square)
	        {
	            double side = Double.parseDouble(tf1.getText());

	            double area = side * side;

	            tf3.setText(area + "");
	        }

	        if(e.getSource() == clr)
	        {
	            tf1.setText("");
	            tf2.setText("");
	            tf3.setText("");
	        }
	    }
	}


