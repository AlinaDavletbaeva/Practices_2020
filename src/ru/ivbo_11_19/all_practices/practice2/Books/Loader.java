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
