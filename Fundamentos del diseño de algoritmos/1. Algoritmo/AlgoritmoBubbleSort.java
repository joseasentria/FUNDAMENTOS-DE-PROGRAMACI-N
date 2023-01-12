public class BubbleSort {
	public void sortArray(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j+1);
				}
				printArray(array);
			}
			System.out.println("Change of partition index");
		}
	}

	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}

	public void swap(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] array = { 10, 1, 5, 40, 12, 34, 44, 12, 11, 9 };
		bubbleSort.printArray(array);
		bubbleSort.sortArray(array);
		bubbleSort.printArray(array);
	}
}