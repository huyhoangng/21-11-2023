package school;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoVien extends Person{
    private ArrayList<String> danhSachLop;
    private double salary;
    private int soMonGiangDay;
    private ArrayList<String> monGiangDay;

    // Constructors
    public GiaoVien() {
        // Constructor không tham số
    }

    public GiaoVien(String name, String gender, String dateOfBirth, String address,
                    ArrayList<String> danhSachLop, double salary, int soMonGiangDay, ArrayList<String> monGiangDay) {
        // Constructor đầy đủ tham số, gọi constructor của lớp cha
        super(name, gender, dateOfBirth, address);
        this.danhSachLop = danhSachLop;
        this.salary = salary;
        this.soMonGiangDay = soMonGiangDay;
        this.monGiangDay = monGiangDay;
    }

    // Getter và Setter cho các thuộc tính mới của lớp GiaoVien
    public ArrayList<String> getDanhSachLop() {
        return danhSachLop;
    }

    public void setDanhSachLop(ArrayList<String> danhSachLop) {
        this.danhSachLop = danhSachLop;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSoMonGiangDay() {
        return soMonGiangDay;
    }

    public void setSoMonGiangDay(int soMonGiangDay) {
        this.soMonGiangDay = soMonGiangDay;
    }

    public ArrayList<String> getMonGiangDay() {
        return monGiangDay;
    }

    public void setMonGiangDay(ArrayList<String> monGiangDay) {
        this.monGiangDay = monGiangDay;
    }

    // Ghi đè phương thức nhập thông tin
    @Override
    public void inputInfo() {
        super.inputInfo(); // Gọi phương thức nhập của lớp cha
        Scanner scanner = new Scanner(System.in);

        danhSachLop = new ArrayList<>();
        System.out.print("Nhập danh sách lớp giảng dạy (cách nhau bởi dấu phẩy): ");
        String lopInput = scanner.nextLine();
        String[] lopArray = lopInput.split(",");
        for (String lop : lopArray) {
            danhSachLop.add(lop.trim());
        }

        System.out.print("Nhập mức lương: ");
        salary = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng thừa để xử lý ký tự Enter

        System.out.print("Nhập số môn giảng dạy: ");
        soMonGiangDay = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng thừa để xử lý ký tự Enter

        monGiangDay = new ArrayList<>();
        System.out.print("Nhập các môn giảng dạy (cách nhau bởi dấu phẩy): ");
        String monInput = scanner.nextLine();
        String[] monArray = monInput.split(",");
        for (String mon : monArray) {
            monGiangDay.add(mon.trim());
        }
    }

    // Ghi đè phương thức in thông tin
    @Override
    public void printInfo() {
        super.printInfo(); // Gọi phương thức in của lớp cha
        System.out.println("Danh sách lớp giảng dạy: " + danhSachLop);
        System.out.println("Mức lương: " + salary);
        System.out.println("Số môn giảng dạy: " + soMonGiangDay);
        System.out.println("Các môn giảng dạy: " + monGiangDay);
    }
}
