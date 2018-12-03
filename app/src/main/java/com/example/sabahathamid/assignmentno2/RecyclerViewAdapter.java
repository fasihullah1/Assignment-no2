package com.example.sabahathamid.assignmentno2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<flag> mData;

    public RecyclerViewAdapter(Context mContext, List<flag> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item,viewGroup,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
        myViewHolder.country_name.setText(mData.get(i).getName());
        myViewHolder.flag_title.setImageResource(mData.get(i).getThumbnail());

        //set Click Listener
         myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,flaginfo.class);

                // Passing Data to countryinfo Activity
                intent.putExtra("c_name",mData.get(i).getName());
                intent.putExtra("c_thumbnail", mData.get(i).getThumbnail());

                //Start the activity
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView flag_title;
        TextView country_name;
        View cardView;

        public MyViewHolder(View itemView){
            super(itemView);

            flag_title = (ImageView)itemView.findViewById(R.id.flag_img_id);
            country_name = (TextView)itemView.findViewById(R.id.country_name_id);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);
        }
    }
}
