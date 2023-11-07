class Const
{
    static int a=10;
    static int b=20;
    static int c;
    
    static void add()
    {
        c=a+b;
        System.out.println(c);
    }
    public static void main(String args[])
    {
        Const.add();
    }
}