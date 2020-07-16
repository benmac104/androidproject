package com.example.androidproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class KnightSteps extends AppCompatActivity implements View.OnClickListener {

    public static String EXTRA_TEXT = "com.example.myapplication";
    private knight k1, k2;
    private int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knight_steps);

        k1 = new knight();
        k2 = new knight();

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);
        Button button15 = findViewById(R.id.button15);
        Button button16 = findViewById(R.id.button16);
        Button button17 = findViewById(R.id.button17);
        Button button18 = findViewById(R.id.button18);
        Button button19 = findViewById(R.id.button19);
        Button button20 = findViewById(R.id.button20);
        Button button21 = findViewById(R.id.button21);
        Button button22 = findViewById(R.id.button22);
        Button button23 = findViewById(R.id.button23);
        Button button24 = findViewById(R.id.button24);
        Button button25 = findViewById(R.id.button25);
        Button button26 = findViewById(R.id.button26);
        Button button27 = findViewById(R.id.button27);
        Button button28 = findViewById(R.id.button28);
        Button button29 = findViewById(R.id.button29);
        Button button30 = findViewById(R.id.button30);
        Button button31 = findViewById(R.id.button31);
        Button button32 = findViewById(R.id.button32);
        Button button33 = findViewById(R.id.button33);
        Button button34 = findViewById(R.id.button34);
        Button button35 = findViewById(R.id.button35);
        Button button36 = findViewById(R.id.button36);
        Button button37 = findViewById(R.id.button37);
        Button button38 = findViewById(R.id.button38);
        Button button39 = findViewById(R.id.button39);
        Button button40 = findViewById(R.id.button40);
        Button button41 = findViewById(R.id.button41);
        Button button42 = findViewById(R.id.button42);
        Button button43 = findViewById(R.id.button43);
        Button button44 = findViewById(R.id.button44);
        Button button45 = findViewById(R.id.button45);
        Button button46 = findViewById(R.id.button46);
        Button button47 = findViewById(R.id.button47);
        Button button48 = findViewById(R.id.button48);
        Button button49 = findViewById(R.id.button49);
        Button button50 = findViewById(R.id.button50);
        Button button51 = findViewById(R.id.button51);
        Button button52 = findViewById(R.id.button52);
        Button button53 = findViewById(R.id.button53);
        Button button54 = findViewById(R.id.button54);
        Button button55 = findViewById(R.id.button55);
        Button button56 = findViewById(R.id.button56);
        Button button57 = findViewById(R.id.button57);
        Button button58 = findViewById(R.id.button58);
        Button button59 = findViewById(R.id.button59);
        Button button60 = findViewById(R.id.button60);
        Button button61 = findViewById(R.id.button61);
        Button button62 = findViewById(R.id.button62);
        Button button63 = findViewById(R.id.button63);
        Button button64 = findViewById(R.id.button64);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
        button26.setOnClickListener(this);
        button27.setOnClickListener(this);
        button28.setOnClickListener(this);
        button29.setOnClickListener(this);
        button30.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);
        button34.setOnClickListener(this);
        button35.setOnClickListener(this);
        button36.setOnClickListener(this);
        button37.setOnClickListener(this);
        button38.setOnClickListener(this);
        button39.setOnClickListener(this);
        button40.setOnClickListener(this);
        button41.setOnClickListener(this);
        button42.setOnClickListener(this);
        button43.setOnClickListener(this);
        button44.setOnClickListener(this);
        button45.setOnClickListener(this);
        button46.setOnClickListener(this);
        button47.setOnClickListener(this);
        button48.setOnClickListener(this);
        button49.setOnClickListener(this);
        button50.setOnClickListener(this);
        button51.setOnClickListener(this);
        button52.setOnClickListener(this);
        button53.setOnClickListener(this);
        button54.setOnClickListener(this);
        button55.setOnClickListener(this);
        button56.setOnClickListener(this);
        button57.setOnClickListener(this);
        button58.setOnClickListener(this);
        button59.setOnClickListener(this);
        button60.setOnClickListener(this);
        button61.setOnClickListener(this);
        button62.setOnClickListener(this);
        button63.setOnClickListener(this);
        button64.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button1:
                fillsf(0);
                break;
            case R.id.button2:
                fillsf(1);
                break;
            case R.id.button3:
                fillsf(2);
                break;
            case R.id.button4:
                fillsf(3);
                break;
            case R.id.button5:
                fillsf(4);
                break;
            case R.id.button6:
                fillsf(5);
                break;
            case R.id.button7:
                fillsf(6);
                break;
            case R.id.button8:
                fillsf(7);
                break;
            case R.id.button9:
                fillsf(8);
                break;
            case R.id.button10:
                fillsf(9);
                break;
            case R.id.button11:
                fillsf(10);
                break;
            case R.id.button12:
                fillsf(11);
                break;
            case R.id.button13:
                fillsf(12);
                break;
            case R.id.button14:
                fillsf(13);
                break;
            case R.id.button15:
                fillsf(14);
                break;
            case R.id.button16:
                fillsf(15);
                break;
            case R.id.button17:
                fillsf(16);
                break;
            case R.id.button18:
                fillsf(17);
                break;
            case R.id.button19:
                fillsf(18);
                break;
            case R.id.button20:
                fillsf(19);
                break;
            case R.id.button21:
                fillsf(20);
                break;
            case R.id.button22:
                fillsf(21);
                break;
            case R.id.button23:
                fillsf(22);
                break;
            case R.id.button24:
                fillsf(23);
                break;
            case R.id.button25:
                fillsf(24);
                break;
            case R.id.button26:
                fillsf(25);
                break;
            case R.id.button27:
                fillsf(26);
                break;
            case R.id.button28:
                fillsf(27);
                break;
            case R.id.button29:
                fillsf(28);
                break;
            case R.id.button30:
                fillsf(29);
                break;
            case R.id.button31:
                fillsf(30);
                break;
            case R.id.button32:
                fillsf(31);
                break;
            case R.id.button33:
                fillsf(32);
                break;
            case R.id.button34:
                fillsf(33);
                break;
            case R.id.button35:
                fillsf(34);
                break;
            case R.id.button36:
                fillsf(35);
                break;
            case R.id.button37:
                fillsf(36);
                break;
            case R.id.button38:
                fillsf(37);
                break;
            case R.id.button39:
                fillsf(38);
                break;
            case R.id.button40:
                fillsf(39);
                break;
            case R.id.button41:
                fillsf(40);
                break;
            case R.id.button42:
                fillsf(41);
                break;
            case R.id.button43:
                fillsf(42);
                break;
            case R.id.button44:
                fillsf(43);
                break;
            case R.id.button45:
                fillsf(44);
                break;
            case R.id.button46:
                fillsf(45);
                break;
            case R.id.button47:
                fillsf(46);
                break;
            case R.id.button48:
                fillsf(47);
                break;
            case R.id.button49:
                fillsf(48);
                break;
            case R.id.button50:
                fillsf(49);
                break;
            case R.id.button51:
                fillsf(50);
                break;
            case R.id.button52:
                fillsf(51);
                break;
            case R.id.button53:
                fillsf(52);
                break;
            case R.id.button54:
                fillsf(53);
                break;
            case R.id.button55:
                fillsf(54);
                break;
            case R.id.button56:
                fillsf(55);
                break;
            case R.id.button57:
                fillsf(56);
                break;
            case R.id.button58:
                fillsf(57);
                break;
            case R.id.button59:
                fillsf(58);
                break;
            case R.id.button60:
                fillsf(59);
                break;
            case R.id.button61:
                fillsf(60);
                break;
            case R.id.button62:
                fillsf(61);
                break;
            case R.id.button63:
                fillsf(62);
                break;
            case R.id.button64:
                fillsf(63);
                break;
        }
    }
    //get x,y by the number button and send it to calculette the min steps
    void fillsf(int i) {

        if (temp == 1) {
            String str = "";
            k2.setKnight(i % 8, i / 8);
            str = k1.getSteps(k1, k2);

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Answer").setMessage(str).setPositiveButton("O.K",null).create().show();
            temp =0;
        }
        else {
            k1.setKnight(i % 8, i / 8);
            temp++;
        }
    }

}


