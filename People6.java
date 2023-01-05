package lab.rob6;

import lab.rob5.People5;

public class People6 implements RecruitmentOfEmployees{

    public People5 people5;

    public People6(People5 people5) {
        this.people5 = people5;
    }

    @Override
    public void recruitmentOfEmployees(String data) {
        if (data.equals("Не судився") && people5.people4.people3.people2.people.getAge() >= 18) {
            System.out.println("Ви нам підходите");
        } else {
            System.out.println("Ви нам не підходите");
        }
    }

}
