package ru.apache.maven;

import java.io.*;
import org.apache.commons.lang3.*;
import static java.lang.System.out;

public class App {
    public static void main( String[] args ) throws IOException {
        String str1 = "Hello World!";
    	/*
        out.println("Введите любую строку:");
    	BufferedReader scn = new BufferedReader(new InputStreamReader(System.in)); 
    	str1 = scn.readLine();
    	*/
        out.println("Ваша строка: " + str1);
    	
    	String str2 = StringUtils.upperCase(str1);
    	out.printf("Метод upperCase: %s\n", str2);
    	
    	String str3 = StringUtils.lowerCase(str1);
    	out.printf("Метод lowerCase: %s\n", str3);
    	
    	String str4 = StringUtils.reverse(str1);
    	out.printf("Метод reverse: %s\n", str4);
    	
    	String[] str5 = StringUtils.split(str1);
    	out.print("Метод split. Массив: ["); 
    	for(int i=0; i<str5.length; i++)
    		if (i==str5.length-1)
    			out.printf("\"%s\"", str5[i]);
    		else 
    			out.printf("\"%s\", ", str5[i]);
    	out.println("]"); 
    	
    	out.print("Метод countMatches. Количество пробелов: ");
    	out.println(StringUtils.countMatches(str1, " "));
    	
    	String str6 = StringUtils.remove(str1, " ");
    	out.printf("Метод remove: %s", str6);
    }
}

