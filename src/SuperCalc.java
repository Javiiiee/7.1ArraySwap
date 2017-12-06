import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class SuperCalc extends JFrame {
    private JTextField [] textField = new JTextField[10];
    private JLabel label;
    private Button buttonSum;
    private Button buttonSort;


    public SuperCalc(){
        label = new JLabel("           0.0");
        Button buttonSum = new Button("SUM");
        buttonSum.addActionListener(new CalculateHandle());
        Button buttonSort = new Button("SORT");
        buttonSort.addActionListener(new SortHandle());

        JPanel masterPanel = new JPanel(new BorderLayout());
        JPanel numberFields = textFieldMethod();

        masterPanel.add(buttonSum, BorderLayout.PAGE_END);
        masterPanel.add(buttonSort, BorderLayout.LINE_END);
        masterPanel.add(label, BorderLayout.PAGE_START);
        masterPanel.add(numberFields, BorderLayout.CENTER);
        setContentPane(masterPanel);
    }
    public static void main(String [] args){
        SuperCalc siri = new SuperCalc();
        siri.setSize(10000,10000);
        siri.setTitle("SUPER CALCULATOR SIRI");
        siri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        siri.pack();
        siri.setVisible(true);
    }
    public JPanel textFieldMethod () {
        GridLayout grid = new GridLayout(2, 2);
        JPanel fieldsPanel = new JPanel(grid);
        for (int i = 0; i < textField.length; i++) {
            textField[i] = new JTextField("            ");
            fieldsPanel.add(textField[i]);
        }
        return fieldsPanel;
    }
    private class CalculateHandle implements ActionListener {
        public void actionPerformed (ActionEvent e){
            double input0 = Double.parseDouble(textField[0].getText());
            double input1 = Double.parseDouble(textField[1].getText());
            double input2 = Double.parseDouble(textField[2].getText());
            double input3 = Double.parseDouble(textField[3].getText());
            double result = (input0+input1+input2+input3);
            DecimalFormat format = new DecimalFormat("####.00");
            label.setText(String.valueOf(format.format((result))));
        }
    }
    private class SortHandle implements ActionListener {
        public void actionPerformed (ActionEvent e){
            double [] textfield2 = new double[10];
            textfield2 [0] = Double.parseDouble(textField[0].getText());
            textfield2 [1] = Double.parseDouble(textField[1].getText());
            textfield2 [2] = Double.parseDouble(textField[2].getText());
            textfield2 [3] = Double.parseDouble(textField[3].getText());
            textfield2 [4] = Double.parseDouble(textField[4].getText());
            textfield2 [5] = Double.parseDouble(textField[5].getText());
            textfield2 [6] = Double.parseDouble(textField[6].getText());
            textfield2 [7] = Double.parseDouble(textField[7].getText());
            textfield2 [8] = Double.parseDouble(textField[8].getText());
            textfield2 [9] = Double.parseDouble(textField[9].getText());
            label.setText(Math.sort(textfield2));
       }
    }
}



