package com.CollectionFrameWork;

import java.util.ArrayList;

public class Search{
    public int searchElement(ArrayList<String> arrayList , String target){
        for(int i = 0;i< arrayList.size(); i++){
            if(arrayList.get(i).equals(target)){
                return i;
            }
        }
        return -1;
    }
}
