package exercise;

public class Ternary {
    public static void main(String[] args) {
        int num=1000;
        String c ;
        c=  num>=90 && num<=100?"A": num >= 80 && num <= 89 ?"B": num >= 70 && num <= 79 ?"C": num >= 60 && num <= 69 ?"D":num >= 0 && num <= 59 ? "F":"Invalid input";
        System.out.println(c);

    }
}
