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
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ListView;

        import java.util.ArrayList;

        import static neighborsystem.neighborfoodmap.R.id.list;


public class ListActivity extends Activity {


    String filterText;
    DBHelper helper;
    Food food = new Food();



    public Context context; //콘텍스트 저장


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

        final ListView listView = (ListView) findViewById(list);

        listView.setAdapter(adapter);


        findViewById(R.id.button4).setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){


                        /////////버튼 눌렀을때 작동하는곳
                    }
                }
        );



        //FoodDetail
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






        /////////////////검색기능

        EditText editTextFilter = (EditText)findViewById(R.id.editTextFilter);


        editTextFilter.addTextChangedListener(new TextWatcher() {


            @Override
            public void afterTextChanged(Editable s) {

                String filterText = s.toString() ;

                Log.d("JW",filterText);

                if (filterText.length() > 0) {
                    listView.setFilterText(filterText) ;

                } else {
                    listView.clearTextFilter() ;
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

        public void onDestory(){

        }


    }












