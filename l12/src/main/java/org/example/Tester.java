package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    // Конструкторы
    public Tester() {
        this("Unknown", "Unknown", 0, "Unknown", 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "Unknown", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    // Перегруженные методы
    public void printInfo() {
        System.out.println("Name: " + name + ", Surname: " + surname);
    }

    public void printInfo(String prefix) {
        System.out.println(prefix + " Name: " + name + ", Surname: " + surname);
    }

    public void printInfo(String prefix, String suffix) {
        System.out.println(prefix + " Name: " + name + ", Surname: " + surname + " " + suffix);
    }

    // Статический метод
    public static void printTesterCount(int count) {
        System.out.println("Total Testers: " + count);
    }
}
