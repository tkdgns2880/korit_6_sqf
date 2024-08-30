package com.study.java_study.ch04_제어;

public class StringUtils {

    boolean isEmpty(String str) {
        if(str == null) {
            return true;
        }
        return str.equals("");  // null인 경우 true null이 아닌 경우 equals

    }
}
//  return str == null || str.equals("");