package com.rioverde.whiteboards;

public class N_T {

    public static String toCamelCase(String s) {
        StringBuffer sb = new StringBuffer();
        s = s.toLowerCase();
        String [] chunks = s.split(" ");
        boolean isFirst = true;
        for(String chunk : chunks) {
            if( isFirst) {
                sb.append(chunk);
                isFirst = false;
            }
            else {
                sb.append(chunk.substring(0,1).toUpperCase());
                sb.append(chunk.substring(1));
            }
        }

        return sb.toString();
    }

}
