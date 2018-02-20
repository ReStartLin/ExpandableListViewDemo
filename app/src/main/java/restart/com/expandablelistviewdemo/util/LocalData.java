package restart.com.expandablelistviewdemo.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/2/20.
 */

public class LocalData {
    /**
     * 获取列表组数据
     *
     * @return
     */
    public static List<String> getGroupData() {
        List<String> groups = new ArrayList<>();
        groups.add("慕课网课程");
        groups.add("JAVA课程");
        return groups;


    }

    /**
     * 获取列表的子条目数据
     *
     * @return
     */
    public static List<List<String>> getChildData() {
        List<List<String>> childs = new ArrayList<>();
        List<String> item1 = new ArrayList<>();
        item1.add("Android 属性动画");
        item1.add("Android Activity生命周期");
        childs.add(item1);
        List<String> item2 = new ArrayList<>();
        item2.add("面向对象");
        item2.add("接口");
        item2.add("集合");
        childs.add(item2);
        return childs;
    }
}
