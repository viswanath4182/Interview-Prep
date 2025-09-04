import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparableComparator extends Student implements Comparable<Student>  {
    public ComparableComparator(int id, String name, long mobile) {
        super(id, name, mobile);
    }


//    List<Student> students = Arrays.asList(new Student(100,"viswa",1972662662),
//            new Student(101,"viswana",1972662663),
//            new Student(102,"viswanath",1972662664));



    @Override
    public int compareTo(Student o) {
        if(this.id > o.id){
            return 1;
        }
        if(this.id < o.id ){
            return -1;
        }

        return 0;
    }

    public static void main(String[] args) {

//        System.out.println(cc.students);
        Student s1 = new Student(100,"viswa",1972662662);
        Student s2 = new Student(101,"viswana",1972662663);
        Student s3 = new Student(102,"viswanath",1972662664);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);




    }
}
