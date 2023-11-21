package school;

import java.util.Scanner;

public class Student extends Person{
    private int studentID;
    private double Score;
    private String email;
    public Student() {

    }
    public Student(String name, String gender, String date, String address,
                   int studentID, double Score, String email) {

        super(name, gender, date, address);
        this.studentID = studentID;
        this.Score = Score;
        this.email = email;
    }
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentCode) {
        this.studentID = studentID;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double examScore) {
        this.Score = Score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Ghi đè phương thức nhập thông tin
    @Override
    public void inputInfo() {
        super.inputInfo(); // Gọi phương thức nhập của lớp cha
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mã sinh viên: ");
        setStudentID(scanner.nextLine());

        System.out.print("Điểm thi: ");
        setScore(scanner.nextDouble());
        scanner.nextLine(); // Đọc dòng thừa để xử lý ký tự Enter

        System.out.print("Email: ");
        setEmail(scanner.nextLine());
    }

    // Ghi đè phương thức in thông tin
    @Override
    public void printInfo() {
        super.printInfo(); // Gọi phương thức in của lớp cha
        System.out.println("Mã sinh viên: " + getStudentID());
        System.out.println("Điểm thi: " + getScore());
        System.out.println("Email: " + getEmail());
    }

    // Phương thức kiểm tra học bổng
    public boolean hasScholarship() {
        return getScore() > 8.0;
    }
}
