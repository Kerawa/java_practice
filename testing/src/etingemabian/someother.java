/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package etingemabian;

/**
 *
 * @author mabian
 */
public class someother implements HumanBeing{
    private String name;

    @Override
    public String human_type(String type) {
        this.name = type;
        return type;
        
    }
    public void displayName()
    {
        System.out.println("The human name is "+ this.name);
    }
    public void error()
    {
        System.out.println("what did you add");
    }
    
}