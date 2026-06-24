import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_0;

    @FXML
    private Button btn_1;

    @FXML
    private Button btn_2;

    @FXML
    private Button btn_3;

    @FXML
    private Button btn_4;

    @FXML
    private Button btn_5;

    @FXML
    private Button btn_6;

    @FXML
    private Button btn_7;

    @FXML
    private Button btn_8;

    @FXML
    private Button btn_9;

    @FXML
    private Button btn_add;

    @FXML
    private Button btn_backspace;

    @FXML
    private Button btn_clear;

    @FXML
    private Button btn_decimal;

    @FXML
    private Button btn_divide;

    @FXML
    private Button btn_equals;

    @FXML
    private Button btn_multiply;

    @FXML
    private Button btn_percent;

    @FXML
    private Button btn_subtract;

    @FXML
    private Label label_display;

    @FXML
    private Label label_display_backg;

    @FXML
    void on_0(ActionEvent event) {

    }

    @FXML
    void on_1(ActionEvent event) {
        user_input.set_one();
        label_display.setText(user_input.get_variable());

    }

    @FXML
    void on_2(ActionEvent event) {
        user_input.set_two();
        label_display.setText(user_input.get_variable());   
    }

    @FXML
    void on_3(ActionEvent event) {
        user_input.set_three();
        label_display.setText(user_input.get_variable());   

    }

    @FXML
    void on_4(ActionEvent event) {
        user_input.set_four();
        label_display.setText(user_input.get_variable());   

    }

    @FXML
    void on_5(ActionEvent event) {
        user_input.set_five();
        label_display.setText(user_input.get_variable());   

    }

    @FXML
    void on_6(ActionEvent event) {
        user_input.set_six();
        label_display.setText(user_input.get_variable());   

    }

    @FXML
    void on_7(ActionEvent event) {
        user_input.set_seven();
        label_display.setText(user_input.get_variable());

    }

    @FXML
    void on_8(ActionEvent event) {
        user_input.set_eight();
        label_display.setText(user_input.get_variable());

    }

    @FXML
    void on_9(ActionEvent event) {

        user_input.set_nine();
        label_display.setText(user_input.get_variable());
    }

    @FXML
    void on_add(ActionEvent event) {
         clear_bs.set_variable(user_input.get_variable());
        clear_bs.set_add();
        user_input.set_variable(clear_bs.get_variable());
        label_display.setText(clear_bs.get_variable());


    }

    @FXML
    void on_backspace(ActionEvent event) {
        clear_bs.set_variable(user_input.get_variable());
        clear_bs.set_backspace();
        user_input.set_variable(clear_bs.get_variable());
        label_display.setText(clear_bs.get_variable());

    }

    @FXML
    void on_clear(ActionEvent event) {

        clear_bs.set_variable(user_input.get_variable());
        clear_bs.set_clear();
        label_display.setText(clear_bs.get_variable());
    }

    @FXML
    void on_decimal(ActionEvent event) {

    }

    @FXML
    void on_divide(ActionEvent event) {

    }

    @FXML
    void on_equals(ActionEvent event) {

    }

    @FXML
    void on_multiply(ActionEvent event) {

    }

    @FXML
    void on_percent(ActionEvent event) {

    }

    @FXML
    void on_subtract(ActionEvent event) {

    }

    @FXML
    void initialize() {
       
    }

}
