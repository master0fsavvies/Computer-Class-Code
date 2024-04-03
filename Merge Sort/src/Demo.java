
public class Demo {
	public static void main(String[] args) {
		int[] List = {55, 22, 78, 68, 45, 7};
		List = MergSort.MergeSort(List);
		
		System.out.println(List);
		
		for(int i = 0; i < List.length; i++) {
			System.out.println(List[i]);
		}
	}
}
