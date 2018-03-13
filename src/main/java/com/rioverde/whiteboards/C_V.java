package com.rioverde.whiteboards;

public class C_V {

    public static int[] reverseArray(int[] arr) {
        for(int i = 0; i < arr.length / 2; i ++) {
            int idx = arr.length - 1 -i;
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    private static final char[] VOWELS = new char[] {'a','e','i','o','u', 'A','E','I','O','U'};

    public static String removeSingleVowel(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i ++ ) {
            if( !isVowel(s.charAt(i))) {
                sb.append(s.charAt(i));
                continue;
            }
            if( i + 1 < s.length()) {
                if (isVowel(s.charAt(i)) && isVowel(s.charAt(i + 1))) {
                    sb.append(s.substring(i, i + 2));
                    i += 1;
                } else if (isVowel(s.charAt(i)) && !isVowel(s.charAt(i + 1))) {
                    continue;
                }
            }
        }

        return sb.toString();
    }

    private static boolean isVowel(char ch) {

        for(int i = 0; i< VOWELS.length; i++) {
            if( ch == VOWELS[i] ){
                return true;
            }
        }

        return false;
    }
}
