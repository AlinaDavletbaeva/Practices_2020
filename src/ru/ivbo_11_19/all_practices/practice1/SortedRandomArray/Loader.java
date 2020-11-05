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
