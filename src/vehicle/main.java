package vehicle;

import java.util.*;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input,count=0;
        Scanner s = new Scanner (System.in);

        showRoom sr = new showRoom();
        System.out.println("What is the name of showroom: ");
        String name = s.next();
        System.out.println("How many Regular Car can be kept in showroom: ");
        int size = s.nextInt();
        System.out.println("How many Sportcar can be kept in showroom: ");
        int sportSize = s.nextInt();
        System.out.println("How many Heavy car can be kept in showroom: ");
        int heavySize = s.nextInt();

        sr = new showRoom(name,size,sportSize,heavySize);


        do {

            System.out.println("******Menu**********");
            System.out.println("1. Add Vehicle\n2. Remove Vehicle\n3. Current Vehicle list\n4. list with expected visitor");
            System.out.println("What do you want: ");
            input = s.nextInt();

            if(input==1) {
                System.out.println("What types of vehicle do you want to add: \n1.Normal\n2.Sports\n3.Heavy");
                int type = s.nextInt();
                if(type==1)
                {
                    System.out.println("****Regular Vehicle start*****");

                    for(int i=0;i<size;i++)
                    {
                        System.out.println("Model Number as String for Regular Car: "+i);
                        String modelNmber = s.next();
                        System.out.println("Engine Type as String for Regular Car: "+i);
                        String engineType = s.next();
                        System.out.println("Engine power as int for Regular Car: "+i);
                        int enginPower = s.nextInt();
                        System.out.println("Tire Size as int for Regular Car: "+i);
                        int tirSize = s.nextInt();


                        normalVehicle nv = new normalVehicle(modelNmber,engineType,enginPower,tirSize);
                        sr.addVehicle(nv);
                    }
                }
                else if(type==2)
                {

                    System.out.println("****Sports Vehicle start*****");

                    for(int i=0;i<sportSize;i++)
                    {
                        System.out.println("Model Number as String for Sports Car: "+i);
                        String modelNmber = s.next();
                        System.out.println("Engine power as int for Sports Car: "+i);
                        int enginPower = s.nextInt();
                        System.out.println("Tire Size as int for Sports Car: "+i);
                        int tirSize = s.nextInt();
                        System.out.println("Turbo as String for Sports Car: "+i);
                        String turrbo = s.next();

                        sportsVehicle sv = new sportsVehicle(modelNmber,"oil",enginPower,tirSize,turrbo);
                        sr.addsportsVehicle(sv);
                    }
                }
                else if(type==3)
                {

                    System.out.println("*****Heavy Vehicle start****** ");



                    for(int i=0;i<heavySize;i++)
                    {
                        count++;
                        System.out.println("Model Number as String for Heavy Car: "+i);
                        String modelNmber = s.next();
                        System.out.println("Engine power as int for Heavy Car: "+i);
                        int enginPower = s.nextInt();
                        System.out.println("Tire Size as int for Heavy Car: "+i);
                        int tirSize = s.nextInt();
                        System.out.println("weight as double for Heavy Car: "+i);
                        double weight = s.nextDouble();

                        heavyVehicle hv = new heavyVehicle(modelNmber,"disel",enginPower,tirSize,weight);
                        sr.addheavyVehicle(hv);
                        count++;
                    }


                }

            }
            else if(input==2)
            {
                System.out.println("What types of Vehicle do you want to remove:\n1. Normal\n2. Sports\n3.Heavy");
                int r = s.nextInt();
                if(r==1)
                {
                    System.out.println("Enter Model Number to delete for Normal car: ");
                    String model = s.next();
                    sr.delete(model);
                }
                else if(r==2)
                {
                    System.out.println("Enter Model Number to delete for sports car: ");
                    String model = s.next();
                    sr.deleteSports(model);
                }
                else if(r==3)
                {
                    System.out.println("Enter Model Number to delete for Heavy car: ");
                    String model = s.next();
                    sr.deleteHeavy(model);
                }
            }
            else if(input==3)
            {
                sr.print();
            }
            else if(input==4)
            {
                sr.printWithCount();
            }
        }while(input!=0);
    }

}
