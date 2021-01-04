package business;

import data.khachhang;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class qlkhachhang {
    public static ArrayList<khachhang> khachhangs=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Them()
    {

        System.out.println(" ---------------------------------------------------------------");
        System.out.println("|               Nhập thông tin khách hàng                       |");
        System.out.println(" ---------------------------------------------------------------");
        System.out.print("|           Nhập mã khách hàng: ");
        String Makh=sc.nextLine();
        System.out.print("|           Nhập tên khách hàng: ");
        String Tenkh=sc.nextLine();
        System.out.print("|           Nhập giới tính: ");
        String Gioitinh=sc.nextLine();
        System.out.print("|           Nhập cấp độ: ");
        String Capdo=(sc.nextLine());
        System.out.print("|           Nhập số điện thoại: ");
        String Sdt=sc.nextLine();
        System.out.println(" ---------------------------------------------------------------");
        khachhang kh=new khachhang(Makh,Tenkh,Gioitinh,Capdo,Sdt);
        khachhangs.add(kh);
    }
    public static void Hien1kh(khachhang kh)
    {
        System.out.printf("%25s|%20s|%15s|%10s|%20s\n",kh.getMakh(),kh.getTenkh(),kh.getGioitinh(),kh.getCapdo(),kh.getSdt());
    }
    public static void HienAll()
    {
        System.out.printf("%25s|%20s|%15s|%10s|%20s\n","Ma khach hang","Ten khach hang","Gioi tinh","Cap do","So dien thoai");
        for (khachhang kh:
                khachhangs) {
            Hien1kh(kh);
        }
    }
    public static void Sua(String ma)
    {
        for (khachhang kh:
                khachhangs) {
            if(ma.equalsIgnoreCase(kh.getMakh())||ma.indexOf(kh.getTenkh())>=0)
            {
                System.out.print("Sửa mã khách hàng: ");
                kh.setMakh(sc.nextLine());
                System.out.print("Sửa tên khách hàng: ");
                kh.setTenkh(sc.nextLine());
                System.out.print("Sửa giới tính khách hàng: ");
                kh.setGioitinh(sc.nextLine());
                System.out.print("Sửa cấp độ khách hàng: ");
                kh.setCapdo((sc.nextLine()));
                System.out.print("Sửa số điện thoại khách hàng: ");
                kh.setSdt(sc.nextLine());
            }
        }
    }
    public static void Xoa(String ma)
    {
        for (int i=0;i<khachhangs.size();i++)
        {
            if(ma.equalsIgnoreCase(khachhangs.get(i).getMakh()))
            {
                khachhangs.remove(i);
                System.out.println("Xóa thành công");
            }
        }
    }
    public static void Tim(String ten)
    {
        for (khachhang kh:
                khachhangs) {
            if(kh.getMakh().equalsIgnoreCase(ten)||kh.getTenkh().indexOf(ten)>=0)
            {
                Hien1kh(kh);
            }
        }
    }

    public static void Docfile()
    {
        try {
            File file = new File("Khachhang.txt");
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                //makh+"#"+tenkh+"#"+gioitinh+"#"+capdo+"#"+sdt;
                String Makh= line.split("#")[0];
                String Tenkh=line.split("#")[1];
                String Gioitinh=line.split("#")[2];
                String Capdo=(line.split("#")[3]);
                String Sdt=line.split("#")[4];
                khachhang kh=new khachhang(Makh,Tenkh,Gioitinh,Capdo,Sdt);
                khachhangs.add(kh);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void Luufile() throws IOException {
        File file = new File("Khachhang.txt");
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        for(khachhang kh:khachhangs)
        {
            fileOutputStream.write(kh.toString().getBytes());
            fileOutputStream.write("\n".getBytes());
        }
        fileOutputStream.close();
    }

}


