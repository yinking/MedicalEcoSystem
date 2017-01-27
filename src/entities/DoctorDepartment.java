/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author GladysWang
 */
@Entity
@Table(name = "doctors_departments", catalog = "MedicalEcoSystem"
)
public class DoctorDepartment {

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "idDepartment", unique = true, nullable = false)
    public Integer getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    @Column(name = "department_id", nullable = false)

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Column(name = "department_name", length = 45)

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    private Integer idDepartment;
    private int departmentId;
    private String departmentName;

    @Override
    public String toString() {
        return departmentName; //To change body of generated methods, choose Tools | Templates.
    }

}
