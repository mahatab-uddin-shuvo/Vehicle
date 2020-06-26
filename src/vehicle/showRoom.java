    package vehicle;

//import com.sun.tools.javac.util.ArrayUtils;

    public class showRoom {

        public String name;
        public int scapacity,hcapacity,capacity;
        sportsVehicle[] scar;
        heavyVehicle[] hcar;
        normalVehicle [] car;
         int sum=0;
         int top=0;
         int stop=0;
         int htop=0;
        showRoom(){}
        showRoom(String name, int capacity,int scapacity, int hcapacity){
            this.name=name;
            this.capacity=capacity;
            this.scapacity=scapacity;
            this.hcapacity = hcapacity;
            car = new normalVehicle [capacity];
            scar=new sportsVehicle[scapacity];
            hcar=new heavyVehicle[hcapacity];
        }
        void addVehicle(normalVehicle b){
            car[top]=b;
            top++;
        }
        void addsportsVehicle(sportsVehicle b){
            scar[stop]=b;
            stop++;
        }
        void addheavyVehicle(heavyVehicle h){
            hcar[htop]=h;
            htop++;
        }
        void print(){
            for(int i=0;i<top;i++){
                car[i].print();
            }
            for(int i=0;i<stop;i++){
                scar[i].print();
            }
            for(int i=0;i<htop;i++){
                hcar[i].print();
            }
        }
        void delete(String model)
        {
            for(int i=0;i<top;i++){
                if(car[i].modelNumber.equals(model))
                {
                    top--;
                }
            }

        }

        void deleteSports(String model)
        {
            for(int i=0;i<stop;i++){
                if(scar[i].modelNumber.equals(model))
                {
                    stop--;
                }
            }


        }
        void deleteHeavy(String hmodel)
        {
            for(int i=0;i<htop;i++){
                if(hcar[i].modelNumber.equals(hmodel))
                {
                    htop--;
                }
            }


        }
        void printWithCount(){
            for(int i=0;i<top;i++){
                car[i].print();
                System.out.println("Regular Visitor: 30");
            }
            for(int i=0;i<stop;i++){
                scar[i].print();
                sum = 30+(i+1)*20;
                System.out.println("Sports Visitor: "+sum);
            }
            for(int i=0;i<htop;i++){
                hcar[i].print();
                System.out.println("Sports Visitor: 30");
            }
        }
    }


