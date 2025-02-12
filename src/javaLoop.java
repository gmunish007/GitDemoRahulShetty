
public class javaLoop {
	public static void main(String[] args) {
		int[] arr = {1,2,4,6,7,8,9,12};
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
			System.out.println(arr[0]);
			System.out.println(arr[arr.length-1]);
			for(int j = arr.length-1; j>=0; j--) {
				System.out.println(arr[j]);
				
			}
			System.out.println(arr.length+"a");

			
		}
	}

}

