package main;

import Employee.MainEmployee;
import salary.FixSalary;
import salary.HourSalary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by kashi on 05.12.2015.
 */
public class Start {

    public static void main(String... args){
        ArrayList<MainEmployee> employeeList = new ArrayList<MainEmployee>();
        employeeList.add ( new HourSalary("Vanya", 20, 36) );
        employeeList.add(new HourSalary ( "Vika", 20, 9 ));
        employeeList.add ( new HourSalary("Zhenya", 20, 11) );
        employeeList.add(new HourSalary ( "Yura", 20, 13 ));
        employeeList.add ( new HourSalary("Sergei", 20, 26) );
        employeeList.add(new HourSalary ( "Nastya", 20, 17 ));

        employeeList.add ( new FixSalary ( "Roman", 20 ) );

        //Сортировочка по алфовиту
        Collections.sort ( employeeList, new Comparator<MainEmployee> ( ) {
            @Override
            public int compare(MainEmployee mainEmployee, MainEmployee t1) {
                return mainEmployee.toString ().compareTo ( t1.toString () );
            }
        } );

        //Выводим первые 5 элементов
        for (int i = 0; i < 5; i++) {
            System.out.println (employeeList.get ( i ));

        }

        System.out.println ("/////////////////////////////////////////////////////////////////");

        //Выводим все элементы
        for (MainEmployee list : employeeList) {
            System.out.println ( list );
        }
    }

}
