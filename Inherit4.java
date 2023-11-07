class Demo1
{
    int a,b;
    
    public Demo1()
    {
        System.out.println("Parent class Constructor");
    }
    
    public Demo1(int x, int y)
    {
        System.out.println("Parametrise Parent class Constructor");
        a=x;
        b=y;
    }
}

class Demo2 extends Demo1
{
    int m, n;
    public Demo2()
    {
        System.out.println("child class Constructor");
    }
    
    public Demo2(int x, int y)
    {
        System.out.println("Paramitrise child class Constructor");
        m=x;
        n=y;
    }
}

class ConstructorExp
{
    public static void main(String args[])
    {
        //Demo2 d=new Demo2();
        Demo2 d2=new Demo2(2,6);
    }
}