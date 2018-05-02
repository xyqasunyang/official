package com.sun.official.google;


import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author suny
 * @version 1.0
 * @date 2018年04月16日
 */
public class GuavaMain {

    public static void main(String[] args) {
        java.util.Optional<Integer> test = java.util.Optional.ofNullable(null);
        test.orElse(100);
        System.out.println(test);
        Integer value1 = null;
        Integer value2 = 10;
       /*创建指定引用的Optional实例，若引用为null则快速失败返回absent()
         absent()创建引用缺失的Optional实例
        */
        Optional<Integer> a = Optional.fromNullable(value1);
        Optional<Integer> b = Optional.fromNullable(value2); //返回包含给定的非空引用Optional实例
        System.out.println(sum(a, b));
        Integer test1 = null;
        System.out.println(Preconditions.checkNotNull(1,"null"));
        StringBuilder sb=new StringBuilder();
        Joiner.on(",").skipNulls().appendTo(sb,"Hello","guava");
        System.out.println(sb);
        System.out.println(Joiner.on(",").useForNull("woshinull").join(1,null,3));
        System.out.println(Joiner.on(",").skipNulls().join(Arrays.asList(1,2,3,4,null,6)));
        Map<String,String> map=new HashMap<>();
        map.put("key1","value1");
        map.put("key2","");
        map.put("key3","value3");
        System.out.println(Joiner.on(",").withKeyValueSeparator("=").join(map));

        String str = "{\n" +
                "  \"errCode\": 0,\n" +
                "  \"msg\": \"\",\n" +
                "  \"errShow\": true,\n" +
                "  \"data\": {\n" +
                "    \"sealName\": \"TC001--浙江省\",\n" +
                "    \"makeUser\": \"超级管理员\",\n" +
                "    \"approveReason\": \"fafasdf\",\n" +
                "    \"sealFileKey\": \"$bda90f8b-f944-4262-a63b-0d6008d91b5b$1138394662\",\n" +
                "    \"sealEndTime\": \"2019-01-31 14:14:40\",\n" +
                "    \"sealRequestId\": \"005a891c-8dee-4f59-82ad-7a31579afc0f\",\n" +
                "    \"issueDate\": \"2018-01-31 14:14:40\",\n" +
                "    \"departmentName\": \"TC001\",\n" +
                "    \"url\": \"data:image/png;base64,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\",\n" +
                "    \"issueUser\": \"超级管理员\",\n" +
                "    \"applyDate\": \"2018-01-08 14:59:28\",\n" +
                "    \"sealStartTime\": \"2018-01-31 14:14:40\",\n" +
                "    \"applyUser\": \"彧卿\",\n" +
                "    \"sealType\": 0,\n" +
                "    \"makeDate\": \"2018-01-08 16:34:17\",\n" +
                "    \"applyReason\": \"afdffd\",\n" +
                "    \"approveDate\": \"2018-01-08 16:34:07\",\n" +
                "    \"sealWay\": 1,\n" +
                "    \"approveUser\": \"超级管理员\",\n" +
                "    \"sealUserNames\": [\n" +
                "      \"彧卿\"\n" +
                "    ],\n" +
                "    \"certNames\": [\n" +
                "      \"测试001\"\n" +
                "    ]\n" +
                "  }\n" +
                "}";
        System.out.println(Splitter.on("url").split(str));
    }

    private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        //isPresent():如果Optional包含非null的引用（引用存在），返回true
        System.out.println("First param is present: " + a.isPresent());
        System.out.println("Second param is present: " + b.isPresent());

        System.out.println(a.orNull());
        Integer value1 = a.or(0);  //返回Optional所包含的引用,若引用缺失,返回指定的值
        Integer value2 = b.or(0); //返回所包含的实例,它必须存在,通常在调用该方法时会调用isPresent()判断是否为null
        return value1 + value2;
    }
}
