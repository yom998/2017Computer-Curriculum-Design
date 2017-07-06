/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pers;

import java.util.Comparator;

/**
 *
 * @author hewro
 */
public class SortByPartitionSize implements Comparator<Partition>{

    @Override
    public int compare(Partition o1, Partition o2) {
        if (o1.getSize()< o2.getSize()) {
            return -1;
        }else if (o1.getSize() > o2.getSize()){
            return 1;
        }else{
            return 0;
        }
    }
    
}