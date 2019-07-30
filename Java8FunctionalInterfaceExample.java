import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


class Student
{
    int id;

    String name;

    double percentage;

    String specialization;

    public Student(int id, String name, double percentage, String specialization)
    {
        this.id = id;

        this.name = name;

        this.percentage = percentage;

        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString()
    {
        return id+"-"+name+"-"+percentage+"-"+specialization;
    }
}

public class Main {
    public static void main(String[] args) {


        /************  Start Of Topic Prdicate*************/


        List<Student> listOfStudents = new ArrayList<Student>();


        //  Adding 10 students data

        listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));

        listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));

        listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));

        listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));

        listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));

        listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));

        listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));

        listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));

        listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));

        listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));


        // Create a predicate variable “mathematicsPredicate” which takes the student as an argument and gets all students who have specialization equals to “Mathematics”.
        Predicate<Student> mathematicsPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");


        // Create a temporary Student ArrayList named “mathematicsStudents”.
        List<Student> mathematicsStudents = new ArrayList<Student>();

        // Inside for loop
        // step1: If mathematicsPredicate contains students with specialization maths then it will return true.
        // step2: If it returns true then we will add that student to out temporary list

        for (Student student : listOfStudents)
        {
            if (mathematicsPredicate.test(student))
            {
                mathematicsStudents.add(student);
            }
        }

        // print those student having subject "Maths"
        for(Student NameOfelementsForforLoop : mathematicsStudents )
        {
        System.out.println(NameOfelementsForforLoop);
        }
        /************  End Of Topic Prdicate*************/



        /************  Start Of Topic Consumer*************/


        // Create cosumter variable which consume students name and pecentage and displays when this lambda gets called from for loop.

        // Lambda expression implementing Consumer : Displaying all students with their percentage

        Consumer<Student> percentageConsumer = (Student student) -> {
            System.out.println(student.getName()+" : "+student.getPercentage());
        };


        for (Student student : listOfStudents)
        {
            percentageConsumer.accept(student);
        }

        /************  End Of Topic Consumer*************/


        /************  Start Of Topic Function*************/
        // Lambda expression implementing Function : Extracting only the names of all students
        Function<Student, String> nameFunction = (Student Student) -> Student.getName();

        List<String> studentNames = new ArrayList<String>();

        for (Student student : listOfStudents)
        {
            studentNames.add(nameFunction.apply(student));
        }
        /************  End Of Topic Function*************/


        /************  End Of Topic Suplier*************/
        // Lambda expression implementing Supplier : Creating a new Student
        Supplier<Student> studentSupplier = () -> new Student(111111, "New Student", 92.9, "Java 8");

        listOfStudents.add(studentSupplier.get());

        for(Student NameOfelementsForforLoop : listOfStudents  )
        {
            System.out.println(NameOfelementsForforLoop);
        }
        /************  End Of Topic Suplier*************/



    }
}














