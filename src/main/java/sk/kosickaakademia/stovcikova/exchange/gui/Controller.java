package sk.kosickaakademia.stovcikova.exchange.gui;

import javafx.event.ActionEvent;


import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import sk.kosickaakademia.stovcikova.exchange.Main;
import sk.kosickaakademia.stovcikova.exchange.calc.Calculator;

public class Controller  extends Main {
    private TextField txt_value;
    public TextField txt_result;
    public ComboBox cmb_currency;
    public Button btn_change;


    /*public void change(ActionEvent actionEvent) {
        if (txt_value == null || cmb_currency == null){
            return;
        }
        if (checkIfIsNumber()== false){
            txt_result.setText("Not number");
            return;
        }
        double txt_value = Double.parseDouble(txt_result.getText().trim());
        String key = (String)cmb_currency.getValue();
        double result = new Calculator().calculate(txt_value, key);
        //result.setText(String.valueOf(result)); //vzsledkom yretayenia je novz retayec


    }*/


}