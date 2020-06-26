package vehicle;


public class heavyVehicle extends vehicle {
    double weight;

    heavyVehicle (String modelNumber, String engineType, int enginePower,int tireSize, double weight)
    {
        super(modelNumber, engineType, enginePower,tireSize);
        this.weight =  weight;
    }

    void print(){
        System.out.println("modelNumber:  "+this.modelNumber+" engineType: "+this.engineType+" enginePower:  "+this.enginePower+" tireSize:  "+this.tireSize+" weight:  "+this.weight);
    }

}
