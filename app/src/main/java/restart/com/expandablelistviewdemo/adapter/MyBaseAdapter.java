package restart.com.expandablelistviewdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import java.util.List;

/**
 * Created by Administrator on 2018/2/20.
 */

public abstract class MyBaseAdapter extends BaseExpandableListAdapter {
    private Context context;
    protected LayoutInflater minInflater;
    private List<String> groups;
    private List<List<String>> childs;
    public MyBaseAdapter(Context context) {
        this.context = context;
        minInflater = LayoutInflater.from(context);
    }

    public void addNewData(List<String> groups, List<List<String>> childs) {
        this.groups = groups;
        this.childs = childs;
    }


    /*获取组的数量*/
    @Override
    public int getGroupCount() {
        return groups.size();
    }
    /*获取组的id*/
    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }
    /*获取组的视图*/
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        return MyGroupView(groupPosition,convertView);
    }
    /*获取组的具体的内容*/
    @Override
    public String getGroup(int groupPosition) {
        return groups.get(groupPosition);
    }
    /*----------------------------------------*/
    /*获取子条目的数量*/
    @Override
    public int getChildrenCount(int groupPosition) {
        return childs.get(groupPosition).size();
    }
    /*获取子条目的id*/
    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }
    /*获取具体的子条目*/
    @Override
    public String getChild(int groupPosition, int childPosition) {
        return childs.get(groupPosition).get(childPosition);
    }
    /*获取子条目的视图*/
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        return MyChildView(groupPosition,childPosition,convertView);
    }

    public abstract View MyGroupView(int groupPosition,View convertView);
    public abstract View MyChildView(int groupPosition,int childPosition,View childView);

    @Override
    public boolean hasStableIds() {
        return false;
    }


    /*子条目是否可被点击*/
    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
