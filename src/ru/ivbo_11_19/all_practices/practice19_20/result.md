####Main.java
```java
/*package ru.ivbo_11_19.all_lessons.lesson10;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        //работа с файлами
        Path path = Paths.get("")
                .toAbsolutePath()//укажет путь
                .getParent()//наверх на один
                .getParent();
        String basePath = "src/ru/ivbo_11_19/";
        String mainFile = "Main.java";//можно указывать путь к любому другому текстовому файлу
        String copyFile = "copy.txt";
        File file = new File(basePath);//массив файлов
        if (file.isDirectory()) {//если это папка
            //System.out.println(path);
            File[] list = file.listFiles(); //получилив все подфайлы
            for (File currentFile : list) {
                System.out.println("is file: " + currentFile.isFile());//проверяет файл или папка
                System.out.println("is directory " + currentFile.isDirectory());
                System.out.println(currentFile.getAbsolutePath());//выведет путь мэйна


            }
        }
        String mainFilePath = file.getAbsolutePath();
        try {
              /*try(FileReader reader = new FileReader(mainFilePath)){
                  int readed = reader.read();//считываем, пока код не равно -1
                  while (readed != -1)
                  {
                      System.out.print((char) readed);
                      readed = reader.read(); // отобразится весь исходный код из мэйна
                  }
              }*/
          /*  try(BufferedReader reader = new BufferedReader(mainFilePath)){//вместо посимвольного чтения, работает с интом
                int readed = reader.read();//считываем, пока код не равно -1
                while (readed != -1)
                {
                    System.out.print((char) readed);
                    readed = reader.read(); // отобразится весь исходный код из мэйна
                }
            }

        } catch(FileNotFoundException e) {
            System.out.println("incorrect path");
            e.printStackTrace();
        //} catch (IOE)
    }
}}
*/
```
####Car.java
```java
package ru.ivbo_11_19.all_lessons.lesson8;

public class Car {
    private int mileage;

    public int getMileage() {
        return mileage;
    }

    public void addMileage(int mileage) throws InvalidMileageException {
        if(mileage < 0) {
            throw new InvalidMileageException("mileage must be positive");
        }
        this.mileage += mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mileage=" + mileage +
                '}';
    }
}







/*public class Car {

    мы делали прокрутку пробега через рандом
    теперь к счётчику прибавляем модуль пробега, чтобы никто не смог передать отрицательное значение
    +=Math.abc()
}
это внутри предыдущего пакета

проверка пробега меньшего нуля - throw new Exception("mileage must be positive"),
 лучше вместо предыдущего создавать отдельный класс, наследуемыйц от Exception - InvalidMileageException
  throws Exception приписать к методу, чтобы показать, что он умеет
*/
```
####InvalidMileageException.java
```java
package ru.ivbo_11_19.all_lessons.lesson8;


/*public class InvalidSalaException extends Exception { когда вызываем Exception, а передаём тип элемента нового класса
    оно будет работать с ребёнком
}*/
public class InvalidMileageException extends Exception {
    public InvalidMileageException(String message) {
        super(message);
    }
}
```
####Main.java
```java
package ru.ivbo_11_19.all_lessons.lesson8;
//обработка исключений

public class Main {
    public static void main(String[] args) {
//        int a = 65 / 0;
        Car car = new Car();

        try {
            car.addMileage(45);
            int newMileage = 7 / 1;
            car.addMileage(newMileage);

            car.addMileage(50);
            car.addMileage(-5);
        } catch (ArithmeticException aex) {
            System.out.println("Incorrect mileage calculation");
            System.out.println(aex.getMessage());
        } catch (InvalidMileageException e) {
            System.out.println("Incorrect mileage");
            System.out.println(e.getMessage());
        }
        System.out.println(car);
    }

}
/*public class Main {
    public static void main(String[] args) throws Exception не красиво{
        System.out.println(5+8);
        System.out.println(8/5);
        System.out.println(8/0);//исключение java.lang.ArithmeticException
        System.out.println(-8.0/0.0);//double позволяет избежать искл-я Infinity
        try{...} catch (Exception ex){...} выдаст /by zero - сообщение
        можно в отдельной функции divide - миникалькулятор с вводом с консоли с рекурсией - можно исправлять
        вместо try catch можно использовать while
        try{} catch{} обернуть addMileage(int)
        catch может быть несколько (incorrect mileage calculation новый) исключения наследуются от Exception
        проходится по исключениям последовательно
        нужно идти от самых конкретных к самым абстрактным
        исключения бывают разными RuntimeException (* ArithmeticException - не проверяется)
        чтобы в элементе car в Main - прога не ругалась при добавлении car.addMileage(34) можем класс
         наследовать отRuntimeException -  выход за границы массива, при делении на ноль, чтобы часто не проверять
        бывает  ArrayIndexOutOfException - выход за границы массива

    }
} */
```
####Main.java
```java
package ru.ivbo_11_19.all_lessons.lesson9;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(12);
        Node node2 = new Node(15);
        node1.setNext(node2);

        printList(node1);

        addToEnd(node1, 150);//добавляем узел с помощью метода addToEnd
        System.out.println("Список с добавленным элементом ^^ ");
        printList(node1);

    }
    private static void printList(Node head) {
        while (head != null) {//голова главного класса ссылается на следующий узел, а то ссылается на следующий
            //т.е. условие = пока не закончатся узлы
            System.out.println(head.getValue());//принимает в голову значение поля узла
            head = head.getNext();//присваивает каждый раз себе новый узел
        }
    }
    private static void addToEnd(Node head, int value) {
        Node tail = head;//head and tail на самом деле, не включаются в узел, они явл.параметрами главного класса, вкл.узлы
        //хвост равен голове, а голова в свою очередь ссылается на 1 узел
        while (tail.getNext() != null) {//пока следующее поле P в узле, которые содержат инф-цию о предыдущем узле не равно нулю
            tail = tail.getNext();//хвосту присваивается значение следующего за 1-ым узла
        }
        Node newTail = new Node(value);//создаём новый узел с полем значения - числа
        tail.setNext(newTail);//устанавливаем ссылку для хвоста на последний узел, хвост ссылается на последний узел
    }
        //setNext - ссылка
        //printList - метод вывода
        //addToEnd(Node head,  int Value)
        //node - названия узлов

}
```
####Node.java
```java
package ru.ivbo_11_19.all_lessons.lesson9;

public class Node {
    private int value;//значение поля узла
    private Node next;//поле в узле со ссылкой на значение той же переменной в след.узле
//пишем get set для полей Node: значение, поле следующего, хвост как поле в узле не задаём
    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
```
####Main.java
```java
package ru.ivbo_11_19.all_lessons.regular;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        int age;
        String name;
        int height;
        System.out.println("Введите возраст _ имя _ высоту");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        String[] tokens = line.split(" ");
        if (tokens.length !=3) {
            System.out.println("Need 3 args");
            return;
        }

        try {
            age = Integer.parseInt(tokens[0]);
        } catch (NumberFormatException nfe) {
            System.out.println("Incorrect age");
            return;
        }
        name = tokens[1];
        try {
            height = Integer.parseInt(tokens[2]);
        }catch (NumberFormatException nfe) {
            System.out.println("Incorrect height");
            return;
        }
        System.out.println("С помощью try catch получили: ");
        System.out.println(age + "-" + name + "-" + height);
        System.out.println("=================================");
        System.out.println("Введите возраст _ имя _ высоту");
        line = scanner.nextLine();
        //Pattern pattern = Pattern.compile("^(\\d+) (\\w+) (\\d+)$"); /*\\w\\w*/ /*\\d- только цифры1 2 3 ^ - начало , группы $ - конец*/
        Pattern pattern = Pattern.compile("^(?<age>\\d+) (?<name>\\w+) (?<height>\\d+)$");//можно дать названия
        //поиск одиночного символа во входной строке
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            System.out.println(matcher.group(0));
           age = Integer.parseInt(matcher.group("age"));
           name = matcher.group("name");
           height = Integer.parseInt(matcher.group("height"));
            // System.out.println(matcher.group(1));
            //System.out.println(matcher.group(2));
            //System.out.println(matcher.group(3));
            System.out.println("На языке регулярных выражений regex: ");
            System.out.println(age+"/"+name+"/"+height);
        }
        else {
            System.out.println("Incorrect pattern");
        }
    }
}
```
####Loader.java
```java
package ru.ivbo_11_19.all_practices.practice1.Cycles;
//циклы
public class Loader {
    public static void main(String[] args){
        int[]arr1={10, 2, 3, 4, 11};
        int sum=0;
        for(int i=0; i<arr1.length; i++) {
            sum+=arr1[i];
        }
        System.out.println(sum);
    }
}

/*public class Loader {
    public static void main(String[] args){
        int[]arr1={10, 2, 3, 4, 11};
        int sum=0;
        int i=0;
        while(i<arr1.length)
        for( i=0; i<arr1.length; i++) {
            sum+=arr1[i];
        }
        System.out.println(sum);
    }
}
*/
/*public class Loader {
    public static void main(String[] args){
        int[]arr1={10, 2, 3, 4, 11};
        int sum=0;
        int i=0;
        do {
            sum += arr1[i];
            i++;
        }
        while(i<arr1.length);
        System.out.println(sum);
    }
}
*/
/*public class Loader {
    public static void main(String[] args){
        int[]arr1={10, 2, 3, 4, 11};
        int sum=0;
        for(int i: arr1){
            sum+=i;}
        System.out.println(sum);
    }
}
*/
```
####Loader.java
```java
package ru.ivbo_11_19.all_practices.practice1.Factorial;
//считает факториал числа
import java.util.Scanner;
public class Loader {
    public static void main(String[] args){
        System.out.println("Введите число N: "+"\n");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int result=1;
        for (int i=1; i<=n; i++){
            result=result*i;
        }
        System.out.println(result);

    }
}
```
####Loader.java
```java
package ru.ivbo_11_19.all_practices.practice1.FirstProgram;

public class Loader {
    public static void main (String[] args){
        System.out.println("Welcome to Java!");
    }
}
```
####Loader.java
```java
package ru.ivbo_11_19.all_practices.practice1.HarmonicSeries;
//выдаёт гармонический ряд и считает сумму ряда
public class Loader {
    public static void main(String[] args){
        double sum=0;
        double b;
        int i=1;
        while(i<=10){
            b=1./i;
            System.out.println(b);
            sum+=1./i;
            i++;

        }
        System.out.println("Сумма: ");
        System.out.println(sum);
    }
}
```
####Loader.java
```java
package ru.ivbo_11_19.all_practices.practice1.SortedRandomArray;
//заполняет массив длины N случайными числами из диапазона 100 и сортирует пузырьком
import java.util.Arrays;
import java.util.Scanner;//считывание
public class Loader {
    public static void main(String[] args) {
        int n;
        int[] arr;
        System.out.println("Вывод сгенерированного массива случайных целых чисел, вывод отсортированного массива ");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество членов массива: ");
        n = in.nextInt();
        arr = new int[n];
        //заполняем массив случайными числами
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)( Math.random() * 100);
        //вывод массива
        for (int i : arr)//for each
            System.out.println(i + " ");
        //Сортировка пузырьком
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    //вывод отсортированного массива
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }
}
```
####CalculatorForm.java
```java
//package ru.mirea.it.ivbo1119.practice11.calculator;
package ru.ivbo_11_19.all_practices.practice11;
import javax.swing.*;


public class CalculatorForm {
    private JPanel panel1;
    private JButton Button1;
    private JButton Button2;
    private JButton Button3;
    private JButton Button4;
    private JButton Button5;
    private JButton Button6;
    private JPanel mainPanel;
    private JPanel buttonPanel;
    private JTextField TextField1;
    private JPanel inpPanel;

    double sc;
    double a;
    double b;
    public JPanel getPanel1(){
        return panel1;
    }

//лейбл для отображения чисел, чтобы запоминал введённое в текстовое поле
    CalculatorForm(){

        Button1.addActionListener(e -> {
             a = Double.parseDouble(TextField1.getText());
             b = Double.parseDouble(TextField1.getText());

            sc=a+b;
        });
        Button2.addActionListener(e -> {
            a = Double.parseDouble(TextField1.getText());
            b = Double.parseDouble(TextField1.getText());
            sc=a-b;
        });
        Button3.addActionListener(e -> {
            a = Double.parseDouble(TextField1.getText());
            b = Double.parseDouble(TextField1.getText());
            sc=a*b;
        });
        Button4.addActionListener(e -> {
            a = Double.parseDouble(TextField1.getText());
            b = Double.parseDouble(TextField1.getText());
            sc=a/b;
        });
        Button5.addActionListener(e -> {
            a = Double.parseDouble(TextField1.getText());
            b = Double.parseDouble(TextField1.getText());
            sc=a%b;
        });
        Button6.addActionListener(e -> {
            TextField1.setText("");
            TextField1.setText(Double.toString(sc));
        });
    }


}
```
####Loader.java
```java
package ru.ivbo_11_19.all_practices.practice11;

import javax.swing.*;
public class Loader {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        frame.setVisible(true);//делает видимым
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//закрывает окошко
        frame.setLocationRelativeTo(null);//окошко всегда по центру
        frame.add( new CalculatorForm().getPanel1());
    }
}
```
####Company.java
```java
package ru.ivbo_11_19.all_practices.practice14;
import java.util.ArrayList;//работа с массивами


public class Company {
    private ArrayList<Employee> employees;

    public Company(){
        this.employees = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees + '}';
    }

    //увольнять и нанимать

   public void addEmployee(Employee employee){
        employees.add(employee);
    }

    /*public void deleteEmployee(){
        employees.remove(0);
    }*/


//методы сортировки и поиска
    public void  findEmployees(EmployeesSelector selector, handleEmployees handleEmployees){
        int count = 0;
        for (int i = 0; i <employees.size(); i++) {
            if (selector.isNeed(employees.get(i))) {
                handleEmployees.handleEmployees(employees.get(i));
                count++;
            }
        }
        System.out.println("Кол-во: " + count);
    }
}
```
####ConsolePrinter.java
```java
package ru.ivbo_11_19.all_practices.practice14;

public class ConsolePrinter implements handleEmployees {
    @Override
    public void handleEmployees(Employee employee) {
        System.out.println("================");
        System.out.println(employee);
        System.out.println("================");
    }
}
```
####Employee.java
```java
package ru.ivbo_11_19.all_practices.practice14;

public class Employee {
    private final int number; //номер в списке
    private final String surname;//фамилия
    private final String name;//имя
    private final int birthday; //день рождения
    private final String address;//адрес
    private final String phone;//номер
    private int salary;//зарплата


//конструктор
    public Employee(int number, String surname, String name, int birthday, String address, String phone, int salary) {
        this.number = number;
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getBirthday() {return birthday;}

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return number+1 + ". Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\''+
                ", address=" + address +
                ", phone=" + phone +'\''+
                ", salary=" + salary +
                '}';
    }
}
```
####EmployeesSelector.java
```java
package ru.ivbo_11_19.all_practices.practice14;

public interface EmployeesSelector {
    boolean isNeed(Employee employee);

}
```
####handleEmployees.java
```java
package ru.ivbo_11_19.all_practices.practice14;

public interface handleEmployees {
    void handleEmployees(Employee employee);
}
```
####Loader.java
```java
package ru.ivbo_11_19.all_practices.practice14;

import java.util.Random;


public class Loader {
    public static void main(String[] args) {
        Company company = new Company();
        Random random = new Random(50_000);
        for (int i = 0; i < 25; i++) {
            Employee employee = new Employee(
                    i,
                    "Петров",
                    "Пётр",
                    1946 + random.nextInt(50),
                    "Пр.Вернадского д.78",
                    "89245651123",
                    20_000 + random.nextInt(50_000));
            company.addEmployee(employee);
            //company.deleteEmployee();


            System.out.println(employee);
           // company.deleteEmployee();
            //car.addMileage(random.nextInt(100_000));
        }

        System.out.println("Данные о сотрудниках 1988 рождения и младше: ");
        //реализация сортировки через отдельный класс
        company.findEmployees(new YearSelector(1988), new ConsolePrinter());
        System.out.println("Фамилии сотрудников с зарплатой больше 50_000: ");
        //через анонимный класс
        company.findEmployees(
                new EmployeesSelector() {
                    @Override
                    public boolean isNeed(Employee employee) {
                        return employee.getSalary() > 50_000;

                       // System.out.println("Начислена пи" employee.getSalary() + 20_000);
                    }
                },
                new handleEmployees() {
                    @Override
                    public void handleEmployees(Employee employee) {
                        System.out.println(employee.getSurname());

                    }
                }
        );
        //через лямбда-выражения
        System.out.println("Список и кол-во сотрудников, чьи фамилии начинаются на П: ");
        EmployeesSelector selector = c -> c.getSurname().startsWith("П");
        company.findEmployees(selector, c-> System.out.println(c));
        System.out.println("Список и кол-во фамилий сотрудников, старше 43 лет и с зарплатой выше 25тыс.");

        company.findEmployees(
                c->c.getBirthday() < 1977 && c.getSalary() > 25_000,
                employee -> System.out.println(employee.getSurname()));

    }}
```
####YearSelector.java
```java
package ru.ivbo_11_19.all_practices.practice14;

public class YearSelector implements EmployeesSelector{
    private int birthday;

    public YearSelector(int birthday) {
        this.birthday=birthday;
    }

    @Override
    public boolean isNeed(Employee employee) {
        return employee.getBirthday()> birthday;
    }
}
```
####Employee.java
```java
package ru.ivbo_11_19.all_practices.practice15;

public class Employee {
    private int age;



    public void addAge(int age) throws ThrowException {
        if (age<0){
            throw new ThrowException();
        }
        this.age += age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                '}';
    }
}
```
####Main.java
```java
package ru.ivbo_11_19.all_practices.practice15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee alina  = new Employee();
        try {
            int b = Integer.parseInt(new Scanner(System.in).nextLine());
            alina.addAge(b);

        }
        catch (ThrowException ex){
            System.out.println("error");
        }
        catch (NumberFormatException vv){
            System.out.println("Incorrect input format");
        }
        finally {
            System.out.println("gleb");
        }
        throw new ThrowRuntimeException();

    }
}
```
####ThrowException.java
```java
package ru.ivbo_11_19.all_practices.practice15;

public class ThrowException extends Exception {

}
```
####ThrowRuntimeException.java
```java
package ru.ivbo_11_19.all_practices.practice15;
//создали собственный тип исключения
public class ThrowRuntimeException extends RuntimeException{
}


```
####Main.java
```java
package ru.ivbo_11_19.all_practices.practice16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выберите решение: 1) с регулярными выражениями; 2)без регулярных выражений;");
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();

        switch (h) {
            case 1: {
                System.out.print("Количество правил: ");
                int k = 0;
                try {
                    k = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                String path;
                String zamena;
                Map<String, String> rule = new HashMap<>();
                for (int i = 0; i < k; i++) {
                    Pattern pattern = Pattern.compile("(?<path>\\w+) (?<zamena>\\w+)");
                    Matcher matcher = pattern.matcher(scanner.nextLine());
                    if (matcher.find()) {
                        path = matcher.group("path");
                        zamena = matcher.group("zamena");
                        rule.put(path, zamena);
                    }
                }

                String text = scanner.next();
                List<Map.Entry<String, String>> ruleConvert = new ArrayList<>(rule.entrySet());
                StringBuilder regex = new StringBuilder();
                for (int i = 0; i < ruleConvert.size(); i++) {
                    regex.append(ruleConvert.get(i).getKey());
                    if (i < ruleConvert.size() - 1) {
                        regex.append("|");
                    }
                }
                Pattern onePattern = Pattern.compile(regex.toString());
                Matcher oneMatcher = onePattern.matcher(text);
                String result = oneMatcher.replaceAll(index -> rule.get(index.group()));
                System.out.println("result: " + result);
            }
            break;


            case 2: {
                System.out.print("Количество правил: ");
                int k = 0;
                try {
                    k = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

                Map<String, String> rule = new HashMap<>();
                for (int i = 0; i < k; i++) {

                    rule.put(scanner.next(), scanner.next());
                }
                String text = scanner.next();
                String rezult = text;
                for (int i = 0; i < text.length(); i++) {
                    for (int j = 0; j < rule.size(); j++) {
                        String t = (String) rule.keySet().toArray()[j];
                        String r = (String) rule.values().toArray()[j];
                        if (i + t.length() < rezult.length() && rezult.substring(i, i + t.length()).equals(t)) {
                            rezult = rezult.replace(t, r + " ");
                            i += r.length();
                            break;
                        }
                    }
                }
                rezult = rezult.replace(" ", "");
                System.out.println(rezult);
            }
            break;
        }
    }
}
        /*int age;
        String name;
        int height;
        System.out.println("Введите возраст _ имя _ высоту");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        String[] tokens = line.split(" ");
        if (tokens.length !=3) {
            System.out.println("Need 3 args");
            return;
        }

        try {
            age = Integer.parseInt(tokens[0]);
        } catch (NumberFormatException nfe) {
            System.out.println("Incorrect age");
            return;
        }
        name = tokens[1];
        try {
            height = Integer.parseInt(tokens[2]);
        }catch (NumberFormatException nfe) {
            System.out.println("Incorrect height");
            return;
        }
        System.out.println("С помощью try catch получили: ");
        System.out.println(age + "-" + name + "-" + height);
        System.out.println("=================================");
        System.out.println("Введите возраст _ имя _ высоту");
        line = scanner.nextLine();
        //Pattern pattern = Pattern.compile("^(\\d+) (\\w+) (\\d+)$"); /*\\w\\w*/ /*\\d- только цифры1 2 3 ^ - начало , группы $ - конец*/
        //Pattern pattern = Pattern.compile("^(?<age>\\d+) (?<name>\\w+) (?<height>\\d+)$");//можно дать названия
        //поиск одиночного символа во входной строке
        /*Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            System.out.println(matcher.group(0));
            age = Integer.parseInt(matcher.group("age"));
            name = matcher.group("name");
            height = Integer.parseInt(matcher.group("height"));
            // System.out.println(matcher.group(1));
            //System.out.println(matcher.group(2));
            //System.out.println(matcher.group(3));
            System.out.println("На языке регулярных выражений regex: ");
            System.out.println(age+"/"+name+"/"+height);
        }
        else {
            System.out.println("Incorrect pattern");
        }
    }
}*/
```
####Graph.java
```java
package ru.ivbo_11_19.all_practices.practice17_18;

//import java.awt.*;
import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;

public class Graph {
    Node s1 = new Node();
    Node s2 = new Node();
    Node s3 = new Node();
    Node s4 = new Node();
    Node s5 = new Node();
    Node head = s1;
    private ArrayList<String> result = new ArrayList<>();
    public Graph() {
        s1.setall(0,"create_project",s2);
        s1.setall(1,"add_library",s5);
        s2.setall(0,"test",s3);
        s2.setall(1,"drop_db",s4);
        s3.setall(0,"drop_db",s4);
        s3.setall(1,"add_library",s5);
        s4.setall(0,"restart",s3);
        s4.setall(1,"deploy",s5);
        s5.setall(0,"deploy",s1);
        s5.setall(1,"restart",s3);
    }

    public void work (int state){
        for (int i = 0; i <head.getConnections().size() ; i++) {
            if (head.getConnections().get(i)==state){
                result.add(head.getInstructions().get(i));
                head= head.getStates().get(i);
            }
        }
    }
    public void getInstruction(){
        for (String res:result
        ) {
            System.out.println(res);
        }
    }
}
```
####Main.java
```java
package ru.ivbo_11_19.all_practices.practice17_18;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();
        int k = 0;
        while (true) {

            if(k==-1){
                break;
            }
            k = sc.nextInt();
            graph.work(k);
        }
        graph.getInstruction();
    }
}
/*
//-----------------------------------------
        /*
public static List<String> getCommand(int command) {
    List<String> result = new ArrayList<>();
    switch (command) {
        case 1: result.add("create_project");
            break;
        case 2: result.add("add_library");
            break;
        case 3: result.add("restart");
            break;
        case 4: result.add("test");
            break;
        case 5: result.add("deploy");
            break;
        case 6: result.add("drop_bd");
            break;
        default:
            break;
    }
    return result;
}
        */
    /*} private static void printList(Node head) {
        while (head != null) {//голова главного класса ссылается на следующий узел, а то ссылается на следующий
            //т.е. условие = пока не закончатся узлы
            System.out.println(head.getValue());//принимает в голову значение поля узла
            head = head.getNext();//присваивает каждый раз себе новый узел
        }
    }
    private static void addToEnd(Node head, int value) {
        Node tail = head;//head and tail на самом деле, не включаются в узел, они явл.параметрами главного класса, вкл.узлы
        //хвост равен голове, а голова в свою очередь ссылается на 1 узел
        while (tail.getNext() != null) {//пока следующее поле P в узле, которые содержат инф-цию о предыдущем узле не равно нулю
            tail = tail.getNext();//хвосту присваивается значение следующего за 1-ым узла
        }
       /* Node newTail = new Node(value);//создаём новый узел с полем значения - числа
        tail.setNext(newTail);//устанавливаем ссылку для хвоста на последний узел, хвост ссылается на последний узел
        */
//}

//setNext - ссылка
//printList - метод вывода
//addToEnd(Node head,  int Value)
//node - названия узлов
```
####Node.java
```java
package ru.ivbo_11_19.all_practices.practice17_18;

import java.util.ArrayList;

public class Node {
    private ArrayList<Integer> connections = new ArrayList<>();
    private ArrayList<String> instructions = new ArrayList<>();
    private ArrayList<Node> states =  new ArrayList<>();
    public void setall (int connection,String instruction,Node state){
        connections.add(connection);
        instructions.add(instruction);
        states.add(state);
    }

    public ArrayList<Integer> getConnections() {
        return connections;
    }

    public ArrayList<String> getInstructions() {
        return instructions;
    }

    public ArrayList<Node> getStates() {
        return states;
    }

}
```
####Main.java
```java
package ru.ivbo_11_19.all_practices.practice19_20;

import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Writing app = new Writing();
        app.exec();
    }
}
```
####Writing.java
```java
package ru.ivbo_11_19.all_practices.practice19_20;
import java.io.*;
import java.nio.file.Paths;
public class Writing {
    public void exec() {
        File tmp = new File("D://result.md");
        tmp.delete();
        File file = new File("src");
        search(file);
    }

    public void search(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            for (String str : list) {
                search(new File(String.valueOf(Paths.get(file.getAbsolutePath(), str).toAbsolutePath())));
            }
        } else if (file.getAbsolutePath().endsWith(".java")) {
            writeToFile(file);
        }
    }

    public void writeToFile(File file) {
        try {
            try (
                    BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()));
                    FileWriter writer = new FileWriter("C://Users//Alina//Desktop//JAVAPR//src//ru//ivbo_11_19//all_practices//practice19_20//result.md", true)
            ) {
                writer.write("####" + file.getName() + "\n");
                writer.write("```java\n");
                String line = reader.readLine();
                while (line != null) {
                    writer.write(line);
                    writer.write('\n');
                    line = reader.readLine();
                }
                writer.write("```\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Something wrong with path");
        } catch (IOException e) {
            System.out.println("Something wrong I can feel it");
        }
    }

}
```
####Book.java
```java
package ru.ivbo_11_19.all_practices.practice2.Books;
public class Book {

