package Employee;

/**
 * Created by kashi on 05.12.2015.
 */

/**
 * Родительский класс сотрудник
 */
public abstract class MainEmployee {
    private String name; //Имя
    private int age; //Розраст
    public abstract int salary(); //Абстрактный метод для расчета среднемесячной заработной платы

    public MainEmployee(){} //Пустой конструктор

    public MainEmployee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Переопределяем toString, для вывода данных сотрудника
    @Override
    public String toString() {
        return "Name = " + getName() + "\nAge =  " + getAge () + "\nSalary of mounth = " + salary() + "\n";
    }
}
