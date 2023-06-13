public class Student_ {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("sinh viên 1");
        System.out.println(student);
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        Student student1 = new Student();
        student1.setName("Tuấn");
        student1.setClasses("C03");
        System.out.println(student1);
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
    }
}
