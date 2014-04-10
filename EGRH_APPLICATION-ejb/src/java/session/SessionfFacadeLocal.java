/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import bean.Inscription;
import bean.Planformation;
import bean.Sessionf;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sara
 */
@Local
public interface SessionfFacadeLocal {

    void create(Sessionf sessionf);

    void edit(Sessionf sessionf);

    void remove(Sessionf sessionf);

    Sessionf find(Object id);

    List<Sessionf> findAll();

    List<Sessionf> findRange(int[] range);

    int count();
    List<Inscription> loadInscription(Sessionf f);
    List<Sessionf> loadSessionf(Planformation p);
    List<Sessionf> listSession();
    
}
