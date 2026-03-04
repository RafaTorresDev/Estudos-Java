import Funcionarios.Employee;
import Funcionarios.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("Enter de number of employees: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.printf("Employee #%d data: \n", i);

            System.out.println("Outsourced (y/n)");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc. nextInt();

            System.out.print("Value for hour: ");
            double vh = sc.nextDouble();

            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(hours, name, vh, additionalCharge);
                list.add(emp);
            }
            else{
                Employee emp = new Employee(hours, name, vh);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("PAYMANT: ");
        for(Employee emp: list){
            System.out.println(emp.getName() +" - $ " + emp.paymant());
        }



        sc.close();
    }
}
