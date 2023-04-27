public class Vehicle {
    private int maXe,dungTich;
    private double triGia;
    private String chuXe;
 private Double thuephainop;
    public Vehicle(int maXe, int dungTich, double triGia, String chuXe, String moTa) {
        this.maXe = maXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.chuXe = chuXe;
        this.thuephainop = thuephainop;
    }
    public Vehicle(){
 
    }
    public int getMaXe() {
        return maXe;
    }
 
    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }
 
    public int getDungTich() {
        return dungTich;
    }
 
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
 
    public double getTriGia() {
        return triGia;
    }
 
    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
 
    public String getChuXe() {
        return chuXe;
    }
 
    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }
 
    public Double getMoTa() {
        return moTa;
    }
 
    public void setMoTa(Double moTa) {
        this.moTa = moTa;
    }
 
    public double tinhThue(){
        double thue;
        if(dungTich<100) thue=triGia*0.01;
        else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
        else thue = triGia * 0.05;
        return thue;
    }
 
    
    public String toString() {
        return maXe + "-"+chuXe + "-"+dungTich + "-"+triGia + "-"+moTa;
}
 
    void inThue(){
        System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f \n ",maXe,chuXe,dungTich,triGia,moTa,tinhThue());
    }
}
import java.util.Scanner;
public class Test {
    static Scanner sc = new Scanner(System.in);

      static void nhapXe(Vehicle xe){
            System.out.print("Nhập mã xe: ");
            xe.setMaXe(sc.nextInt());sc.nextLine();
            System.out.print("Nhập tên chủ xe: ");
            xe.setChuXe(sc.nextLine());
            System.out.print("Nhập dung tích xe: ");
            xe.setDungTich(sc.nextInt());
            System.out.print("Nhập trị giá xe: ");
            xe.setTriGia(sc.nextDouble());;sc.nextLine();
            System.out.print("thue phai nop");
            xe.setMoTa(sc.nextDouble());
        }
 public static void main(String[] args) {
        Vehicle v[]= null;
        int a,n=0;
        boolean flag = true;
        
        do{
            System.out.println("Bạn chọn làm gì!!!");
            System.out.println("1.Tạo các đối tượng xe và nhập thông tin \n"+
                    "2.Xuất bảng kê khai tiền thuế của các xe.\n"+
                    "Nhập số khác để thoát");
            a =sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
                    n=sc.nextInt();
                    
                    v= new Vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thứ " + (i+1));
                        v[i] = new Vehicle();
                        nhapXe(v[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%5s %5s %5s %10s %10s %8s 
                    for (int i = 0; i < n; i++) {
                        v[i].inThue();
                    }
                    break;
                default:
                    System.out.println("bye");
                    flag=false;
                    break;
            }
        }while (flag);
    }
}