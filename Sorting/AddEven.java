/*Problem
Segregate Even And Odd Numbers

Given an array of numbers, rearrange them in-place so that even numbers appear before odd ones.
Example

{
"numbers": [1, 2, 3, 4]
}

Output:

[4, 2, 3, 1]

The order within the group of even numbers does not matter; same with odd numbers. So the following are also correct outputs: [4, 2, 1, 3], [2, 4, 1, 3], [2, 4, 3, 1].
Notes

    It is important to practice solving this problem by rearranging numbers in-place.
    There is no need to preserve the original order within the even and within the odd numbers.
    We look for a solution of the linear time complexity that uses constant auxiliary space.

Constraints:

    1 <= length of the array <= 105
    1 <= element of the array <= 109

*/

package Sorting;
import java.util.*;

public class AddEven {

	static ArrayList<Integer> segregate_evens_and_odds(ArrayList<Integer> numbers) {
        // Write your code here.
		int start =0;
		int end = numbers.size()-1;
		while (start < end) {
			if (numbers.get(start)%2 == 0) {
					start++;
			} else if (numbers.get(end)%2 != 0) {
					end--;
			} else {
				int temp = numbers.get(start);
		        numbers.set(start,numbers.get(end));
		        numbers.set(end,temp);
		        start++;
		        end--;
				}
			}
	        return numbers;
    }
	
	public static void main (String[] args)
    {
		/*ArrayList<Integer> gfg = new ArrayList<Integer>(Arrays.asList(12, 34, 45,9,90,3));*/
		ArrayList<Integer> arr = new ArrayList<Integer>(){
            {
                add(12);
                add(34);
                add(45);
                add(9);
                add(90);
                add(3);
            }
        };
		segregate_evens_and_odds(arr);
        System.out.print("Array after segregation ");
        System.out.print(arr +" ");
    }
}
