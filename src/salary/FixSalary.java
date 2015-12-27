package salary;

import Employee.MainEmployee;

/**
 * Created by kashi on 05.12.2015.
 */

/**
 * Класс потомок2, с фиксированой оплатой
 */
public class FixSalary extends MainEmployee {

    private static int oklad = 10;

    public int getOklad() {
        return oklad;
    }

    public void setOklad(int oklad) {
        this.oklad = oklad;
    }



    public FixSalary(String name, int age) {
        super ( name, age );

    }

    @Override
    public int salary() {
        return 20*8*oklad;
    }

}
