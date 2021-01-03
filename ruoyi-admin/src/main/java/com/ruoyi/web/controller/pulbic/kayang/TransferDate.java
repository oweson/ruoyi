package com.ruoyi.web.controller.pulbic.kayang;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.ReflectUtil;
import cn.hutool.core.util.StrUtil;

import java.lang.reflect.Method;

/**
 * @author oweson
 * @date 2020/12/24 22:22
 */


public class TransferDate {


    public static void main(String[] args) {
        String id="411321199009252949";
        System.out.println(IdcardUtil.getBirthByIdCard(id));


    }
}
