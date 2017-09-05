/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

public class Pilha implements OperacoesPilha{
    
    private Object[] elementos;
    private final int TAMANHO_INICIAL = 10;
    private int size;
    
    
    public Pilha(){
        elementos = new Object[TAMANHO_INICIAL];
        size = 0;
    }

    
    
    @Override
    public void inserir(Object objecto) throws IndexOutOfBoundsException{
        if(size >= TAMANHO_INICIAL)
            throw new IndexOutOfBoundsException("StackOverFlow");
        elementos[size++] = objecto;    
    }

    @Override
    public Object remover() throws IndexOutOfBoundsException{
        if(this.vazio())
            throw new IndexOutOfBoundsException("StackUnderFlow");
        Object objecto = elementos[size-1];
        elementos[--size] = null;
        return objecto;
    }

    @Override
    public Object topo() {
        if(this.vazio())
            throw new IndexOutOfBoundsException("StackUnderFlow");
        return elementos[size-1];
    }

    @Override
    public boolean vazio() {
        return size == 0;
    }

    @Override
    public int pesquisa(Object obj) {

        for(int i =0; i< size; i++)
            if(obj.equals(elementos[i]))
                return size-i;
        return -1;
    }
    
    
    
    
}
