package com.FileWorks;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserReaderIO {
    public List<User> getUserList(String fileName) throws FileNotFoundException {
        List<User> userList = new ArrayList<>();
        String directoryPath = System.getProperty("user.home")
                + File.separator+
                "Desktop"+File.separator+"FileWorks";
        File sourceFile = new File(directoryPath+ File.separator+fileName);
        Scanner scanner = new Scanner(sourceFile);

        while (scanner.hasNext()){
            String line =scanner.nextLine();
            String [] dataList = line.split(", ");

            userList.add(new User(dataList[0],dataList[1],dataList[2]));

            //System.out.println("RollNum : "+dataList[0] + " Name: "+dataList[1]+" phoneNumber: "+dataList[2]);
        }
        return  userList;
    }
}
