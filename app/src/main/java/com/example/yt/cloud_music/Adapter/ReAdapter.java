package com.example.yt.cloud_music.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yt.cloud_music.R;
import com.example.yt.cloud_music.bean.IcBean;

import java.util.List;

public class ReAdapter extends RecyclerView.Adapter<ReAdapter.ViewHolder> {
    private List<IcBean> mlist;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView icImage;
        TextView icName;
        public ViewHolder(View itemView) {
            super(itemView);
            icImage=(ImageView)itemView.findViewById(R.id.img_title);
            icName=(TextView)itemView.findViewById(R.id.tv_title);

        }
    }

    public ReAdapter(List<IcBean> mlist) {
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public ReAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ReAdapter.ViewHolder holder, int position) {
        IcBean icBean=mlist.get(position);
        holder.icImage.setImageResource(icBean.getImgid());
        holder.icName.setText(icBean.getName());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }
}
