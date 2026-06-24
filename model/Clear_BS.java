package model;

public class Clear_BS {
    String variable = "123456789";
    void set_clear(){
        variable = "";
    }   
    void set_backspace(){
        variable = variable.substring(0, variable.length() - 1);
    }       
}
String get_variable(){
    return variable;
}
public static void main(String[] args) {
    Clear_BS cb = new Clear_BS();
    System.out.println(cb.get_variable());
    
    cb.set_backspace();
    System.out.println(cb.get_variable());

    cb.set_backspace();
    System.out.println(cb.get_variable());

    cb.set_clear();
    System.out.println(cb.get_variable());
}