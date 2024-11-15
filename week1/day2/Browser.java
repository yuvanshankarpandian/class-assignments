package week1.day2;

 public class Browser {
	
 

 public static void main(String[] args) {

      Browser a = new Browser();
      String launchBrowser =a.launchBrowser("kaipulla");
      System.out.println(launchBrowser);

       a.loadurl();
 }

 


public String launchBrowser(String browsername) {
	System.out.println(browsername);
return browsername;

}

public void loadurl() { 
         System.out.print("application URL loaded");

 }
 }
