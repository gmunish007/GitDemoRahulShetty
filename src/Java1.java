
public class Java1 {
	public static void main(String[] args) {
		int a = 5;
		String website = "munish gupta";
		
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=5;
		arr[2]=9;
		arr[3]=4;
		arr[4]=8;
		
		int[] arr2 = {1,3,5,7,9};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] str = {"assd", "rsd", "fsd", "csd"};
		for(int j=0; j<str.length; j++) {
			System.out.println(str[j]);
		}
		
		//Enhanced for loop
		
		String[] strEnhanced = {"assd", "rsd", "fsd", "csd"};
		for(String s: strEnhanced) {
			System.out.println(s+": 1");
		}
		
	}
}
