package com.chin.oa.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class Md5Utils {
    public static String md5Digest(String source){
        return DigestUtils.md5Hex(source);
    }
    //加盐操作
    public static String md5Digest(String source,Integer salt){
        char[] chars = source.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i]+salt);
        }
        String target = new String(chars);
        System.out.println(target);
        String md5 = DigestUtils.md5Hex(target);
        return md5;
    }
}
