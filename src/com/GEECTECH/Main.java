package com.GEECTECH;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(myMethod("Harry", generateRandomAge(), generateRandomTemperature()));
        System.out.println(myMethod("Tony", generateRandomAge(), generateRandomTemperature()));
        System.out.println(myMethod("Steve", generateRandomAge(), generateRandomTemperature()));
        System.out.println(myMethod("Bruce", generateRandomAge(), generateRandomTemperature()));
        System.out.println(myMethod("John", generateRandomAge(), generateRandomTemperature()));
    }

    public static String myMethod(String name, int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature > -20 && temperature < 30) {
            return "Age: " + age + " Temperature:" + temperature + "\n" + name + "  Mужик можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature < 28) {
            return "Age: " + age + " Temperature:" +temperature+ "\n" + name + " Mужик можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25)
            return "Age: " + age + " Temperature:" + temperature + "\n" + name + " Mужик можно идти гулять ";
        else
            return "Age: " + age + " Temperature: " + temperature + "\n" + name + " Оставайтесь дома";

    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static int generateRandomTemperature() {
        Random random = new Random();
        int max = 40;
        int min = -40;
        int diff = max - min;
        return random.nextInt(diff + 1) + min;
    }
// write your code here
    }

