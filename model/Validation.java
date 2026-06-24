package model;

public class Validation {
    boolean is_variable_valid(String variable){
    //  condition: two dots in the variable 
    int count = 0;
    for(int i = 0; i<variable.length(); i++){
        if(variable.charAt(i) == '.'){
            count++;
        }
        if (count >1) {
            break;
            
        }
    }
        return true;
    }
    boolean is_operator_valid(String operator){
        // if (variable) {
            
        // }
        if(operator.length() != 1){
            return false;
        }
        if(!operator.equals("+") && !operator.equals("-") && !operator.equals("/") && !operator.equals("x")){
            return false;
        }


        return true;
    }


}
