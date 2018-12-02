import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcPage {
    JTextField calcJTextField = new JTextField(15);


    CalcPage() {


        JFrame calcJframe = new JFrame("Calculator");

        calcJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcJframe.setLayout(new GridBagLayout());
        calcJframe.setSize(280, 450);
        calcJframe.setLocationRelativeTo(null);

        JButton jButton0 = new JButton("0");
        new ButtonView(jButton0);
        jButton0.addActionListener(new CalcActionListener());

        JButton jButton1 = new JButton("1");
        new ButtonView(jButton1);
        jButton1.addActionListener(new CalcActionListener());

        JButton jButton2 = new JButton("2");
        new ButtonView(jButton2);
        jButton2.addActionListener(new CalcActionListener());

        JButton jButton3 = new JButton("3");
        new ButtonView(jButton3);
        jButton3.addActionListener(new CalcActionListener());

        JButton jButton4 = new JButton("4");
        new ButtonView(jButton4);
        jButton4.addActionListener(new CalcActionListener());

        JButton jButton5 = new JButton("5");
        new ButtonView(jButton5);
        jButton5.addActionListener(new CalcActionListener());

        JButton jButton6 = new JButton("6");
        new ButtonView(jButton6);
        jButton6.addActionListener(new CalcActionListener());

        JButton jButton7 = new JButton("7");
        new ButtonView(jButton7);
        jButton7.addActionListener(new CalcActionListener());

        JButton jButton8 = new JButton("8");
        new ButtonView(jButton8);
        jButton8.addActionListener(new CalcActionListener());

        JButton jButton9 = new JButton("9");
        new ButtonView(jButton9);
        jButton9.addActionListener(new CalcActionListener());

        JButton jButtonPlus = new JButton("+");
        new ButtonView(jButtonPlus);
        jButtonPlus.addActionListener(new CalcActionListener());

        JButton jButtonMinus = new JButton("-");
        new ButtonView(jButtonMinus);
        jButtonMinus.addActionListener(new CalcActionListener());

        JButton jButtonMultiply = new JButton("*");
        new ButtonView(jButtonMultiply);
        jButtonMultiply.addActionListener(new CalcActionListener());

        JButton jButtonDivision = new JButton("/");
        new ButtonView(jButtonDivision);
        jButtonDivision.addActionListener(new CalcActionListener());

        JButton jButtonDot = new JButton(".");
        new ButtonView(jButtonDot);
        jButtonDot.addActionListener(new CalcActionListener());

        JButton jButtonToClear = new JButton("C");
        new ButtonView(jButtonToClear);
        jButtonToClear.setForeground(new Color(251, 119, 47));
        jButtonToClear.addActionListener(new CalcActionListener());

        JButton jButtonErace = new JButton("<");
        new ButtonView(jButtonErace);
        jButtonErace.addActionListener(new CalcActionListener());

        JButton jButtonEqually = new JButton("=");
        jButtonEqually.setBackground(new Color(251, 119, 47));
        jButtonEqually.setFont(new Font("Verdana", Font.PLAIN, 15));
        jButtonEqually.setForeground(Color.WHITE);
        jButtonEqually.addActionListener(new CalcActionListener());

        JButton jButtonPercent = new JButton("%");
        new ButtonView(jButtonPercent);
        jButtonPercent.addActionListener(new CalcActionListener());

        calcJTextField.setFont(new Font("Verdana", Font.PLAIN, 30));


        calcJframe.add(calcJTextField, new GridBagConstraints(0, 0, 0, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(10, 10, 10, 10), 1, 1));

        //1
        calcJframe.add(jButtonToClear, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 10, 0, 0), 1, 1));

        calcJframe.add(jButtonErace, new GridBagConstraints(1, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 1, 1));

        calcJframe.add(jButtonDivision, new GridBagConstraints(2, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 1, 1));

        calcJframe.add(jButtonMultiply, new GridBagConstraints(3, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 0, 10), 1, 1));

        //2


        calcJframe.add(jButton7, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 10, 0, 0), 1, 1));

        calcJframe.add(jButton8, new GridBagConstraints(1, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 1, 1));

        calcJframe.add(jButton9, new GridBagConstraints(2, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 1, 1));

        calcJframe.add(jButtonMinus, new GridBagConstraints(3, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 0, 10), 1, 1));

        //3


        calcJframe.add(jButton4, new GridBagConstraints(0, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 10, 0, 0), 1, 1));

        calcJframe.add(jButton5, new GridBagConstraints(1, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 1, 1));

        calcJframe.add(jButton6, new GridBagConstraints(2, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 1, 1));

        calcJframe.add(jButtonPlus, new GridBagConstraints(3, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 0, 10), 1, 1));

        //4

        calcJframe.add(jButton1, new GridBagConstraints(0, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 10, 0, 0), 1, 1));

        calcJframe.add(jButton2, new GridBagConstraints(1, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 1, 1));

        calcJframe.add(jButton3, new GridBagConstraints(2, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 1, 1));

        calcJframe.add(jButtonPercent, new GridBagConstraints(3, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 0, 10), 1, 1));

        //5

        calcJframe.add(jButtonDot, new GridBagConstraints(0, 5, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 10, 10, 0), 1, 1));

        calcJframe.add(jButton0, new GridBagConstraints(1, 5, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 10, 0), 1, 1));

        calcJframe.add(jButtonEqually, new GridBagConstraints(2, 5, 2, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 10, 10), 1, 1));


        calcJframe.setVisible(true);


    }

    static String result = "";

    class CalcActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String expression = calcJTextField.getText();
            String operation = e.getActionCommand();
            boolean thisIsOperation = operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*") || operation.equals(".");
            boolean operationOfTheEnd = expression.endsWith("+") || expression.endsWith("-") || expression.endsWith("/") || expression.endsWith("*") || expression.endsWith(".");


            if (operation.equals("-")) {

                if (expression.equals("")) {
                    calcJTextField.setText("-");
                } else if (expression.endsWith("/")) {
                    calcJTextField.setText(expression + "-");
                } else if (expression.endsWith("*")) {
                    calcJTextField.setText(expression + "-");
                } else if (operationOfTheEnd) {
                    expression = expression.substring(0, expression.length() - 1) + "-";
                    calcJTextField.setText(expression);
                } else calcJTextField.setText(expression + "-");

            } else if (operation.equals("+")) {

                if (expression.equals("")) {
                } else if (operationOfTheEnd) {
                    expression = expression.substring(0, expression.length() - 1) + "+";
                    calcJTextField.setText(expression);
                } else calcJTextField.setText(expression + "+");

            } else if (thisIsOperation) {

                if (expression.equals("")) {
                } else if (operationOfTheEnd) {
                    expression = expression.substring(0, expression.length() - 1) + operation;
                    calcJTextField.setText(expression);

                } else calcJTextField.setText(expression + operation);

            } else if (operation.equals("<")) {

                if (expression.equals("")) {
                } else {
                    expression = expression.substring(0, expression.length() - 1);
                    calcJTextField.setText(expression);
                }
            } else if (operation.equals("C")) calcJTextField.setText("");


            else if (operation.equals("=")) {

                if (expression.equals("")) {
                } else if (operationOfTheEnd) {
                    expression = expression.substring(0, expression.length() - 1) + operation;
                    calcJTextField.setText(expression);

                } else {
                    calcJTextField.setText(expression + operation);
                    result = expression + operation;
                }


            }
            else calcJTextField.setText(expression + operation);

        }
    }
}













