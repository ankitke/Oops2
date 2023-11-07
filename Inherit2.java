class Human1
{
    private String name;
    int age;
    
    Human1()
    {
        System.out.println("Human class Constructor");
    }
    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human1
{
    //public Student()
    //{
    //   sleep();
    //}
    
    void disp()
    {
        System.out.println("Student age is= "+age);
        //System.out.println("Student name is= "+name);
    }
}

class Inherit
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.sleep();
        s.disp();
    }
}