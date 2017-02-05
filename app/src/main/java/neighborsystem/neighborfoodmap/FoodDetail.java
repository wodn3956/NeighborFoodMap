package neighborsystem.neighborfoodmap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jaewoo Kim on 2017-01-31.
 */

public class FoodDetail extends Activity {

    DBHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_view);
        Intent intent = getIntent();


        String title = intent.getStringExtra("title");

        TextView tvtitle = (TextView)findViewById(R.id.textView3);
        ImageView iv1 = (ImageView)findViewById(R.id.imageView2);
        ImageView iv2 = (ImageView)findViewById(R.id.imageView3);

        int k = Integer.parseInt(intent.getStringExtra("image1")); // switch문에 넣을 String 값을 int형으로 전환
        Log.d("MBCC",""+k);

        helper = new DBHelper(FoodDetail.this, // 현재 화면의 context
                "person2.db",                   // 파일명
                null,                           // 커서 팩토리
                2);                             // 버전 번호


        final ArrayList<Food> list1 = helper.select();



        //음식점 사진입니다.

        for(int i=0; i<list1.size(); i++){
            Log.d("MBC","1번 : "+""+list1.get(i).getId()+" ,    "+"2번 : " +""+ k);
            if(list1.get(i).getId() == k) {
                int j = i+1;
                int resId1 = getResources().getIdentifier("img_"+j, "drawable", "neighborsystem.neighborfoodmap");
                int resId2 = getResources().getIdentifier("img_"+j+"_1", "drawable", "neighborsystem.neighborfoodmap");

                tvtitle.setText(title);
                iv1.setImageResource(resId1);
                iv2.setImageResource(resId2);
            }
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

