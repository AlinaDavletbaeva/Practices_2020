package ru.ivbo_11_19.all_practices.practice23_24;

import com.google.gson.Gson;

public class JsonAndHttp {
    private static Gson gson = new Gson();
    public static void main(String[] args) {
        Item item = new Item(0, "some data", true, "some log description");

        System.out.println(gson.toJson(item));

        Item fromJson = gson.fromJson("{\"id\":0,\"data\":\"some data\",\"isGood\":true,\"description\":\"some log description\"}", Item.class);
        System.out.println(fromJson.getId());
        System.out.println(fromJson.getData());
        System.out.println(fromJson.isGood());
        System.out.println(fromJson.getDescription());
    }
}
