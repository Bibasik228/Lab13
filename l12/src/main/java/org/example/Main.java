package org.example;
public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester("John", "Doe", 5, "Advanced", 50000);
        tester.printInfo();
        tester.printInfo("Mr.", "is a great tester.");

        // Вызов статического метода
        Tester.printTesterCount(10);
    }
}