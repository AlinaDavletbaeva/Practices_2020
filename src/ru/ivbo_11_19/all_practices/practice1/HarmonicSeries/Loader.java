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
