/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

import java.util.ArrayList;
import java.util.List;
import modelo.Estudante;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author 50enta
 */
public class EstudanteControlo implements Crud {

    //configurações do hibernate
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();
    private Session sessao;

    private List<Estudante> estudantes = null;

    @Override
    public boolean salvar(Object objecto) {
        sessao = factory.openSession();
        getSessao().beginTransaction();
        getSessao().save((Estudante) objecto);
        getSessao().getTransaction().commit();
        getSessao().close();
        this.actualizar();
        return true;
    }

    @Override
    public Object Pesquisar(String nome) {
        for (Estudante a : this.getEstudantes()) {
            if (a.getNomeEstudante().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public boolean remover(Object objecto) {
        sessao = factory.openSession();
        getSessao().beginTransaction();
        getSessao().delete((Estudante) objecto);
        getSessao().getTransaction().commit();
        getSessao().close();
        this.actualizar();
        return true;
    }

    @Override
    public boolean actualizar() {
        sessao = factory.openSession();
        getSessao().beginTransaction();
        estudantes = sessao.createCriteria(Estudante.class).list();
        getSessao().getTransaction().commit();
        getSessao().close();
        return true;
    }

    /**
     * @return the factory
     */
    public SessionFactory getFactory() {
        return factory;
    }

    /**
     * @param factory the factory to set
     */
    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }

    /**
     * @return the sessao
     */
    public Session getSessao() {
        return sessao;
    }

    /**
     * @param sessao the sessao to set
     */
    public void setSessao(Session sessao) {
        this.sessao = sessao;
    }

    /**
     * @return the estudantes
     */
    public List<Estudante> getEstudantes() {
        this.actualizar();
        return estudantes;
    }

    /**
     * @param estudantes the estudantes to set
     */
    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

}
