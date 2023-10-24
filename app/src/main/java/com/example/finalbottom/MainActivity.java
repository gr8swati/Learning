package com.example.finalbottom;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity {
    MeowBottomNavigation meowBottomNavigation;
    RelativeLayout main_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_layout = findViewById(R.id.main_layout);

        meowBottomNavigation= findViewById(R.id.bottomNavigation);


        meowBottomNavigation.show(2,true);

        meowBottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.baseline_menu_24));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.baseline_document_scanner_24));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.baseline_account_circle_24));

        main_layout.setBackgroundColor(Color.parseColor("#FFBB86FC"));

        navigation();
    }

    private void navigation() {
        meowBottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch (model.getId()){
                    case 1:

                        main_layout.setBackgroundColor(Color.parseColor("#8692f7"));

                        break;
                    case 2:

                        main_layout.setBackgroundColor(Color.parseColor("#FFBB86FC"));
                          break;

                    case 3:

                        main_layout.setBackgroundColor(Color.parseColor("#FF018786"));
                          break;
                }

                return null;
            }
        });
    }

}