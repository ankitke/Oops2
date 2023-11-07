class Method
{
    static int a=30;
    static int b=35;
    
    static void show()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
class MyCl
{
    public static void main(String args[])
    {
        Method.show();
    }
}