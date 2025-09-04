public class Student {
    int id;
    String name;
    long mobile;
    public Student(int id, String name, long mobile){
        this.id=id;
        this.name=name;
        this.mobile=mobile;

    }

//    public int getId() {
//        return id;
//    }
//
//    public long getMobile() {
//        return mobile;
//    }
//
//    public String getName() {
//        return name;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + id + '\'' +
                ", model='" + name + '\'' +
                ", year=" + mobile +
                '}';
    }

}
