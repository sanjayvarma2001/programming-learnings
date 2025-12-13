public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void greet(){
        System.out.println("Hello, I'm " + name + " I'm age " + age + " year's old");
    }

    public void haveBirthday(){
        age = age + 1;
    }
}
