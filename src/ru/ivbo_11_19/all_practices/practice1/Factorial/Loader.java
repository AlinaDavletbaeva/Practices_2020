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
