// final class Animal
// {
//     void sleep()
//     {
//         System.out.println("Animal is sleeping");
//     }
// }
class Animal
{
    final int age=19;
    final void sleep()
    {
        //age=30;
        System.out.println("Animal is sleeping");
    }
}

class Tiger extends Animal
{
    
}
class Final1K
{
    public static void main(String args[])
    {
        Tiger t=new Tiger();
        t.sleep();
    }
}