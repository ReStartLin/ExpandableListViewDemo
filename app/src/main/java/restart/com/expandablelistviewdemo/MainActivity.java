package restart.com.expandablelistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import restart.com.expandablelistviewdemo.adapter.LocalAdapter;
import restart.com.expandablelistviewdemo.util.LocalData;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView mElv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mElv = findViewById(R.id.elv_local_data);
        loadLocal();
    }

    public void loadLocal() {
        LocalAdapter adapter = new LocalAdapter(this);
        adapter.addNewData(LocalData.getGroupData(), LocalData.getChildData());
        mElv.setAdapter(adapter);
    }
}
