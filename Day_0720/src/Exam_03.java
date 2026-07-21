
public class Exam_03 {

	public static void main(String[] args) {

		static int dataMax(int arr[]) {
			int max = arr[0];
			System.out.print("data: ");
			for(int i=0; i<arr.length; i++) {
				System.out.printf("%4d", arr[i]);
				if(max<arr [i])
					max= arr[i];
			}
			System.out.print("\n");
			
			return max;
		}
	}

}
