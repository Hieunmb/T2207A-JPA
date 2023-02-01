package assignment6;

public class Main {
    public static void main(String[] args){
        News n= new News(1,"Hieu","23/02","Hieu1","New",10);
        n.Display();
        n.Ratelist[0]=2;
        n.Ratelist[1]=4;
        n.Ratelist[2]=6;
        n.Calculate();
    }
}
