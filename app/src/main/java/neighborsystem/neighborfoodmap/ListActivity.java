 package neighborsystem.neighborfoodmap;

 import android.app.Activity;
 import android.content.Context;
 import android.content.Intent;
 import android.os.Bundle;
 import android.text.Editable;
 import android.text.TextWatcher;
 import android.util.Log;
 import android.view.View;
 import android.widget.AdapterView;
 import android.widget.EditText;
 import android.widget.ListView;

 import java.util.ArrayList;

 import static neighborsystem.neighborfoodmap.R.id.list;


public class ListActivity extends Activity {

    DBHelper helper;




    public Context context; //콘텍스트 저장
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        helper = new DBHelper(ListActivity.this, // 현재 화면의 context
                "person2.db",                   // 파일명
                null,                           // 커서 팩토리
                2);                             // 버전 번호


        final ArrayList<Food> list1 = helper.select();

        FoodAdapter adapter = new FoodAdapter(this, list1);

        listView = (ListView) findViewById(list);

        listView.setAdapter(adapter);

        //FoodDetail
          listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), FoodDetail.class);

                int Y = view.getId(); //ConvertView의 id값을 저장하는 변수 FoodDetail에 값을 제대로 넘겨주기위함, 이것때문에 3일고생했다...


                //FoodDatail 에 데이터값 집어넣기!
                for(int i=0; i<list1.size(); i++) {
                    if(list1.get(i).getId() == Y){
                        Log.d("KBS",""+list1.get(Y-1).getImage1());
                        intent.putExtra("image1",list1.get(Y-1).getImage1());
                        intent.putExtra("title",list1.get(Y-1).getTitle());
                    }
                }



                intent.putExtra("image2", list1.get(position).getImage2());

                startActivity(intent);
            }
        });






        /////////////////검색기능

        EditText editTextFilter = (EditText)findViewById(R.id.editTextFilter);


        editTextFilter.addTextChangedListener(new TextWatcher() {


            @Override
            public void afterTextChanged(Editable s) {

                String filterText = s.toString() ;



                if (filterText.length() > 0) {
                    listView.setTextFilterEnabled(true);
                    listView.setFilterText(filterText) ;


                } else  {
                    listView.clearTextFilter();
                }


            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
        });


        }
    }












