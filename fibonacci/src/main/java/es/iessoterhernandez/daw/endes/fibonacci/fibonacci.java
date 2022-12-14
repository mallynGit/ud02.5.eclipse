package es.iessoterhernandez.daw.endes.fibonacci;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class fibonacci {
private Scanner sc;

public void showSequence() {
        int a=0,b=1,sum=b+a;
        sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres ver?");
        int num = sc.nextInt();
        for(int i=0;i<=num;i++) {
        	if(i!=num) {System.out.print(sum+", ");}
        	else {System.out.print(sum+".");}
        	sum=b+a;a=b;b=sum;
        }
}
}

