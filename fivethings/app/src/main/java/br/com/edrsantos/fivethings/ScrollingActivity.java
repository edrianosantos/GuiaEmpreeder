package br.com.edrsantos.fivethings;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class ScrollingActivity extends AppCompatActivity {

    TextView titleApp;
    boolean showMenu;
    Menu menu;

    //AVALIAÇÂO
    private Dialog rankDialog;
    float nota;
    RatingBar ratingBar;
    private TextView txtValorAvaliacao;
    //Sobre
    private Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        toolbar.setTitle("Empreender");

        titleApp = (TextView) findViewById(R.id.titleApp);
        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle("Guia Empreender");
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.expandedappbar);
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.BLACK);
        setSupportActionBar(toolbar);

        AppBarLayout appBar = (AppBarLayout) findViewById(R.id.app_bar);

//        PopupMenu p  = new PopupMenu(this, null);
//        this.menu = p.getMenu();
        AppBarLayout.OnOffsetChangedListener mListener = new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (collapsingToolbarLayout.getHeight() + verticalOffset < 2 * ViewCompat.getMinimumHeight(collapsingToolbarLayout)) {
                    titleApp.setBackgroundResource(R.color.btnColor);
                    toolbar.setLogo(R.drawable.books_48);
                    showMenu = true;
//                    onCreateOptionsMenu(menu);
                    onPrepareOptionsMenu(menu);
                } else {
                    titleApp.setBackgroundResource(R.color.green);
                    toolbar.setLogo(null);
                    showMenu = false;
//                    onCreateOptionsMenu(menu);
                    onPrepareOptionsMenu(menu);
                }
            }
        };

        appBar.addOnOffsetChangedListener(mListener);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                share();

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        fullScreencall();
    }

    @Override
    protected void onStart() {
        super.onStart();
        fullScreencall();
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

    public void opcaoOne(View view) {
        TextView txtOp1 = (TextView) findViewById(R.id.txtConteudoOp1);
        Button btnOp1 = (Button) findViewById(R.id.btnOp1);
        btnOp1.setAnimation(AnimationUtils.loadAnimation(ScrollingActivity.this, R.anim.anim_alpha));
//        LinearLayout llOp1 = (LinearLayout) findViewById(R.id.llOp1);

        try {
            if (txtOp1.getVisibility() == View.GONE) {
                txtOp1.setVisibility(View.VISIBLE);
                txtOp1.setAnimation(AnimationUtils.loadAnimation(ScrollingActivity.this, android.R.anim.slide_in_left));
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
        btnOp2.setAnimation(AnimationUtils.loadAnimation(ScrollingActivity.this, R.anim.anim_alpha));
//        LinearLayout llOp2 = (LinearLayout) findViewById(R.id.llOp2);

        try {
            if (txtOp2.getVisibility() == View.GONE) {
                txtOp2.setVisibility(View.VISIBLE);
                txtOp2.setAnimation(AnimationUtils.loadAnimation(ScrollingActivity.this, android.R.anim.slide_in_left));
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
        btnOp3.setAnimation(AnimationUtils.loadAnimation(ScrollingActivity.this, R.anim.anim_alpha));
//        LinearLayout llOp3 = (LinearLayout) findViewById(R.id.llOp3);

        try {
            if (txtOp3.getVisibility() == View.GONE) {
                txtOp3.setVisibility(View.VISIBLE);
                txtOp3.setAnimation(AnimationUtils.loadAnimation(ScrollingActivity.this, android.R.anim.slide_in_left));
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
        btnOp4.setAnimation(AnimationUtils.loadAnimation(ScrollingActivity.this, R.anim.anim_alpha));
//        LinearLayout llOp4 = (LinearLayout) findViewById(R.id.llOp4);

        try {
            if (txtOp4.getVisibility() == View.GONE) {
                txtOp4.setVisibility(View.VISIBLE);
                txtOp4.setAnimation(AnimationUtils.loadAnimation(ScrollingActivity.this, android.R.anim.slide_in_left));
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
        btnOp5.setAnimation(AnimationUtils.loadAnimation(ScrollingActivity.this, R.anim.anim_alpha));
//        LinearLayout llOp5 = (LinearLayout) findViewById(R.id.llOp5);

        try {
            if (txtOp5.getVisibility() == View.GONE) {
                txtOp5.setVisibility(View.VISIBLE);
                txtOp5.setAnimation(AnimationUtils.loadAnimation(ScrollingActivity.this, android.R.anim.slide_in_left));
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_scrolling, menu);
        this.menu = menu;

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.mni_rating) {
            avaliacao();
            return true;
        }

        if (id == R.id.mni_sobre) {
            about();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem rating;
        MenuItem about;

        if (menu != null) {
            rating = menu.findItem(R.id.mni_rating);
            about = menu.findItem(R.id.mni_sobre);

            if (showMenu) {
                rating.setVisible(true);
                about.setVisible(true);
            } else {
                rating.setVisible(false);
                about.setVisible(false);
            }
        }

        return true;
    }

    private void share() {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,
                "O Guia Empreender é um aplicativo feito com intuito de ajudar Empreendedores iniciantes com 5 dicas importantes.\n\nhttps://play.google.com/store/apps/details?id=br.com.edrsantos.fivethings");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }

    private void about() {
        mDialog = new Dialog(ScrollingActivity.this, R.style.FullHeightDialog);
        mDialog.setContentView(R.layout.activity_dialog);
        mDialog.setCancelable(true);
        mDialog.setCanceledOnTouchOutside(true);

        Button btnDialog = (Button) mDialog.findViewById(R.id.btnDialog);
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });
        mDialog.show();
    }

    private void avaliacao() {
        //code
        rankDialog = new Dialog(ScrollingActivity.this, R.style.FullHeightDialog);
        rankDialog.setContentView(R.layout.activity_rating);
        rankDialog.setCancelable(true);
        ratingBar = (RatingBar) rankDialog.findViewById(R.id.dialog_ratingbar);
        TextView text = (TextView) rankDialog.findViewById(R.id.txtValorAvaliacao);
        txtValorAvaliacao = (TextView) rankDialog.findViewById(R.id.txtValorAvaliacao);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float avaliacao, boolean fromUser) {
                txtValorAvaliacao.setText(String.valueOf(avaliacao));
                nota = avaliacao;
            }
        });

        text.setText(String.valueOf(ratingBar.getRating()));

        Button updateButton = (Button) rankDialog.findViewById(R.id.rank_dialog_button);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ratingBar.getRating() >= 2.0f) {
                    try {
                        AlertDialog.Builder builder = new AlertDialog.Builder(ScrollingActivity.this);
                        builder.setMessage("Confirmar sua nota na Play Store?");
                        builder.getContext().setTheme(R.style.FullHeightDialog);
                        builder.setCancelable(true);
                        builder.setPositiveButton("SIM", new avaliar());
                        builder.setNegativeButton("NÃO", new fechaAvaliacao());
                        AlertDialog dialog = builder.create();
                        dialog.show();

                        Button pb = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
                        pb.setBackgroundColor(Color.parseColor("#055d9d"));
                        pb.setTextColor(Color.WHITE);

                        Button nb = dialog.getButton(DialogInterface.BUTTON_NEGATIVE);
                        nb.setBackgroundColor(Color.parseColor("#2b2b2b"));
                        nb.setTextColor(Color.WHITE);

                        return;
                    } catch (Exception e) {
                        Toast.makeText(ScrollingActivity.this, "Seu dispositivo não tem suporte.", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                Toast.makeText(ScrollingActivity.this, "Muito obrigado! Sua nota é importante para melhorar o aplicativo.", Toast.LENGTH_SHORT).show();
                rankDialog.dismiss();
            }
        });
        rankDialog.show();
    }
    class avaliar implements DialogInterface.OnClickListener {
        avaliar() {
        }

        public void onClick(DialogInterface dialog, int id) {
            ScrollingActivity.this.startActivity(new Intent("android.intent.action.VIEW",
                    Uri.parse("market://details?id=br.com.edrsantos.fivethings")));
            Toast.makeText(ScrollingActivity.this, "Muito obrigado! Sua nota é importante para melhorar o aplicativo.",
                    Toast.LENGTH_LONG).show();
            Toast.makeText(ScrollingActivity.this, "Por Favor, Confirme sua nota no Google Play.",
                    Toast.LENGTH_LONG).show();
            dialog.cancel();
            rankDialog.dismiss();
        }
    }

    class fechaAvaliacao implements DialogInterface.OnClickListener {
        fechaAvaliacao() {
            rankDialog.dismiss();
        }

        public void onClick(DialogInterface dialog, int id) {
            dialog.cancel();
        }
    }

}
