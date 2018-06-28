/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordgamehack;

/**
 *
 * @author Shacks
 */
public class experimentWithScope {
    int i=0;
    anotherClass obj = new anotherClass();
    obj.met();
}

class anotherClass{
    public void met(){
        System.out.println(obj.i);
    }
}