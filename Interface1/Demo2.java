package Interface1;

interface A
{
    int a=55;
    String location="CHARUSAT";
    void show();
    void config();
}
class B implements A{
    public void show()
    {
        System.out.println("Showing...");
    }
    public void config()
    {
        System.out.println("Configuring...");
    }
}
class Demo2{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
       
        System.out.println(A.a);
    }
}