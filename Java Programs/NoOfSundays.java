/*Question 

Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 

So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.

Count the number of Sunday jack will get within n number of days.

 Example 1:

Input 

mon-> input String denoting the start of the month.

13  -> input integer denoting the number of days from the start of the month.

Output :

2    -> number of days within 13 days.

Explanation:

The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.

Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. Total 2 sundays may fall within 13 days.
*/

//My Code

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String day = sc.next().toLowerCase(); //Starting Day
	int n = sc.nextInt(); //Number of Days
	String arr[]={"sun","mon","tue","wed","thur","fri","sat"};
	int days=0;
	int result=0;
	String save[]= new String[n];
	for(int i = 0;i<arr.length;i++){
	    if(day.equals(arr[i])){
	        days = i;
	    }
	}
	int k = days+1;
	for(int i = 0;i<n;i++){
	    if(k>6){
	        k = k%7;
	    }
	    save[i]=arr[k];
	    k++;
	    }
	    
	    for(int i = 0;i<save.length;i++){
	        if(save[i].equals("sun")){
	            result++;	        
	        }
	    }
	    System.out.print(result);
	}
}

//Efficient Code 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next().toLowerCase();
        int n = sc.nextInt();

        String[] daysOfWeek = {"sun", "mon", "tue", "wed", "thur", "fri", "sat"};
        int startIndex = -1;
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (day.equals(daysOfWeek[i])) {
                startIndex = i;
                break;
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            if ((startIndex + i + 1) % 7 == 0) {
                result++;
            }
        }

        System.out.print(result);
    }
}


