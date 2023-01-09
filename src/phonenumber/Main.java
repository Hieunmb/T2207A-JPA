package phonenumber;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<PhoneNumber> pn=new ArrayList<>();
        pn.add(new PhoneNumber("Hieu","0964958450"));
        System.out.println(pn.get(0).ten+" va "+pn.get(0).sdt);
    }
}
