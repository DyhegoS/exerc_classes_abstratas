package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalEntity;
import entities.NaturalPerson;
import entities.TaxPlayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPlayer> taxPlayer = new ArrayList<>();
		
		System.out.print("Informe o número de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do " + i + "º contribuinte: ");
			System.out.print("Pessoa Física ou Juridica (f / j)? ");
			char typePerson = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Renda anual: ");
			double anualIncome = sc.nextDouble();
			if(typePerson == 'f') {
				System.out.print("Despesas Médicas: ");
				double healthExpenses = sc.nextDouble();
				taxPlayer.add(new NaturalPerson(anualIncome, name, healthExpenses));
			}else{
				System.out.print("Informe o número de funcionários: ");
				int numOfEmployess = sc.nextInt();
				taxPlayer.add(new LegalEntity(anualIncome, name, numOfEmployess));
			}
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("Impostos pagos pelos contrbuintes: ");
		for(TaxPlayer tp : taxPlayer) {
			System.out.print(tp.getName() + ": R$" + String.format("%.2f", tp.TaxCalc()) + "\n");
			sum += tp.TaxCalc();
		}
		System.out.println();
		System.out.println("Total de imposto arrecadado:");
		System.out.printf("R$ %.2f", sum);
		
		
		sc.close();
	}

}
