package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		List<Person> list= new ArrayList<>();
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.printf("tax payer #",i+1,"data:");
			System.out.print("Individual or company (i/c)?");
			char b = sc.next().charAt(0);
			if(b=='i') {
				System.out.print("name:");
				String name = sc.next();
				System.out.print("Anual income:");
				double anualIncome= sc.nextDouble();
				System.out.print("Health expenditures:");
				Double heathExpenditures=sc.nextDouble();
				list.add(new Individual(name, anualIncome, heathExpenditures));
			}else {
				if(b=='c') {
				System.out.print("name:");
				String name = sc.next();
				System.out.print("Anual income:");
				double anualIncome= sc.nextDouble();
				System.out.print("Number of employees:");
				Integer employee=sc.nextInt();
				list.add(new Company(name, anualIncome, employee));
				
			}
		}
	}
		double sum=0;
		System.out.println("");
		System.out.println("TAXES PAID: ");
		for(Person person: list) {
			System.out.println(""+person.getName()+(String.format(" $ %.2f%n",person.Tax())));
			sum+= person.Tax();
		}
		
		System.out.printf("total taxes: %.2f%n",sum);
		
		sc.close();		
	}

}
