package com.adil.gui;

import java.awt.*;
import java.awt.event.*;

public class StudentPercentage implements ActionListener
{
    private Frame frm;
    private Label l1, l2, l3, l4, l5, l6, l7;
    private TextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
    private Button calculate, clr;

    public StudentPercentage()
    {
        frm = new Frame();

        l1 = new Label("Java : ");
        l2 = new Label("Maths : ");
        l3 = new Label("English : ");
        l4 = new Label("Computer : ");
        l5 = new Label("DBMS : ");
        l6 = new Label("Total : ");
        l7 = new Label("Percentage : ");

        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        tf4 = new TextField();
        tf5 = new TextField();
        tf6 = new TextField();
        tf7 = new TextField();

        calculate = new Button(" Calculate ");
        clr = new Button(" CLR ");

        // Label Colors
        l1.setBackground(Color.RED);
        l1.setForeground(Color.WHITE);

        l2.setBackground(Color.BLUE);
        l2.setForeground(Color.WHITE);

        l3.setBackground(Color.PINK);
        l3.setForeground(Color.BLACK);

        l4.setBackground(Color.YELLOW);
        l4.setForeground(Color.BLACK);

        l5.setBackground(Color.ORANGE);
        l5.setForeground(Color.BLACK);

        l6.setBackground(Color.GREEN);
        l6.setForeground(Color.BLACK);

        l7.setBackground(Color.CYAN);
        l7.setForeground(Color.BLACK);

        // TextField Colors
        tf1.setBackground(Color.LIGHT_GRAY);
        tf2.setBackground(Color.WHITE);
        tf3.setBackground(Color.LIGHT_GRAY);
        tf4.setBackground(Color.WHITE);
        tf5.setBackground(Color.LIGHT_GRAY);

        tf6.setBackground(Color.GREEN);
        tf7.setBackground(Color.CYAN);

        // Button Colors
        calculate.setBackground(Color.BLUE);
        calculate.setForeground(Color.WHITE);

        clr.setBackground(Color.RED);
        clr.setForeground(Color.WHITE);
    }

    public void action()
    {
        frm.setVisible(true);
        frm.setLayout(null);
        frm.setTitle("Student Percentage");
        frm.setBounds(100, 50, 450, 550);

        frm.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                frm.dispose();
                System.exit(0);
            }
        });

        l1.setBounds(30, 40, 100, 35);
        l2.setBounds(30, 80, 100, 35);
        l3.setBounds(30, 120, 100, 35);
        l4.setBounds(30, 160, 100, 35);
        l5.setBounds(30, 200, 100, 35);
        l6.setBounds(30, 240, 100, 35);
        l7.setBounds(30, 280, 100, 35);

        frm.add(l1);
        frm.add(l2);
        frm.add(l3);
        frm.add(l4);
        frm.add(l5);
        frm.add(l6);
        frm.add(l7);

        tf1.setBounds(140, 40, 100, 35);
        tf2.setBounds(140, 80, 100, 35);
        tf3.setBounds(140, 120, 100, 35);
        tf4.setBounds(140, 160, 100, 35);
        tf5.setBounds(140, 200, 100, 35);
        tf6.setBounds(140, 240, 100, 35);
        tf7.setBounds(140, 280, 100, 35);

        frm.add(tf1);
        frm.add(tf2);
        frm.add(tf3);
        frm.add(tf4);
        frm.add(tf5);
        frm.add(tf6);
        frm.add(tf7);

        calculate.setBounds(30, 340, 100, 40);
        clr.setBounds(145, 340, 70, 40);

        calculate.addActionListener(this);
        clr.addActionListener(this);

        frm.add(calculate);
        frm.add(clr);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == calculate)
        {
            double a = Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf2.getText());
            double c = Double.parseDouble(tf3.getText());
            double d = Double.parseDouble(tf4.getText());
            double f = Double.parseDouble(tf5.getText());

            double total = a + b + c + d + f;
            double percentage = total / 5;

            tf6.setText(total + "");
            tf7.setText(percentage + "%");
        }

        if(e.getSource() == clr)
        {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
        }
    }
}
