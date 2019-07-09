package com.aplicativo.lenovouser.meuaplicativo.Homogêneas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class HomogeneasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homogeneas);
    }

    public void unidimensionais(View view){
        Intent intent = new Intent(HomogeneasActivity.this, UnidimensionaisActivity.class);
        startActivity(intent);
    }

}
