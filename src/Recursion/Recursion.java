package Recursion;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(1));
    }



    public static int sumOfNumbers(int number){
        if(number==5){
            return number;
        }
        number++;
        return sumOfNumbers(number);
    }
}
