package assignment5;

import java.util.ArrayList;

public class PhoneNumber {
    public String name;
    public ArrayList<String> phones = new ArrayList<>();

    public PhoneNumber() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }
    public void addPhone(String phone) {
        if (!phones.contains(phone)){
            this.phones.add(phone);
        }
    }

    public void updatePhone(String oldPhone, String newPhone) {
        if (phones.contains(oldPhone)){
            int i = phones.indexOf(oldPhone);// tìm vị trí
            phones.add(i, newPhone);// nạp giá trị mới vào vị trí i
        }
    }

    public void deletePhone(String phone) {
        if (phones.contains(phone)){
            phones.remove(phone);
        }
    }
}
