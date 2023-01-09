package session4;

import hocsinh.HocSinh;
import session3.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        HocSinh[] hs = new HocSinh[10];
        ArrayList<HocSinh> ls = new ArrayList<>();
        ls.add(new HocSinh("Trung", "25/12/2005", "8 Ton that thuyet", "T2207A", 8.5));
        ls.add(new HocSinh("Hieu", "23/02/2004", "8 Ton that thuyet", "T2207A", 4));
        //in thong tin sinh vien 1
        ls.get(1).inThongTin();
        ArrayList<String> strs = new ArrayList<>();
//        ArrayList<Integer>
        //Tao 1 lop Car gồm: brand,name,price
        //Tạo 1 ArrayList Car,sau đó sắp xếp theo giá tăng dần
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("HONDA","Morning",12000));
        cars.add(new Car("BMW","Morning",8000));
        cars.add(new Car("MayBach","Morning",7000));
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice()-o2.getPrice()>0?0:-1;
            }
        });
        for (int i=0;i<cars.size();i++){
            System.out.println(cars.get(i).getName());
            System.out.println(cars.get(i).getBrand());
            System.out.println(cars.get(i).getPrice());
        }
    }
}
