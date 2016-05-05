package com.example.win81user.myjmap;

/**
 * Created by Win81 User on 1/5/2559.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class List extends Activity {
    //@Bind(R.id.btn) Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

}
