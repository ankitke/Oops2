class Aeroplane1
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking Off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane1 extends Aeroplane1
{
    public void btakeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane files at lower height");
    }
}
class PassangerPlane1 extends Aeroplane1
{
    public void takeOff()
    {
        System.out.println("PassangerPlane require medium size runway");
    }
    public void fly()
    {
        System.out.println("PassangerPlane flies at medium height");
    }
}
class LaunchPoly
{
    public static void main(String args[])
    {
        CargoPlane1 cp=new CargoPlane1();
        
        PassangerPlane1 pp=new PassangerPlane1();
        
        Aeroplane1 ref;
        ref=cp;
        cp.takeOff();
        cp.fly();
        System.out.println("---------------------------");
        
        ref=pp;
        ref.takeOff();
        ref.fly();
    }
}