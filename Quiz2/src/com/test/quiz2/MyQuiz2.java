package com.test.quiz2;

import java.util.Scanner;

public class MyQuiz2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			Scanner Sin=new Scanner(System.in);
			
			int Numin;
			String end = "Y";
			
			while(!end.equals("N")){
				if(!end.equals("Y"))
					System.out.println("Y�� N�� �Է����ּ���.");
				else{
					System.out.println("���ڸ� �Է��ϼ���.");
					Numin=in.nextInt();
					if(Numin==1){
						for(int i=5;i>=1;i--){
							for(int j=i;j<=5;j++)
								System.out.print("*");
							System.out.println("");
						}
					}
					else if(Numin==2){
						for(int i=5;i>=1;i--){
							for(int j=i-1;j>=1;j--)
								System.out.print(" ");
							for(int j=i;j<=5;j++)
								System.out.print("*");
							System.out.println("");
						}
					}
					else if(Numin==3){
						for(int i=1;i<=5;i++){
							for(int j=i-1;j>=1;j--)
								System.out.print(" ");
							for(int j=i;j<=5;j++)
								System.out.print("*");
							System.out.println("");
						}
					}
					else if(Numin==4){
						for(int i=1;i<=5;i++){
							for(int j=i;j<=5;j++)
								System.out.print("*");
							System.out.println("");
						}
					}
					else{
						System.out.println("�߸��� ���ڸ� �Է��ϼ˽��ϴ�.");
					}
				}
				System.out.print("��� �Ͻðڽ��ϱ�? (Y/N)");
				end=Sin.nextLine();
			}
	}

}
