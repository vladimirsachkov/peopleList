package ru.specialist.human;

import java.util.ArrayList;
import java.util.Scanner;

public class peopleList {
    public static void main(String[] args) {
        ArrayList<Human> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Human human = new Human();
            System.out.println("Enter a name:");
            human.setName(scanner.nextLine());
            if (human.getName().equals("exit")) {
                break;
            }
            boolean isAgeEntered = false;
            while (!isAgeEntered) {
                try {
                    System.out.println("Enter a age:");
                    human.setAge(Integer.parseInt(scanner.nextLine()));
                    isAgeEntered = true;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong format. Age should only be numeric.");
                }
            }
            people.add(human);
        }
        showPeople(people);
    }

    public static void showPeople (ArrayList<Human> people) {
        int count = 1;
        for (Human h: people) {
            System.out.println(count++ + ") "+ h.getName() + " " + h.getAge());
        }
    };
}
