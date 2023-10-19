import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class GroupOfStudents implements Iterable<Student> {


    List<Student> numberofStudents = new ArrayList<Student>();
    int index = 0;

    public GroupOfStudents(List numberofStudents) {

        this.numberofStudents = numberofStudents;
    }


    public List getNumberofStudents() {
        return numberofStudents;
    }

    public List setNumberofStudents(List numberofStudents) {
        return this.numberofStudents = numberofStudents;
    }

    @Override
    public String toString() {
        return "ClassStudents{" +
                "numberofStudents=" + numberofStudents +
                '}';
    }


    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator() {
        };
    }


    private class StudentIterator implements Iterator<Student> {
        @Override
        public boolean hasNext() {
            return index < numberofStudents.size();
        }

        @Override
        public Student next() {
            if (hasNext()) {
                return numberofStudents.get(index++);
            }
            return null;
        }

        @Override
        public void remove() {
            return;
        }
    }

    public void addPerson(Student student) {
        numberofStudents.add(student);
    }
}