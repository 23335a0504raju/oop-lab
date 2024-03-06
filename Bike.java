public class Bike{
   public
        int millage=50;
        String name="KTM";
        int maxSpeed=180;
    public
    void Vehicleinfo(int millage,String name,float maxSpeed){
      
            System.out.println("Vehicle details:");
            System.out.println("Name of the vehicle is"+name);
            System.out.println("Millage of the given vehicle: "+millage+"KM/H");
            System.out.println("Maximum speed that the vheicle can posses :"+maxSpeed+"Speed");
    

}
}

class Car extends Bike{
       public
    
        int millage=35;
        String name="Lamborghini";
        float maxSpeed=280;
       // Vehicleinfo();
       Car(){
        Vehicleinfo(millage,name,maxSpeed);
       }

public static void  main(String args[]){
    Bike Buyer1=new Bike();
    Car Buyer2=new Car();
    Buyer1.Vehicleinfo(60,"Yamaha",120);
    Buyer2.Vehicleinfo(25,"Audi",220);
}
}
