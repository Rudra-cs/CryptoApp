package com.rudra.cryptoapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rudra.cryptoapp.R;
import com.rudra.cryptoapp.models.Trade;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Trade> tradeList;

    public RecyclerAdapter(Context mContext, ArrayList<Trade> tradeList) {
        this.mContext = mContext;
        this.tradeList = tradeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.trade_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.name.setText(tradeList.get(position).getName());
        holder.entry.setText(tradeList.get(position).getEntryPoint());
        holder.updatedTime.setText(tradeList.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        return tradeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name,entry,updatedTime;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.bitcoin_name);
            entry = itemView.findViewById(R.id.entry_point);
            updatedTime = itemView.findViewById(R.id.timeUpdated);
        }
    }
}
