package Days30Code;

import java.util.Scanner;

/**
 *
 * @author Simone
 */
public class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber);
    }

}

class Student extends Person {

    private int[] testScores;

    public Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    char calculate() {
        double avg = 0;
        int value = 0;
        char val = 'T';
        for (int i = 0; i < testScores.length; i++) {
            avg += testScores[i];
        }
        avg = (int) (avg / testScores.length);
        if (100 >= avg && avg >= 90) {
            val = 'O';
        } else if (90 > avg && avg >= 80) {
            val = 'E';
        } else if (80 > avg && avg >= 70) {
            val = 'A';
        } else if (70 > avg && avg >= 55) {
            val = 'P';
        } else if (55 > avg && avg >= 40) {
            val = 'D';
        } else {
            val = 'T';
        }
        return val;
    }

}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
