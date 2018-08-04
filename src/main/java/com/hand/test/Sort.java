package com.hand.test;

import java.util.*;

/**
 * @author ZhengShuang
 * @date 2018/8/4 11:34
 */
public class Sort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i <= 50; i++) {
            Integer a = (int) (Math.random() * 100 + 1);
            list.add(a);
        }
        System.out.println("随机生成50个小于100的数,分别为: " + list);
        for (int i : list) {
            map.put(i / 10, new ArrayList<Integer>());
        }
        for (int i : list) {
            map.get(i / 10).add(i);
        }
        System.out.println("Map中的数据为:" + map.toString());

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, List<Integer>> entry = (Map.Entry<Integer, List<Integer>>) iterator.next();
            Collections.sort(entry.getValue());
        }
        System.out.println("排序后的Map为:" + map);
    }
}
