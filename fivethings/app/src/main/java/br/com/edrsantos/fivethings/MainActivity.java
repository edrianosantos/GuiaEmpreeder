package br.com.edrsantos.fivethings;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        fullScreencall();
    }

    public void opcaoOne(View view) {
        TextView txtOp1 = (TextView) findViewById(R.id.txtConteudoOp1);
        Button btnOp1 = (Button) findViewById(R.id.btnOp1);
        btnOp1.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_alpha));
//        LinearLayout llOp1 = (LinearLayout) findViewById(R.id.llOp1);

        try {
            if (txtOp1.getVisibility() == View.GONE) {
                txtOp1.setVisibility(View.VISIBLE);
                txtOp1.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_in_left));
                btnOp1.setBackgroundResource(R.drawable.btn_border_green);

//                btnOp1.setBackgroundResource(R.drawable.screen_border_white);
//                llOp1.setBackgroundResource(R.drawable.screen_border_blue);
            } else {
//                txtOp1.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_out_up));
                btnOp1.setBackgroundResource(R.drawable.btn_style);
                txtOp1.setVisibility(View.GONE);

//                btnOp1.setBackgroundResource(R.drawable.screen_border_blue);
//                llOp1.setBackgroundResource(R.drawable.screen_border_white);
            }
        } catch (Exception e) {
        }

    }

    public void opcaoTwo(View view) {
        TextView txtOp2 = (TextView) findViewById(R.id.txtConteudoOp2);
        Button btnOp2 = (Button) findViewById(R.id.btnOp2);
        btnOp2.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_alpha));
//        LinearLayout llOp2 = (LinearLayout) findViewById(R.id.llOp2);

        try {
            if (txtOp2.getVisibility() == View.GONE) {
                txtOp2.setVisibility(View.VISIBLE);
                txtOp2.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_in_left));
                btnOp2.setBackgroundResource(R.drawable.btn_border_green);
//                llOp2.setBackgroundResource(R.drawable.screen_border_blue);
            } else {
//                txtOp2.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_out_up));
                btnOp2.setBackgroundResource(R.drawable.btn_style);
                txtOp2.setVisibility(View.GONE);

//                llOp2.setBackgroundResource(R.drawable.screen_border_white);
            }
        } catch (Exception e) {
        }

    }

    public void opcaoThree(View view) {
        TextView txtOp3 = (TextView) findViewById(R.id.txtConteudoOp3);
        Button btnOp3 = (Button) findViewById(R.id.btnOp3);
        btnOp3.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_alpha));
//        LinearLayout llOp3 = (LinearLayout) findViewById(R.id.llOp3);

        try {
            if (txtOp3.getVisibility() == View.GONE) {
                txtOp3.setVisibility(View.VISIBLE);
                txtOp3.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_in_left));
                btnOp3.setBackgroundResource(R.drawable.btn_border_green);
//                llOp3.setBackgroundResource(R.drawable.screen_border_blue);
            } else {
//                txtOp3.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_out_up));
                btnOp3.setBackgroundResource(R.drawable.btn_style);
                txtOp3.setVisibility(View.GONE);
//                llOp3.setBackgroundResource(R.drawable.screen_border_white);
            }
        } catch (Exception e) {
        }
    }

    public void opcaoFour(View view) {
        TextView txtOp4 = (TextView) findViewById(R.id.txtConteudoOp4);
        Button btnOp4 = (Button) findViewById(R.id.btnOp4);
        btnOp4.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_alpha));
//        LinearLayout llOp4 = (LinearLayout) findViewById(R.id.llOp4);

        try {
            if (txtOp4.getVisibility() == View.GONE) {
                txtOp4.setVisibility(View.VISIBLE);
                txtOp4.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_in_left));
                btnOp4.setBackgroundResource(R.drawable.btn_border_green);
//                llOp4.setBackgroundResource(R.drawable.screen_border_blue);
            } else {
//                txtOp4.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_out_up));
                btnOp4.setBackgroundResource(R.drawable.btn_style);
                txtOp4.setVisibility(View.GONE);
//                llOp4.setBackgroundResource(R.drawable.screen_border_white);
            }
        } catch (Exception e) {
        }
    }

    public void opcaoFive(View view) {
        TextView txtOp5 = (TextView) findViewById(R.id.txtConteudoOp5);
        Button btnOp5 = (Button) findViewById(R.id.btnOp5);
        btnOp5.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_alpha));
//        LinearLayout llOp5 = (LinearLayout) findViewById(R.id.llOp5);

        try {
            if (txtOp5.getVisibility() == View.GONE) {
                txtOp5.setVisibility(View.VISIBLE);
                txtOp5.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_in_left));
                btnOp5.setBackgroundResource(R.drawable.btn_border_green);
//                llOp5.setBackgroundResource(R.drawable.screen_border_blue);
            } else {
//                txtOp5.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_out_up));
                btnOp5.setBackgroundResource(R.drawable.btn_style);
                txtOp5.setVisibility(View.GONE);
//                llOp5.setBackgroundResource(R.drawable.screen_border_white);
            }
        } catch (Exception e) {
        }
    }

    public void fullScreencall() {
        if (Build.VERSION.SDK_INT < 19) { //19 or above api
            View v = this.getWindow().getDecorView();
            v.setSystemUiVisibility(View.GONE);
        } else {
            //for lower api versions.
            View decorView = getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }

    //    private void animation(){
//        boolean isClicked=false;
//        LinearLayout mLayoutTab = (LinearLayout)findViewById(R.id.linearlayout);
//
//        if(isClicked){
//            isClicked = false;
//            mLayoutTab.animate()
//                    .translationYBy(120)
//                    .translationY(0)
//                    .setDuration(getResources().getInteger(android.R.integer.config_mediumAnimTime));
//
//        }else{
//            isClicked = true;
//            mLayoutTab.animate()
//                    .translationYBy(0)
//                    .translationY(120)
//                    .setDuration(getResources().getInteger(android.R.integer.config_mediumAnimTime));
//        }
//    }

}
