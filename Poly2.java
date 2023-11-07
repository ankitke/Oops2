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
class FighterPlane1 extends Aeroplane1
{
    public void takeOff()
    {
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly()
    {
        System.out.println("FighterPlane flies as heigh height");
    }
}
class Airpot
{
    void poly(Aeroplane1 ref)
    {
        ref.takeOff();
        ref.fly();
        System.out.println("--------------------------------------------");
    }
}
class LaunchPoly
{
    public static void main(String args[])
    {
        CargoPlane1 cp=new CargoPlane1();
        
        PassangerPlane1 pp=new PassangerPlane1();
        
        FighterPlane1 fp=new FighterPlane1();
        
       // cp.takeOff();
        //cp.fly();
        
    //    pp.takeOff();
     //   pp.fly();
        
      //  fp.takeOff();
    //    fp.fly();
    
         Airpot a=new Airpot();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
    }
}