package hocsinh;

import session2.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        HocSinh[] hs = new HocSinh[10];
        ArrayList<HocSinh> hs=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhap ten");
            String ten = sc.nextLine();
            System.out.println("Nhap ngay sinh");
            String ns = sc.nextLine();
            System.out.println("Dia chi");
            String dc = sc.nextLine();
            System.out.println("Lop");
            String lh = sc.nextLine();
            System.out.println("Diem trung binh");
            double tb = sc.nextDouble();
            hs.add(new HocSinh(ten, ns, dc, lh, tb));
        }
//        HocSinh temp;
//        for (int i=0;i< hs.length-1;i++){
//            for (int j=0;j< hs.length;i++){
//                if(hs[j].getDiemTB()<hs[j+1].getDiemTB()) {
//                    temp = hs[j];
//                    hs[j] = hs[j + 1];
//                    hs[j + 1] = temp;
//                }
//            }
//        }
//        for (int i=0;i< hs.length;i++){
//            hs[i].inThongTin();
//        }
//        for (int i=0;i< hs.length;i++){
//            hs[i].hocSinhGioi();
//        }
//
        Collections.sort(hs, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                return o2.getDiemTB()-o1.getDiemTB()>0?0:01;
            }
        });
    }
}
