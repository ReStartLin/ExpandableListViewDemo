package restart.com.expandablelistviewdemo.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import restart.com.expandablelistviewdemo.R;

/**
 * Created by Administrator on 2018/2/20.
 */

public class LocalAdapter extends MyBaseAdapter {

    public LocalAdapter(Context context) {
        super(context);

    }

    @Override
    public View MyGroupView(int groupPosition, View convertView) {
        View view = minInflater.inflate(R.layout.item_elv_group,null);
        TextView txtTitle = view.findViewById(R.id.txt_group_data);
        txtTitle.setPadding(30,0,0,0);
        txtTitle.setText(getGroup(groupPosition));

        return view;
    }

    @Override
    public View MyChildView(int groupPosition, int childPosition, View childView) {
        View cView = minInflater.inflate(R.layout.item_elv_child, null);
        TextView txtContent = cView.findViewById(R.id.txt_child_data);
        txtContent.setPadding(30,0,0,0);
        txtContent.setText(getChild(groupPosition,childPosition));
        return cView;
    }
}
