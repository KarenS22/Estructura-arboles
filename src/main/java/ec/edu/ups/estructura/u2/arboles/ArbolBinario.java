/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.u2.arboles;

import java.util.Stack;

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
    
    public void preOrder(){
        if (root == null){
            System.out.println("El arbol esta vacio:(");
            return;
        }
        Stack<Nodo> stack = new Stack<>();
        stack.add(root);
        
        while (!stack.isEmpty()){
            Nodo actual = stack.pop();
            System.out.print(actual.getValue() + " - ");
            if (actual.getRight() != null){
                stack.push(actual.getRight());
            }
            if (actual.getLeft() != null){
                stack.push(actual.getLeft());
            }
        }
    }
    
    public void postOrder(){
        if (root == null){
            return;
        }
        Stack<Nodo> stack = new Stack<>();
        Stack<Nodo> stackAux = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()){
            Nodo actual = stack.pop();
            stackAux.push(actual);
            
            if (actual.getLeft() != null){
                stack.push(actual.getLeft());
            }
            if (actual.getRight() != null){
                stack.push(actual.getRight());
            }
        }
        
        while(!stackAux.isEmpty()){
            System.out.print(stackAux.pop().getValue() + " - ");
        }
    }
    
    public void inOrder(){
        if (root == null){
            return;
        }
        
        Stack<Nodo> stack = new Stack<>();
        Nodo actual = root;
        
        while (actual != null || stack.isEmpty()){
            
            while (actual != null){
                stack.push(actual);
                actual = actual.getLeft();
            }
            
            actual = stack.pop();
            System.out.print(actual.getValue() + " - ");
            
            actual = actual.getRight();
        }
    }
    
    
    
}
