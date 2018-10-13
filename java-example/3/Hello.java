public class Hello
{
  private static int  i;

  public static void main(String[] args) throws InterruptedException
  {
    // TODO: add output of arguments here
    for (int index = 0; index < args.length; ++index)
    {
      System.out.println("args[" + index + "]: " + args[index]);
    }

    while(true)
    {
      i++;
      System.out.println("Hello World! (call " + i + ")");
      Thread.sleep(1000);
    }
  }

}
