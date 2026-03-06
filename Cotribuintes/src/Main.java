import Entities.Pessoa;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            System.out.printf("Tax payer #%d data: \n", i);
            System.out.println("Individual or company (i/c)");
            char ch = sc.next().charAt(0);
            if(ch == 'i'){
                System.out.printf("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of emplyoees: ");
                int numEmp = sc.nextInt();
                Pessoa pI = new PessoaJuridica(name, anualIncome, numEmp);
                list.add(pI);
            }
            else if(ch == 'c'){
                System.out.printf("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double expenditures = sc.nextDouble();
                Pessoa pF = new PessoaFisica(name, anualIncome, expenditures);
                list.add(pF);
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        double total = 0;

        for(Pessoa pp: list){
            System.out.println(pp.calcularImposto());
            total += pp.calcularImposto();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: " + total);
        sc.close();
    }
}
