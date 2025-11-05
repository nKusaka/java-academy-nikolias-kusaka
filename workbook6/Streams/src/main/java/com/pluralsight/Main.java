package com.pluralsight;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Create a list to hold Person objects
        List<Person> people = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        List<Person> matches = new ArrayList<>();

        // Add 10 Person objects to the list
        people.add(new Person("John", "Smith", 25));
        people.add(new Person("Emily", "Johnson", 30));
        people.add(new Person("Michael", "Brown", 22));
        people.add(new Person("Sarah", "Davis", 27));
        people.add(new Person("David", "Wilson", 35));
        people.add(new Person("Laura", "Martinez", 29));
        people.add(new Person("James", "Anderson", 33));
        people.add(new Person("Olivia", "Taylor", 24));
        people.add(new Person("Daniel", "Thomas", 31));
        people.add(new Person("Sophia", "Moore", 28));

        System.out.printf("Enter the name of a person you would like to search for first or last: ");
        String userInput = read.nextLine().toLowerCase();

        for (Person person: people) {
            if (person.getFirstName().toLowerCase().contains(userInput) || person.getLastName().toLowerCase().contains(userInput)) {
                matches.add(person);
            }
        }

        System.out.println("List of all people matching your search: ");
        for (Person person: matches) {
            System.out.println(person);
            
            int averageAge = 0;
            averageAge += person.getAge();
        }

        matches.sort((a,b) -> a.getAge() - b.getAge());
        System.out.println("The oldest person in the list is " + matches.get(matches.size() - 1));

        System.out.println("The youngest person in the list is " + matches.get(0));
    }
}