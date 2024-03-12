package test;

public class test6_while {
	public static void main(String[] args) {
		/*
		int year=2023, mon=12;
			int i;
			System.out.println("============"+ year+"년"+mon+"월"+ "============");
			for(i=1; i<=31; i++) {
				System.out.printf("%5d",i);
				if (i%7 == 0) {
				System.out.println();
					}
				*/
		
				 int i =0;
				  while (i++ <=31) {
				  if (i<=0) 
				  System.out.printf("%5s"," ");
				  else {
				  System.out.printf("%5d",i);
				  	if(i%7 == 2)
				  System.out.println();
				  }
				
				}
	}
}