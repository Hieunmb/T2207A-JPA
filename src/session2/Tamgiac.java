package session2;

import java.util.Scanner;

public class Tamgiac {
    int a;
    int b;
    int c;
    public Tamgiac(){
        do{
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap do dai a:");
        a= sc.nextInt();
        System.out.println("Nhap do dai b:");
        b=sc.nextInt();
        System.out.println("Nhap do dai c:");
        c=sc.nextInt();}while(!KiemTra());
    }
    public int TinhChuVi(int a,int b,int c){
        return a+b+c;
    }
    public float TinhDienTich(int a,int b,int c){
        int d=(a+b+c)/2;
        float e;
        e=(float)Math.sqrt(d*(d-a)*(d-b)*(d-c));
        return e;
    }
    public boolean KiemTra(){
        return a+b>c && b+c>a && a+c>b;
    }
}
