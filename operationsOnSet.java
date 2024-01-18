class App
  {
public static void main(String, args[])

    {
Set<String> s1 = new HashSet<String>();
      s1.add("Agni");
s1.add("Charan");
s1.add("Teja");
      if(s1.contains("Agni"))
      {
        System.out.println("yes");
        
      }
      else
      {
        System.out.println("no");
      }

      //copy a set

      Set<String> s2 = new HashSet<String>(s1);
      System.out.println(s2);
      //remove the copy of s1 in s2
      s2.removeAll(s1);
      System.out.println(s2);

      
      
      
    }
    
  }
