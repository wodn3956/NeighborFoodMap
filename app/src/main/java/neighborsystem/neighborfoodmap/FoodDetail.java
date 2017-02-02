package neighborsystem.neighborfoodmap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jaewoo Kim on 2017-01-31.
 */

public class FoodDetail extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_view);
        Intent intent = getIntent();
        int k = Integer.parseInt(intent.getStringExtra("image1")); // switch문에 넣을 String 값을 int형으로 전환


        String title = intent.getStringExtra("title");

        TextView tvtitle = (TextView)findViewById(R.id.textView3);
        ImageView iv1 = (ImageView)findViewById(R.id.imageView2);
        ImageView iv2 = (ImageView)findViewById(R.id.imageView3);




        //음식점 사진입니다.



         switch(k) {
             case 1:
                int resId1 = getResources().getIdentifier("img_1", "drawable", "neighborsystem.neighborfoodmap");
                int resId1_1 = getResources().getIdentifier("img_1_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId1);
                 iv2.setImageResource(resId1_1);
                break;

             case 2:
                 int resId2 = getResources().getIdentifier("img_2", "drawable", "neighborsystem.neighborfoodmap");
                 int resId2_1 = getResources().getIdentifier("img_2_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId2);
                 iv2.setImageResource(resId2_1);
                 break;

             case 3:
                 int resId3 = getResources().getIdentifier("img_3", "drawable", "neighborsystem.neighborfoodmap");
                 int resId3_1 = getResources().getIdentifier("img_3_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId3);
                 iv2.setImageResource(resId3_1);
                 break;

             case 4:
                 int resId4 = getResources().getIdentifier("img_4", "drawable", "neighborsystem.neighborfoodmap");
                 int resId4_1 = getResources().getIdentifier("img_4_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId4);

                 iv2.setImageResource(resId4_1);
                 break;

             case 5:
                 int resId5 = getResources().getIdentifier("img_5", "drawable", "neighborsystem.neighborfoodmap");
                 int resId5_1 = getResources().getIdentifier("img_5_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId5);
                 iv2.setImageResource(resId5_1);
                 break;

             case 6:
                 int resId6 = getResources().getIdentifier("img_6", "drawable", "neighborsystem.neighborfoodmap");
                 int resId6_1 = getResources().getIdentifier("img_6_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId6);
                 iv2.setImageResource(resId6_1);
                 break;

             case 7:
                 int resId7 = getResources().getIdentifier("img_7", "drawable", "neighborsystem.neighborfoodmap");
                 int resId7_1 = getResources().getIdentifier("img_7_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId7);
                 iv2.setImageResource(resId7_1);
                 break;

             case 8:
                 int resId8 = getResources().getIdentifier("img_8", "drawable", "neighborsystem.neighborfoodmap");
                 int resId8_1 = getResources().getIdentifier("img_8_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId8);
                 iv2.setImageResource(resId8_1);
                 break;

             case 9:
                 int resId9 = getResources().getIdentifier("img_9", "drawable", "neighborsystem.neighborfoodmap");
                 int resId9_1 = getResources().getIdentifier("img_9_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId9);
                 iv2.setImageResource(resId9_1);
                 break;

             case 10:
                 int resId10 = getResources().getIdentifier("img_10", "drawable", "neighborsystem.neighborfoodmap");
                 int resId10_1 = getResources().getIdentifier("img_10_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId10);
                 iv2.setImageResource(resId10_1);
                 break;

             case 11:
                 int resId11 = getResources().getIdentifier("img_11", "drawable", "neighborsystem.neighborfoodmap");
                 int resId11_1 = getResources().getIdentifier("img_11_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId11);
                 iv2.setImageResource(resId11_1);
                 break;

             case 12:
                 int resId12 = getResources().getIdentifier("img_12", "drawable", "neighborsystem.neighborfoodmap");
                 int resId12_1 = getResources().getIdentifier("img_12_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId12);
                 iv2.setImageResource(resId12_1);
                 break;

             case 13:
                 int resId13 = getResources().getIdentifier("img_13", "drawable", "neighborsystem.neighborfoodmap");
                 int resId13_1 = getResources().getIdentifier("img_13_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId13);
                 iv2.setImageResource(resId13_1);
                 break;

             case 14:
                 int resId14 = getResources().getIdentifier("img_14", "drawable", "neighborsystem.neighborfoodmap");
                 int resId14_1 = getResources().getIdentifier("img_14_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId14);
                 iv2.setImageResource(resId14_1);
                 break;

             case 15:
                 int resId15 = getResources().getIdentifier("img_15", "drawable", "neighborsystem.neighborfoodmap");
                 int resId15_1 = getResources().getIdentifier("img_15_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId15);
                 iv2.setImageResource(resId15_1);
                 break;

             case 16:
                 int resId16 = getResources().getIdentifier("img_16", "drawable", "neighborsystem.neighborfoodmap");
                 int resId16_1 = getResources().getIdentifier("img_16_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId16);
                 iv2.setImageResource(resId16_1);
                 break;

             case 17:
                 int resId17 = getResources().getIdentifier("img_17", "drawable", "neighborsystem.neighborfoodmap");
                 int resId17_1 = getResources().getIdentifier("img_17_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId17);
                 iv2.setImageResource(resId17_1);
                 break;

             case 18:
                 int resId18 = getResources().getIdentifier("img_18", "drawable", "neighborsystem.neighborfoodmap");
                 int resId18_1 = getResources().getIdentifier("img_18_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId18);
                 iv2.setImageResource(resId18_1);
                 break;

             case 19:
                 int resId19 = getResources().getIdentifier("img_19", "drawable", "neighborsystem.neighborfoodmap");
                 int resId19_1 = getResources().getIdentifier("img_19_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId19);
                 iv2.setImageResource(resId19_1);
                 break;

             case 20:
                 int resId20 = getResources().getIdentifier("img_20", "drawable", "neighborsystem.neighborfoodmap");
                 int resId20_1 = getResources().getIdentifier("img_20_1", "drawable", "neighborsystem.neighborfoodmap");
                 tvtitle.setText(title);
                 iv1.setImageResource(resId20);
                 iv2.setImageResource(resId20_1);
                 break;

         }
        }

    /*ublic void onDestory(){
        Drawable d = iv1.getDrawable();
        if(d instanceof BitmapDrawable){
            Bitmap bitmap = ((BitmapDrawable)d).getBitmap();
            bitmap.recycle();
            bitmap = null;
        }
        d.setCallback(null);

        super.onDestroy();
    }
*/
    }

