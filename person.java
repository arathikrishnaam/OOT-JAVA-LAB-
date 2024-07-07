import java.util.Scanner;

class person1{
    String name;
    int age;
    int salary;

    void set(String name,int age,int salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
    }
}

public class person {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        person1 first_person = new person1();
        System.out.println("ENTER THE NAME OF THE PERSON");
        String name = sc.nextLine();
        System.out.println("ENTER THE AGE OF THE PERSON");
        int age = sc.nextInt();
        System.out.println("ENTER THE SALARY OF THE PERSON");
        int salary = sc.nextInt();
        first_person.set(name,age,salary);
        first_person.display();

    }
    
}
