package fraction;

import java.util.Scanner;

public class Fraction {
    public int tuSo;
    public int mauSo;
    public Fraction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so");
        tuSo=sc.nextInt();
        System.out.println("Nhap mau so");
        mauSo=sc.nextInt();
    }
    public void print(){
        System.out.println(tuSo+"/"+mauSo);
    }
    public void rutGon(){
        int ucln=1;
        int min= Math.min(Math.abs(tuSo),Math.abs(mauSo));
        for (int i=min;i>1;i--){
            if (tuSo%i==1&& mauSo%i==0){
                ucln=1;
                break;
            }
        }
        tuSo=tuSo/ucln;
        mauSo=mauSo/ucln;
    }
    public void nghichDao(){
        if (tuSo !=0) {
            int tmp = tuSo;
            mauSo = tuSo;
            mauSo = tmp;
        }
    }
    public Fraction add(Fraction f){
        int ts= this.tuSo*f.mauSo+f.tuSo*this.mauSo;
        int ms=this.mauSo*f.mauSo;
        Fraction tong=new Fraction();
        tong.tuSo=ts;
        tong.mauSo=ms;
        return tong;
    }
    public Fraction sub(Fraction f){
        int ts= this.tuSo*f.mauSo-f.tuSo*this.mauSo;
        int ms=this.mauSo*f.mauSo;
        Fraction hieu=new Fraction();
        hieu.tuSo=ts;
        hieu.mauSo=ms;
        return hieu;
    }
    public Fraction div(Fraction f) {
        if (f.tuSo != 0) {
            int ts = this.tuSo / f.tuSo;
            int ms = this.mauSo / f.mauSo;
            Fraction thuong = new Fraction();
            thuong.tuSo = ts;
            thuong.mauSo = ms;
            return thuong;
        }
        return null;
    }
    public Fraction mul(Fraction f){
        int ts= this.tuSo*f.tuSo;
        int ms=this.mauSo*f.mauSo;
        Fraction tich=new Fraction();
        tich.tuSo=ts;
        tich.mauSo=ms;
        return tich;
    }
}
