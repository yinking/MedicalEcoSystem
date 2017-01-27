/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.JoinSelectedCompound;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;

/**
 *
 * @author GladysWang
 */
public class JoinSeletedCompoundDao extends AbstractModel<JoinSelectedCompound> {

    public JoinSeletedCompoundDao() {
    }

    
//    
//    drop procedure if exists selectedCompoundJionCompound;
//DELIMITER $$
//CREATE PROCEDURE selectedCompoundJionCompound(  IN _drugNumber     VARCHAR(45))
//BEGIN
//	select c.idCompound as id, c.molecularFormula as formula, c.name as name,
//    dhc.compoundWeight as weight,dhc.assignDate as assignDate
//    from Compound c join Drug_has_Compound dhc on c.idCompound=dhc.idCompound where dhc.drugNumber=_drugNumber;
//END $$
//DELIMITER ;
    
    
    public List<JoinSelectedCompound> findCompoundByDrugNumber(String str) {
        List<JoinSelectedCompound> objects = null;
        SQLQuery sqlq = null;

        try {
            tx = session.beginTransaction();
            sqlq = session.createSQLQuery("call selectedCompoundJionCompound(:str)");
            sqlq.setString("str", str);
            objects = sqlq.setResultTransformer(Transformers.aliasToBean(JoinSelectedCompound.class)).list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
        }
        return objects;
    }
}
