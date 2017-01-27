/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.math.BigInteger;

/**
 *
 * @author GladysWang
 */
public class PatientGraphData {

    private BigInteger patientNum;
    private Integer year;
    private Integer month;

    public BigInteger getPatientNum() {
        return patientNum;
    }

    public void setPatientNum(BigInteger patientNum) {
        this.patientNum = patientNum;
    }

    

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

   
}
