package com.hzbank.citylist;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.hzbank.citylist.utils.Constance;
import com.wbtech.ums.UmsAgent;

import static android.R.attr.start;
import static com.hzbank.citylist.utils.Constance.REQUEST_CITY_LIST;

public class MainActivity extends Activity {
private Button btnChooseCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChooseCity=(Button)findViewById(R.id.btn_city_list);
        btnChooseCity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,CityListActivity.class);
                startActivityForResult(intent, Constance.REQUEST_CITY_LIST);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       if(requestCode==REQUEST_CITY_LIST&&resultCode==RESULT_OK){
           btnChooseCity.setText(data.getStringExtra(Constance.KEY_PICKED_CITY));
       }

    }
}
