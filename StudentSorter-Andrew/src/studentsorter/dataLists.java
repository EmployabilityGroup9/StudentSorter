/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsorter;

import java.util.ArrayList;

/**
 *
 * @author rwals
 */
public class dataLists {
    private ArrayList<String> dataList = new ArrayList();
    
    public ArrayList<String> getDataList(){
        return new ArrayList(dataList);
    }
    
    public void setDataList(ArrayList<String> dList){
        if(dList == null){
            throw new NullPointerException("No items in array");
        }
        this.dataList = dList;
    }
}
