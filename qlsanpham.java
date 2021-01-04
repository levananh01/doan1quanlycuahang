package business;
import data.sanpham;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class qlsanpham {
    public static ArrayList<sanpham> sanphams=new ArrayList();
    public static Scanner sc=new Scanner(System.in);
    public static void Them()
    {
        System.out.println(" ---------------------------------------------------------------");
        System.out.println("|                    Nhập thông tin sản phẩm                    |");
        System.out.println(" ---------------------------------------------------------------");
        System.out.print("|              Nhập mã sản phẩm: ");
        String Masp=sc.nextLine();
        System.out.print("|              Nhập tên sản phẩm: ");
        String Tensp=sc.nextLine();
        System.out.print("|              Nhập số lượng: ");
        int Soluong=Integer.parseInt(sc.nextLine());
        System.out.print("|              Nhập giá nhập: ");
        double Gianhap=Double.parseDouble(sc.nextLine());
        System.out.print("|              Nhập giá bán: ");
        double Giaban=Double.parseDouble(sc.nextLine());
        System.out.print("|              Nhập size : ");
        String Size=sc.nextLine();
        System.out.print("|              Ngày nhập sản phẩm: ");
        String ngaynhap=sc.nextLine();
        System.out.println(" ---------------------------------------------------------------");
        sanpham sp=new sanpham(Masp,Tensp,Soluong,Gianhap,Giaban,Size,ngaynhap);
        sanphams.add(sp);
    }
    public static void Hien1giay(sanpham sanpham)
    {
        System.out.printf("%20s|%20s|%15s|%15s|%15s|%10s|%10s\n",sanpham.getMasp(),sanpham.getTensp(),sanpham.getSoluong(),sanpham.getGiaban(),sanpham.getGianhap(),
                sanpham.getSize(),sanpham.getNgaynhap());
    }
    public static void HienAll()
    {
        System.out.printf("%20s|%20s|%15s|%15s|%15s|%10s|%10s\n","Ma san pham","Ten san pham","So luong","Gia ban","Gia nhap","Size","Ngay nhap");
        for (sanpham sp:
                sanphams) {
            Hien1giay(sp);
        }
    }
    public static void Tim(String ma)
    {

        for (sanpham sp:
                sanphams) {

            if(ma.toUpperCase().indexOf(sp.getTensp().toUpperCase())>=0||ma.equalsIgnoreCase(sp.getMasp()))
                Hien1giay(sp);
        }
    }
    public static void Xoa(String ma) throws IOException {
        boolean kt = true;
        for (int i = 0; i < sanphams.size(); i++) {

            if(ma.equalsIgnoreCase(sanphams.get(i).getMasp()))
            {
                sanphams.remove(i);
                System.out.println("Xóa thành công");
                kt=false;
                Luufile();
            }
            else System.out.println("Không tìm thấy");
        }
    }


    public static void Docfile()
    {
        try {
            File file = new File("sanpham.txt");

            FileReader fileReader = new FileReader(file);
            BufferedReader br= new BufferedReader(fileReader);
            String line;
            while ((line=br.readLine())!=null)
            {

                String Masp= line.split("#")[0];
                String Tensp=line.split("#")[1];
                int Soluong=Integer.parseInt(line.split("#")[2]);
                double Gianhap =Double.parseDouble(line.split("#")[3]);
                double Giaban=Double.parseDouble(line.split("#")[4]);
                String Size=line.split("#")[5];
                String ngaynhap=line.split("#")[6];
                sanpham sp=new sanpham(Masp,Tensp,Soluong,Gianhap,Giaban,Size,ngaynhap);
                sanphams.add(sp);
            }
            br.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void Luufile() throws IOException {
        File file = new File("sanpham.txt");
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        for(sanpham sp: sanphams)
        {

            fileOutputStream.write(sp.toString().getBytes());
            fileOutputStream.write("\n".getBytes());
        }
        OutputStream outputStream = new FileOutputStream(file, true);
        fileOutputStream.close();
    }
}
