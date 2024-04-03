
public class MergSort {
	
	public static int[] MergeSort(int[]list){
		return sort(list);
	}
	
	private static int [] sort(int[]list) {
		if(list.length == 1)
			return list;
		
		int halfsize = list.length/2;
		
		int[] leftList = new int[halfsize];
		int[] rightList = new int[list.length - halfsize];
		
		//populates right and left list
		for(int i=0; i<list.length; i++) {
			if(i<halfsize)
				leftList[i] = list[i];
			else
				rightList[i] = list[i];
		}
		
		leftList = sort(leftList);
		rightList = sort(rightList);
		
		int[]sortedList = new int[list.length];
		
		int rI = 0;
		int lI = 0;
		int i = 0;
		
		while(lI < leftList.length && rI < rightList.length) {
			if(leftList[lI] < rightList[rI])
				sortedList[i++] = leftList[lI++];
			else
				sortedList[i++] = rightList[rI++];
		}
		
		
		
		if(lI < leftList.length) {
			for( ; lI<leftList.length; lI++) {
				sortedList[i++] = leftList[lI];
			}
		}
		else {
			for( ; rI < rightList.length; rI++) {
					sortedList[i++] = rightList[rI];
			}
		}
		
		
		return sortedList;
	}
}
