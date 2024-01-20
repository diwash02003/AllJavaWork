package com.ListSetMap;

import java.util.ArrayList;

public class LinkListDemo {
    public static void main(String[] args) {

        ArrayList<String> st = new ArrayList<>();

        st.add("hello");
        //st.add(",");
        st.add("whats up");
        st.add(1,"Diwash");
        st.addFirst("my name");
        st.addLast("Pokhrel");

        //st.removeFirst();
        st.remove("Pokhrel");
        st.removeLast();

        System.out.println(st);
    }
}
