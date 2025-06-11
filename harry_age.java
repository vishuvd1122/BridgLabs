//Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
public class harry_age {

    public static void main(String[] args) {
        //Birth year of Harry
        int birthYear= 2000;

        //Current year
        int currentYear = 2024;

        //Substract both to find the age
        int age = currentYear-birthYear;
        System.out.println(age);
    }
}