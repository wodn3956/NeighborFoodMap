package neighborsystem.neighborfoodmap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jaewoo Kim on 2017-02-01.
 */

public class RandomAdapter extends BaseAdapter {

    public Context context;
    LayoutInflater inf;
    ArrayList<Food> list = new ArrayList<Food>(); //아이템 리스트

    public RandomAdapter (Context context, ArrayList<Food> list) {
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
            convertView = inf.inflate(R.layout.random_view, parent, false);
        }

        TextView tvTitle = (TextView) convertView.findViewById(R.id.textView7);
        tvTitle.setText(""+list.get(position).getTitle());

        return convertView;
    }
}


