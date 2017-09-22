package com.example.administrator.mylinkedlistview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.mylinkedlistview2.Adapter.LeftListAdapter;
import com.example.administrator.mylinkedlistview2.Adapter.MainSectionedAdapter;
import com.example.administrator.mylinkedlistview2.View.PinnedHeaderListView;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    ListView leftListview;
    PinnedHeaderListView pinnedListView;
    private boolean isScroll = true;
    private LeftListAdapter adapter;

    private String[] leftStr = new String[]{"面食类", "盖饭", "寿司", "烧烤", "酒水", "凉菜", "小吃", "粥", "休闲"};
    private boolean[] flagArray = {true, false, false, false, false, false, false, false, false};
    private String[][] rightStr = new String[][]{{"热干面", "臊子面", "烩面"},
            {"番茄鸡蛋", "红烧排骨", "农家小炒肉"},
            {"芝士", "丑小丫", "金枪鱼"}, {"羊肉串", "烤鸡翅", "烤羊排"}, {"长城干红", "燕京鲜啤", "青岛鲜啤"},
            {"拌粉丝", "大拌菜", "菠菜花生"}, {"小食组", "紫薯"},
            {"小米粥", "大米粥", "南瓜粥", "玉米粥", "紫米粥"}, {"儿童小汽车", "悠悠球", "熊大", " 熊二", "光头强"}
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         leftListview = (ListView) findViewById(R.id.left_listview);
         pinnedListView = (PinnedHeaderListView) findViewById(R.id.pinnedListView);

//        ButterKnife.bind(this);
        pinnedListView = (PinnedHeaderListView) findViewById(R.id.pinnedListView);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        ButterKnife.unbind(this);
    }
}
