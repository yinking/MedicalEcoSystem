/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Drug;
import java.math.BigInteger;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;

/**
 *
 * @author GladysWang
 */
public class DrugDao extends AbstractModel<Drug> {

    public DrugDao() {
    }

    public Integer findWhetherDrugExist(String str) {
        SQLQuery sqlq = null;
        BigInteger aa = null;
        try {
            tx = session.beginTransaction();
            sqlq = session.createSQLQuery("SELECT COUNT(1) FROM Drug  WHERE drugNumber=:str");
            sqlq.setString("str", str);
            aa = (BigInteger) sqlq.uniqueResult();
            System.out.println(aa + "aaaaaaaa");
            tx.commit();

        } catch (HibernateException e) {
            tx.rollback();
        }
        return aa.intValue();

    }

}
