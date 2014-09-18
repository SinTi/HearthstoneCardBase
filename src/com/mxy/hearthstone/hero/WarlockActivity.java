package com.mxy.hearthstone.hero;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import com.mxy.hearthstone.R;
import com.mxy.hearthstone.fragment.CardsFragment;

/**
 * 术士
 */
public class WarlockActivity extends Activity {

    private ScrollView sv_fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //db = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.warlock);
        sv_fragment = (ScrollView) findViewById(R.id.sv_fragment);
    }

    public void costClick(View view) {
        int id = view.getId();
        // 获得Fragment管理器对象
        FragmentManager fm = getFragmentManager();

        // 获得一个Fragment的事物对象
        FragmentTransaction ft = fm.beginTransaction();
        CardsFragment cardsFragment = (CardsFragment) getFragmentManager().findFragmentById(R.id.fl_fragment);
        switch (id) {
            case R.id.bt_costAll:
                // 进行操作: 把Activity布局中的Framelayout替换成FragmentAll
                ft.replace(R.id.fl_fragment, cardsFragment.newInstance("warlock", -1));
                // ft.replace(R.id.fl_fragment, new FragmentAll());
                break;
            case R.id.bt_cost0:
                // 进行操作: 把Activity布局中的Fragment替换成FragmentAll
                // ft.replace(R.id.fl_fragment, new Fragment0());
                ft.replace(R.id.fl_fragment, cardsFragment.newInstance("warlock", 0));
                break;
            case R.id.bt_cost1:
                ft.replace(R.id.fl_fragment, cardsFragment.newInstance("warlock", 1));
                break;
            case R.id.bt_cost2:
                ft.replace(R.id.fl_fragment, cardsFragment.newInstance("warlock", 2));
                break;
            case R.id.bt_cost3:
                ft.replace(R.id.fl_fragment, cardsFragment.newInstance("warlock", 3));
                break;
            case R.id.bt_cost4:
                ft.replace(R.id.fl_fragment, cardsFragment.newInstance("warlock", 4));
                break;
            case R.id.bt_cost5:
                ft.replace(R.id.fl_fragment, cardsFragment.newInstance("warlock", 5));
                break;
            case R.id.bt_cost6:
                ft.replace(R.id.fl_fragment, cardsFragment.newInstance("warlock", 6));
                break;
            case R.id.bt_cost7plus:
                ft.replace(R.id.fl_fragment, cardsFragment.newInstance("warlock", 7));
                break;

        }
        sv_fragment.setVisibility(View.INVISIBLE);
        // 把事物关闭
        ft.commit();

    }

}