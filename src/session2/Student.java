package session2;

import java.util.Scanner;

public class Student {
        String name;
        String email;
        int age=18;//attribute
        //ham khoi tao
        public Student(){
                //tu dong chay khi tao doi tuong
                Scanner sc= new Scanner(System.in);
                System.out.println("Nhap ten:");
                name= sc.nextLine();
                System.out.println("Nhap email:");
                email=sc.nextLine();
                //System.out.println("Xin chao");
        }
        public void eat(){
                System.out.println("Eating..");
        }
        public void learn(){
                System.out.println("Learning..");
        }
}
