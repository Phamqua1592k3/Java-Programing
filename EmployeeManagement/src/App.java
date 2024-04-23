import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.*; để import tất cả các thư viện (nặng)

public class App {
    public static void Add(ArrayList<Employee> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten: ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap code: ");
        String code = sc.nextLine();
        System.out.print("Nhap bo phan: ");
        String department = sc.nextLine();
        System.out.print("Nhap he so luong: ");
        double salaryRate = sc.nextDouble();
        sc.nextLine();
        arr.add(new Employee(id, name, age, department, code, salaryRate));
    }

    public static void Delete(ArrayList<Employee> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten nguoi dung muon xoa: ");
        String str = sc.nextLine();
        if (arr.removeIf(employee -> (employee.getName().equalsIgnoreCase(str)))) {
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Xoa that bai");
        }
        ;
    }

    public static void Display(ArrayList<Employee> arr) {
        for (Employee employee : arr) {
            employee.displayInfo();
        }
    }

    public static void displayMenu(ArrayList<Employee> arr) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("+-----------------------------+");
        System.out.println("| EMPLOYEES MANAGEMENT SYSTEM |");
        System.out.println("+-----------------------------+");
        System.out.println("| 1. Add new employee         |");
        System.out.println("| 2. Delete employee          |");
        System.out.println("| 3. Display employee         |");
        System.out.println("| 4. Exit                     |");
        System.out.println("+-----------------------------+");
        System.out.print("Enter your choice: ");
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Add(arr);
                    System.out.print("Enter your choice: ");
                    break;
                case 2:
                    Delete(arr);
                    System.out.print("Enter your choice: ");
                    break;
                case 3:
                    Display(arr);
                    System.out.print("Enter your choice: ");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Enter your choice: ");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(1, "Pham Quynh Anh", 20, "IT", "01", 1000));
        employees.add(new Employee(2, "Pham Quynh Chi", 20, "IT", "01", 1000));
        employees.add(new Employee(3, "Pham Van Anh", 20, "IT", "01", 1000));
        employees.add(new Employee(4, "Nguyen Quynh Anh", 20, "IT", "01", 1000));
        employees.add(new Employee(5, "Pham Quynh Anh", 20, "IT", "01", 1000));
        employees.add(new Employee(6, "Pham Quynh Anh", 20, "IT", "01", 1000));
        employees.add(new Employee(7, "Pham Quynh Anh", 20, "IT", "01", 1000));
        employees.add(new Employee(8, "Pham Yen Anh", 20, "IT", "01", 1000));
        employees.add(new Employee(9, "Pham  Anh", 20, "IT", "01", 1000));
        employees.add(new Employee(10, "Quynh Anh", 20, "IT", "01", 1000));

        
        displayMenu(employees);
        
    }

}
