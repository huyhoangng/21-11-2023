package school;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;


    public Person() {

    }

    public Person(String name, String gender, String dateOfBirth, String address) {

        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin:");
        System.out.print("Tên: ");
        setName(scanner.nextLine());

        System.out.print("Giới tính: ");
        setGender(scanner.nextLine());

        System.out.print("Ngày sinh: ");
        setDateOfBirth(scanner.nextLine());

        System.out.print("Địa chỉ: ");
        setAddress(scanner.nextLine());
    }
    public void printInfo() {
        System.out.println("Thông tin Person:");
        System.out.println("Tên: " + getName());
        System.out.println("Giới tính: " + getGender());
        System.out.println("Ngày sinh: " + getDateOfBirth());
        System.out.println("Địa chỉ: " + getAddress());
    }

}
