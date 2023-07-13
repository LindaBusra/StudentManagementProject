package pages;

import com.github.javafaker.Faker;

public class deneme {

    public static void main(String[] args) {

        Faker faker = new Faker();

        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println(faker.date().birthday());
    }
}
