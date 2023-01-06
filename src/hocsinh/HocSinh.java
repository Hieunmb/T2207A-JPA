package hocsinh;

public class HocSinh {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String tenLopHoc;
    private int diemTB;

    public HocSinh(String hoTen, String ngaySinh, String diaChi, String tenLopHoc, int diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.tenLopHoc = tenLopHoc;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public int getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(int diemTB) {
        this.diemTB = diemTB;
    }
    public void baoCaoKetQua(){
        if(diemTB<5){
            System.out.println("Hoc sinh yeu");
        }else{
            if (diemTB<6.5){
                System.out.println("Hoc sinh trung binh");
            }
            else {
                if (diemTB<8){
                    System.out.println("Hoc sinh kha");
                }
                else {
                    System.out.println("Hoc sinh xuat sac");
                }
            }
        }
    }
    public void hocSinhGioi(){
        if(diemTB>=8){
        System.out.println(getHoTen());
    }
    }public void hocSinhKem(){
        if(diemTB<5){
        System.out.println(getHoTen());
    }
    }

    }

