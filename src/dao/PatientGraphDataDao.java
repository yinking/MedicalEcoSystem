/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.JoinSelectedCompound;
import entities.PatientGraphData;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;

/**
 *
 * @author GladysWang
 */
public class PatientGraphDataDao extends AbstractModel<PatientGraphData> {

    public List<PatientGraphData> getPatientAdmissionYearMonth() {
        List<PatientGraphData> objects = null;
        SQLQuery sqlq = null;

        try {
            tx = session.beginTransaction();
            sqlq = session.createSQLQuery("SELECT extract(year from registration_date) as year, extract(month from registration_date) as month, \n"
                    + "COUNT(*) as patientNum  FROM patients GROUP BY extract(year from registration_date), extract(month from registration_date) \n"
                    + "ORDER BY Year,MONTH");
            objects = sqlq.setResultTransformer(Transformers.aliasToBean(PatientGraphData.class)).list();
//            System.out.println(objects.size());
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
        }
        return objects;
    }
}
