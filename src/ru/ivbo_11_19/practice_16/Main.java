package ru.ivbo_11_19.practice_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int count;
    String rule;
    int digit;
    String text;
        System.out.println("Введите кол-во правил замены: ");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        System.out.println(count);
        String[] strings = new String[count];
        for(int i=0; i<count; i++) {
            System.out.println("Введите строку правил номер "+ (i+1) + ": ");
            strings[i] = scanner.next();

            //пропиши ввод этих значений через сканеры
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
