/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.estructura.u2.arboles;

/**
 *
 * @author ACER
 */
public class EstructuraU2Arboles {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArbolBinario arbolBinario = new ArbolBinario();
        arbolBinario.insertarNodo(50);
        arbolBinario.insertarNodo(30);
        arbolBinario.insertarNodo(20);
        arbolBinario.insertarNodo(40);
        arbolBinario.insertarNodo(70);
        arbolBinario.insertarNodo(60);
        arbolBinario.insertarNodo(80);
        arbolBinario.insertarNodo(32);
        
        System.out.println("PreOrder\n");
        
        arbolBinario.preOrder();
        
        System.out.println("\nPostOrder\n");
        
        arbolBinario.postOrder();
        
    }
}
