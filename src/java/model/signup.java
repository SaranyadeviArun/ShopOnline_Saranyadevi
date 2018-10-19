/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author saranya
 */
public class signup {
        private String signuser, signemail, signpass1, signpass2;
       
    public String getSignuser() {
        return signuser;
    }

    public void setSignuser(String signuser) {
        this.signuser = signuser;
    }

    public String getSignemail() {
        return signemail;
    }

    public void setSignemail(String signemail) {
        this.signemail = signemail;
    }

    public String getSignpass1() {
        return signpass1;
    }

    public void setSignpass1(String signpass1) {
        this.signpass1 = signpass1;
    }

    public String getSignpass2() {
        return signpass2;
    }

    public void setSignpass2(String signpass2) {
        this.signpass2 = signpass2;
    }
        

    
}
