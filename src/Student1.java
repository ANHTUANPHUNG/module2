public class Student1 {
    static int x=10;
    public static void main(String[] args) {
        Student2.change(); //calling change method

        //creating objects
        Student2 s1 = new Student2(111, "Hoang");
        Student2 s2 = new Student2(222, "Khanh");
        Student2 s3 = new Student2(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
        System.out.println(Student2.loichao);
    }
}