    String name;
    String author;
    int pages;

    //Я решила добавить конструктор 16.09.2020
    public Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public String toString() {
        String s = '\n'+"Book name - " + name + '\n' + "Author - " + author + '\n' + "Pages - " + pages;
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


}
```
####Loader.java
```java
package ru.ivbo_11_19.all_practices.practice2.Books;
//на репозитории с похожим названием тот же код, так что всё норм
public class Loader {

    public static void main(String[] arg)
    {

        Book a= new Book("Портрет Дориана Грея","Оскар Уайльд", 320);
       /* a.setName("Портрет Дориана Грея");
        a.setAuthor("Оскар Уайльд");
        a.setPages(320);
        решила заменить на конструктор 16.09.2020, основная работа была сделана 09.09.2020
       */
        System.out.println(a);

    }
}
```
####Dog.java
```java
package ru.ivbo_11_19.all_practices.practice2.Dogs;

import java.util.Scanner;
public class Dog {

    String name;
    int age;

    public String toString() {
        String s ="Имя собаки - " + name + '\n' + "Возраст - " + age + '\n' + "Возраст в человеческих годах = " + ageCalc();
        return s;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int ageCalc() {
        return age * 7;
    }

}
```
####Loader.java
```java
package ru.ivbo_11_19.all_practices.practice2.Dogs;

import java.util.Scanner;
public class Loader {

