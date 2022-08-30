package com.company.yarik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Application {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Barsik");
        Animal dog2 = new Dog("Alex");
        Animal cat1 = new Cat("Sveta");
        Animal cat2 = new Cat("Olena");
        Animal animal1 = new Animal("Vlad");

        List<Animal> animalList = new ArrayList<>();

        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(cat1);
        animalList.add(cat2);
        animalList.add(animal1);

//        calculateAmountOfAnimalsHashMap(animalList);
        calculateAmountOfAnimals(animalList);

    }

    public static void calculateAmountOfAnimalsHashMap(List<Animal> animalList) {
        HashMap<String, Integer> animalsHashMap = new HashMap<>();
        animalsHashMap.put("Dog", 0);
        animalsHashMap.put("Cat", 0);
        animalsHashMap.put("Animal", 0);
        for (Animal animal : animalList) {
            if (animal instanceof Dog) {
                animalsHashMap.computeIfPresent("Dog", (k, v) -> ++v);
            } else if (animal instanceof Cat) {
                animalsHashMap.computeIfPresent("Cat", (k, v) -> ++v);
            } else {
                animalsHashMap.computeIfPresent("Animal", (k, v) -> ++v);
            }
        }
        animalsHashMap.forEach((k, v) -> System.out.println(k + ":" + v));
    }


    public static void calculateAmountOfAnimals(List<Animal> animalList) {

        Map<? extends Class<? extends Animal>, Long> animalsHashMap =
                animalList.stream().collect(groupingBy(Animal::getClass, Collectors.counting()));
        animalsHashMap.forEach((k, v) -> System.out.println(k + ":" + v));
        int animals = 0;
        int cats = 0;
        int dogs = 0;
        for (Animal animal : animalList) {
            if (animal instanceof Dog) {
                dogs++;
            } else if (animal instanceof Cat) {
                cats++;
            } else {
                animals++;
            }
        }
        System.out.println("Animals" + ":" + animals);
        System.out.println("Dogs" + ":" + dogs);
        System.out.println("Cats" + ":" + cats);
    }
}
