/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.DrugGraphData;
import entities.PatientGraphData;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;

/**
 *
 * @author GladysWang
 */
public class DrugGraphDataDao extends AbstractModel<DrugGraphData> {

    public List<DrugGraphData> getPatientAdmissionYearMonth() {
        List<DrugGraphData> objects = null;
        SQLQuery sqlq = null;

        try {
            tx = session.beginTransaction();
            sqlq = session.createSQLQuery("select c.name as CompoundName,count(*) as CompoundUsedNumber From Drug_has_Compound dhc join Compound c on\n"
                    + " c.idCompound=dhc.idCompound Group BY dhc.idCompound");
            objects = sqlq.setResultTransformer(Transformers.aliasToBean(DrugGraphData.class)).list();
//            System.out.println(objects.size());
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
        }
        return objects;
    }
}