    public static void main(String[] arg)
    {
        Dog d = new Dog();
        Scanner input = new Scanner(System.in);
        System.out.print("Input name: ");
        d.setName (input.nextLine());
        System.out.print("Input age: ");
        d.setAge(input.nextInt());
        d.ageCalc();

        Dog e = new Dog();
        System.out.print("Input name: ");
        e.setName (input.next());
        System.out.print("Input age: ");
        e.setAge(input.nextInt());
        e.ageCalc();
        input.close();


        System.out.println(d);
        System.out.println(e);


    }
}
```
####Client.java
```java
package ru.ivbo_11_19.all_practices.practice21_22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        sendMessage("Hello from localhost", "127.0.0.1", 10101);
        sendMessage("Hello Java", "10.125.160.46", 10101);
        sendMessage("Hello to all", "255.255.255.255", 10101);
    }

    private static void sendMessage(String message, String address, int port)
            throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] data = message.getBytes();
        DatagramPacket packet = new DatagramPacket(
                data,
                0,
                data.length,
                InetAddress.getByName(address),
                port
        );
        socket.send(packet);
        byte[] buffer = new byte[2048];
        DatagramPacket responsePacket = new DatagramPacket(
                buffer,
                0,
                buffer.length
        );
        socket.receive(responsePacket);
        System.out.println(new String(buffer, 0, responsePacket.getLength()));
    }
}
```
####Item.java
```java
package ru.ivbo_11_19.all_practices.practice23_24;

