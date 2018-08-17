/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
 class CountSpace {

    public static void main(String[] args) {

        String word ="sdfdf";
        String data[];int k=0;
        data=word.split("");
        for(int i=0;i<data.length;i++){
            if(data[i].equals(" ")){
                k++;
            }

        }
        System.out.println(k);

    }
}
