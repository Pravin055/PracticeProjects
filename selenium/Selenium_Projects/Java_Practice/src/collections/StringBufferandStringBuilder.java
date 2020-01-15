package collections;

public class StringBufferandStringBuilder {
	 public static void main(String[] args) 
	    {
	
	String str="Pravin";
	
	 // conversion from String object to StringBuffer 
    StringBuffer sbr = new StringBuffer(str); 
    sbr.reverse(); 
    System.out.println(sbr); 
      
    // conversion from String object to StringBuilder 
    StringBuilder sbl = new StringBuilder(str);
    sbl.append("ForGeeks");
    System.out.println(sbl);
	    }

}
