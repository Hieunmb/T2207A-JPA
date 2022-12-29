package session1;

import java.util.Scanner;

public class Buoi2 {
    public static void main(String[] args) {
        System.out.println("kiem tra so co hoan hao khong");
        int S = 0;
        System.out.println("Nhap n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do {
            if (n <= 0) {
                System.out.println(" n phai > 0. Xin nhap lai !");
            }
        } while (n <= 0);

        for (int i = 1; i <= n - 1; i++) {
            if (n % i == 0) {
                S += i;
            }
        }
        if (S == n) {
            System.out.println("So hoan hao la " + n);
        } else {
            System.out.println("So khong hoan hao la " + n);
        }
        System.out.println("Tim ket qua day fibonaci");
        System.out.println("Nhap k=");
        int k = sc.nextInt();
        int h, p, m;
        h = p = m = 1;
        for (int i = 3; i <= k; i++) {
            h = m + p;
            m = p;
            p = h;
        }
        System.out.println("Ket qua cua day fibonaci la" + h);
        System.out.println("Tim UCLN");
            System.out.println("Nhap a = ");
            int a = sc.nextInt();
            System.out.println("Nhap b= ");
            int b = sc.nextInt();
        while(a!=b){
            if(a>b){
                a-=b;
            }
            else{
                b-=a;
            }
        }
        System.out.println("tim boi chung lon nhat");
        System.out.println("Nhap c = ");
        int c = sc.nextInt();
        System.out.println("Nhap d= ");
        int d = sc.nextInt();
        while (a<=0|| b<=0);
        int  x=c;
        int  y=d;
        int z=x*y/a;
            System.out.println("Uoc chung lon nhat la" + a);
            System.out.println("Boi chung nho nhat la" + z);
        }
    }