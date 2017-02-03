        package neighborsystem.neighborfoodmap;

        import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

        public class MainActivity extends AppCompatActivity {

    DBHelper helper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new DBHelper(MainActivity.this, // 현재 화면의 context
                "person2.db",                   // 파일명
                null,                           // 커서 팩토리
                2);                             // 버전 번호



        helper.delete("현대옥");
        helper.delete("오향가");
        helper.delete("男다른감子탕");
        helper.delete("신선설농탕");
        helper.delete("금바위");
        helper.delete("포하임");
        helper.delete("함경도 찹쌀순대");
        helper.delete("유타로");
        helper.delete("홍대칼국수와족발");
        helper.delete("함흥본가면옥");
        helper.delete("청춘연가");
        helper.delete("백년교동짬뽕");
        helper.delete("찌개마을");
        helper.delete("가츠현");
        helper.delete("남원산성추어탕");
        helper.delete("오연숙불쭈꾸미");
        helper.delete("의정부부대찌개");
        helper.delete("진또배기");
        helper.delete("전주화심순두부");
        helper.delete("이화수전통육개장");

        helper.insert(1, "현대옥", "서울시 송파구 양재대로62길 37-1 진양빌딩", "1", "1");
        helper.insert(2, "오향가", "서울시 송파구 송이로 106", "2", "1");
        helper.insert(3, "男다른감子탕", "서울시 송파구 중대로 134 부광아트빌딩", "3", "1");
        helper.insert(4, "신선설농탕", "서울시 송파구 중대로 126-1", "4", "1");
        helper.insert(5, "금바위", "서울시 송파구 가락동 112-8", "5", "1");
        helper.insert(6, "포하임", "서울시 송파구 중대로 121 송파롯데캐슬파인힐", "6", "1");
        helper.insert(7, "함경도 찹쌀순대", "서울시 송파구 가락동 79-7", "7", "1");
        helper.insert(8, "유타로", "서울시 송파구 가락동 79-5 1F", "8", "1");
        helper.insert(9, "홍대칼국수와족발", "서울시 송파구 가락동 80", "9", "1");
        helper.insert(10, "함흥본가면옥", "서울시 송파구 중대로10길5", "10", "1");
        helper.insert(11, "청춘연가", "서울시 송파구 송이로 112", "11", "1");
        helper.insert(12, "백년교동짬뽕", "서울시 송파구 송이로 139 우진빌딩", "12", "1");
        helper.insert(13, "찌개마을", "서울시 송파구 가락동 129-9", "13", "1");
        helper.insert(14, "가츠현", "서울시 송파구 가락동81", "14", "1");
        helper.insert(15, "남원산성추어탕", "서울시 송파구 송이로20길 16", "15", "1");
        helper.insert(16, "오연숙불쭈꾸미", "서울시 송파구 양재대로62길 41", "16", "1");
        helper.insert(17, "의정부부대찌개", "서울시 송파구 송파대로30길 41-27", "17", "1");
        helper.insert(18, "진또배기", "서울시 송파구 가락동 91-5", "18", "1");
        helper.insert(19, "전주화심순두부", "서울시 송파구 송이로 135", "19", "1");
        helper.insert(20, "이화수전통육개장", "서울시 송파구 송이로 108 케이알타워 1F", "20", "1");





    }

    public void onButton1Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), ListActivity.class);
        startActivity(intent);
    }

    public void onButton2Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), RandomActivity.class);
        startActivity(intent);
    }

    public void onButton3Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
        startActivity(intent);
    }



}

                /*인증서 지문(SHA1): 0C:99:DC:FB:2A:09:D8:F6:82:0D:EA:78:B6:CB:62:ED:A0:AE:C6:B6
                API 값 : AIzaSyDxdZuSj2BOEThbi1UCp97pKzQCG4sIsdU
*/