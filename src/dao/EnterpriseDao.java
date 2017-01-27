/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Enterprise;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;



/**
 *
 * @author GladysWang
 */
public class EnterpriseDao extends AbstractModel<Enterprise>{
    
   

    public EnterpriseDao() {
    }
    
     public List<Enterprise> searchEnterpriseByIdCity(String str) {
        List<Enterprise> objects = null;
        SQLQuery sqlq = null;

        try {
            tx = session.beginTransaction();
            sqlq = session.createSQLQuery("select * from Enterprise where idCity=(:str)");
            sqlq.setString("str", str);
            objects = sqlq.addEntity(Enterprise.class).list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
        }
        return objects;
    }

    
    
}
