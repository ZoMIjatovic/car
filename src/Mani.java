
public class Mani {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.printMainAttraibutes();
        
        System.out.println("Maksimalna brzina je: " + myCar.maxSpeed);
        System.out.println(myCar.condition);
        System.out.println(myCar.currentPrice);
        System.out.println(myCar.licence);
        System.out.println(myCar.minSpeed);
        System.out.println(myCar.weight);
        System.out.println(myCar.licence);
        
        
        

        Car companyCar = new Car(150, 30, 2000, false, "EF-123", 'B', 3500, 6000);
        companyCar.changeModel("Fiat");
        companyCar.changeMaxFuel(150);
        companyCar.fuelUp();
        companyCar.changeConsuption(10);
        companyCar.printMainAttraibutes();
        companyCar.travel(20);
        companyCar.printAttraibutes();
        
        System.out.println("Maksimalna brzina je: " + companyCar.maxSpeed);
        System.out.println(companyCar.condition);
        System.out.println(companyCar.currentPrice);
        System.out.println(companyCar.licence);
        System.out.println(companyCar.minSpeed);
        System.out.println(companyCar.weight);
        System.out.println(companyCar.licence);
        
        Car audi = new Car();
        audi.changeModel("Audi");
        audi.fuelUp();
        audi.changeConsuption(20);
        audi.travel(3);
        audi.printMainAttraibutes();
        audi.travel(3);
        audi.printMainAttraibutes();
        audi.getIn();
        audi.getOut();
        audi.printMainAttraibutes();
        audi.getIn();
        audi.getOut();
        audi.printMainAttraibutes();
        audi.getIn();
        audi.getOut();
        audi.printMainAttraibutes();
        audi.getIn();
        audi.getOut();
    }

}
