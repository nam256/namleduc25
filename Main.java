package lab6c2;

public class Main {
    
    public static void main(String[] args) {
        HocSinh hs = new HocSinh();
        System.out.println("Diem trung binh toan li hoa cua hoc sinh: " + hs.diemTrungBinh());
        HocSinh hsct = new HocSinhChuyenToan();
        System.out.println("Diem trung binh toan li hoa cua hoc sinh chuyen toan: " +  hsct.diemTrungBinh());
    }
}
