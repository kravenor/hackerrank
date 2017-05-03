package hackerrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simone
 */
public class ProveConLeDate {
    public static void main(String []args){
        
        String date1="07:05:45PM";
        DateFormat informat=new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outFormat=new SimpleDateFormat("HH:mm:ss");
        try {
            System.out.println(outFormat.format(informat.parse(date1)));
        } catch (ParseException ex) {
            Logger.getLogger(ProveConLeDate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}
