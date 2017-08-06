

//тут я вообще уже перестала понимать, что происходит

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CEV implements ActionListener {

    FC parent;

    char selectedAction = ' '; //- + * /  {
    double currentResult = 0;
    CEV (FC parent) {
        this.parent = parent;
    }


    public void actionPerformed(ActionEvent e) {

        JButton clickedButton = (JButton) e.getSource();
        String dispFieldText = parent.displayField.getText();
        double displyaValue = 0;
        if (!"".equals(dispFieldText)) {
            displyaValue = Double.parseDouble(dispFieldText);
        }
        Object src = e.getSource();
        if (src == parent.buttonPlus) {
            selectedAction = '+';
            currentResult = displyaValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMinus){
        selectedAction = '-';
        currentResult = displyaValue;
        parent.displayField.setText("");


        } else if (src == parent.buttonDevide){
            selectedAction = '/';
            currentResult = displyaValue;
            parent.displayField.setText("");

        } else if (src == parent.buttonMultply){
            selectedAction = '*';
            currentResult = displyaValue;
            parent.displayField.setText("");

        } else if (src == parent.buttonEqual) {
            if (selectedAction == '+') {
                currentResult += displyaValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '-'){
                currentResult -= displyaValue;
                parent.displayField.setText("" + currentResult);

            } else if (selectedAction == '/'){
                currentResult /= displyaValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '*'){
                currentResult *= displyaValue;
                parent.displayField.setText("" + currentResult);
            } else {
                String clickedButtonLabel = clickedButton.getText();
                parent.displayField.setText(dispFieldText + clickedButtonLabel);
            }

        }


    }
    }