//@ADM_04JUL2026 Exercicio Módulo 2: JAVA. Tema 1 - Tarefa2: Palindromo

import java.util.Scanner;

/**
 * Um palíndromo é uma palavra ou frase que se lê igual, tanto quando se começa pelo princípio como
 * pelo final. No nosso caso, o método não é sensível às diferenças entre maiúsculas e minúsculas e
 * apenas terá em conta os caracteres ASCII situados entre o “A” e o “Z”' (ou o “a” e o “z”). Espaços e
 * caracteres especiais serão ignorados.
 * Nessa atividade prática, deverás implementar a função boolean ePalindromo(String) que dado
 * uma String passado por parâmetro, devolve um valor booleano indicando se essa String é palíndromo
 * ou não.
 */
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduza o texto: ");
        String texto = in.nextLine();
        Palindromo p = new Palindromo();
        System.out.println("O texto introduzido: "+"'"+texto + "'"+" é um palindromo? --> "+p.ePalindromo(texto));
    }
}