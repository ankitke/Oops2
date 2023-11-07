abstract class Aeroplane
{
    abstract public void takeOff();
    
    abstract public void fly();
    
    public void landing()
    {
        System.out.println("Aeroplane is landing");
    }
    
}
class CargoPlane extends Aeroplane
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies at longer height");
    }
    public void alert()                        //this method is called speclised method
    {
        System.out.println("alert....");
    }
}
class PassangerPlane extends Aeroplane
{
    public void takeOff()
    {
        System.out.println("PassangerPlane requires medium size runway");   
    }
    public void fly()
    {
        System.out.println("PassangerPlane flies at medium height");
    }
}
class LaunchAbc
{
    public static void main(String args[])
    {
        Aeroplane ref=new CargoPlane();
        ref.takeOff();
        ref.fly();
        ref.landing();
        ref.alert();
        
        Aeroplane ref2=new PassangerPlane();
        ref2.takeOff();
       ((CargpPlane) ref2).fly();
    }
}