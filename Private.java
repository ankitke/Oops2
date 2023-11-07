class Private
{
    private int a;
    private int b;
    
    public void setVar(int a)
    {
        this.a=a;
    }
    public void setVar2(int b)
    {
        this.b=b;
    }
    public int getVar()
    {
        return a;
    }
    public int getVar2()
    {
        return b;
    }
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
    
}
class MyCl
{
    public static void main(String args[])
    {
        Private p=new Private();
        p.setVar(23);
        p.setVar2(45);
        p.disp();
    }
}