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
