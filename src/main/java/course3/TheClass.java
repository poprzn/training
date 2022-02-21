package course3;

import java.util.Calendar;
import java.util.Date;

public class TheClass {
    public static void main(String[] args) {
        System.out.println("Hello class!");

        Professor mathProfessor = new Professor();
        Professor sportProfessor = new Professor();
        Professor chemistryProfessor = new Professor();


        mathProfessor.setFirstName("Gabriel");
        Date mathProfessorBirthday = new Date(1967, Calendar.APRIL,11);
        mathProfessor.setDateOfBirth(mathProfessorBirthday);
        System.out.println("My name is " +
                mathProfessor.getFirstName() + ", I was born on " +
                mathProfessor.getDateOfBirth() +
                " and I'm gonna be your math Professor");


        sportProfessor.setEmailAddress("mircea.ilea@gmail.com");
        Date sportProfessorHiring = new Date(2017, Calendar.MARCH, 15 );
        sportProfessor.setDateOfHiring((sportProfessorHiring));
        System.out.println("\t ..and last but not least, my email address is " + sportProfessor.getEmailAddress() +
                " and I work here since " + sportProfessor.getDateOfHiring());


        chemistryProfessor.setLastName("Sandu");
        String a = "yes";
        String b = "no";
        boolean ab;
        String result = (a==b) ? "true" : "false";
        System.out.println("\t ..so, my nickname is " + chemistryProfessor.getLastName() +
                " and i earned my Phd last year " + result);


            }
}

