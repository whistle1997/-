import javax.swing.CellEditor;

public class NoReapt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,1,2,11,7};
		Clean c = new Clean();
		int[] newArr = c.cleanArr(arr);
		for(int num : newArr){
			System.out.println(num+ " ");
		}
	}
	
}
