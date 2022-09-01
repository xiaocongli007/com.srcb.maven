package com.test;

import com.test.util.DbHelper;

import javax.servlet.annotation.WebServlet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
@Author jiujiu
@Date 2022/8/31 - 下午2:02
*/

public class TestDBHelper {
    public static void main(String[] args) {
        String sql = "select * from users";
        List<Map<String, Object>> mapList = new DbHelper().executeQuery(sql);
        for(Map<String ,Object>map:mapList){
            Set<Map.Entry<String, Object>> entries = map.entrySet();
            for (Map.Entry<String,Object> entry:entries){
                System.out.print(entry.getKey());
                System.out.print(":");
                System.out.print(entry.getValue());
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
