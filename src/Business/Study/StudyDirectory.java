/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Study;

import java.util.ArrayList;

/**
 *
 * @author Ke Wang
 * 
 */
public class StudyDirectory {
    private ArrayList<Study> studyDir;

    public StudyDirectory(){
        studyDir = new ArrayList<Study>();
    }
    
    public ArrayList<Study> getStudyDir() {
        return studyDir;
    }
    
    public Study addStudy(){
        Study s = new Study();
        studyDir.add(s);
        return s;
    }
    
    public void addInStudy(Study s){
        studyDir.add(s);
    }
    
    public void removeProduct(Study s){
        studyDir.remove(s);
    }
    
    public Study searchProduct(String studyName){
        for(Study s : studyDir){
            if(s.getName().equals(studyName)){
                return s;
            }
        }
        return null; 
    }
}
