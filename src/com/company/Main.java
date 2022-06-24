package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr= new int[5];
        Scanner s= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<=arr.length/2;i++){
            System.out.println(arr[i]);
        }
        for(int i=arr.length-1;i>arr.length/2;i--){
            System.out.println(arr[i]);
        }
    }
}
