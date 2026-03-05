import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static  void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.println("Enter a number of products: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.printf("Product #%d data:\n", i);
            System.out.println("Common, used or imported (c/u/i)");
            char c = sc.next().charAt(0);

            if(c == 'c'){
                System.out.print("Enter the name of product: ");
                sc.nextLine();
                String namec = sc.nextLine();
                System.out.print("Enter de prices's product: ");
                double pricec = sc.nextDouble();

                Product pd = new Product(pricec, namec);
                list.add(pd);
            }
            else if(c == 'u'){
                System.out.print("Enter the name of product: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Enter de prices's product: ");
                double priceu = sc.nextDouble();
                System.out.printf("Enter the date of facture (dd/MM/yyyy): ");
                sc.nextLine();
                String dateTexto = sc.nextLine();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(dateTexto, formatter);

                UsedProduct pu = new UsedProduct(priceu, name, date);
                list.add(pu);
            }
            else if(c == 'i'){
                System.out.print("Enter the name of product: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Enter the prices's product: ");
                double price = sc.nextDouble();
                System.out.println("Enter the custom fee: ");
                double customFee = sc.nextDouble();

                ImportedProduct pi = new ImportedProduct(price, name, customFee);
                list.add(pi);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");

        for (Product pd: list){
            System.out.println(pd.priceTag());
        }

        sc.close();
    }
}
