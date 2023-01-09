package phonenumber;

public class PhoneNumber {
    String ten;
    String sdt;

    public PhoneNumber(String ten, String sdt) {
        this.ten = ten;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
