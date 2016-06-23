package com.example.main;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ksenya on 22.06.16.
 */
public class Sorting {
    /*String[] i = {"1", "4", "9", "16", "9","7","4", "9", "11"};
    LinkedList mylist = new LinkedList(Arrays.asList(i));
    Collections.reverse(;
            Arrays.asList(i);
    //String[] a = Arrays.asList((T[]) i);*/

        //List<Integer> list = Arrays.asList(1, 4, 9, 16, 9, 7, 4, 9, 11);
        //System.out.print("fgg");
        //Collections.reverse(list);
        //System.out.println(list);
        public static void main(String[] args) throws Exception {
            List<Integer> list = Arrays.asList(1, 4, 9, 16, 9, 7, 4, 9, 11);
            //System.out.print("fgg");
            Collections.reverse(list);
            //System.out.println(list);
            String[] i = {"1", "4", "9", "16", "9","7","4", "9", "11"};
            //LinkedList mylist = new LinkedList(Arrays.asList(i));
            //mylist.sort(Collections.reverseOrder());
            Collections.reverse(Arrays.asList(i));
            String[] b = i;
            System.out.print(Arrays.asList(b));
            //String[] a = (String[])mylist.toArray();
    //String[] a = Arrays.asList((T[]) i);*/

        }

}
