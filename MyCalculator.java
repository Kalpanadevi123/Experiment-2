/* Program to create a Simple Calculator */
import java.awt.*;
import java.awt.event.*;
public class MyCalculator extends Frame implements ActionListener {
    double num1,num2,result;
    Label lbl1,lbl2,lbl3;
    TextField tf1,tf2,tf3;
    Button btn1,btn2,btn3,btn4;
    char op;
    MyCalculator() {
        lbl1=new Label("Number 1: ");
        lbl1.setBounds(50,100,100,30);
        
        tf1=new TextField();
        tf1.setBounds(160,100,100,30);
        
        lbl2=new Label("Number 2: ");
        lbl2.setBounds(50,170,100,30);
        
        tf2=new TextField();
        tf2.setBounds(160,170,100,30);
        
        btn1=new Button("+");
        btn1.setBounds(50,250,40,40);

        btn2=new Button("-");
        btn2.setBounds(120,250,40,40);

        btn3=new Button("*");
        btn3.setBounds(190,250,40,40);

        btn4=new Button("/");
        btn4.setBounds(260,250,40,40);
        
        lbl3=new Label("Result : ");
        lbl3.setBounds(50,320,100,30);
        
        tf3=new TextField();
        tf3.setBounds(160,320,100,30);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        
        add(lbl1); add(lbl2); add(lbl3);
        add(tf1);  add(tf2);  add(tf3);
        add(btn1); add(btn2); add(btn3); add(btn4);

        setSize(400,500);
        setLayout(null);
        setTitle("Calculator");
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        num1 = Double.parseDouble(tf1.getText());
        num2 = Double.parseDouble(tf2.getText());
        
        if(ae.getSource() == btn1)
        {
            result = num1 + num2;
            tf3.setText(String.valueOf(result));
        }
        if(ae.getSource() == btn2)
        {
            result = num1 - num2;
            tf3.setText(String.valueOf(result));
        }
        if(ae.getSource() == btn3)
        {
            result = num1 * num2;
            tf3.setText(String.valueOf(result));
        }
        if(ae.getSource() == btn4)
        {
                result = num1 / num2;
                tf3.setText(String.valueOf(result));
        }
    }

    public static void main(String args[]) {
        MyCalculator calc=new MyCalculator();
    }
}
