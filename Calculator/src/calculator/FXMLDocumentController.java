package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author Mark Noriel's PC
 */
public class FXMLDocumentController implements Initializable {
    private String expressions = "";

     @FXML
    private TextField handlerDisplay;
    
    @FXML
    private Text handlerCalcDisp;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handlerClear(ActionEvent event) {
        handlerDisplay.setText("0");
        handlerCalcDisp.setText("0");
    }

    @FXML
    private void btnDiv(ActionEvent event) {
       expressions += handlerDisplay.getText() + "/";
       handlerCalcDisp.setText(handlerDisplay.getText() + " ÷ ");
       handlerDisplay.setText("");
    }

    @FXML
    private void num7(ActionEvent event) {
        String textDisplay = handlerDisplay.getText();
        String secDisplay = ((Button)event.getSource()).getText();
  
        if(textDisplay.equals("0")){
            handlerDisplay.setText("7");
            handlerCalcDisp.setText("7");
        }else{
             handlerDisplay.setText(handlerDisplay.getText() + "7");
             handlerCalcDisp.setText(handlerCalcDisp.getText() + secDisplay);
        } 
    }

    @FXML
    private void num8(ActionEvent event) {
        String textDisplay = handlerDisplay.getText();
        String secDisplay = ((Button)event.getSource()).getText();
  
        if(textDisplay.equals("0")){
            handlerDisplay.setText("8");
            handlerCalcDisp.setText("8");
        }else{
             handlerDisplay.setText(handlerDisplay.getText() + "8");
             handlerCalcDisp.setText(handlerCalcDisp.getText() + secDisplay);
        } 
    }

    @FXML
    private void num9(ActionEvent event) {
     String textDisplay = handlerDisplay.getText();
        String secDisplay = ((Button)event.getSource()).getText();
  
        if(textDisplay.equals("0")){
            handlerDisplay.setText("9");
            handlerCalcDisp.setText("9");
        }else{
             handlerDisplay.setText(handlerDisplay.getText() + "9");
             handlerCalcDisp.setText(handlerCalcDisp.getText() + secDisplay);
        } 
    }

    @FXML
    private void btnMultiply(ActionEvent event) {
       expressions += handlerDisplay.getText() + "*";
       handlerCalcDisp.setText(handlerDisplay.getText() + " × ");
       handlerDisplay.setText("");
    }

    @FXML
    private void num4(ActionEvent event) {
       String textDisplay = handlerDisplay.getText();
        String secDisplay = ((Button)event.getSource()).getText();
  
        if(textDisplay.equals("0")){
            handlerDisplay.setText("4");
            handlerCalcDisp.setText("4");
        }else{
             handlerDisplay.setText(handlerDisplay.getText() + "4");
             handlerCalcDisp.setText(handlerCalcDisp.getText() + secDisplay);
        } 
    }

    @FXML
    private void num5(ActionEvent event) {
       String textDisplay = handlerDisplay.getText();
        String secDisplay = ((Button)event.getSource()).getText();
  
        if(textDisplay.equals("0")){
            handlerDisplay.setText("5");
            handlerCalcDisp.setText("5");
        }else{
             handlerDisplay.setText(handlerDisplay.getText() + "5");
             handlerCalcDisp.setText(handlerCalcDisp.getText() + secDisplay);
        } 
    }

    @FXML
    private void num6(ActionEvent event) {
      String textDisplay = handlerDisplay.getText();
        String secDisplay = ((Button)event.getSource()).getText();
  
        if(textDisplay.equals("0")){
            handlerDisplay.setText("6");
            handlerCalcDisp.setText("6");
        }else{
             handlerDisplay.setText(handlerDisplay.getText() + "6");
             handlerCalcDisp.setText(handlerCalcDisp.getText() + secDisplay);
        } 
    }

    @FXML
    private void btnSub(ActionEvent event) {
       expressions += handlerDisplay.getText() + "-";
       handlerCalcDisp.setText(handlerDisplay.getText() + " - ");
       handlerDisplay.setText("");;
        
    }

