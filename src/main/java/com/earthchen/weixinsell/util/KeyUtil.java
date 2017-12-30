package com.earthchen.weixinsell.util;

import java.util.Random;

public class KeyUtil {

    /**
     * 生成唯一的主键
     * <p>
     * 格式: 时间+随机数
     *
     * 使用同步  线程安全
     *
     * @return
     */
    public static synchronized String genUniqueKey() {

        Random random = new Random();
        // 生成6位随机数
        Integer number = random.nextInt(900000) + 10000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
