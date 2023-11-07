class Overload
{
    int a ,b;
    static
    {
        System.out.println("This is a static block");
    }
    
    Overload( int a, int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("A="+a+" B="+b);
    }
    
    Overload(int a)
    {
        this.a=a;
        System.out.println("A="+a);
    }
}
class MyCl
{
    public static void main(String args[])
    {
        new Overload(23, 45);
        new Overload(56);
    }
}