package lab6c2;

public class HocSinhChuyenToan extends HocSinh {
    
    @Override
    public double diemTrungBinh() {
       return (toan * 2 + li + hoa)/4;
    }
}
