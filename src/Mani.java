
public class Mani {

    public static void main(String[] args) {
        
        Car myCar = new Car();
        System.out.println("Maksimalna brzina je: " + myCar.maxSpeed);
        
       
        
        Car companyCar = new Car(150, 30, 2000, false, "EF-123", 'B', 3500, 6000);
        System.out.println("Maksimalna brzina je: " + companyCar.maxSpeed);
        
    }
    
}
