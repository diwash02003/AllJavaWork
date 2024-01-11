package com.operationChecker;
import com.BankSystem.Account;
public class MathematicalOperation {
    boolean checkPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i =2;i<=num/2;i++){
            if(num%i==0){
                
                return false;
            }
        }
        return true;
    }
    void checkValueAsPrime(int value,Input input){
        if(checkPrime(value)){
            System.out.println("Input value "+ input.getInputValue()+" is prime");
        }
        else{
            System.out.println("Input value "+ input.getInputValue()+" is not prime");
        }
    }
    void findPrimeNumberInRange(int lower, int upper){
        System.out.println("Prime number between "+ lower+ " and "+upper+ ":");
        for(int i =lower;i<=upper;i++){
            if(checkPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    void findEvenNumberInRange(int lower, int upper){

        System.out.println("Even number between "+ lower+ " and "+upper+ ":");
        for(int i = lower;i<=upper;i++){
            if(i%2==0){

                System.out.print(i+ " ");
            }
        }
        System.out.println(" ");
    }

    void findPalindromeNumberInRange(int lower, int upper){

        System.out.println("Palindrome number between "+ lower+ " and "+upper+ ":");
        for(int i =lower;i<=upper;i++) {

            int num,remainder,reversedNum=0;
            num =i;
            while (num !=0) {
                remainder = num %10;
                reversedNum = reversedNum * 10 +remainder;
                num /=10;
                if (i==reversedNum) {
                    System.out.print(i +" ");
                }
            }
        }
        System.out.println(" ");
    }
//    void findSquareNumberInRange(int lower,int upper){
//        System.out.println("Square number between "+ lower+ " and "+upper+ ":");
//
//        int cnt =0;
//
//        for(int i =lower;i<=upper;i++){
//            for (int j = 1;j*j<=1;j++){
//                if(j*j ==i){
//
//                }
//            }
//        }
//
//    }
}