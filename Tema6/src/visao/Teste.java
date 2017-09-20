package visao;

import controlo.EstudanteControlo;
import modelo.Estudante;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author 50enta
 */
public class Teste {

    public static void main(String[] args) {

        EstudanteControlo est = new EstudanteControlo();

//        Estudante est1 = new Estudante();
//        est1.setNomeEstudante("Micaela");
//        est1.setNumeroEstudante("12334");
//        est1.setNota1(19);
//        est1.setNota1(10);
//        est1.setNota1(13);
//        est.salvar(est1);
//        Estudante est2 = new Estudante();
//        est2.setNomeEstudante("Cinquenta");
//        est2.setNumeroEstudante("12334");
//        est2.setNota1(4);
//        est2.setNota1(10);
//        est2.setNota1(20);
//        est.salvar(est2);

for(Estudante a: est.getEstudantes()){
    System.out.println(a.toString());
}

    }

}
