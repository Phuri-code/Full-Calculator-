package model;

public class Number_input {
    String Variable;
    void set_zero(){
        Variable = Variable + "0";
    }

    void set_one(){
        Variable = "1";
    }

    void set_two(){
        Variable = Variable + "2";
    }

    void set_three(){
        Variable = "3";
    }

    void set_four(){
        Variable = Variable + "4";
    }

    void set_five(){
        Variable = Variable + "5";
    }

    void set_six(){
        Variable = Variable + "6";
    }

    void set_seven(){
        Variable = Variable + "7";
    }

    void set_eight(){
        Variable = Variable + "8";
    }

    void set_nine(){
        Variable = Variable + "9";
    }

    String get_variable(){
        return Variable;
        
    }
    public static void main(String[] args) {
        Number_input number_input = new Number_input();
        number_input.set_zero();
        number_input.set_one();
        number_input.set_two();
        number_input.set_three();
        number_input.set_four();
        number_input.set_five();
        number_input.set_six();
        number_input.set_seven();
        number_input.set_eight();
        number_input.set_nine();
        System.out.println(number_input.get_variable());
        Memory m = new Memory();
        m.set_first_variable(number_input.get_variable());
        System.out.println(m.get_first_variab());


    }
    
}
