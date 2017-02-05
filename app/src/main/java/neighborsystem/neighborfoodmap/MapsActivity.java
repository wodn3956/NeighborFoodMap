package neighborsystem.neighborfoodmap;

/**
 * Created by Jaewoo Kim on 2017-02-02.
 */

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener, GoogleMap.OnMapClickListener {

    Marker selectedMarker;
    View marker_root_view;
    TextView tv_marker;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //////////시작 위치설정하는곳
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(37.494958, 127.122466),18));
        mMap.setOnMarkerClickListener(this); mMap.setOnMapClickListener(this);
        setCustomMarkerView();
        getSampleMarkerItems();
    }

    private void setCustomMarkerView() {
        marker_root_view = LayoutInflater.from(this).inflate(R.layout.marker_layout, null);
        tv_marker = (TextView) marker_root_view.findViewById(R.id.tv_marker);
    }

    private void getSampleMarkerItems() {
        ArrayList<MarkerItem> sampleList = new ArrayList();
        //음식점 좌표 넣어라~
        sampleList.add(new MarkerItem(37.494958, 127.122466, "네이버시스템"));
        sampleList.add(new MarkerItem(37.496656, 127.120195, "현대옥"));
        sampleList.add(new MarkerItem(37.496737, 127.121373, "오향가"));
        sampleList.add(new MarkerItem(37.494424, 127.122829, "男다른감子탕"));
        sampleList.add(new MarkerItem(37.494033, 127.122368, "신선설농탕"));
        sampleList.add(new MarkerItem(37.493762, 127.121783, "금바위"));
        sampleList.add(new MarkerItem(37.494327, 127.121415, "포하임"));
        sampleList.add(new MarkerItem(37.494725, 127.121298, "함경도찹쌀순대"));
        sampleList.add(new MarkerItem(37.494377, 127.120552, "유타로"));
        sampleList.add(new MarkerItem(37.495021, 127.120431, "홍대칼국수와족발"));
        sampleList.add(new MarkerItem(37.493482, 127.121937, "함흥본가면옥"));
        sampleList.add(new MarkerItem(37.496455, 127.121672, "청춘연가"));
        sampleList.add(new MarkerItem(37.494559, 127.124034, "백년교동짬뽕"));
        sampleList.add(new MarkerItem(37.497182, 127.121103, "명동찌개마을"));
        sampleList.add(new MarkerItem(37.495266, 127.119619, "가츠현"));
        sampleList.add(new MarkerItem(37.495781, 127.119723, "남원산성추어탕"));
        sampleList.add(new MarkerItem(37.496468, 127.120392, "오연숙불쭈꾸미"));
        sampleList.add(new MarkerItem(37.497194, 127.120528, "의정부부대찌개"));
        sampleList.add(new MarkerItem(37.497480, 127.119097, "진또배기"));
        sampleList.add(new MarkerItem(37.494784, 127.123882, "전주화심순두부"));
        sampleList.add(new MarkerItem(37.496640, 127.121617, "이화수전통육개장"));



        for (MarkerItem markerItem : sampleList) {
            addMarker(markerItem, false);
        }
    }


    private Marker addMarker(MarkerItem markerItem, boolean isSelectedMarker) {

        LatLng position = new LatLng(markerItem.getLat(), markerItem.getLon());
        String price = markerItem.getPrice();
        tv_marker.setText(price);


        if (isSelectedMarker) {
            tv_marker.setBackgroundResource(R.drawable.ic_marker_phone_blue);
            tv_marker.setTextColor(Color.WHITE);
        } else {
            tv_marker.setBackgroundResource(R.drawable.ic_marker_phone);
            tv_marker.setTextColor(Color.BLACK);
        }

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.title((price));
        markerOptions.position(position);
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(createDrawableFromView(this, marker_root_view)));

        return mMap.addMarker(markerOptions);
    }


    private Bitmap createDrawableFromView(Context context, View view) {

        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels); view.buildDrawingCache();
        Bitmap bitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap); view.draw(canvas); return bitmap;
    }


    private Marker addMarker(Marker marker, boolean isSelectedMarker) {

        double lat = marker.getPosition().latitude;
        double lon = marker.getPosition().longitude;
        String price = (marker.getTitle());
        MarkerItem temp = new MarkerItem(lat, lon, price);
        return addMarker(temp, isSelectedMarker);
    }



    @Override
    public boolean onMarkerClick(Marker marker) {

        CameraUpdate center = CameraUpdateFactory.newLatLng(marker.getPosition());
        mMap.animateCamera(center);
        changeSelectedMarker(marker);

        return true;
    }


    private void changeSelectedMarker(Marker marker) {
        // 선택했던 마커 되돌리기
        if (selectedMarker != null) {
            addMarker(selectedMarker, false); selectedMarker.remove();
        } // 선택한 마커 표시
        if (marker != null) {
            selectedMarker = addMarker(marker, true);
            marker.remove();
        }
    }



    @Override
    public void onMapClick(LatLng latLng) {
        changeSelectedMarker(null);
    }


}
