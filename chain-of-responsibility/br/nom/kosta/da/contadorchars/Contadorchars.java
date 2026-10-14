/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.nom.kosta.da.contadorchars;

import java.util.Scanner;

/**
 *
 * @author Dhiego da Costa
 */
public class Contadorchars {

    public static void main(String[] args) {
        
        String chars;
        String input;
        if (args.length == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Caracteres a serem contados (espaço será considerado):");
            chars = sc.nextLine();
            if (chars.length() == 0) {
                System.out.println("Sem caracteres para contar, não há o que fazer");
                return;
            }
            System.out.println("Texto a ser contado:");
            input = sc.nextLine();
            sc.close();
        } else {
            chars = args[0];
            input = args[1];
        }
        char c;
        ContaCharChain ccc = null;
        for (int i=0; i < chars.length(); i++) {
            c = chars.charAt(i);
            if (ccc == null) {
                ccc = new ContaCharChain(c, ContadorMediator.getInstance());
            } else {
                ccc.setNext(new ContaCharChain(c, ContadorMediator.getInstance()));
            }
        }
        if (ccc == null) {
            System.out.println("Erro inesperado, saindo.");
            return;
        }
        for (int i=0; i < input.length(); i++) {
            ccc.count(input.charAt(i));
        }
        ccc.report();
        System.out.println("Estatísticas:");
        System.out.println(ContadorMediator.getInstance().getStats());
    }
}
