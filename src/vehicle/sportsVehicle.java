package vehicle;

public class sportsVehicle extends vehicle {
    String turbo;

    sportsVehicle (String modelNumber, String engineType, int enginePower,int tireSize, String turbo)
    {
        super(modelNumber, engineType, enginePower,tireSize);
        this.turbo =  turbo;
    }

    void print(){
        System.out.println("modelNumber:  "+this.modelNumber+" engineType: "+this.engineType+" enginePower:  "+this.enginePower+" tireSize:  "+this.tireSize+" turbo:  "+this.turbo);
    }

}
