package ComIT.ComIT4.EmployeeSurveyUpdate;


import java.util.ArrayList;
import java.util.Scanner;

public class Survey {

    private ArrayList<Participant> males;
    private ArrayList<Participant> females;




    public Survey() {
        this.males = new ArrayList<>();
        this.females = new ArrayList<>();



    }

    public void start() {

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your current salary");
            String salary = scanner.nextLine();
            if (salary.isEmpty()) {
                break;
            }
            int newSalary = Integer.valueOf(salary);
            newSalary = getSalary(newSalary);
            System.out.println("Please enter your gender");
            String answer = scanner.nextLine();
            Participant.Gender gender = getGender(answer);
            System.out.println("Are you currently employed?");
            String employmentAnswer = scanner.nextLine();
            boolean isEmployed = isEmployed(employmentAnswer);

            Participant newParticipant = new Participant(gender, isEmployed, newSalary);

            System.out.println(newParticipant);

            addParticpant(newParticipant);

        }

        results();
    }


    private int getSalary(int salary) {
        if (salary < 0 ) {
            System.out.println("Invalid Salary");
        }
        return salary;  }

    private Participant.Gender getGender(String answer) {
        answer = answer.toLowerCase();
        Participant.Gender gender = Participant.Gender.MALE;
        if (answer.equals("m") || answer.equals("male")) {
            gender = Participant.Gender.MALE;
            return gender;
        }

        if (answer.equals("f") || answer.equals("female")) {
            gender = Participant.Gender.FEMALE;
            return gender;
        }


   return null; }

   private boolean isEmployed(String answer) {
        String employmentAnswer = answer.toLowerCase();
       if (employmentAnswer.equals("no") || employmentAnswer.equals("NO")) {
           return false;

       } else {
           return true;
       }
   }


    private boolean isMale(Participant participant) {
        Participant.Gender gender = participant.getGender();
        if (gender.equals(Participant.Gender.MALE)) {
            return true;
        }
   return false; }


    private void addParticpant(Participant part) {
        if (isMale(part)) {
            males.add(part);
        } else {
            females.add(part);
        }

    }

    private double getFemaleSalary() {
        int sum = 0;
        for (Participant part: females) {
            sum+=part.getSalary();
        }
    return sum/females.size();
    }

    private double getMaleSalary() {
        int sum = 0;
        for (Participant part: males) {
            sum+=part.getSalary();
        }
        return sum/males.size();
    }

    private double percentageEmployed(ArrayList<Participant> list) {
        int count = 0;
        for (Participant part: list) {
            if (part.isEmployed()) {
                count++;
            }
        }
    return count/list.size() * 100;
    }

    private void results() {
        System.out.println("Number of male participants: " + males.size());
        System.out.println("Number of female participants: " + females.size());
        System.out.println("Average male salary: " + getMaleSalary());
        System.out.println("Average female salary: " + getFemaleSalary());
        System.out.println("Average total salary: " + (getFemaleSalary() + getMaleSalary())/2);
        System.out.println("Percentage men employed " +  percentageEmployed(males));
        System.out.println("Percentage female employed " +  percentageEmployed(males));

    }





}


