package ru.netology.post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Руслан";
        post.patronymic = "Сергеевич";
        post.surname = "Асадов";
        post.passport = "8005 № 805805";
        post.phone = "+7 (987)-987-87-87";
        post.subscription = true;

        FormDate formDate = new FormDate();
        post.birthday = new FormDate();
        post.birthday.day = 28;
        post.birthday.month = 2;
        post.birthday.year = 2000;
    }
}