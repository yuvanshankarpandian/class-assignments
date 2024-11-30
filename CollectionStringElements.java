package hw;



	import java.util.ArrayList;
	import java.util.List;

	public class CollectionStringElements {

		
		public static void main(String[] args) {
			List<String> str=new ArrayList<String>();
		

		
		
		str.add("HCL");
		str.add("Wipro");
		str.add("Aspire System");
		str.add("CTS");
		
		
		str.sort(String.CASE_INSENSITIVE_ORDER);
		
		for(int i=str.size()-1;i>=0;i--)
		{
			System.out.print(" " +str.get(i));
			
		}

		}

	}


