package com.lits;

public class app {
    public static void main(String[] args){

        int[] arr = {6, -10, 4, 8, 3, -2, 1, -12, 16, 14};
        int[][] ar = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}};
        //////////////////Task 1-2////////
        int temp = arr[0];
        int counter = 0;
            for(int i = 0; i < arr.length; i++) {
                if (temp > Math.abs(arr[i])) {
                    temp = Math.abs(arr[i]);
                    counter = i;
                }
            }
        /////////////////////Task 3//////////
        int max = arr[0];
        int min = arr[0];

        int sumMaxMin = 0;
            for(int j = 0; j < arr.length; j++) {
                if(min > arr[j]){
                    min = arr[j];
                }
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            sumMaxMin=max+min;
        ////////////////////////Task 4///////
        int[] sumOfNumber = new int[arr.length];
            int i = 0;
                for(int j = 0; j<arr.length; j++){
                  if(Math.abs(arr[j]) >= 10 && Math.abs(arr[j]) <= 100) {
                      sumOfNumber[i] = Math.abs(arr[j]) % 10;
                      sumOfNumber[i] += Math.abs(arr[j]) / 10;
                      i++;
                  }
                }
        int maxSum = 0;
            for(i = 0; i < sumOfNumber.length; i++){
                if(maxSum < sumOfNumber[i]){
                    maxSum = sumOfNumber[i];
                }
            }
        ////////////////Task 5-6//////////////
        int[] stovb = new int[ar.length];
        int[] ryadok = new int[ar.length];
        for( i = 0; i < ar.length; i++){
            for (int j = 0; j < ar.length; j++){
                ryadok[i] += ar[i][j];
                stovb[i] += ar[j][i];
            }
        }
        int maxRyad = 0;
        int maxStovb = 0;
        for(i = 0; i< stovb.length;i++){
            if(maxRyad < stovb[i]){
                maxRyad = stovb[i];
            }
            if(maxStovb < ryadok[i]){
                maxStovb = ryadok[i];
            }
        }
        ////////////////////////////////////
        System.out.println("[Task 1] Abs min " + arr[counter]);
        System.out.println("[Task 2] Position " + counter);
        System.out.println("[Task 3] Max + min " + sumMaxMin);
        System.out.println("[Task 4] Max " + maxSum);
        System.out.println("[Task 5] Max Ryad " + maxRyad);
        System.out.println("[Task 6] Max Stovb " + maxStovb);
    }
}
