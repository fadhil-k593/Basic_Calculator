import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    boolean isOperatorClicked=false;
    String oldValue;

    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton multiButton;
    JButton addButton;
    JButton minusButton;
    JButton clearButton;
    String operator = "";


public Calculator() {
         jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300,150);

         displayLabel=new JLabel(" ");
        displayLabel.setBounds(30, 50, 440, 50);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        sevenButton=new JButton("7");
        sevenButton.setBounds(30,120,80,80);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton=new JButton("8");
        eightButton.setBounds(120,120,80,80);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(210,120,80,80);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton=new JButton("4");
        fourButton.setBounds(30,210,80,80);
        fourButton.addActionListener(this);
        jf.add(fourButton);

     fiveButton=new JButton("5");
        fiveButton.setBounds(120,210,80,80);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

         sixButton=new JButton("6");
        sixButton.setBounds(210,210,80,80);
        sixButton.addActionListener(this);
        jf.add(sixButton);

         oneButton=new JButton("1");
        oneButton.setBounds(30,300,80,80);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(120,300,80,80);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton=new JButton("3");
        threeButton.setBounds(210,300,80,80);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton=new JButton(".");
        dotButton.setBounds(30,430,80,80);
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton=new JButton("0");
        zeroButton.setBounds(120,430,80,80);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton=new JButton("=");
        equalButton.setBounds(210,430,80,80);
        equalButton.addActionListener(this);
        jf.add(equalButton);

         divButton=new JButton("/");
        divButton.setBounds(330,120,80,85);
        divButton.addActionListener(this);
        jf.add(divButton);

         multiButton=new JButton("x");
        multiButton.setBounds(330,225,80,85);
        multiButton.addActionListener(this);
        jf.add(multiButton);

         addButton=new JButton("+");
        addButton.setBounds(330,325,80,85);
        addButton.addActionListener(this);
        jf.add(addButton);

        clearButton=new JButton("clear");
        clearButton.setBounds(420,120,110,85);
        clearButton.addActionListener(this);
        jf.add(clearButton);

     minusButton=new JButton("-");
        minusButton.setBounds(330,420,80,85);
        minusButton.addActionListener(this);
        jf.add(minusButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         


    }
    public static void main(String[] args) {
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== sevenButton) {
            if(isOperatorClicked) {
                displayLabel.setText("7");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"7");
            }
        }else if(e.getSource()== eightButton) {
            if(isOperatorClicked) {
                displayLabel.setText("8");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"8");
            }
        }else if(e.getSource()== nineButton) {
            if(isOperatorClicked) {
                displayLabel.setText("9");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }else if(e.getSource()== fourButton) {
            if(isOperatorClicked) {
                displayLabel.setText("4");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"4");
            }
        }else if(e.getSource()== fiveButton) {
            if(isOperatorClicked) {
                displayLabel.setText("5");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"5");
            }
        }else if(e.getSource()== sixButton) {
            if(isOperatorClicked) {
                displayLabel.setText("6");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"6");
            }
        }else if(e.getSource()== oneButton) {
            if(isOperatorClicked) {
                displayLabel.setText("1");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }else if(e.getSource()== twoButton) {
            if(isOperatorClicked) {
                displayLabel.setText("2");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"2");
            }
        }else if(e.getSource()== threeButton) {
            if(isOperatorClicked) {
                displayLabel.setText("3");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }else if(e.getSource()== dotButton) {
            displayLabel.setText(displayLabel.getText()+".");
        }else if(e.getSource()== zeroButton) {
            if(isOperatorClicked) {
                displayLabel.setText("0");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"0");
            }
        }else if (e.getSource() == equalButton) {
            isOperatorClicked = true;

            String newValue = displayLabel.getText();
            float oldValueF = 0;
            float newValueF = 0;
            try {
                oldValueF = Float.parseFloat(oldValue);
                newValueF = Float.parseFloat(newValue);
            } catch (NumberFormatException ex) {
                displayLabel.setText("Error");
                return;
            }
            float result = 0;
            if (isOperatorClicked) {
                if (operator.equals("+")) {
                    result = oldValueF + newValueF;
                } else if (operator.equals("-")) {
                    result = oldValueF - newValueF;
                } else if (operator.equals("*")) {
                    result = oldValueF * newValueF;
                } else if (operator.equals("/")) {
                    result = oldValueF / newValueF;
                }
                displayLabel.setText(result + "");
                isOperatorClicked = false;
            }
        }
        
        else if (e.getSource() == divButton) {
            operator = "/";
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
        } else if (e.getSource() == multiButton) {
            operator = "*";
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
        } else if (e.getSource() == addButton) {
            operator = "+";
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
        } else if (e.getSource() == minusButton) {
            operator = "-";
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
        } else if (e.getSource() == clearButton) {
            displayLabel.setText("");
            oldValue = "";
            operator = "";
            isOperatorClicked = false;
        }
    }
}
        
