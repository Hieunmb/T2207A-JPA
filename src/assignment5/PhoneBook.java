package assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook extends Phone {
    public ArrayList<String> PhoneList=new ArrayList<>();
    @Override
    void insertPhone(String name, String phone) {
        if(PhoneList.isEmpty()) {
            PhoneList.add(name + "," + phone);
        }else{
            }
            boolean timthay=false;
            for(String pb: PhoneList){
                if(pb.contains(name+",")){
                    timthay=true;
                    if(pb.contains(phone)){
                        PhoneList.set(PhoneList.indexOf(pb),pb+":"+phone);
                    }
                    break;
                }
            }
            if (!timthay){
                PhoneList.add(name + "," + phone);
            }
        }

    @Override
    void removePhone(String name) {
        if(PhoneList.isEmpty()){
            System.out.println("Danh Ba Trong");
        }else {
            boolean timthay=false;
            for(String pb: PhoneList){
                if(pb.contains(name+",")){
                    timthay=true;
                    PhoneList.remove(pb);
                    System.out.println("Da xoa nguoi dung "+name);
                    break;
                }
            }
            if(!timthay){
                System.out.println("Khong tim thay ten nguoi dung "+name+" trong danh ba");
            }
        }
    }

    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {

    }

    @Override
    PhoneNumber searchPhone(String name) {
        for(String pb:PhoneList){
            if(pb.contains(name+",")){
                return pb;
            }
        }
        return null;
    }

    @Override
    void sort() {

    }
}
