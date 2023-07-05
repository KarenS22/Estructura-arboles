/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.u2.arboles;

/**
 *
 * @author ACER
 */
public class Nodo {
    private int value;
    private Nodo left;
    private Nodo right;

    public Nodo(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Nodo{" + "value=" + value + ", left=" + left + ", right=" + right + '}';
    }
    
    
    
    
}
