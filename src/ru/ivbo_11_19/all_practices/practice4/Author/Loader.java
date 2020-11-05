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
