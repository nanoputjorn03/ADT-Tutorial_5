// Tat Putjorn 672115024 //

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        String[] firstNames = {"Nano", "Oat", "Guy", "May", "Aum", "Bob", "Praifah", "Soda", "Pun", "Non"};
        String[] lastNames = {"Doe", "Smith", "Johnson", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson"};
        String[][] vaccines = {{"Pfizer"}, {"Moderna"}, {"J&J", "Pfizer"}, {"AstraZeneca"}, {"Sinovac"}, {"Pfizer", "Moderna"}, {"J&J"}, {"AstraZeneca"}, {"Moderna"}, {"Pfizer"}};

        for (int i = 0; i < 10; i++) {
            list.insert(new CovidVaccine(100 + i, firstNames[i], lastNames[i], Arrays.asList(vaccines[i])));
        }

        System.out.println("Initial List:");
        list.traverse();

        Random random = new Random();
        int delete1 = 100 + random.nextInt(10);
        int delete2 = 100 + random.nextInt(10);
        while (delete2 == delete1) { 
            delete2 = 100 + random.nextInt(10);
        }

        System.out.println("\nDeleting applicants with SID: " + delete1 + " and " + delete2);
        list.delete(delete1);
        list.delete(delete2);

        System.out.println("List after deletion:");
        list.traverse();

        System.out.println("\nDeleting all applicants...");
        list.deleteAll();

        System.out.println("Final List:");
        if (list.isEmpty()) {
            System.out.println("No applicants remaining.");
        }
    }
}
