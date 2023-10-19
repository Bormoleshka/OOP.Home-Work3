import java.util.Comparator;

public class StudentComporator implements Comparator<Student> {

    
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getName().compareTo(secondStudent.getName());
    }

    public static class StudentAgeComparator implements Comparator<Student> {

        public int compare(Student ageFirstStudent, Student ageSecondStudent) {

            if (ageFirstStudent.getAge() > ageSecondStudent.getAge())
                return 1;
            else if (ageFirstStudent.getAge() < ageSecondStudent.getAge())
                return -1;
            else
                return 0;
        }
    }
}