package com.fiberhome.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args:-XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class PermGenSpace {
    public static void main(String[] args) {
        List<String> strList=new ArrayList();
        for(int i=0;;i++)
           strList.add( String.valueOf(i+1).intern());
    }




}
