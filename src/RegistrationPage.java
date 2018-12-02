import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class RegistrationPage {

    JFrame jFrame = new JFrame("Registration");
    JTextField loginField = new JTextField(15);
    JTextField passwordField = new JTextField(15);
    JTextField rapeatPasswordField = new JTextField(15);

    RegistrationPage(){



            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setSize(300,150);
            jFrame.setLocationRelativeTo(null);
            jFrame.setLayout(new GridBagLayout());

            JLabel loginlabel = new JLabel("Login");
            JLabel passwordlabel = new JLabel("Password");
            JLabel repeatPasswordlabel = new JLabel("Repeat password");

            JButton registrationButton = new JButton("Registration");
            new ButtonView(registrationButton);
            registrationButton.addActionListener(new RegistrationListener());




            jFrame.add(loginlabel, new GridBagConstraints(0,0,1,1,0,1,
                    GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1),1,1));

            jFrame.add(passwordlabel, new GridBagConstraints(0,1,1,1,0,1,
                    GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1),1,1));

            jFrame.add(repeatPasswordlabel, new GridBagConstraints(0,2,1,1,0,1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1),1,1));

            jFrame.add(loginField, new GridBagConstraints(1,0,1,1,0,1,
                    GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1),1,1));

            jFrame.add(passwordField, new GridBagConstraints(1,1,1,1,0,1,
                    GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1),1,1));

            jFrame.add(rapeatPasswordField, new GridBagConstraints(1,2,1,1,0,1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1),1,1));

            jFrame.add(registrationButton, new GridBagConstraints(0,3,2,1,0,1,
                    GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1),1,1));

            jFrame.pack();

            jFrame.setVisible(true);








    }


    static String result = "";

    class RegistrationListener implements ActionListener{


        public boolean checkInputData (String login, String password, String repeatPassword){

            char[] unresolvedСharacters = new char[]{':',';','.',' ', '/'};

            boolean check = true;
            int i = 0;

            while (i == 0) {

                if (login.equals("") || password.equals("") || repeatPassword.equals("")) {
                    new Message("Please, enter the data in all folders");
                    check = false;
                    break;
                }

                for (int j = 0; j < unresolvedСharacters.length; j++) {

                    if (login.indexOf(unresolvedСharacters[j]) != -1 || password.indexOf(unresolvedСharacters[j]) != -1 || repeatPassword.indexOf(unresolvedСharacters[j]) != -1) {

                        new Message("Login and password cannot contain characters \":\",\";\",\".\",\"/\" and \"space\"");
                        check = false;
                        break;
                    }
                }

                if (login.length() > 30 || password.length() > 30){
                    new Message("Length of the login and password should not be more than 30 characters");
                    check = false;
                    break;
                }

                if (!password.equals(repeatPassword)){
                    new  Message("Passwords are different");
                    check = false;
                    break;
                }

                ++i;
            }

            return check;

        }


        @Override
        public void actionPerformed(ActionEvent e) {


            String login = loginField.getText();
            String password = passwordField.getText();
            String rapeatPassword = rapeatPasswordField.getText();


            if (checkInputData(login, password, rapeatPassword) == true) {
                result = login + ":" + password;

            }

        }
    }
}


/* public boolean checkInputData (String login, String password){

            char[] unresolvedСharacters = new char[]{':',';','.',' ', '/'};

            boolean check = true;
            int i = 0;

            while (i == 0) {

                if (login.equals("") || password.equals("")) {
                    new Message("Please, enter the data in all folders");
                    check = false;
                    break;
                }

                for (int j = 0; j < unresolvedСharacters.length; j++) {

                    if (login.indexOf(unresolvedСharacters[j]) != -1 || password.indexOf(unresolvedСharacters[j]) != -1) {

                        new Message("Login and password cannot contain characters \":\",\";\",\".\",\"/\" and \"space\"");
                        check = false;
                        break;
                    }
                }

                if (login.length() > 30 || password.length() > 30){
                    new Message("Length of the login and password should not be more than 30 characters");
                    check = false;
                    break;
                }

                ++i;
            }

            return check;

        }


        @Override
        public void actionPerformed(ActionEvent e) {

            String login = loginField.getText();
            String password = passwordField.getText();


            if (e.getActionCommand().equals("Lign in")) {



                if (checkInputData(login, password) == true) {
                    result = login + ":" + password;
                }
            } else {


            }


        }

    }*/