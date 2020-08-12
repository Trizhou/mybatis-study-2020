package com.zhou.utils;

import java.util.UUID;

/**
 * @Description:
 * @Date: 2020/8/10 19:30
 **/
public class IDUtils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
