package github;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person eu = new Person();

        eu.name = "Cristian Pessotto";
        eu.age = 21; // estou MUITO velho mds 1-1

        eu.languages = new ArrayList<>(Arrays.asList(
                "JavaScript",
                "PHP",
                "HTML",
                "CSS"));

        eu.frameworksAndLibs = new ArrayList<>(Arrays.asList(
                "React",
                "Laravel",
                "Bootstrap",
                "Spring"));

        eu.foods = new ArrayList<>(Arrays.asList(
                "Estrogonofe",
                "Pizza",
                "Snickers",
                "Energético"));

        eu.songs = new ArrayList<>(Arrays.asList(
                "Lo-Fi",
                "Rock",
                "Synthwave",
                "Dark Techno"));

        ArrayList<ArrayList<String>> lists = new ArrayList<>(Arrays.asList(
                eu.languages,
                eu.frameworksAndLibs,
                eu.foods,
                eu.songs));

        final String line = "-".repeat(20);

        lists.stream().forEach(category -> {
            System.out.println(line);
            category.stream().forEach(element -> {
                System.out.println(element);
            });
        });
    }
}

class Person {

    public String name;
    public short age;
    public String stack;
    public ArrayList<String> languages;
    public ArrayList<String> frameworksAndLibs;
    public ArrayList<String> foods;
    public ArrayList<String> songs;
}
