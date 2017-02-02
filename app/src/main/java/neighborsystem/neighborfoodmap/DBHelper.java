
        package neighborsystem.neighborfoodmap;


        import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;


        /**
 * Created by Jaewoo Kim on 2017-01-24.
 */

public class DBHelper extends SQLiteOpenHelper {


    SQLiteDatabase db;


    public DBHelper(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table food (" +
                "_id integer," +
                "title text," +
                "address text,"+
                "image1 text," +
                "image2 text);";

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String sql = "drop table if exists food";
        db.execSQL(sql);

        onCreate(db);
    }

    public void insert(int _id, String title, String address, String image1, String image2) {

        db = getWritableDatabase(); // db 객체를 얻어온다. 쓰기 가능


        ContentValues values = new ContentValues();
        // db.insert의 매개변수인 values가 ContentValues 변수이므로 그에 맞춤
        // 데이터의 삽입은 put을 이용한다.

        values.put("_id",_id);
        values.put("title", title);
        values.put("address", address);
        values.put("image1", image1);
        values.put("image2", image2);

        db.insert("food", null, values); // 테이블/널컬럼핵/데이터(널컬럼핵=디폴트)

    }

    public void delete(String title) {
        db = getWritableDatabase();
        db.delete("food", "title=?", new String[]{title});
        Log.i("db", title + "정상적으로 삭제 되었습니다.");
    }


    public ArrayList<Food> select() {

        ArrayList<Food> list2 = new ArrayList<Food>();

        // 1) db의 데이터를 읽어와서, 2) 결과 저장, 3)해당 데이터를 꺼내 사용

        db = getReadableDatabase(); // db객체를 얻어온다. 읽기 전용
        Cursor c = db.query("food", null, null, null, null, null, null);

        //아이템 리스트

        while (c.moveToNext()) {

            int _id = c.getInt(c.getColumnIndex("_id"));
            String title = c.getString(c.getColumnIndex("title"));
            String address = c.getString(c.getColumnIndex("address"));
            String image1 = c.getString(c.getColumnIndex("image1"));
            String image2 = c.getString(c.getColumnIndex("image2"));



            Food food1 = new Food(_id, title, address, image1, image2);

            list2.add(food1);


        }

        return list2;

    }

  }




