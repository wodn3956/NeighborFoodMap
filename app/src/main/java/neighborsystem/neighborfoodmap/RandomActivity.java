package neighborsystem.neighborfoodmap;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jaewoo Kim on 2017-02-01.
 */

public class RandomActivity extends Activity {

    int k;
    DBHelper helper;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.random_list);

        helper = new DBHelper(RandomActivity.this, // 현재 화면의 context
                "person2.db",                   // 파일명
                null,                           // 커서 팩토리
                2);                             // 버전 번호

        final ArrayList<Food> list1 = helper.select();

        RandomAdapter adapter = new RandomAdapter(this, list1);

        final ListView listView = (ListView) findViewById(R.id.list2);

        listView.setAdapter(adapter);


        findViewById(R.id.button5).setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        /////////버튼 눌렀을때 작동하는곳

                        Random rnd = new Random();
                        k = rnd.nextInt(list1.size());
                        Log.d("AA",""+k);


                        TextView textView = (TextView) findViewById(R.id.textView8);
                        textView.setText(list1.get(k).getTitle());
                        textView.setBackgroundColor(Color.rgb(255,0,0));
                        ImageView ivImage = (ImageView) findViewById(R.id.imageView8);



                        switch(list1.get(k).getId()) {

                            case 1 :
                                ivImage.setImageResource(R.drawable.img_1);
                                break;

                            case 2 :
                                ivImage.setImageResource(R.drawable.img_2);
                                break;

                            case 3 :
                                ivImage.setImageResource(R.drawable.img_3);
                                break;

                            case 4 :
                                ivImage.setImageResource(R.drawable.img_4);
                                break;

                            case 5 :
                                ivImage.setImageResource(R.drawable.img_5);
                                break;

                            case 6 :
                                ivImage.setImageResource(R.drawable.img_6);
                                break;

                            case 7 :
                                ivImage.setImageResource(R.drawable.img_7);
                                break;

                            case 8 :
                                ivImage.setImageResource(R.drawable.img_8);
                                break;

                            case 9 :
                                ivImage.setImageResource(R.drawable.img_9);
                                break;

                            case 10 :
                                ivImage.setImageResource(R.drawable.img_10);
                                break;

                            case 11 :
                                ivImage.setImageResource(R.drawable.img_11);
                                break;

                            case 12 :
                                ivImage.setImageResource(R.drawable.img_12);
                                break;

                            case 13 :
                                ivImage.setImageResource(R.drawable.img_13);
                                break;

                            case 14 :
                                ivImage.setImageResource(R.drawable.img_14);
                                break;

                            case 15 :
                                ivImage.setImageResource(R.drawable.img_15);
                                break;

                            case 16 :
                                ivImage.setImageResource(R.drawable.img_16);
                                break;

                            case 17 :
                                ivImage.setImageResource(R.drawable.img_17);
                                break;

                            case 18 :
                                ivImage.setImageResource(R.drawable.img_18);
                                break;

                            case 19 :
                                ivImage.setImageResource(R.drawable.img_19);
                                break;

                            case 20 :
                                ivImage.setImageResource(R.drawable.img_20);
                                break;
                        }

                    }
                }
        );





        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), FoodDetail.class);


                intent.putExtra("title", list1.get(position).getTitle());
                intent.putExtra("image1", list1.get(position).getImage1());
                intent.putExtra("image2", list1.get(position).getImage2());

                startActivity(intent);
            }
        });

}
    }
