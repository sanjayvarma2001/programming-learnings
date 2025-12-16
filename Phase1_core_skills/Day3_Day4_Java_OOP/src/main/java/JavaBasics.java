import java.util.Scanner;


public class JavaBasics {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("I am Sanjay");
        int age = 20;
        String college ="Parul";
        double cgpa = 9.8;
        boolean isPlaced = false;

        System.out.println("Sanjay of age " + age + " from " + college +" of cgpa " + cgpa + " is Placed :" + isPlaced);

        /* scanner to take user input
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age1 = scan.nextInt();
        System.out.println("Enter your Name");
        String name = scan.next();

        System.out.println("Hello, " + name + ". you are " + age1 +" years old.");

        if (age1<18){
            System.out.println("You are not Eligible " + name);
        }else{
            System.out.println("You are Eligible " + name);
        }
        Person p = new Person("Sanjay", 20);
        p.greet();
        p.haveBirthday();
        p.greet();
    }
}
