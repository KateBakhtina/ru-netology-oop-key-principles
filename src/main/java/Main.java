import netology.personalData.FormDate;
import netology.personalData.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Изя";
        post.passport = "1111 № 222222";
        post.patronymic = "Михайлович";
        post.phone = "+7 (920) 0001200";
        post.surname = "Кацман";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = "01";
        post.birthday.month = "01";
        post.birthday.year = "1967";

    }
}
