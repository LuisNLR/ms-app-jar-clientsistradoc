/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pe.com.softlite.clientsistradoc;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import pe.com.softlite.clientsistradoc.view.JFrameLogin;

/**
 *
 * @author USER
 */
public class StartApplication {

    public static void main(String[] args) {
        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            System.out.println("info.getName(): " + "#######################");
            System.out.println("info.getName(): " + info.getName());
            System.out.println("info.getClassName(): " + info.getClassName());
        }

        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(StartApplication.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(StartApplication.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(StartApplication.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(StartApplication.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        }
        new JFrameLogin().setVisible(true);
    }
}