public class Item {
    private int id;
    private String data;
    private boolean isGood;
    private String description;

    public Item(int id, String data, boolean isGood, String description) {
        this.id = id;
        this.data = data;
        this.isGood = isGood;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
```
####JsonAndHttp.java
```java
package ru.ivbo_11_19.all_practices.practice23_24;

import com.google.gson.Gson;

public class JsonAndHttp {
    private static Gson gson = new Gson();
    public static void main(String[] args) {
        Item item = new Item(0, "some data", true, "some log description");

        System.out.println(gson.toJson(item));

        Item fromJson = gson.fromJson("{\"id\":0,\"data\":\"some data\",\"isGood\":true,\"description\":\"some log description\"}", Item.class);
        System.out.println(fromJson.getId());
        System.out.println(fromJson.getData());
        System.out.println(fromJson.isGood());
        System.out.println(fromJson.getDescription());
    }
}
```
####Main.java
```java
package ru.ivbo_11_19.all_practices.practice25_26;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';

    public static void main(String[] args) throws Exception {

        String csvFile = "/Users/Alina/Desktop/JAVAPR/src/ru/ivbo_11_19/all_practices/practice25/oscar_age.csv";

        Scanner scanner = new Scanner(new File(csvFile));
        while (scanner.hasNext()) {
            List<String> line = parseLine(scanner.nextLine());

            System.out.println(line.get(0)+" [year= " + line.get(1) + " , age=" + line.get(2) + " , name=" + line.get(3) + " , movie=" + line.get(4) +"]");
        }
        scanner.close();

    }

    public static List<String> parseLine(String cvsLine) {
        return parseLine(cvsLine, DEFAULT_SEPARATOR, DEFAULT_QUOTE);
    }

    public static List<String> parseLine(String cvsLine, char separators) {
        return parseLine(cvsLine, separators, DEFAULT_QUOTE);
    }

    public static List<String> parseLine(String cvsLine, char separators, char customQuote) {

        List<String> result = new ArrayList<>();

        //if empty, return!
        if (cvsLine == null && cvsLine.isEmpty()) {
            return result;
        }

        if (customQuote == ' ') {
            customQuote = DEFAULT_QUOTE;
        }

        if (separators == ' ') {
            separators = DEFAULT_SEPARATOR;
        }

        StringBuffer curVal = new StringBuffer();
        boolean inQuotes = false;
        boolean startCollectChar = false;
        boolean doubleQuotesInColumn = false;

        char[] chars = cvsLine.toCharArray();

        for (char ch : chars) {

            if (inQuotes) {
                startCollectChar = true;
                if (ch == customQuote) {
                    inQuotes = false;
                    doubleQuotesInColumn = false;
                } else {

                    //Fixed : allow "" in custom quote enclosed
                    if (ch == '\"') {
                        if (!doubleQuotesInColumn) {
                            curVal.append(ch);
                            doubleQuotesInColumn = true;
                        }
                    } else {
                        curVal.append(ch);
                    }

                }
            } else {
                if (ch == customQuote) {

                    inQuotes = true;

                    //Fixed : allow "" in empty quote enclosed
                    if (chars[0] != '"' && customQuote == '\"') {
                        curVal.append('"');
                    }

                    //double quotes in column will hit this!
                    if (startCollectChar) {
                        curVal.append('"');
                    }

                } else if (ch == separators) {

                    result.add(curVal.toString());

                    curVal = new StringBuffer();
                    startCollectChar = false;

                } else if (ch == '\r') {
                    //ignore LF characters
                    continue;
                } else if (ch == '\n') {
                    //the end, break!
                    break;
                } else {
                    curVal.append(ch);
                }
            }

        }

        result.add(curVal.toString());

        return result;
    }

}
```
####Oscar.java
```java
package ru.ivbo_11_19.all_practices.practice25_26;

public class Oscar {
    public int index;
    public int year;
    public String name;
    public String movie;


}
```
####Circle.java
```java
package ru.ivbo_11_19.all_practices.practice3.Circle;

public class Circle {
    //заготовка абстрактного мяча
    private int number; //
    private float radius; //
    private float area; //
    private float length;

