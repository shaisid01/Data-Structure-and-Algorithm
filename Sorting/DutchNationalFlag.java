/*
Dutch National Flag

Given some balls of three colors arranged in a line, rearrange them such that all the red balls go first, then green and then blue ones.

Do rearrange the balls in place. A solution that simply counts colors and overwrites the array is not the one we are looking for.

This is an important problem in search algorithms theory proposed by Dutch computer scientist Edsger Dijkstra. Dutch national flag has three colors (albeit different from ones used in this problem).
Example
{
"balls": ["G", "B", "G", "G", "R", "B", "R", "G"]
}

Output:["R", "R", "G", "G", "G", "G", "B", "B"]

There are a total of 2 red, 4 green and 2 blue balls. In this order they appear in the correct output.
Notes
Constraints:

    1 <= n <= 100000
    Do this in ONE pass over the array, NOT TWO passes
    Solution is only allowed to use constant extra memory
 */
 
 
package Sorting;
import java.util.*;
public class DutchNationalFlag {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO
		
		Character[] letters = {'G', 'B', 'G', 'G', 'B', 'B', 'R', 'G'};
		ArrayList<Character> chBalls = new ArrayList<Character>(Arrays.asList(letters));
		//ArrayList<Character> chBalls = new ArrayList<Character>(Arrays.asList('G', 'B', 'R','G', 'B', 'R'));
		dutch_flag_sort(chBalls);
		System.out.print(chBalls);
	}

	static ArrayList<Character> dutch_flag_sort(ArrayList<Character> balls) {
        // Write your code here.
        int g = -1;
        int r = -1;
        
        for(int i=0; i<balls.size(); i++){
            if (balls.get(i) == 'G'){
                g++;
                Collections.swap(balls,i,g);
            }
            else if (balls.get(i)=='R'){
                g++;
                Collections.swap(balls,i,g);
                r++;
                Collections.swap(balls,r,g);
            }
        }
        return balls;
    }
}
