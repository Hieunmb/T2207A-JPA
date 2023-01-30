package assignment5;

public class Main {
    public static void main(String[] args){
        PhoneBook pb=new PhoneBook();
        pb.insertPhone("Hieu","0964958450");
        pb.insertPhone("Hieu1","0964958453");
        pb.insertPhone("Hieu2","0964958453");
        pb.removePhone("Hieu2");
        pb.removePhone("Hieu3");
        for(String pl: pb.PhoneList){
            System.out.println(pl);
        }
    }
}
