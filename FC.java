

import javax.swing.*;
import java.awt.*;


public class FC {


    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");

    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDevide = new JButton("/");
    JButton buttonMultply = new JButton("*");

    JPanel MFC = new JPanel();
    JTextField displayField = new JTextField(30);


    FC(){
       BorderLayout b1 = new BorderLayout();
       MFC.setLayout(b1);

       MFC.add("North", displayField);

       JPanel p1 = new JPanel();
       GridLayout g1 = new GridLayout(4,3);


       p1.setLayout(g1);
       p1.add(button1);
       p1.add(button2);
       p1.add(button3);
       p1.add(button4);
       p1.add(button5);
       p1.add(button6);
       p1.add(button7);
       p1.add(button8);
       p1.add(button9);
       p1.add(button0);
       p1.add(buttonPoint);
       p1.add(buttonEqual);

       MFC.add("Center", p1);

       JPanel p2 = new JPanel();
       GridLayout g2 = new GridLayout(4,1);
       p2.setLayout(g2);
       p2.add(buttonPlus);
       p2.add(buttonMultply);
       p2.add(buttonMinus);
       p2.add(buttonDevide);

       MFC.add("East", p2);

       JFrame frame = new JFrame("MFNC");
       frame.setContentPane(MFC);

       frame.pack();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       CEV cev = new CEV(this);

       button1.addActionListener(cev);
       button2.addActionListener(cev);
       button3.addActionListener(cev);
       button4.addActionListener(cev);
       button5.addActionListener(cev);
       button6.addActionListener(cev);
       button7.addActionListener(cev);
       button8.addActionListener(cev);
       button9.addActionListener(cev);
       button0.addActionListener(cev);
       buttonPoint.addActionListener(cev);
       buttonPlus.addActionListener(cev);
       buttonMultply.addActionListener(cev);
       buttonMinus.addActionListener(cev);
       buttonDevide.addActionListener(cev);
       buttonEqual.addActionListener(cev);

    }


    public static void main(String[] args) {
        FC calc = new FC();

    }
}

