import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		//ArrayList<String> a =new ArrayList<String>();
		/*a.add("Rishard");
		a.add("Khan");
		a.add("Selenium");
		System.out.println(a.get(1));
		a.remove(2);
		System.out.println(a);*/
		String d = "Mohamed Rishard Khan";
		String [] sp1=d.split(" ");
		System.out.println(sp1[0]);
		System.out.println(sp1[1]);System.out.println(sp1[2]);
		String [] sp2 = d.split("Rishard");
		System.out.println(sp2[0]);
		System.out.println(sp2[1]);
		System.out.println(sp2[1].trim())
		;
		//for (int i=0; i<d.length();i++)
			//System.out.println(d.charAt(i));
		for (int i=d.length()-1;i>=0;i--){
		System.out.println(d.charAt(i));
		}
		
		

	}

}
