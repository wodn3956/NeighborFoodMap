package neighborsystem.neighborfoodmap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static neighborsystem.neighborfoodmap.R.id.list;


public class ListActivity extends Activity {



    DBHelper helper;


    public Context context; //콘텍스트 저장


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        helper = new DBHelper(ListActivity.this, // 현재 화면의 context
                "person2.db",                   // 파일명
                null,                           // 커서 팩토리
                2);                             // 버전 번호


        helper.insert(1, "현대옥1", "문정동1", "1", "2");
        helper.insert(1, "현대옥2", "문정동2", "1", "2");
        helper.insert(1, "현대옥3", "문정동3", "1", "2");
        helper.insert(1, "현대옥4", "문정동4", "1", "2");
        helper.insert(1, "현대옥5", "문정동5", "1", "2");
        helper.insert(1, "현대옥6", "문정동6", "1", "2");
        helper.insert(1, "현대옥7", "문정동7", "1", "2");
        helper.insert(1, "현대옥8", "문정동8", "1", "2");
        helper.insert(1, "현대옥9", "문정동9", "1", "2");

        /*delete("현대옥1");
        delete("현대옥2");
        delete("현대옥3");
        delete("현대옥4");
        delete("현대옥5");
        delete("현대옥6");
        delete("현대옥7");
        delete("현대옥8");*/

        final ArrayList<Food> list1 = helper.select();

        FoodAdapter adapter = new FoodAdapter(this, list1);

        ListView listView = (ListView) findViewById(list);

        listView.setAdapter(adapter);


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












