class Const
{
    int a, b;
    Const(int m, int n)
    {
        a=m;
        b=n;
    }
    void disp()
    {
        System.out.println("Value of a= "+a+" and b= "+b);
    }
}
class MyCl
{
    public static void main(String args[])
    {
        Const c=new Const(20,30);
        c.disp();
    }
}