package com.mycompany.provinhabolada;
import java.util.Scanner;
public class ProvinhaBolada2 {
 public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
//Declarando vetor
String []lutadores = new String[6];
lutadores[0] = "CHUNLI";
lutadores[1] = "ZANGIEF";
lutadores[2] = "BLANKA";
lutadores[3] = "GUILE";
lutadores[4] = "RYU";
lutadores[5] = "DHALSIM";
System.out.println("=======QUE COMECE AS LUTAS=======");
for (int i = 0;i<6;i++){
System.out.println("A sua "+(i+1)+"ª luta será contra: ");
System.out.println(lutadores[i]);
}
//vitórias
int vitorias;
System.out.println("Quantas lutas você venceu? ");
vitorias = ler.nextInt();
if (vitorias < 6) {
System.out.println("INSIRA OUTRA FICHA AMIGÃO");
} else {
System.out.println("HORAS DOS BOSSES, SE PREPARA");
}
 }
}
