package com.nicole.tileslogin.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 * 符合MD5加盐处理密码要求的加密工具类
 */
public class MD5Util {

    public static String getMD5Str(String password) {

        //生成一个随机数，帮助生成密码学中的salt

        Random random = new Random();

        StringBuilder stringBuilder = new StringBuilder(16);

        stringBuilder.append(random.nextInt(99999999)).append(99999999);

        int len = stringBuilder.length();

        if (len < 16) {

            for (int i = 0; i < 16 - len; i++) {

                stringBuilder.append("0");

            }

        }

        //生成最终的盐

        String salt = stringBuilder.toString();

        //最终需要被加密的是password;salt加在后面
        password=md5Hex(password+salt);

        char[] cs=new char[48];

        //48位，变换位置
        for(int i=0;i<48;i+=3){

            cs[i]=password.charAt(i/3*2);

            char c=salt.charAt(i/3);

            cs[i+1]=c;

            cs[i+2]=password.charAt(i/3*2+1);

        }

        return String.valueOf(cs);

    }

    /**

     * 实现字节数组和16位进制数的互转

     * @param str

     * @return

     */

    private static String md5Hex(String str){

        byte[] digest = null;

        try {

            MessageDigest md5 = MessageDigest.getInstance("md5");

            digest = md5.digest(str.getBytes("utf-8"));

        } catch (NoSuchAlgorithmException e) {

            e.printStackTrace();

        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();

            return "";

        }

        //16代表转换成16进制数

        String md5Str = new BigInteger(1, digest).toString(16);

        return md5Str;

    }

    /**

     * 验证加盐后密码是否还相同

     * @param password

     * @param md5str

     * @return

     */

    public static boolean getSaltverifyMD5(String password, String md5str) {

        char[] cs1 = new char[32];

        char[] cs2 = new char[16];

        for (int i = 0; i < 48; i += 3) {

            cs1[i / 3 * 2] = md5str.charAt(i);

            cs1[i / 3 * 2 + 1] = md5str.charAt(i + 2);

            cs2[i / 3] = md5str.charAt(i + 1);

        }

        String Salt = new String(cs2);

        return md5Hex(password + Salt).equals(String.valueOf(cs1));

    }
}
