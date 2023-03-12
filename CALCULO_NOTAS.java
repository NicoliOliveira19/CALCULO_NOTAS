
/**
 * Faça um programa em Java que calcula a media de notas de uma turma supondo que seja (prova 1 + prova 2 + prova 3 + media trabalhos 1,2,3/4).
 * 
 * Nicoli 
 * 11/03/23
 */
import java.util.Scanner;
public class CALCULO_NOTAS
{
    public static void main (String args[]){
        Scanner t = new Scanner (System.in);
        double prova1 = 0.0, prova2 = 0.0, prova3 = 0.0, trabalho1 = 0.0, trabalho2 = 0.0, trabalho3 = 0.0, resultado, media;
        
        System.out.println("\fInforme a nota da prova 1:");
        prova1 = t.nextDouble();
        
        System.out.println("Informe a nota da prova 2:");
        prova2 = t.nextDouble();
        
        System.out.println("Informe a nota da prova 3:");
        prova3 = t.nextDouble();
        
        System.out.println("Informe a nota do trabalho 1:");
        trabalho1 = t.nextDouble();
        
        System.out.println("Informe a nota do trabalho 2:");
        trabalho2 = t.nextDouble();
        
        System.out.println("Informe a nota do trabalho 3:");
        trabalho3 = t.nextDouble();
        
        media = (trabalho1 + trabalho2 + trabalho3)/3;
        
        
        System.out.println("Sua média de trabalhos: " + media + " Sua nota final é: " + (prova1 + prova2 + prova3 + media)/4);
        resultado = t.nextDouble();
    }
}
