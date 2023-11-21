package school;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        //*Class Person
        System.out.println("Student1");
        Person person1 = new Person();
        person1.inputInfo();
        person1.printInfo();
        Person person2 = new Person("John Smith", "Male", "01/01/1990", "567 Lasvegas");
        person2.printInfo();
        // *Class Student
        Student student1 = new Student();
        student1.inputInfo();
        student1.printInfo();
        System.out.println("Có học bổng: " + student1.hasScholarship());

        // Hoặc sử dụng constructor đầy đủ tham số
        Student student2 = new Student("AnhDuyen", "Female", "05/10/2001", "HN,VN",
                12345, 9.5, "AnhDuyen@gmail.com");
        student2.printInfo();
        System.out.println("Có học bổng: " + student2.hasScholarship());

        Student student3 = new Student("Some one", "Female", "11/12/2023", "Some Where",
                5432, 5, "SomeOne@gmail.com");
        student3.printInfo();
        System.out.println("Có học bổng: " + student3.hasScholarship());

        //*Class GiaoVien
        ArrayList<String> lopList = new ArrayList<>();
        lopList.add("A1");
        lopList.add("A2");

        ArrayList<String> monList = new ArrayList<>();
        monList.add("Toán");
        monList.add("Văn");

        GiaoVien giaoVien1 = new GiaoVien();
        giaoVien1.inputInfo();
        giaoVien1.printInfo();

        GiaoVien giaoVien2 = new GiaoVien("Mr. Smith", "Male", "03/03/1970", "Royal School St",
                lopList, 50000.0, 2, monList);
        giaoVien2.printInfo();
    }

}