    //desc Number
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    //desc radius
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius){
        this.radius=radius;
    }
    public float getLength(){
        float length= (float) (radius * 2 * 3.14);
        return length;
    }
    public void setLength(float length){
        this.length=length;
    }

    /* public void setArea(float area){
       this.area=area;
   }*/
//desc area
    public void setArea(float area){
        this.area = area;
    }
    public float getArea(){
        area= (float) (radius * radius * 3.14);
        return area;
    }

}
```
####Loader.java
```java
package ru.ivbo_11_19.all_practices.practice3.Circle;

import java.util.Scanner;
public class Loader {
    public static void main (String[] args)
    {
        Circle a = new Circle();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер окружности: ");
        a.setNumber (input.nextInt());
        System.out.print("Введите радиус окружности: ");
        a.setRadius(input.nextFloat());
        System.out.println("Длина окружности: "+ a.getLength());
        System.out.println("Площадь окружности: "+ a.getArea());

        System.out.println();

    }
}
```
####Employee.java
```java
package ru.ivbo_11_19.all_practices.practice3.Employee;

public /*final*/ class Employee extends Person{
    //final works with classes and methods

    //ext and name of Mums class
    public  int age; // новую переменную зададим через дисплейинфо благодаря переопределению
    //сначала вызвоется старая логика через супер, а затем новая

    @Override //pereopredelenie parent method
    public void displayInfo() {

        super.displayInfo(); // super - вызов метода из Parent? если удалим - ничего не будет вызывать
        System.out.println("Age: "+age);

        //новый метод

    }

}
```
####Human.java
```java
package ru.ivbo_11_19.all_practices.practice3.Employee;
public abstract class Human {
    //абстрактный класс позволяет сделать заготовку для будующих наследуемых классов, без содержимого
    protected int height;
    public int getHeight() {
        return height;

    }
    public abstract void setHeight(int height);
}
```
####Person.java
```java
package ru.ivbo_11_19.all_practices.practice3.Employee;

public class Person extends Human{

    public String name;
    public String surname;

    public /*final*/ void displayInfo() //method of inf
    //final
    {
        System.out.println("Name: "+name+"\n"+"Surname: "+surname);
    }
    public void setHeight(int height){
        this.height=height;

    }

}
```
####PersonLoader.java
```java
package ru.ivbo_11_19.all_practices.practice3.Employee;

public class PersonLoader {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Vasiliy";
        p1.surname = "Petrov";

        p1.displayInfo();

        Employee e1 = new Employee();

        e1.name = "Peter";
        e1.surname = "Vasilyev";
        e1.age = 14; //this age wil be only in baby class, not in parent

        e1.displayInfo();
    }
}

```
####Hand.java
```java
package ru.ivbo_11_19.all_practices.practice3.Human;

public class Hand {

    private boolean isRight;
    private int strong;

    public Hand(boolean isRight, int strong) {
        this.isRight = isRight;
        this.strong = strong;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public String can() {
        return isRight ? "двигает правой рукой" : "двигает левой рукой";
    }
}
```
####Head.java
```java
package ru.ivbo_11_19.all_practices.practice3.Human;

public class Head {

    private String hairColor;
    private String eyeColor;

    public Head(String hairColor, String eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String can() {
        return "пытается понять Java";
    }
}
```
####Human.java
```java
package ru.ivbo_11_19.all_practices.practice3.Human;
public class Human {

    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(String headColor, String eyeColor, int speed, int strong) {
        this.head = new Head(headColor, eyeColor);
        this.leftLeg = new Leg(false, speed);
        this.rightLeg = new Leg(true, speed);
        this.leftHand = new Hand(false, strong);
        this.rightHand = new Hand(true, strong);
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public String can() {
        return head.can() + "\n" +
                rightHand.can() + "\n" +
                leftHand.can() + "\n" +
                rightLeg.can() + "\n" +
                leftLeg.can();
    }
}
```
####HumanLoader.java
```java
package ru.ivbo_11_19.all_practices.practice3.Human;

public class HumanLoader {

    public static void main(String[] args) {
        Human human = new Human("brown", "brown", 11, 22);
        System.out.println(human.can());
    }
}
```
####Leg.java
```java
package ru.ivbo_11_19.all_practices.practice3.Human;

public class Leg  {

    private boolean isRight;
    private int speed;

    public Leg(boolean isRight, int speed) {
        this.isRight = isRight;
        this.speed = speed;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String can() {
        return isRight ? "идет правой ногой" : "идет левой ногой";
    }
}
```
####Author.java
```java
package ru.ivbo_11_19.all_practices.practice4.Author;

public class Author {

