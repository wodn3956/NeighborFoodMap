package neighborsystem.neighborfoodmap;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jaewoo Kim on 2017-01-19.
 */

public class FoodAdapter extends BaseAdapter {

    int layout;
    public Context context;
    LayoutInflater inf;
    ArrayList<Food> list = new ArrayList<Food>(); //아이템 리스트


    public FoodAdapter (Context context, ArrayList<Food> list) {
        this.context = context;
        this.list = list;
        inf = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }




    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            convertView = inf.inflate(R.layout.food_list, parent, false);
        }



        ImageView ivImage = (ImageView) convertView.findViewById(R.id.imageView1);
        TextView tvTitle = (TextView)convertView.findViewById(R.id.textView1);
        TextView tvAddress = (TextView)convertView.findViewById(R.id.textView2);

        ivImage.setImageResource(R.drawable.img_1);
        tvTitle.setText(""+list.get(position).getTitle());
        tvAddress.setText(""+list.get(position).getAddress());

        return convertView;
    }

}



