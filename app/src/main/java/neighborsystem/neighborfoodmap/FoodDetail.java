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


        String title = intent.getStringExtra("title");


        TextView tvtitle = (TextView)findViewById(R.id.textView3);

        ImageView iv1 = (ImageView)findViewById(R.id.imageView2);
        ImageView iv2 = (ImageView)findViewById(R.id.imageView3);


        //음식점 사진입니다.
        int resId1 = getResources().getIdentifier("img_1", "drawable", "neighborsystem.neighborfoodmap");

        //음식점 메뉴판 입니다.
        int resId2 = getResources().getIdentifier("img_1", "drawable", "neighborsystem.neighborfoodmap");



        tvtitle.setText(title);
        iv1.setImageResource(resId1);
        iv2.setImageResource(resId2);

    }
}
