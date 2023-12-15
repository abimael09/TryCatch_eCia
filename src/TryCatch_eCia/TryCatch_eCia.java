package TryCatch_eCia;

//Importação usando Console.
import java.io.*;

import java.util.Scanner;

public class TryCatch_eCia{
    
    public static void main(String[] args){
        
        /*Um bloco “try” é chamado de bloco “protegido” porque, caso ocorra algum problema com os comandos dentro do bloco,
        a execução desviará para os blocos “catch” correspondentes.*/
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            // Entrada de dados Strings
            System.out.println("Click no cursor, digite um Texto e tecle enter:\n");
            String texto = br.readLine();
            System.out.println("Frase: "+texto+"\n");
            
            //Entrada de dados Inteiros
            System.out.println("Click no cursor, digite um número Inteiro e tecle enter:\n");
            String numeroInteiro = br.readLine();
            int numeroI = Integer.parseInt(numeroInteiro);
            System.out.println("Número Int = "+numeroI+"\n");
            
            // Entrada de dados Reais
            System.out.println("Click no cursor, digite um número Real e tecle enter:\n");
            String numeroReal = br.readLine();
            double numeroR = Double.parseDouble(numeroReal);
            System.out.println("Número Real = "+numeroR+"\n");

        }catch(IOException ex){
            System.out.println(" ERRO \n");
        }
        
        String n = "----------------------------------------------------------------------------\n";
        //1° Questao
        int num = 358;
        System.out.println(num+"   |   853\n");
        
        String v = "----------------------------------------------------------------------------\n";
        //2° Questão
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um Número:");
        int A = input.nextInt();
        
        System.out.println("Digite mais Número:");
        int B = input.nextInt();
        
        System.out.println("Digite outro Número:");
        int C = input.nextInt();
        
        int soma = A + B + C;
        System.out.println("Resultado = " + soma+"\n ");
    }
}
