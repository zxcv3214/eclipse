package test;

import java.io.InputStream;
import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		
		InputStream in = System.in;
		Scanner sc= new Scanner(in);
		
		System.out.println("limit를 입력하세요>");
		System.out.println("listcount를 입력하세요>");
		int limit=sc.nextInt();
		int listcount=sc.nextInt();
		
		int maxpage = (limit-1)/10;
		
		int maxpage1 = (listcount-1)/5;
		System.out.println(maxpage1+1);
		
		sc.close();
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("limit :");
		int limit = sc.nextInt();
		
		System.out.println("lisycount :");
		int listcount=sc.nextInt();
		
		int maxpage1 = (listcount-1)/limit+1;
		System.out.println(listcount + "=>" + maxpage1);
		
		int maxpage2 = (listcount - 1 + limit) / limit;
		System.out.println(listcount + "=>" + maxpage2);
		
		sc.close();
		*/
	}
}