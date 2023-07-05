/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.u2.arboles;

/**
 *
 * @author ACER
 */
public class ArbolBinario {
    private Nodo root;
    private int nivel;

    public ArbolBinario() {
        this.root = null;
        this.nivel = 0;
    }
    
    public String insertarNodo(int value){
        Nodo nuevoNodo = new Nodo(value);
        if (root == null){
            root = nuevoNodo;
            return "Ingresa la raiz";
        }
        Nodo actual = root;
        Nodo padre;
        
        while(true){
            padre = actual;
            if (value < actual.getValue()){
                actual = actual.getLeft();
                if (actual == null){
                    padre.setLeft(nuevoNodo);
                    return "Ingresa un valor menor y se va a la izquierda en el nivel";
                }
            } else if (value > actual.getValue()){
                actual = actual.getRight();
                if (actual == null){
                    padre.setRight(nuevoNodo);
                    return "Ingreso un valor mayor y se va a la derecha en el nivel";
                }
            } 
        }
    }
    
    
    
}
