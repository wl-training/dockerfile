public class Hello
{
  private static int  i;

  public static void main(String[] args) throws InterruptedException
  {
    // TODO: add output of arguments here

    while(true)
    {
      i++;
      System.out.println("Hello World! (call " + i + ")");
      Thread.sleep(1000);
    }
  }

}
