package com.fiberhome.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args:-Xmx20m -Xms20m
 */
public class HeapMemoryOverflow {

    public static final int _MB=1024*1024;

    public static void main(String[] args) {
        List byteList=new ArrayList<byte []>();
        for(int i=0;i<20;i++){
            byteList.add(new byte[_MB]);
        }

    }
}
