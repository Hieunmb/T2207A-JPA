package session3;

public class Session3Main {
    public static void main(String[] args){
//        Car c= new Car();
//        c.setBrand("BWM");
//        c.setName("X8");
        Car c= new Car("BMW","X8",8000);
        System.out.println(c.getBrand());
        int x=10;
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+3;
        }

        Car[] cars=new Car[3];
        for(int i=0;i<cars.length;i++){
            cars[i]=new Car("Honda","CRV",12000);
        }
    }
}
