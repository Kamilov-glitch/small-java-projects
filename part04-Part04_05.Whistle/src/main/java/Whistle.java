/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Whistle {
    private String ses;
    
    public Whistle(String ses) {
        this.ses = ses;
    }
    
    public void sound() {
        System.out.println(this.ses);
    }
}