    @FXML
    private void num1(ActionEvent event) {
        String textDisplay = handlerDisplay.getText();
        String secDisplay = ((Button)event.getSource()).getText();
  
        if(textDisplay.equals("0")){
            handlerDisplay.setText("1");
            handlerCalcDisp.setText("1");
        }else{
             handlerDisplay.setText(handlerDisplay.getText() + "1");
             handlerCalcDisp.setText(handlerCalcDisp.getText() + secDisplay);
        } 
    }

    @FXML
    private void num2(ActionEvent event) {
     String textDisplay = handlerDisplay.getText();
        String secDisplay = ((Button)event.getSource()).getText();
  
        if(textDisplay.equals("0")){
            handlerDisplay.setText("2");
            handlerCalcDisp.setText("2");
        }else{
             handlerDisplay.setText(handlerDisplay.getText() + "2");
             handlerCalcDisp.setText(handlerCalcDisp.getText() + secDisplay);
        } 
    }

    @FXML
    private void num3(ActionEvent event) {
       String textDisplay = handlerDisplay.getText();
        String secDisplay = ((Button)event.getSource()).getText();
  
        if(textDisplay.equals("0")){
            handlerDisplay.setText("3");
            handlerCalcDisp.setText("3");
        }else{
             handlerDisplay.setText(handlerDisplay.getText() + "3");
             handlerCalcDisp.setText(handlerCalcDisp.getText() + secDisplay);
        } 
    }

    @FXML
    private void btnAdd(ActionEvent event) {
       expressions += handlerDisplay.getText() + "+";
       handlerCalcDisp.setText(handlerDisplay.getText() + " + ");
       handlerDisplay.setText("");
       
        }
    

    @FXML
    private void num0(ActionEvent event) {
     String textDisplay = handlerDisplay.getText();
        String secDisplay = ((Button)event.getSource()).getText();
  
        if(textDisplay.equals("0")){
            handlerDisplay.setText("0");
            handlerCalcDisp.setText("0");
        }else{
             handlerDisplay.setText(handlerDisplay.getText() + "0");
             handlerCalcDisp.setText(handlerCalcDisp.getText() + secDisplay);
        } 
    }

    @FXML
    private void numDot(ActionEvent event) {
        String textDisplay = handlerDisplay.getText();
        String secDisplay = ((Button)event.getSource()).getText();
  
        if(textDisplay.equals("0")){
            handlerDisplay.setText(".");
            handlerCalcDisp.setText(".");
        }else{
             handlerDisplay.setText(handlerDisplay.getText() + ".");
             handlerCalcDisp.setText(handlerCalcDisp.getText() + secDisplay);
        } 
    }

    @FXML
    private void btnEqual(ActionEvent event) {
        expressions += handlerDisplay.getText();
        double result = evaluate(expressions);
        
       if(result == (long) result){
           handlerDisplay.setText(Long.toString((long) result));
       }else{
           handlerDisplay.setText(Double.toString(result));
       }
        expressions = "";
    }

    @FXML
    private void btnBack(ActionEvent event) {
        String getDisplay = handlerDisplay.getText();
        String getCalcDisp = handlerCalcDisp.getText();
        
        if(getDisplay.equals("") && getCalcDisp.equals("") || getDisplay.equals("0") && getCalcDisp.equals("0")){
            handlerDisplay.setText("0");
            handlerCalcDisp.setText("0");
        }else{
            handlerDisplay.setText(getDisplay.substring(0, getDisplay.length() - 1));
            handlerCalcDisp.setText(getCalcDisp.substring(0, getCalcDisp.length() - 1));
        }  
    }
    
    private double evaluate(String expressions){
        expressions = expressions.replaceAll("\\s+", ""); // Remove any spaces
        String[] tokens = expressions.split("(?<=[-+*/])|(?=[-+*/])"); // Split by operators

        double result = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length - 1; i += 2) {
            String operator = tokens[i];
            double operand = Double.parseDouble(tokens[i + 1]);

            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }
        
        return result;
    }

}
