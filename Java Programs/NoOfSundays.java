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


