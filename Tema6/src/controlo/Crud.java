/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

/**
 *
 * @author 50enta
 */
public interface Crud {
    
    public boolean salvar(Object objecto);

    public Object Pesquisar(Object objecto);

    public boolean remover();

    public boolean actualizar();

}
