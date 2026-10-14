/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.nom.kosta.da.contadorchars;

import java.util.HashMap;

/**
 *
 * @author Dhiego da Costa
 */
public class ContadorMediator {
    private static ContadorMediator instance = null;
    private HashMap<Character, Integer> conts;
    
    private ContadorMediator() {
        this.conts = new HashMap<>();
    }
    
    // Singleton
    public static ContadorMediator getInstance() {
        if (ContadorMediator.instance == null) {
            ContadorMediator.instance = new ContadorMediator();
        }
        return ContadorMediator.instance;
    }
    
    public void addCharCount(ContaCharChain sender) {
        // se ch ja existia, novo valor sobrescreve
        conts.put(sender.getChar(), sender.getCount());
    }
    
    public HashMap<Character, Integer> getStats() {
        return conts;
    }
}
