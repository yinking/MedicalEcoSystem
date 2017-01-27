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
public class DrugGraphData {

    private BigInteger CompoundUsedNumber;
    private String  CompoundName;

    public BigInteger getCompoundUsedNumber() {
        return CompoundUsedNumber;
    }

    public void setCompoundUsedNumber(BigInteger CompoundUsedNumber) {
        this.CompoundUsedNumber = CompoundUsedNumber;
    }

    public String getCompoundName() {
        return CompoundName;
    }

    public void setCompoundName(String CompoundName) {
        this.CompoundName = CompoundName;
    }
    

   
}
