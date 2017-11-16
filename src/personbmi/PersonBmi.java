/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personbmi;

/**
 *
 * @author MERC-LAB-01
 */
public class PersonBmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name="wedika";
        p1.ht=1.8;
        p1.wt=98;
        p1.age=34;
        p1.calculateBmi();
        System.out.println(p1.bmi);
        
               
    }
    
}
