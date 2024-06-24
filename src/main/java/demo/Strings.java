package demo;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Strings {
    public static void main(String[] args) {
        String s = "sachin";
        System.out.println(s.concat(" tendulkar"));
        System.out.println(s);

        char[] c = s.toCharArray();
        for(char ch: c){
            System.out.println(ch);
        }

        System.out.println(new String(c));
        String s12 = new String();
        System.out.println(s12.valueOf(c));
        //String Tokenizer
        String s1 = "Bangalore,Pune,Mumbai,Delhi";

        System.out.println("***** Using Constructor 1 *****");
        StringTokenizer str1 = new StringTokenizer(s1);
        while(str1.hasMoreTokens())
            System.out.println(str1.nextToken());

        System.out.println("***** Using Constructor 2 *****");
        StringTokenizer str2 = new StringTokenizer(s1, ",");
        while(str2.hasMoreTokens())
            System.out.println(str2.nextToken());

        System.out.println("***** Using Constructor 3 *****");
        StringTokenizer str3 = new StringTokenizer(s1, ",", true);
        while(str3.hasMoreTokens())
            System.out.println(str3.nextToken());


        //String JOINER
        ArrayList<String> str = new ArrayList<>();
        str.add("Virat");
        str.add("Rohit");
        str.add("Surya");
        str.add("Gill");

        StringJoiner sj1 = new StringJoiner(",");
        // Using setEmptyValue() method
        sj1.setEmptyValue("sj1 is empty");
        System.out.println(sj1);

        // Using add() method
        sj1.add(str.get(0)).add(str.get(1));
        System.out.println(sj1);

        // Using length() method
        System.out.println("Length of sj1 : " + sj1.length());

        StringJoiner sj2 = new StringJoiner(":");
        sj2.add(str.get(2)).add(str.get(3));
        System.out.println(sj2);

        // Using merge() method
        sj1.merge(sj2);
        System.out.println(sj1);
        // Using toString() method
        System.out.println(sj1.toString());
        System.out.println("Length of new sj1 : " + sj1.length());

    }
}
