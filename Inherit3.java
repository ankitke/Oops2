class Aeroplane
{
    public void takeOff()
    {
        System.out.println("Take off the Plane");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane
{
    public void fly()
    {
        System.out.println("Aeroplane is flying lower height");
    }
    
    public void carryGoods()
    {
        System.out.println("Cargoplane carrie goods");
    }
    
}
class PassangerPlane extends Aeroplane
{
    public void fly()
    {
        System.out.println("Aeroplane is flying medium height");
    }
    
    public void carriePassanger()
    {
        System.out.println("PassangerPlane carrie passanger");
    }
    
}
class Inherit
{
    public static void main(String args[])
    {
        CargoPlane cp=new CargoPlane();
        cp.takeOff();
        cp.fly();
        cp.carryGoods();
        
        PassangerPlane pp=new PassangerPlane();
        pp.takeOff();
        pp.fly();
        pp.carriePassanger();
    }
}