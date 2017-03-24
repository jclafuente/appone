/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.cajamarca.appone.services;

import ec.cajamarca.appone.entities.Projecto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jlafuente
 */
@Stateless
public class ProjectoFacade extends AbstractFacade<Projecto> {

    @PersistenceContext(unitName = "ec.cajamarca_ec.cajamarca.appone_war_1.0.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProjectoFacade() {
        super(Projecto.class);
    }

}
