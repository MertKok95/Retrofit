package com.mertkok.retrofit_version2.Adapters;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.mertkok.retrofit_version2.Models.DataItem;
import com.mertkok.retrofit_version2.R;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder> {

    private ArrayList<DataItem> cryptoList;
    private final String[] colors = {"#6495ED","#DC143C"};

    public RecyclerViewAdapter(ArrayList<DataItem> cryptoList) {
        this.cryptoList = cryptoList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layout,parent,false);
        return new RowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.RowHolder holder, int position) {
        holder.bind(cryptoList.get(position),colors,position);
    }

    @Override
    public int getItemCount() {
        if (cryptoList == null || cryptoList.size() == 0){
            return 0;
        }
        return cryptoList.size();
    }

    public class RowHolder extends RecyclerView.ViewHolder {

        TextView textName, textSymbol, textPrice;

        public RowHolder(@NonNull View itemView) {
            super(itemView);

        }

        @SuppressLint("SetTextI18n")
        public void bind(DataItem cryptoModel, String[] colors, Integer position) {
            itemView.setBackgroundColor(Color.parseColor(colors[position % 2]));
            textName = itemView.findViewById(R.id.text_name);
            textSymbol = itemView.findViewById(R.id.text_symbol);
            textPrice = itemView.findViewById(R.id.text_price);

            textName.setText(cryptoModel.getName());
            textSymbol.setText(" (" + cryptoModel.getSymbol() + ")");
            textPrice.setText(""+cryptoModel.getQuote().getUSD().getPrice());

        }


    }
}
