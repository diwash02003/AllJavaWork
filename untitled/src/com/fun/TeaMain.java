package com.fun;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea();
        if(tea.Empty()){
            tea.Refill();
        }
        else {
            tea.Drink();
        }
    }
}
