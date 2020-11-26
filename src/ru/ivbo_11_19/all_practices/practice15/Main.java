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
            System.out.println(gleb);
        }
        throw new ThrowRuntimeException();

    }
}
