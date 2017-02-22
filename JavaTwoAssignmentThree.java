
public class JavaTwoAssignmentThree {
	public static void main(String[] args) {
	
		 int i , k ;
		 boolean onetime = false;
		for(i = 1 ; i<=2 ; i++)
		{  
			System.out.println( "    a");
			for( k = 1; (k<=2 && i <= 1 ); k++)
		   { 
				System.out.println( "  a b a" );
				if (!onetime)
				{
					System.out.println( "a b c b a");
					onetime = true;

				}
		   }

		}

	}
}
