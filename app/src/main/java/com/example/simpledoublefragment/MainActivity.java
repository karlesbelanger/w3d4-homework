package com.example.simpledoublefragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LeftFragment.CallbackComponent {

    private ImageView mImageView;

    private ListView mListView;
    private String[] name = {"karles", "aldo", "Mike", "Chris", "Edwin"};
    //private ArrayList<String> arrayList = new ArrayList<String>();
    private List<String> arrayList =  Arrays.asList(name);
    private ArrayAdapter<String> arrayAdapter;
    private TextView mTextView;
    private static final String TAG = MainActivity.class.getSimpleName();

    private static final String LEFT_FRAGMENT_TAG = "LEFT_FRAGMENT";
    private static final String RIGHT_FRAGMENT_TAG = "RIGHT_FRAGMENT";


    private LeftFragment mLeftFragment;
    private RightFragment mRightFragment = null;
    private Main_List mMain_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMain_list = new Main_List();
        mLeftFragment = new LeftFragment();

//        if(mRightFragment != null && mRightFragment.isAdded()) {
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.a_main_left, mLeftFragment, LEFT_FRAGMENT_TAG)
//                    .add(R.id.a_main_right, mRightFragment, RIGHT_FRAGMENT_TAG)
//                    .commit();
//        }else{
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.a_main_left, mLeftFragment, LEFT_FRAGMENT_TAG)
//                    .commit();
//            mRightFragment = new RightFragment();
//            if(getSupportFragmentManager().findFragmentById(R.id.a_main_right) != null) {
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .remove(
//                                getSupportFragmentManager()
//                                        .findFragmentById(R.id.a_main_right))
//                        .commit();
//                mRightFragment = null;
//            }
//        }
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.a_main_left, mLeftFragment, LEFT_FRAGMENT_TAG)
                .commit();
        if(getResources().getConfiguration().orientation == 2){
            mRightFragment = new RightFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.a_main_right, mRightFragment, RIGHT_FRAGMENT_TAG)
                    .commit();
        }

    }


    public void itemClicked(int n, String name) {
        Log.d(TAG, "buttonClicked: " + n);
        if (getResources().getConfiguration().orientation == 2){//mRightFragment != null && mRightFragment.isAdded()) {
            mRightFragment.loadImage(n);
       }else
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
}
