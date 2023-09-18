/*
Objective
Today, we are building on our knowledge of arrays by adding another dimension. Check out the Tutorial tab for learning materials and an instructional video.

Context
Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

Task
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

Example

In the array shown above, the maximum hourglass sum is  for the hourglass in the top left corner.

Input Format

There are  lines of input, where each line contains  space-separated integers that describe the 2D Array .

Constraints

Output Format

Print the maximum hourglass sum in .

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

 contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
The hourglass with the maximum sum () is:

2 4 4
  2
1 2 4
  */

 List<List<Integer>> arr = new ArrayList<>();

    for (int i = 0; i < 6; i++) {
        String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arrRowItems = new ArrayList<>();

        for (int j = 0; j < 6; j++) {
            int arrItem = Integer.parseInt(arrRowTempItems[j]);
            arrRowItems.add(arrItem);
        }

        arr.add(arrRowItems);
    }

    bufferedReader.close();

    int sum = -100;
    for(int i = 0; i < 4; i++) {
      int temp;
        for(int j = 0; j < 4; j++) {
            temp = 0;
                temp += arr.get(i).get(j);
                temp += arr.get(i).get(j+1);
                temp += arr.get(i).get(j+2);
                temp += arr.get(i+1).get(j+1);
                temp += arr.get(i+2).get(j);
                temp += arr.get(i+2).get(j+1);
                temp += arr.get(i+2).get(j+2);

                if(temp > sum ) {
                    sum = temp;
                }
        }
    }
    System.out.println(sum);
}
