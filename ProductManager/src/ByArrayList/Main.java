package ByArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ByArrayList manager = new ByArrayList();

        while (true) {
            System.out.println("\n===== QUẢN LÝ SẢN PHẨM (ArrayList) =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo ID");
            System.out.println("3. Xoá sản phẩm theo ID");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = sc.nextDouble();

                    manager.addProduct(new Product(id, name, price));
                    break;

                case 2:
                    System.out.print("Nhập ID sản phẩm cần sửa: ");
                    int editId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tên mới: ");
                    String newName = sc.nextLine();
                    System.out.print("Giá mới: ");
                    double newPrice = sc.nextDouble();

                    if (manager.updateProduct(editId, newName, newPrice)) {
                        System.out.println("Cập nhật thành công!");
                    } else {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                    break;

                case 3:
                    System.out.print("Nhập ID sản phẩm cần xoá: ");
                    int deleteId = sc.nextInt();
                    if (manager.removeProduct(deleteId)) {
                        System.out.println("Đã xoá sản phẩm!");
                    } else {
                        System.out.println("Không tìm thấy sản phẩm!");
                    }
                    break;

                case 4:
                    System.out.println("\nDanh sách sản phẩm:");
                    break;

                case 5:
                    System.out.print("Nhập tên cần tìm: ");
                    String searchName = sc.nextLine();
                    Product found = manager.findByName(searchName);
                    if (found != null) {
                        System.out.println("Tìm thấy: " + found);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm nào!");
                    }
                    break;

                case 6:
                    manager.sortAscending();
                    System.out.println("Đã sắp xếp tăng dần theo giá.");
                    break;

                case 7:
                    manager.sortDescending();
                    System.out.println("Đã sắp xếp giảm dần theo giá.");
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
