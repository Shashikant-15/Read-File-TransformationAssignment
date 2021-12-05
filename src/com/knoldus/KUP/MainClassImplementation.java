package com.knoldus.KUP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class MainClassImplementation {

    public static void main(String[] args) throws IOException {
        File file = new File("/home/knoldus/Desktop/Read-File-TransformationAssignment/src/com/knoldus/KUP/file.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        HashMap<String,Integer> map=new HashMap<String,Integer>();

        String st;

        while ((st = br.readLine()) != null) {
            String[] arr=st.split("\\s");
            for (String s : arr) {
                if (!map.containsKey(s))
                    map.put(s, 1);
                else
                    map.put(s, map.get(s) + 1);
            }
        }

        System.out.println(map);

    }
}
