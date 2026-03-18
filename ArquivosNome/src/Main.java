import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String path = "C:\\Windows\\Temp\\nomes.txt";
        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();
        String linha;

        try(BufferedWriter bf = new BufferedWriter(new FileWriter(path, true))){
            bf.write(nome);
            bf.newLine();
        }
        catch (IOException e){
            System.out.print("Deu ruim ein...");
            e.getMessage();
        }

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }
        catch(IOException a){
            System.out.println("Deu ruim ein");
            a.getMessage();
        }


    }
}