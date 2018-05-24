
public class Car {

    int maxSpeed = 120;
    int minSpeed = 10;
    double weight = 1000;
    boolean isTheCarOn = false;
    String licence = "AB-123";
    char condition = 'A';
    double currentPrice = 3000;
    int milagePassed = 50000;
    
    String model;
    int maxFuel;
    int currentFuel;
    int consuption;

    public Car() {
        this.model = "default";
        this.currentFuel = 0;
        this.maxFuel = 100;
    }

    public Car(int maxSpeed, int minSpeed, double weight, boolean isTheCarOn,
            String licence, char condition, double currentPrice, int milagePassed) {

        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.weight = weight;
        this.isTheCarOn = isTheCarOn;
        this.licence = licence;
        this.condition = condition;
        this.currentPrice = currentPrice;
        this.milagePassed = milagePassed;
    }

    public void printMainAttraibutes() {

        System.out.println("Model: " + this.model);
        System.out.println("Kapacitet rezervoara: " + this.maxFuel);
        System.out.println("Trenutno gorivo: " + this.currentFuel);
        System.out.println("Predjena kilometraza: " + this.milagePassed);
        System.out.println();
    }
    public void printAttraibutes() {

        System.out.println("Maksimalna brzina je: " + this.maxSpeed);
        System.out.println("Minimalna brzina je: " + this.minSpeed);
        System.out.println("Registarski broj je: " + this.licence);
        System.out.println("Tezina: " + this.weight);
        System.out.println("Trenutna cena: " + this.currentPrice);
        System.out.println("Predjena kilometraza: " + this.milagePassed);

    }
    public void changeModel(String customModel) {
        this.model = customModel;
    
    }

    public void changeMaxFuel(int customMaxFuel){
        this.maxFuel = customMaxFuel;}
    
    public void fuelUp() {
        this.currentFuel = this.maxFuel;
    }
    
    public void changeConsuption(int customConsumption){
        this.consuption = customConsumption;
    }
    
    public void travel(int distance) {
        
        if (this.currentFuel > distance * this.consuption) {
        this.milagePassed = this.milagePassed + distance;
        this.currentFuel = this.currentFuel - distance * this.consuption;
        System.out.println("Putovali ste: " + distance);
        }
        else{
        System.out.println("Nema dovoljno goriva");
        }
        
        
        
        }
       
    
    
    }
    

