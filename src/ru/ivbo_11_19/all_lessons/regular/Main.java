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
