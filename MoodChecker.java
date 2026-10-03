package com.adil.gui;

import java.awt.*;
import java.awt.event.*;

public class MoodChecker implements ActionListener
{
    private Frame frm;
    private Label l1, l2;
    private TextField tf1, tf2;
    private Button happy, sad, angry, sleepy, clr;

    public MoodChecker()
    {
        frm = new Frame();

        l1 = new Label("Enter Name : ");
        l2 = new Label("Mood : ");

        tf1 = new TextField();
        tf2 = new TextField();

        happy = new Button(" Happy  ");
        sad = new Button(" Sad  ");
        angry = new Button(" Angry  ");
        sleepy = new Button(" Sleepy ");
        clr = new Button(" CLR ");

        l1.setBackground(Color.PINK);
        l2.setBackground(Color.CYAN);

        happy.setBackground(Color.GREEN);
        sad.setBackground(Color.BLUE);
        sad.setForeground(Color.WHITE);
        angry.setBackground(Color.RED);
        angry.setForeground(Color.WHITE);
        sleepy.setBackground(Color.ORANGE);
        clr.setBackground(Color.MAGENTA);
        clr.setForeground(Color.WHITE);
    }

    public void action()
    {
        frm.setVisible(true);
        frm.setLayout(null);
        frm.setTitle("Funny Mood Checker");
        frm.setBounds(100, 100, 500, 500);

        frm.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                frm.dispose();
                System.exit(0);
            }
        });

        l1.setBounds(30, 80, 100, 40);
        l2.setBounds(30, 130, 100, 40);

        frm.add(l1);
        frm.add(l2);

        tf1.setBounds(140, 80, 150, 40);
        tf2.setBounds(140, 130, 200, 40);

        frm.add(tf1);
        frm.add(tf2);

        happy.setBounds(30, 200, 90, 40);
        sad.setBounds(130, 200, 80, 40);
        angry.setBounds(220, 200, 90, 40);
        sleepy.setBounds(320, 200, 90, 40);
        clr.setBounds(190, 270, 70, 40);

        happy.addActionListener(this);
        sad.addActionListener(this);
        angry.addActionListener(this);
        sleepy.addActionListener(this);
        clr.addActionListener(this);

        frm.add(happy);
        frm.add(sad);
        frm.add(angry);
        frm.add(sleepy);
        frm.add(clr);
    }

    public void actionPerformed(ActionEvent e)
    {
        String name = tf1.getText();

        if(e.getSource() == happy)
        {
            tf2.setText(name + " is Happy ");
        }

        if(e.getSource() == sad)
        {
            tf2.setText(name + " is Sad ");
        }

        if(e.getSource() == angry)
        {
            tf2.setText(name + " is Angry ");
        }

        if(e.getSource() == sleepy)
        {
            tf2.setText(name + " is Sleepy ");
        }

        if(e.getSource() == clr)
        {
            tf1.setText("");
            tf2.setText("");
        }
    }
}