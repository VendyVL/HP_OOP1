package Sem_1;

import javafx.scene.chart.PieChart.Data;

public class person {//В основе всего должен быть человек одна штука
    private static int number; //Типа внутренняя информация?

    private String first_name; //У него есть какие-то параметры
    private String last_name; 
    private Data birthday;
    public String something_else; 
    
    // private String first_name; Иванов (неизменяемое)
    // private String last_name; Василий Петрович (неизменяемое)
    // private Data birthday; 30,09,1985 (неизменяемое)
    // public String something_else; дурак (изменяемое)
    static {
        person.number = 0;
    }

    public person(String first_name, String last_name, Data birthday, String something_else ) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthday = birthday;
        this.something_else = something_else;
    }
    //Делать он вроеде ничего не умеет

}
