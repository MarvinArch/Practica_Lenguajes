/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identificador;

/**
 *
 * @author alpha
 */
public enum caracter {
    A(97), B(98), C(99), D(100), E(101), F(102), G(103), H(104), I(105), J(106), K(107), L(108), M(109), N(110), O(111), P(112), Q(113), R(114), S(115), T(116), U(117), V(118), W(119), X(120), Y(121), Z(122);
    
    private int valor; 
    
    
    caracter(int s){
        valor=s;
    }
    
    int getVelocidad(){
        return valor;
    }
}
