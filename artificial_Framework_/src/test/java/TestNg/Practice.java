package TestNg;
import org.testng.annotations.Test;
public class Practice {
	
	

	

		
		public void createCustomer(){
			
			System.out.println ("Create");
			}
		@Test(dependsOnMethods ="createCustomer" )
	public void modifyCustomer(){
			
			System.out.println ("modify");
	}
		@Test
	public void deleteCustomer(){
		
		System.out.println ("delete");
	}}