    String name;
    String email;
    char gender;

    public Author (String name, String email, char gender) {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public String toString() {
        String s = '\n'+"Author name - " + name + '\n' + "Email - " + email + '\n' + "Gender " + gender;
        return s;
    }

    public Author () {
    }
}
```
####Loader.java
```java
package ru.ivbo_11_19.all_practices.practice4.Author;

public class Loader {

    public static void main(String[] arg)
    {

        Author a = new Author();
        a.setName("Оскар Уайльд");
        a.setEmail("OskarWilde@gmail.com");
        a.setGender('M');

        System.out.println(a);

    }
}
```
####Cup.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Dishes;
public class Cup extends Dishes{
    private int volume;
    public Cup(String color, int age, float price, int volume){
        super(color, age, price);
        this.volume=volume;
    }


    @Override
    public  void displayInfo() {
        super.displayInfo();
        System.out.println("Вместимость: "+volume+" мл");
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume)
    {
        this.volume=volume;
    }
}
```
####Dishes.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Dishes;
public class Dishes {
    private String color;
    private int age;
    private float price;

    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
    public float getPrice(){
        return price;
    }

    public Dishes(String color, int age, float price){
        this.color=color;
        this.age=age;
        this.price=price;
    }
    public void displayInfo(){
        System.out.println("Цвет: "+color+"\n"+"Сколько лет хранится: "+age+" года/лет"+"\n"+"Цена: "+price+" руб.");
    }


    }

```
####DishesLoader.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Dishes;

public class DishesLoader {
    public static void main(String[] args) {
        Dishes d1 = new Dishes("Голубой", 2, 33.4f );
        d1.displayInfo();
        System.out.println();
        Cup c1 = new Cup("Розовый", 3, 22.5f, 350);
        c1.displayInfo();
        System.out.println();
        Plate p1 = new Plate("Синий", 5, 50.35f,"Суповая");
        p1.displayInfo();
        System.out.println();
        Spoon s1=new Spoon("Бронзовый", 1, 10, "Чайная");
        s1.displayInfo();

    }
}

```
####Plate.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Dishes;

public class Plate extends Dishes{
    private String food;
    public Plate(String color, int age, float price, String food) {
        super(color, age, price);
        this.food=food;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Для какого вида пищи: "+food);
    }
    public String getTypeFood(){
            return food;
    }

    public void setTypeFood(String typeFood) {
            this.food = food;
    }
}
```
####Spoon.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Dishes;

class Spoon extends Dishes{
    private String typeF;
    public Spoon(String color, int age, float price, String typeF) {
        super(color, age, price);
        this.typeF = typeF;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип ложки: "+typeF);
    }

    public String getTypeF(){

        return typeF;
    }

    public void setTypeF(String typeF) {

        this.typeF = typeF;
    }

}
```
####Chihuahua.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Dogs;

public class Chihuahua extends Dog {
    private boolean isCalm;

    public Chihuahua(String name, int age, char gender, String region, boolean isCalm) {
        super(name, age, gender, region);
        this.isCalm =isCalm;
    }
    public void set(boolean isCalm) {
        this.isCalm = isCalm;
    }

    @Override
    public void showCharacteristic() {
        super.showCharacteristic();
        System.out.print("По характеру: ");
        if (isCalm==true)
            System.out.println ("спокойная");
        else System.out.println("агрессивная");
    }


}
```
####Dog.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Dogs;

public class Dog {
    private String name;
    private int age;
    private char gender;
    private String region;

    public String getName(){ return name; }
    public int getAge(){
        return age;
    }
    public char getGender(){ return gender; }

    public String getRegion(){ return region; }


    public Dog(String name, int age, char gender, String region){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.region=region;
    }

    public void showCharacteristic() {
        System.out.println("Кличка: "+name+"\n"+"Возраст в собачьих годах: "+age +"\n"+"Страна породы: "+region);

    }
    /*public String humAge(){
        return "Возраст собаки в человеческих годах: " + getAge()*7;
    }*/

    public int calculate(){
        return   getAge() * 7;

    }
}


```
####DogLoader.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Dogs;

public class DogLoader {
    public static void main(String[] args) {
        Dog d1 = new Dog("Тотошка",3, 'д', "Российская Федерация" );
        d1.showCharacteristic();
        System.out.println("Возраст в человеческих годах: "+d1.calculate());
        System.out.println();
        Shepherd sh1= new Shepherd("Мухтар", 2, 'м', "Киргизская респ.", true);
        sh1.showCharacteristic();
        System.out.println("Возраст в человеческих годах: "+sh1.calculate());
        System.out.println();
        Chihuahua c1=new Chihuahua("Маркус", 3, 'м', "Германия", true);
        c1.showCharacteristic();
        System.out.println("Возраст в человеческих годах: "+c1.calculate());

    }
}
```
####Shepherd.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Dogs;

public class Shepherd extends Dog{
    private boolean isService;
    public Shepherd(String name, int age, char gender, String region, boolean isService){
        super(name, age, gender, region);
        this.isService=isService;
    }

    public void setIsService(boolean isService) {
        this.isService = isService;
    }

    @Override
    public void showCharacteristic() {
        super.showCharacteristic();
        System.out.print("Служба: ");
        if (isService==true)
            System.out.println ("служащая");
        else System.out.println("гражданская");
    }

}
```
####Cabinett.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Furniture_Shop;

class Cabinett extends Furniture { //шкаф
    private double height;
    private double width;

    Cabinett(String material, String color, String dimensions, int price, String name){
        super(material, color, dimensions, price, name);
    }

    @Override
    public String displayInfo(){
        return ("Материал: " + getMaterial() + "; Цвет: " + getManufacturer() + "; Габариты: " + getDimensions() +
                "; Высота: " + getHeight() + "; Ширина: " + getWidth());
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}


```
####Desk.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Furniture_Shop;

public class Desk extends Furniture{ //стул
    private int height; //высота
    private int length; //длина стола
    private int width; //ширина стола

    Desk(String material, String manufacturer, String dimensions, int price, String name){
        super(material, manufacturer, dimensions, price, name);
    }

    @Override
    public String displayInfo(){
        return ("Материал: " + getMaterial() + "; Изготовитель: " + getManufacturer() + "; Габариты: " + getDimensions() +
                "; Высота ножек: " + getHeight() + "; Длина столешницы: " + getLength()+"; Ширина столешницы: " + getWidth() );
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }


}
```
####Furniture.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Furniture_Shop;

abstract class Furniture{
    private String material;
    private int price;
    private String name;
    private String manufacturer;
    private String dimensions;

    Furniture(String material, String manufacturer, String dimensions, int price, String name){
        this.material = material;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions; //габариты
        this.price = price;
        this.name = name;
    }

    public abstract String displayInfo();

