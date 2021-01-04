package view;

import business.qlkhachhang;
import business.qlnhanvien;
import business.qlsanpham;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static Scanner sc=new Scanner(System.in);

    public static void Docallfile()
    {
        qlsanpham.Docfile();
        qlkhachhang.Docfile();
        qlnhanvien.Docfile();

    }
    public static void Ghiallfile() throws IOException
    {
        qlsanpham.Luufile();
        qlkhachhang.Luufile();
        qlnhanvien.Luufile();

    }
    public static int Menu()
    {
        System.out.println(" ----------------------------------------------");
        System.out.println("|         1. Quản lý sản phẩm                  |");
        System.out.println("|         2. Quản lý khách hàng                |");
        System.out.println("|         3. Quản lý nhân viên                 |");
        System.out.println("|         4. Thoát                             |");
        System.out.println(" ----------------------------------------------");
        int n;
        do {
            n=Integer.parseInt(sc.nextLine());
        }while (n<1||n>5);
        return n;
    }

    public static int Menu1()
    {
        System.out.println(" ----------------------------------------------");
        System.out.println("|            1. Thêm sản phẩm                      |");
        System.out.println("|            2. Hiện sản phẩm                      |");
        System.out.println("|            3. Tìm kiếm sản phẩm                  |");
        System.out.println("|            4. Xóa sản phẩm                       |");
        System.out.println("|            5. Quay lại                       |");
        System.out.println(" ----------------------------------------------");
        int n;
        do {
            System.out.print("Vui lòng chọn (1-5) : ");
            n=Integer.parseInt(sc.nextLine());
        }while (n<1||n>5);
        return n;
    }
    public static int Menu2()
    {
        System.out.println(" ----------------------------------------------");
        System.out.println("|            1. Thêm khách hàng                |");
        System.out.println("|            2. Hiện thông tin khách hàng      |");
        System.out.println("|            3. Sửa thông tin khách hàng       |");
        System.out.println("|            4. Tìm khách hàng                 |");
        System.out.println("|            5. Xóa thông tin khách hàng       |");
        System.out.println("|            6. Quay lại                       |");
        System.out.println(" ----------------------------------------------");
        int n;
        do {
            n=Integer.parseInt(sc.nextLine());
        }while (n<1||n>6);
        return n;
    }
    public static int Menu3()
    {
        System.out.println(" ----------------------------------------------");
        System.out.println("|            1. Thêm nhân viên                 |");
        System.out.println("|            2. Hiện nhân viên                 |");
        System.out.println("|            3. Tìm nhân viên                  |");
        System.out.println("|            4. Xóa nhân viên                  |");
        System.out.println("|            5. Quay lại                       |");
        System.out.println(" ----------------------------------------------");
        int n;
        do {

            n=Integer.parseInt(sc.nextLine());
        }while (n<1||n>5);
        return n;
    }

    public static void Run() throws IOException {
        int chon;
        do {
            chon=Menu();
            switch (chon)
            {
                case 1:
                    do {
                        chon=Menu1();
                        switch (chon)
                        {
                            case 1:
                                qlsanpham.Them();

                                break;
                            case 2:
                                qlsanpham.HienAll();
                                System.out.println("Nhấn enter để tiếp tục");
                                sc.nextLine();

                                break;
                            case 3:
                                System.out.println("Nhập mã sản phẩm: ");
                                String ten=sc.nextLine();
                                qlsanpham.Tim(ten);

                                sc.nextLine();
                                break;
                            case 4:
                                System.out.println("Nhập mã sản phẩm: ");
                                String ma=sc.nextLine();
                                qlsanpham.Xoa(ma);
                                System.out.println("Nhấn enter để tiếp tục");
                                sc.nextLine();

                                break;
                        }
                    }while (chon>=1&&chon<=4);
                    break;
                case 2:
                    do {
                        chon=Menu2();
                        switch (chon)
                        {
                            case 1:
                                qlkhachhang.Them();
                                break;
                            case 2:
                                qlkhachhang.HienAll();
                                System.out.println("Nhấn enter để tiếp tục");
                                sc.nextLine();

                                break;
                            case 3:
                                System.out.println("Nhập tên hoặc mã khách hàng: ");
                                String mas=sc.nextLine();
                                qlkhachhang.Sua(mas);

                                break;
                            case 4:
                                System.out.println("Nhập tên hoặc mã khách hàng: ");
                                String tens=sc.nextLine();
                                qlkhachhang.Tim(tens);
                                System.out.println("Nhấn enter để tiếp tục");
                                sc.nextLine();

                                break;
                            case 5:
                                System.out.println("Nhập tên hoặc mã khách hàng: ");
                                String ma=sc.nextLine();
                                qlkhachhang.Xoa(ma);
                                System.out.println("Nhấn enter để tiếp tục");
                                sc.nextLine();

                                break;
                        }
                    }while (chon>=1&&chon<=5);
                    break;
                case 3:
                    do {
                        chon=Menu3();
                        switch (chon)
                        {
                            case 1:
                                qlnhanvien.Them();
                                break;
                            case 2:
                                qlnhanvien.HienAll();
                                System.out.println("Nhấn enter để tiếp tục");
                                sc.nextLine();

                                break;
                            case 3:
                                System.out.println("Nhập mã nhân viên: ");
                                String ten=sc.nextLine();
                                qlnhanvien.Tim(ten);
                                System.out.println("Nhấn enter để tiếp tục");
                                sc.nextLine();

                                break;
                            case 4:
                                System.out.println("Nhập mã nhân viên: ");
                                String ma=sc.nextLine();
                                qlnhanvien.Xoa(ma);
                                System.out.println("Nhấn enter để tiếp tục");
                                sc.nextLine();

                                break;
                        }
                    }while (chon>=1&&chon<=3);
                    break;

            }
        }while (true);
    }
    public static void main(String[] args) throws IOException {
        Docallfile();
        Ghiallfile();
        Run();
    }
}



