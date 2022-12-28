package session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        int x=10;
        double y=3.14;
        String s="Hello";
        System.out.println("x="+x);
        y= y+ 20 *x;
        if(y>100){
            System.out.println("y="+y);
        }else{
            System.out.println("x="+x);
        }
        for(int i=0;i<10;i++){
            System.out.println("i="+i);
        }
        //tinh sum=1+2+3+...+1000
        float sum=0;
        for(float i=1;i<=1000;i++){
            sum=i+sum;
        }
        System.out.println("sum="+sum);
        //tinh S=1+1/2+1/3+...+1/1000
        float S=0;
        for(float i=1;i<=1000;i++){
            S= 1/i + S;
        }
        System.out.println("S="+S);
        int z= tinhTong(10,15);
        System.out.println("z="+z);
        int u=tinhHieu(10,5);
        System.out.println("u="+u);
        int m=tinhTich(10,5);
        System.out.println("m="+m);
        int th=tinhThuong(10,5);
        System.out.println("t="+th);
        boolean t=true;
        //nhap 1 gia tri tu ban phim
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        System.out.println("Nhap 1 so thuc:");
//        double d=sc.nextDouble();
//        sc.nextLine();
//        System.out.println("Nhap 1 string:");
//        String str=sc.nextLine();
//        System.out.println("n:"+n);
//        System.out.println("d:"+d);
//        System.out.println("str:"+str);
        //Nhap 1 so nguyen n tu ban phim,
        // tinh tong S=1+2+3+..+n
        System.out.println("Nhap n");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int tong=0;
        for(int i=1;i<=n;i++) {
            tong = tong + i;
        }
        System.out.println("Tong ="+tong);
        //kiem tra n co phai so nguyen to hay khong
        System.out.println("Nhap h:");
        int h=sc.nextInt();
        int p=0;
        for(int j=1;h>=j;j++){
            if(h%j==0){
                p=p+1;
            }}if(p==2){
                System.out.println("So nguyen to la "+h);
            }
            else {
                System.out.println("So nguyen to khong phai la "+h);
            }
        }
    static int tinhTong(int a,int b){
        return a+b;
    }
    static int tinhHieu(int a,int b){
        return a-b;
    }
    static int tinhThuong(int a,int b){
        return b==0?null: a/b;
    }
    static int tinhTich(int a,int b){
        return a*b;
    }
}
