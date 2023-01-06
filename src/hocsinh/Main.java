package hocsinh;

import session2.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HocSinh> sts = new ArrayList<>();
        sts.add(new HocSinh("Hieu", "23/02", "ha noi", "t2207a", 9));
        sts.add(new HocSinh("Hieu1", "23/02", "ha noi", "t2208a", 8));
        sts.add(new HocSinh("Hieu2", "23/02", "ha noi", "t2209a", 7));
        sts.add(new HocSinh("Hieu3", "23/02", "ha noi", "t2201a", 6));
        sts.add(new HocSinh("Hieu4", "23/02", "ha noi", "t2202a", 5));
        sts.add(new HocSinh("Hieu5", "23/02", "ha noi", "t2203a", 4));
        sts.add(new HocSinh("Hieu6", "23/02", "ha noi", "t2204a", 3));
        sts.add(new HocSinh("Hieu7", "23/02", "ha noi", "t2205a", 2));
        sts.add(new HocSinh("Hieu8", "23/02", "ha noi", "t2206a", 1));
        sts.add(new HocSinh("Hieu9", "23/02", "ha noi", "t2301a", 0));
        for (int i = 0; i < sts.size(); i++) {
            System.out.println(sts.get(i).getHoTen());
            sts.get(i).baoCaoKetQua();
        }
        System.out.println("Danh sach hoc sinh gioi");
        for (int i = 0; i < sts.size(); i++) {
            sts.get(i).hocSinhGioi();
        }
        System.out.println("Danh sach hoc sinh diem thap");
        for (int i = 0; i < sts.size(); i++) {
            sts.get(i).hocSinhKem();
        }
        System.out.println("Sap xep diem trung binh");
        int [] arr = new int [args.length];
        int temp= arr[0];
        for (int i = 0; i < args.length-1; i++) {
            for (int j = 1; j < args.length; j++) {
                if (sts.get(i).getDiemTB() < sts.get(j).getDiemTB()) {

                }
            }
        }
    }
}
