package salary;

import Employee.MainEmployee;

/**
 * Created by kashi on 05.12.2015.
 */

/**
 * Класс потомок1, с почасовой оплатой
 */
public class HourSalary extends MainEmployee {

    public int stavka; //переменная ставки 1-го часа


    //Наследование конструктора
    public HourSalary(String name, int age, int stavka) {
        super ( name, age );
        this.stavka = stavka;
    }

    //метод для расчета ставчи почасовой
    public int salary() {
        return 20 * 8 * stavka;
    }
}
