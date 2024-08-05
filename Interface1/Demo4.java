package Interface1;

interface computer
{
     void code();
    
}

class laptop implements computer
{
  public void code()
    {
        System.out.println("code, compile and run");
    }
}
class desktop implements computer
{
   public void code()
    {
        System.out.println("code, compile and run: faster");
    }
}
class developer
{
    void devApp(computer lap)
    {
        lap.code();
    }
}


public class Demo4 {
    public static void main(String[] args) {
        computer lap=new laptop();
        computer dek=new desktop();

        developer d = new developer();
        d.devApp(lap);
    }
    
}
