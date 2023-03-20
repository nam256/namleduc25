package lab6c2;

public class HocSinh {
    
    public String hoTen;
    public int lop;
    public float toan = 9, li = 10, hoa = 7;

    public HocSinh() {
    }
    
    public HocSinh(String hoTen, int lop, float toan, float li, float hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLi() {
        return li;
    }

    public void setLi(float li) {
        this.li = li;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }
    
    public double diemTrungBinh() {
       return (toan + li + hoa)/3;
    }
}
