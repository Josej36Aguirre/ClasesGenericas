
package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> claseGenerica = new ClaseGenerica<Integer>(15);
        claseGenerica.obtenerTipo();
        ClaseGenerica claseGenerica1 = new ClaseGenerica<>("Jose");
        claseGenerica1.obtenerTipo();
    }
}
