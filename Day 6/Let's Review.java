/*
Objective
Today we will expand our knowledge of strings, combining it with what we have already learned about loops. Check out the Tutorial tab for learning materials and an instructional video.

Task
Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

Note:  is considered to be an even index.

Example


Print abc def

Input Format

The first line contains an integer,  (the number of test cases).
Each line  of the  subsequent lines contain a string, .

Constraints

Output Format

For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak
Explanation

Test Case 0: 






The even indices are , , and , and the odd indices are , , and . We then print a single line of  space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().

Test Case 1: 




The even indices are  and , and the odd indices are  and . We then print a single line of  space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().
  */




Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            String r = new StringBuilder(s).reverse().toString();
            char sArr[] = s.toCharArray();
            char rArr[] = r.toCharArray();
            int j = 1;
            int k = s.length();
            int flag = 1;
            while(j < k){
                if(Math.abs(sArr[j]-sArr[j-1]) != Math.abs(rArr[j]-rArr[j-1])){
                    System.out.println("Not Funny");
                    flag = 0;
                    break;
                }
                ++j;
            }
            if(flag == 1){
            System.out.println("Funny");
            }
        }
