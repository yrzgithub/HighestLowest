//             211
//Example op - 1221

class Main  
{
  public static void main(String[] args)
  {
    int n = 10,count=1;
    String p = "1",curr=" ";
    char current;
    System.out.println(p);
    
    for(int i=1;i<n;++i)
    {
      curr = "";
      current = p.charAt(0);
      count = 1;
      for(int j=1;j<p.length();++j)
      {
        if(p.charAt(j)==p.charAt(j-1))
        {
          ++count;
        }
        else
        {
          curr+= count+""+p.charAt(j-1);
          System.out.print(count+""+p.charAt(j-1));
          current = p.charAt(j);
          count = 1;
        }
      }
      p = "" + count +current;
      System.out.println(p); 
      p = curr + p;
    }
  }
}