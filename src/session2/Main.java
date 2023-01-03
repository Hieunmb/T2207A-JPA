package session2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int x=10;
        x++;
        //age++;
        Student s1= new Student();
        //s1.age++;
        //s1.eat();
        Student s2= new Student();
        //s2.eat();
        Student s3=new Student();
        System.out.println("S1:"+s1.name);
        System.out.println("S2:"+s2.name);
        System.out.println("S3:"+s3.name);
        //s3.playgame();
        //s3.quetnha();
        //s3.ruabat();
        int[] arrNums=new int[10];//mang 10 so nguyen
        arrNums[0]=12;
        arrNums[1]=9;
        for(int i=0;i<10;i++){
            arrNums[i]=i;
        }
//        arrNums[10]=18;
//        arrNums[10]++;
//        System.out.println(arrNums[10]);
        ArrayList<String> strs=new ArrayList<>();
        strs.add("Hello");
        strs.add("world");
        strs.add("every body");
        System.out.println(strs.get(0));
        System.out.println(strs.get(1));
        System.out.println(strs.get(2));
        for(int i=0;i<strs.size();i++){
            System.out.println(strs.get(i));
        }
        ArrayList<Student> sts=new ArrayList<>();//mang cac sinh vien
        sts.add(s1);
        sts.add(s2);
        sts.add(s3);
        sts.add(new Student());
        ArrayList<HotGirl> stb=new ArrayList<>();
        stb.add(new HotGirl());
        stb.add(new HotGirl());
        for (int j=0;j<stb.size();j++){
            System.out.println("Dia chi la "+stb.get(j).address);
            System.out.println("Ten la "+stb.get(j).name);
            System.out.println("Nam sinh la "+stb.get(j).birthday);
        }

        //Xay dung lop tam giac co cac thong tin gom do dai cac canh
        //Sau do viet cac method tinh chu vi va dien tich cua tam giac
        Tamgiac tg= new Tamgiac();
            System.out.println("Dientich la "+tg.TinhDienTich(tg.a,tg.b,tg.c));
            System.out.println("Chu vi la "+tg.TinhChuVi(tg.a,tg.b,tg.c));
        }
    }