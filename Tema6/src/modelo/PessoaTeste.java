/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author 50enta
 */
public class PessoaTeste {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session sessao = factory.openSession();
        sessao.beginTransaction();

        Pessoa pess = new Pessoa();
        pess.setNome("Jeremias Marengula");
        pess.setCorOlhos("Azuls");
        pess.setDataNasc( new Date(12,13,2001));
        pess.setAltura(1.90);
        
        sessao.save(pess);
        sessao.getTransaction().commit();
        sessao.close();
        
    }
    
}
