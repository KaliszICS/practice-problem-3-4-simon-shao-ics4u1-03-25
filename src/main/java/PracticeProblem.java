import java.util.Arrays;
import java.util.ArrayList;
public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(Arrays.toString(recaman(9)));
	}


public static int[] recaman(int n) {
	if (n<0){
		return new int[]{};
	}

int[] array = new int[n];
ArrayList<Integer> arr = new ArrayList<Integer>();
recHelper(n, arr);
for (int i = 0; i<array.length; i++){
	array[i] = arr.get(i);
}
return array;
}


public static int recHelper(int n, ArrayList<Integer> list){
if (n ==0){
	return 0;
}
int temp = recHelper(n-1, list)-n;
System.out.println(n + " this is n current");
System.out.println(temp + " this is temp current");
if (temp>0&&!list.contains(temp)){
	System.out.println(n + " this is n");
	System.out.println(temp + " this is temp sub");
	list.add(temp);
}
else{
	temp = temp+2*n;
	if (!list.contains(temp)){
		System.out.println(n + " this is n");
		System.out.println(temp + " this is temp add");
		list.add(temp);
	}
}
return temp;
}

}
