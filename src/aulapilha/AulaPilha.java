/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapilha;

import java.util.Stack;

public class AulaPilha {

    public static void main(String[] args) {
        Stack pilha = new Stack();
        
        
        pilha.push(12);
        pilha.push(14);
        pilha.push("Test");
        pilha.pop();
        
        System.out.println(pilha.search(144));
        
        
        
        
    }
    
}
