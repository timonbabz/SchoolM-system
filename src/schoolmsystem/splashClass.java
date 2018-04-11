/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmsystem;
/**
 *
 * @author user
 */
public class splashClass {
    public static void main (String[]args){
        SmsSplash homesplash = new SmsSplash();
        homesplash.setVisible(true);
        SmsHome home = new SmsHome();
        
        try{
        for(int i = 0;i<=100;i++){
        Thread.sleep(40);
        homesplash.labelLoad.setText(Integer.toString(i)+"%");
        homesplash.progressSms.setValue(i);
        
        if (i == 100){
        homesplash.setVisible(false);
        home.setVisible(true);
        }
        //end of if clause
        }
        //end of try
        }catch(Exception e){}
    }
}