/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

public interface OperacoesPilha {
    
    
    public void inserir(Object o);
    public Object remover();
    public Object topo();
    public boolean vazio();
    public int pesquisa(Object o);
    
    
}
