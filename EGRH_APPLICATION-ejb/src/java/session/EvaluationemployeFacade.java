/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import bean.Evaluationemploye;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sara
 */
@Stateless
@LocalBean
public class EvaluationemployeFacade extends AbstractFacade<Evaluationemploye> implements EvaluationemployeFacadeLocal {
    @PersistenceContext(unitName = "EGRH_APPLICATION-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EvaluationemployeFacade() {
        super(Evaluationemploye.class);
    }
    
}
