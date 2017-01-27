/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Compound;
import entities.Patients;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;



/**
 *
 * @author GladysWang
 */
public class PatientsDao extends AbstractModel<Patients>{
    
   

    public PatientsDao() {
    }
    public List<Patients> searchPatientsByName(String str) {
        List<Patients> objects = null;
        SQLQuery sqlq = null;

        try {
            tx = session.beginTransaction();
            sqlq = session.createSQLQuery("call searchPatientsByLastName(:str)");
            sqlq.setString("str", str);
            objects = sqlq.addEntity(Patients.class).list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
        }
        return objects;
    }
}
