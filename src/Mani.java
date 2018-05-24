
public class Mani {

    public static void main(String[] args) {

        Car myCar = new Car();
        System.out.println("Maksimalna brzina je: " + myCar.maxSpeed);
        System.out.println(myCar.condition);
        System.out.println(myCar.currentPrice);
        System.out.println(myCar.licence);
        System.out.println(myCar.minSpeed);
        System.out.println(myCar.weight);
        System.out.println(myCar.licence);

        Car companyCar = new Car(150, 30, 2000, false, "EF-123", 'B', 3500, 6000);
        System.out.println("Maksimalna brzina je: " + companyCar.maxSpeed);
        System.out.println(companyCar.condition);
        System.out.println(companyCar.currentPrice);
        System.out.println(companyCar.licence);
        System.out.println(companyCar.minSpeed);
        System.out.println(companyCar.weight);
        System.out.println(companyCar.licence);
    }

}
