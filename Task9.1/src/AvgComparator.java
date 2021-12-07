import java.util.Comparator;

public class AvgComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getAvgPoint() - o2.getAvgPoint();
    }
}
