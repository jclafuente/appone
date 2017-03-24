/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.cajamarca.appone.controllers;

import ec.cajamarca.appone.services.ProjectoFacade;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jlafuente
 */
@ManagedBean
@SessionScoped
public class ProyectoController {

    @EJB
    ProjectoFacade projectoFacade;

    @PostConstruct
    public void init() {

    }

    public void countProjects() {
        System.out.println(projectoFacade.count());
    }

}
