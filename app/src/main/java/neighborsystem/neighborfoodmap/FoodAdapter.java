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

public class FoodAdapter extends BaseAdapter /*implements Filterable*/ {


    public Context context;
    LayoutInflater inf;
    ArrayList<Food> list = new ArrayList<Food>(); //아이템 리스트
    /*ArrayList<Food> filteredlist = new ArrayList<Food>(); // 필터링 된 결과 리스트
    Filter listFilter ;*/


    public FoodAdapter (Context context, ArrayList<Food> list) {
        this.context = context;
        this.list = list;
        inf = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }




    @Override
    public int getCount() {
        //return filteredlist.size();
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

      //  Food food = filteredlist.get(position);



        //이미지 넣기
        switch(list.get(position).getId()) {

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


        tvTitle.setText(""+list.get(position).getTitle());
        tvAddress.setText(""+list.get(position).getAddress());


        return convertView;
    }




    /*@Override
    public Filter getFilter() {
        if(listFilter == null) {
            listFilter = new ListFilter();
        }
        return listFilter;
    }

    public class ListFilter extends Filter {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults() ;

            if (constraint == null || constraint.length() == 0) {
                results.values = list ;
                results.count = list.size() ;
            } else {
                ArrayList<Food> itemList = new ArrayList<Food>() ;

                for (Food item : list) {
                    if (item.getTitle().toUpperCase().contains(constraint.toString().toUpperCase()))
                    {
                        itemList.add(item) ;

                    }
                }

                results.values = itemList ;
                Log.d("BB",""+results.values);
                results.count = itemList.size() ;
            }
            return results;
        }


        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            // update listview by filtered data list.
            filteredlist = (ArrayList<Food>) results.values ;

            Log.d("AA",""+filteredlist);

            // notify
            if (results.count > 0) {
                notifyDataSetChanged() ;
            } else {
                notifyDataSetInvalidated() ;
            }

        }
    }*/
}