/*Calculation c = new Calculation();


                if (oneLevelCache.linkedList.isEmpty()) {

                    c.getArrayList(expression + operation);

                    calcJTextField.setText(expression + operation + c.expressionValue());
                    oneLevelCache.linkedList.add(expression + operation + c.expressionValue());

                    System.out.println("если пустой кэш");

                }
                else if (oneLevelCache.SearchLinkedList(expression + operation, calcJTextField) ||
                        twoLevelСache.SearchArrayList(expression + operation, calcJTextField, oneLevelCache.linkedList)) {}


                else {
                    if(oneLevelCache.linkedList.size() < 10) {

                        c.getArrayList(expression + operation);
                        calcJTextField.setText(expression + operation + c.expressionValue());
                        oneLevelCache.linkedList.add(expression + operation + c.expressionValue());
                        System.out.println("добавлено в кэш первого уровня");

                    } else if (twoLevelСache.arrayList.size() < 10){

                        c.getArrayList(expression + operation);
                        calcJTextField.setText(expression + operation + c.expressionValue());
                        twoLevelСache.arrayList.add(expression + operation + c.expressionValue());
                        System.out.println(" добавлено в кэш второго уровня");

                    }  else {

                        c.getArrayList(expression + operation);
                        calcJTextField.setText(expression + operation + c.expressionValue());
                        twoLevelСache.arrayList.remove(0);
                        twoLevelСache.arrayList.add(expression + operation + c.expressionValue());

                    }

                }



            }*/


