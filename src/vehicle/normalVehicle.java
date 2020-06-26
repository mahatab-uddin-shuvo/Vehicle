package vehicle;

public class normalVehicle extends vehicle {

    public normalVehicle(String modelNumber, String engineType, int enginePower,int tireSize)
    {
        super(modelNumber, engineType, enginePower,tireSize);
    }

    void print(){
        System.out.println("modelNumber:  "+this.modelNumber+" engineType: "+this.engineType+" enginePower:  "+this.enginePower+" tireSize:  "+this.tireSize);
    }

}
