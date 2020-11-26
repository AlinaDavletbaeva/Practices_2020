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