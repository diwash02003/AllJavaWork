package com.ListSetMap;

import java.util.List;

public class ListFunction {
    public  int  sumOfArraylist(List<Integer> sumList){
        int sum = 0;
        for(Integer sumOperation : sumList){
            sum += sumOperation;
        }
        return sum;
    }
    public  int smallestOfArray(List<Integer> smallestValue){

        int smallest = Integer.MAX_VALUE;
        for(Integer num : smallestValue){
            if(smallest>num){
                smallest = num;
            }
        }
        return smallest;
    }
    public  int largestOfArray(List<Integer> largestValue){

        int largest = Integer.MIN_VALUE;
        for(Integer num : largestValue){
            if(num >largest){
                largest = num;
            }
        }
        return largest;
    }

}
