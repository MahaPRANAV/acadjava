
public class JavaTwoAssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	boolean Onetime =false;

     for (int i=1 ;i <= 2;i++)
     {
    	 System.out.println("*________*");
    	 for (int j=1;(j<= 2 && i <= 1);j++)
    	 {
    		 System.out.println("__*___*");
    		 if (!Onetime) {
    			 System.out.println("____*");
    			 Onetime = true;
    		 }
    	 }
     }
	}

}
