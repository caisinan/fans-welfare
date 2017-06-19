package com.fans.common.util;

import java.util.UUID;

/**
 * Created by caisinan on 2017/6/12.
 */
public class UuidUtil {
    public static String get32UUID() {
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }
    public static void main(String[] args) {
        System.out.println(get32UUID());
    }
}
