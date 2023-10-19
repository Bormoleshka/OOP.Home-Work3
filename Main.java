import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student Alexey = new Student("Alexey", "Bormotov", 33, "4a");
        Student Masha = new Student("Masha", "Borov", 22, "2b");
        Student Veniamin = new Student("Aleksandr", "Hlopov", 25, "3a");

        List<Student> numberOfGroup = new ArrayList<>();
        numberOfGroup.add(Alexey);
        numberOfGroup.add(Masha);
        numberOfGroup.add(Veniamin);

       
        System.out.println("iterating:");
        Iterator<Student> iterator = numberOfGroup.iterator();
        while (iterator.hasNext()) {
            Student person = iterator.next();
            System.out.println("Name: " + person.getName());
            System.out.println("Surname: " + person.getSurname());
            System.out.println("Age: " + person.getAge());
            System.out.println("Name of group: " + person.getNameofGroup());
        }

        Comparator<Student> studentComp = new StudentComporator()
                .thenComparing(new StudentComporator.StudentAgeComparator());
        TreeSet<Student> checkStudents = new TreeSet<>(studentComp);
        checkStudents.add(new Student("Kolya", "Rogov", 21, "2a"));
        checkStudents.add(new Student("Stepan", "Stepanov", 27, "2a"));
        checkStudents.add(new Student("Denis", "Stepnoy",30, "3a"));
        checkStudents.add(new Student("Vera", "Kudryavceva", 22, "2a"));
        checkStudents.add(new Student("Svetlana", "Li", 24, "3a"));
        for(Student std : checkStudents){

            System.out.println(std.getName() + " -> " + std.getAge() + " years old");
        }
    }
}
