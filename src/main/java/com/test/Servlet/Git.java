package com.test.Servlet;

import com.test.util.DbHelper;

import java.util.List;
import java.util.Map;

/*
@Author jiujiu
@Date 2022/9/1 - 下午2:40
*/
public class Git {
    public static void main(String[] args) {
        DbHelper dbHelper = new DbHelper();
        String sql = "select name from users";
        List<Map<String, Object>> mapList = dbHelper.executeQuery(sql);
        System.out.println(mapList);
    }
}