    public String getManufacturer(){
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial(){
        return material;
    }

    public String getDimensions(){
        return dimensions;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public void setDimensions(String dimensions){
        this.dimensions = dimensions;
    }
}

```
####FurnitureLoader.java
```java
/*package ru.ivbo_11_19.all_practices.practice5_6.Furniture_Shop;
import java.util.Scanner;
import java.util.ArrayList;

public class FurnitureLoader {
    public int numbProduct;
    public int amountOfMoney;

    public static void showCommand(){
        System.out.println("Добро пожаловать! Список команд: ");
        System.out.print("Показать каталог - 1" + "\n" +  "Купить - 2" + "\n" +
                "Показать список команд - 3" + "\n" + "Уйти - 4" + "\n" + "Ваша команда: ");
    }

    public static void main(String[] args) {
        Sofa sofa_1 = new Sofa("Skin", "China", "Average", 40000, "Fisher_1");
        Desk desk_1 = new Desk("Oak", "Brasil", "Small", 2300, "StudySmart_3");
        Cabinett cab_1 = new Cabinett("Wood", "South Korea", "Big", 60000, "Trio_1");

        ArrayList<Furniture> catalog = new ArrayList<Furniture>();
        catalog.add(new Desk("Oak", "Brasil", "Small", 2700, "StudySmart_2"));
        catalog.add(new Sofa("Velour", "Germany", "Big", 100000, "Fisher_2"));
        catalog.add(new Cabinett("Wood", "Indonesia", "Average", 150000, "IndBusy_2"));
        catalog.add(desk_1);
        catalog.add(sofa_1);
        catalog.add(cab_1);

        System.out.print("Введите сумму Ваших денег: ");
        Scanner in = new Scanner(System.in);
        int amountOfMoney = in.nextInt();

        FurnitureLoader.showCommand();

        //через case сделать
        while(true){
            int command = in.nextInt();
            if(command == 1){ //вывод каталога
                FurnitureShop.printCatalog(catalog);
            }
            else if(command == 2){ //добавить в корзину
                System.out.print("Введите номер товара который хотите добавить в корзину: ");
                int numbProduct = in.nextInt()-1;
                FurnitureShop.getBas(catalog, basket, numbProduct);
            }
            else if(command == 3){ //убрать из корзины
                System.out.println("Введите номер товара который хотите убрать из корзины: ");
                int numbProduct = in.nextInt()-1;
                FurnitureShop.delBas(basket, numbProduct);
            }
            else if(command == 4){
                FurnitureShop.showBasket(basket);
            }
            else if(command == 5){ //покупка
                System.out.println("Стоимость всех товаров из Вашей корзины составляет: " + FurnitureShop.getSum());
                FurnitureShop.buy(amountOfMoney, basket);
            }
            else if(command == 6){ //вывод списка команд
                FurnitureLoader.showCommand();
            }
            else if(command == 7){ //выход
                System.out.println("Выход");
                break;
            }
            else{
                System.out.print("Вы неверно ввели команду. Список команд: ");
                FurnitureLoader.showCommand();
            }
        }
    }
}
*/
```
####FurnitureShop.java
```java
/*package ru.ivbo_11_19.all_practices.practice5_6.Furniture_Shop;
import java.util.ArrayList;

public class FurnitureShop {
    private String storeName;
    private String buyersName;
    static int sum = 0;
    static int count = 0;

    FurnitureShop(String storeName, String buyersName){
        this.storeName = storeName;
        this.buyersName = byersName;
    }

    static void printCatalog(ArrayList<Furniture> catalog){
        for(int i = 0; i < catalog.size(); i++){
            System.out.println(i+1 + ") " + catalog.get(i).getName() + " " + catalog.get(i).getPrice());
        }
    }

     static void getBas(ArrayList<Furniture> catalog, ArrayList<Furniture> basket, int numbProduct){
        basket.add(catalog.get(numbProduct));
        System.out.println("Товар " + basket.get(counterObjBas).getName() + " добавлен в корзину!");
        sum += basket.get(count).getPrice();
        ++count;
    }
    
     static void delBasket(ArrayList<Furniture> basket, int numbProduct){
        if(!basket.isEmpty()) {
            System.out.println("Товар " + basket.get(numbProduct).getName() + " удалён из корзины!");
            sum -= basket.get(numbProduct).getPrice();
            basket.remove(numbProduct);
            --count;
        }
        else{
            System.out.println("Корзина пуста");;
        }
    }
    
    static void buy(ArrayList<Furniture> catalog, int numbProduct, int amountOfMoney){
        if(amountOfMoney >= catalog.get(numbProduct).getPrice()){
            amountOfMoney -= catalog.get(numbProduct).getPrice();
            catalog.remove(numbProduct);
            System.out.println("Вы успешно купили выбранный товар!!!" + " Остаток средств: " + amountOfMoney);
        }
        else {
            System.out.println("На вашем счёте недостаточно средств для совершения покупки. ");
        }
    }

       static int getSum(){
        return sum;
    }
    public void setBuyersName(String buyersName) {
        this.buyersName = buyersName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getBuyersName() {
        return buyersName;
    }

    public String getStoreName() {
        return storeName;
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "storeName='" + storeName + '\'' +
                ", buyersName='" + buyersName + '\'' +
                '}';
    }
}
*/
```
####Sofa.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Furniture_Shop;

class Sofa extends Furniture { //диван
    private String form;
    private int numberOfSeats;

    Sofa(String material, String manufacturer, String dimensions, int price, String name) {
        super(material, manufacturer, dimensions, price, name);
    }

    @Override
    public String displayInfo() {
        return ("Материал: " + getMaterial() + "; Изготовитель: " + getManufacturer() + "; Габариты: " + getDimensions() +
                "; Форма дивана: " + getForm() + "; Количество мест: " + getNumberOfSeats());
    }

    public String getForm() {
        return form;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
```
####Circle.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Shapes;
class Circle extends Shape{
    protected double radius;
    Circle(){}

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }
}
```
####Rectangle.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Shapes;

class Rectangle extends Shape{
    protected double width;
    protected double length;

    Rectangle(){}
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    double getArea() {
        return width*length;
    }

    @Override
    double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
```
####Shape.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Shapes;

abstract class Shape {
    protected String color;
    protected boolean filled;

