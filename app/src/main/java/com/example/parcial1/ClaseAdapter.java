package com.example.parcial1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

    public class ClaseAdapter extends BaseAdapter {

        private ArrayList<ListViewItem> items;

        public ClaseAdapter(ArrayList<ListViewItem> items){
            this.items = items;
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public ListViewItem getItem(int i) {
            return items.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if(view == null) {
                view = LayoutInflater
                        .from(viewGroup.getContext())
                        .inflate(R.layout.listview_row,viewGroup, false);


            }
            decorateWith(view, items.get(i));
            return view;



        }

        private void decorateWith(View view, ListViewItem listViewItem) {
            ImageView imageView = view.findViewById(R.id.imageViewID);
            TextView textView = view.findViewById(R.id.textViewID);
            imageView.setImageResource(listViewItem.getImageResource());
            textView.setText(listViewItem.getTitle());
        }
    }




