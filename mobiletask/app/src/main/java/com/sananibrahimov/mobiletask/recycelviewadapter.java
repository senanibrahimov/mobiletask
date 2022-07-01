package com.sananibrahimov.mobiletask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sananibrahimov.mobiletask.databinding.ReycelrowbindingBinding;

import java.util.ArrayList;

public class recycelviewadapter  extends RecyclerView.Adapter<recycelviewadapter.viewholder> {
   ArrayList<dataclass> arrayList;
 private Context context;

    public recycelviewadapter(ArrayList<dataclass> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public recycelviewadapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      ReycelrowbindingBinding binding=ReycelrowbindingBinding.inflate(LayoutInflater.from(context),parent,false);


        return new recycelviewadapter.viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull recycelviewadapter.viewholder holder, int position) {
           holder.binding.cotagieesiofimageview.setImageResource(arrayList.get(position).image);
           holder.binding.textofcatogiries.setText(arrayList.get(position).name);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ReycelrowbindingBinding binding;
        public viewholder(ReycelrowbindingBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
