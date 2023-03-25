public class array {
    
    public static void main(String[] args) {
        // Deklarasi Array
        String[] cars = {"Volvo","BMW"}; 
        Number[] myNum = new Number[4];
        myNum[0] = 10;
        myNum[1] = 20;
        myNum[2] = 30;
        myNum[3] = 40;
        
        // Akses elemen array
        System.out.println(cars[0]); 
        System.out.println(myNum[0]);
       
        // Manipulasi elemen array
        cars[0] = "Maudy Hyundai";
        myNum[1]= 100;
        myNum[2]= null;

        System.out.println(myNum[1]);
        System.out.println(myNum[2]);
        System.out.println(cars[0]);


    }

}
