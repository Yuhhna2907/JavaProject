import java.util.Scanner;

public class FullPrintTriangle {
    public static void main(String[] args) {
        int choice=-1;
        Scanner input = new Scanner(System.in);
        while (choice!=0) {
            System.out.println("Main Menu:");
            System.out.println("1. Draw the right triangle");
            System.out.println("2. Draw the isosceles triangle");
            System.out.println("3. Draw the isosceles right triangle");
            System.out.println("4. Draw the equilateral triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập chiều cao tam giác (n): ");
                int n = sc.nextInt();

                System.out.println("\n Góc vuông DƯỚI TRÁI:");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println("\n Góc vuông DƯỚI PHẢI:");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println("\n Góc vuông TRÊN TRÁI:");
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println("\n Góc vuông TRÊN PHẢI:");
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }
            if (choice == 2) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập chiều cao tam giác (n): ");
                int n = sc.nextInt();

                System.out.println("\n Tam giác cân (đỉnh ở TRÊN):");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }

                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println("\n Tam giác cân (đỉnh ở DƯỚI):");
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            if (choice == 3) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập cạnh tam giác vuông cân (n): ");
                int n = sc.nextInt();

                System.out.println("\n Góc vuông DƯỚI TRÁI:");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println("\n Góc vuông DƯỚI PHẢI:");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println("Góc vuông TRÊN TRÁI:");
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println("\n Góc vuông TRÊN PHẢI:");
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            if (choice == 4) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập chiều cao tam giác (n): ");
                int n = sc.nextInt();

                System.out.println("\n Tam giác đều ĐẶC (đỉnh ở TRÊN):");
                for (int i = 1; i <= n; i++) {
                    // in khoảng trắng bên trái
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    // in dấu *
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println("\n Tam giác đều ĐẶC (đỉnh ở DƯỚI):");
                for (int i = n; i >= 1; i--) {
                    // in khoảng trắng bên trái
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    // in dấu *
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}