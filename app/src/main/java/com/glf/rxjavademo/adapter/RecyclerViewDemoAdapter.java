package com.glf.rxjavademo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.glf.rxjavademo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 修改注释位置即可 套用
 */
public class RecyclerViewDemoAdapter extends RecyclerView.Adapter<RecyclerViewDemoAdapter.ViewHolder> {

    //存数据的集合
    List<Object> mObjectList = new ArrayList<>();
    private OnItemClickListener mOnItemClickListener;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_error, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(mObjectList.get(position));
        //绑定点击事件
        if (null != mOnItemClickListener) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mOnItemClickListener.onItemCLick(mObjectList.get(position));
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mObjectList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

//        @BindView(R.id.title)
//        TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            ButterKnife.bind(this, itemView);
        }

        public void setData(Object o) {
//            title.setText(o.getTile());
        }
    }

    //设置数据
    public void setData(List<Object> objectList) {
        mObjectList.clear();
        mObjectList.addAll(objectList);
        notifyDataSetChanged();
    }

    //设置回调点击事件
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    /**
     * 定义点击事件回调接口
     */
    public interface OnItemClickListener {
        void onItemCLick(Object object);
    }
}
