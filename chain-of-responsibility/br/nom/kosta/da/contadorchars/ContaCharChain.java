/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.nom.kosta.da.contadorchars;

/**
 *
 * @author Dhiego da Costa
 */
public class ContaCharChain {
    protected ContaCharChain next;
    protected ContadorMediator contadorGeral;
    protected int cont;
    protected Character caractere;
    
    public ContaCharChain(char c, ContadorMediator contadorGeral) {
        this.contadorGeral = contadorGeral;
        this.caractere = c;
        this.next = null;
        this.cont = 0;
    }
    
    public char getChar() {
        return this.caractere;
    }
    
    public int getCount() {
        return this.cont;
    }
    
    public void setNext(ContaCharChain ccc) {
        if (this.caractere == ccc.getChar()) {
            return;
        }
        if (this.next == null) {
            this.next = ccc;
        } else {
            this.next.setNext(ccc);
        }
    }
    
    public void count(char c) {
        if (c == this.caractere) {
            this.cont++;
        } else {
            if (this.next != null) {
                this.next.count(c);
            }
        }
    }
    
    public void report() {
        this.contadorGeral.addCharCount(this);
        if (this.next != null) {
            this.next.report();
        }
    }
}