   Shape(){}
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

}

```
####ShapeLoader.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Shapes;

public class ShapeLoader {
    public static void main(String[] args) {
        Circle circle_1 = new Circle(2, "White", false);
        circle_1.setRadius(8.9);
        circle_1.setColor("Pink");
        System.out.println("Радиус круга: " + circle_1.getRadius() + "; Цвет круга: " + circle_1.getColor());
        System.out.println("\n" + "Площадь круга: " + circle_1.getArea() + "; Периметр круга: " + circle_1.getPerimeter());
        System.out.println(circle_1.toString());


        Rectangle rectangle_1 = new Rectangle(7.5, 11.2);
        rectangle_1.setLength(8.7);
        rectangle_1.setWidth(4.9);
        System.out.println("Длина прямоугольника: " + rectangle_1.getLength() + "; Ширина прямоугольника: " + rectangle_1.getWidth());
        System.out.println("\n" + "Площадь прямоугольника: " + rectangle_1.getArea() + "; Периметр прямоугольника: " + rectangle_1.getPerimeter() + "\n");
        System.out.println(rectangle_1.toString());

        Square square_1 = new Square(9.0);
        System.out.println("Длина квадрата: " + square_1.getLength()+"; Ширина квадрата: "+square_1.getLength()+"; Сторона квадрата: "+square_1.getSide());
        System.out.println("\n" + square_1.toString());


    }
}
```
####Square.java
```java
package ru.ivbo_11_19.all_practices.practice5_6.Shapes;

class Square extends Rectangle{
    protected double side;


    Square(double side){
        this.side = side;
    }

    Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        length=this.getWidth();
        side=width;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
        length=this.getWidth();
        side=width;
    }

    @Override
    public void setLength(double side) {
        super.setLength(length);
        width=this.getLength();
        side=length;
    }

    @Override
    public String toString() {
        return "Square: (" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + side +
                ", length=" + side +
                ", side=" + side +
                ')';
    }
}
```
####Company.java
```java
package ru.ivbo_11_19.all_practices.practice7_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company{
    public float income;
    public double baseSalary;
    List<Employee> employeeList = new ArrayList<>();
    public Company(float income, double baseSalary)
    {
        this.income = income;
        this.baseSalary = baseSalary;
    }
    public float getIncome() {
        return income;
    }
    public double getBaseSalary()
    {
        return baseSalary;
    }
    public void hire(Employee employee)
    {
        employeeList.add(employee);
    }
    public void hireAll(List<Employee> employees)
    {
        for (int i = 0; i < employees.size(); i++)
        {
            employeeList.add(employees.get(i));
        }
    }
    public void fire(int index)
    {
        if (index < employeeList.size() && index >= 0)
        {
            employeeList.remove(index);
        }
    }
    public List<Employee> getTopSalaryStaff(int numStaff)
    {
        if (numStaff >= 1 && numStaff <= employeeList.size())
        {
            employeeList.sort(new EmployeeComparator());
            List<Employee> employeeListTopSalary = new ArrayList<>();
            for (int i = 0; i < numStaff; i++)
            {
                employeeListTopSalary.add(employeeList.get(i));
            }
            return employeeListTopSalary;
        }
        else
        {
            return employeeList;
        }
    }

    public List<Employee> getLowestSalaryStaff(int numStaff)
    {
        if (numStaff >= 1 && numStaff <= employeeList.size())
        {
            employeeList.sort(new EmployeeComparator());
            List<Employee> employeeListLowestSalary = new ArrayList<>();
            for (int i = employeeList.size() - 1; i > employeeList.size() - 1 - numStaff; i--)
            {
                employeeListLowestSalary.add(employeeList.get(i));
            }
            return employeeListLowestSalary;
        }
        else
        {
            return employeeList;
        }
    }
    public String printSalary(List<Employee> employees)
    {
        String topSalary = "";
        for (int i = 0; i < employees.size(); i++)
        {
            topSalary += employees.get(i).salary + " руб.\n";
        }
        return topSalary;
    }
    @Override
    public String toString() {
        /*return "Company{" +
                "income=" + income +
                ", baseSalary=" + baseSalary +
                ", employeeList=" + employeeList +
                '}';*/
        return  "Информация о компании: " +
                "\nДоход: " + income +
                "\nОклад: " + baseSalary +
                "\nСотрудники: \n" + employeeList + "\n";
    }
}
```
####CompanyLoader.java
```java
package ru.ivbo_11_19.all_practices.practice7_8;
import java.util.Random;
public class CompanyLoader {

    public static void main(String[] args) {
        Company company = new Company(120000000, 40000);
        String[] posts = {"Manager", "Top Manager", "Operator"};
        /*Employee employee1 = new Employee(company,posts[0], "Mana", "Ger");
        Employee employee2 = new Employee(company,posts[1], "Topma", "Nager");
        Employee employee3 = new Employee(company,posts[0], "Mana2", "Ger2");
        Employee employee4 = new Employee(company,posts[0], "Mana3", "Ger3");
        Employee employee5 = new Employee(company,posts[2], "Ope", "Rator");
        company.hire(employee1);
        company.hire(employee2);
        company.hire(employee3);
        company.hire(employee4);
        company.hire(employee5);
        System.out.println(company);
        System.out.println(company.printSalary(company.getLowestSalaryStaff(2)));*/
        int i, countOperator = 180, countMan = 80, countTopMan = 10;
        for (i = 1; i <= countOperator; i++)
        {
            company.hire(new Employee(company, posts[2], "Oper", "Ator" + i));
        }
        for (i=1; i <= countMan; i++)
        {
            company.hire(new Employee(company, posts[0], "Mana", "Ger" + i));
        }
        for (i=1; i <= countTopMan; i++)
        {
            company.hire(new Employee(company, posts[1], "Top Ma", "Nager" + i));
        }
        System.out.println(company.printSalary(company.getTopSalaryStaff(11)));
        System.out.println(company.printSalary(company.getLowestSalaryStaff(30)));
        final Random random = new Random();
        for (i=0;i<company.employeeList.size()/2; i++)
        {
            company.fire(random.nextInt(company.employeeList.size()-1));
        }
        System.out.println(company.printSalary(company.getTopSalaryStaff(11)));
        System.out.println(company.printSalary(company.getLowestSalaryStaff(30)));
    }
    }

```
####Employee.java
```java
package ru.ivbo_11_19.all_practices.practice7_8;
import java.util.List;

public class Employee {
    public String name, surname, post;
    public double baseSalary, salary;
    public Employee(Company company, String post, String name, String surname)
    {
        baseSalary = company.getBaseSalary();
        this.name = name;
        this.surname = surname;
        this.post = post;
        if (post == "Manager")
        {
            Manager manager = new Manager();
            salary = manager.calcSalary(baseSalary);
        }
        else if (post == "Top Manager")
        {
            TopManager topManager = new TopManager(company);
            salary = topManager.calcSalary(baseSalary);
        }
        else
        {
            Operator operator = new Operator();
            salary = operator.calcSalary(baseSalary);
        }
    }

    @Override
    public String toString() {
        return "\nИнформация о сотруднике: " +
                "\nИмя: "+ name + " " + surname +
                //"\nФамилия: " + surname +
                "\nДолжность: " + post +
                "\nЗарплата: " + salary + "\n";
    }
}

```
####EmployeeComparator.java
```java
package ru.ivbo_11_19.all_practices.practice7_8;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.salary > o2.salary)
        {
            return -1;
        }
        else if (o1.salary < o2.salary)
        {
            return 1;
        }
        return 0;
    }
}
```
####EmployeePosition.java
```java
package ru.ivbo_11_19.all_practices.practice7_8;
public interface EmployeePosition {
    String getJobTitle();
    double calcSalary(double baseSalary);
}
```
####Manager.java
```java
package ru.ivbo_11_19.all_practices.practice7_8;

import java.util.Random;

public class Manager implements EmployeePosition{
    final Random random = new Random();
    public String getJobTitle()
    {
        return "Manager";
    }
    public double calcSalary(double baseSalary)
    {
        return (random.nextInt(25000) + 115000) * 0.05 + baseSalary;
    }
}
```
####Operator.java
```java
package ru.ivbo_11_19.all_practices.practice7_8;

public class Operator implements EmployeePosition{
    public String getJobTitle()
    {
        return "Operator";
    }
    public double calcSalary(double baseSalary)
    {
        return baseSalary;
    }
}
```
####TopManager.java
```java
package ru.ivbo_11_19.all_practices.practice7_8;

public class TopManager implements EmployeePosition{
    Company company;
    public TopManager(Company company)
    {
        this.company = company;
    }
    public String getJobTitle()
    {
        return "Top Manager";
    }
    public double calcSalary(double baseSalary)
    {
        if (company.getIncome() > 10000000)
        {
            return baseSalary * 2.5;
        }
        else {
            return baseSalary;
        }
    }
}
```
####FootballForm.java
```java
package ru.ivbo_11_19.all_practices.practice9_10;
import javax.swing.*;
import java.awt.event.*;

public class FootballForm {
    private JPanel panelForm;
    private JButton button1;
    private JButton button2;
    private JLabel score;
    private JLabel com1;
    private JLabel label1;
    private JLabel com2;
    private JButton button3;
    int point1;
    int point2;

    public JPanel getPanelform() {
        return panelForm;
    }

    FootballForm(){

       button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setText("");
                point1+=1;
                String f="Score: " + Integer.toString(point1) + "x" + Integer.toString(point2);
                score.setText(f);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setText("");
                point2+=1;
                String f="Score: " + Integer.toString(point1) + "x" + Integer.toString(point2);
                score.setText(f);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setText("");
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                com1.setVisible(false);
                com2.setVisible(false);
                score.setText("Игра окончена");
                if (point1>point2){
                    score.setText("Выиграла Команда 1 со счётом: "+point1+"x"+point2);
                }
                if (point1<point2){
                    score.setText("Выиграла Команда 2 со счётом: "+point1+"x"+point2);
                }
                if (point1==point2)
                    score.setText("Ничья со счётом: "+point1+"x"+point2);

            }
        });
  }
}
```
####Loader.java
```java
package ru.ivbo_11_19.all_practices.practice9_10;
import  javax.swing.*;
public class Loader {
    public static void main(String[] args) {
        //1 variant
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//полное закрытие программы, окошечка

        //frame.add(new JButton("Click")); //принимает текст
        //2 variant CUI form d src
        FootballForm myForm = new FootballForm();
        frame.add(myForm.getPanelform());

    }
}
```
