package session2;

import java.util.Scanner;

public class HotGirl {
    String name;
    String birthday;
    String address;
    public HotGirl(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten:");
        name= sc.nextLine();
        System.out.println("Nhap namsinh:");
        birthday=sc.nextLine();
        System.out.println("Nhap diachi:");
        address=sc.nextLine();
    }
    public void playgame(){
        System.out.println("Playgame..");
    }public void ruabat(){
        System.out.println("Rua Bat..");
    }public void quetnha(){
        System.out.println("Quet Nha..");
    }
}
