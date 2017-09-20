
package Ex01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author 50enta
 */
public class EstudanteTeste {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session sessao = factory.openSession();
        sessao.beginTransaction();

        Estudante est = new Estudante();
        est.setNomeEstudante("Samira Flávia");
        est.setNumeroEstudante("3445");
        est.setNota2(20);
        est.setNota1(11);
        est.setNota3(15);
        
        sessao.save(est);
        sessao.getTransaction().commit();
        sessao.close();
        
    }
    
}
