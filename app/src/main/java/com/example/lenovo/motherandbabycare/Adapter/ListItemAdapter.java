package com.example.lenovo.motherandbabycare.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenovo.motherandbabycare.MyModel.ToDo;
import com.example.lenovo.motherandbabycare.R;
import com.example.lenovo.motherandbabycare.Todo_List;

import java.util.List;

class ListItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnCreateContextMenuListener
{
    ItemClickListener itemClickListener;
    TextView item_title,item_description;
    public ListItemViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        itemView.setOnCreateContextMenuListener(this);

        item_title=(TextView)itemView.findViewById(R.id.item_title);
        item_description=(TextView)itemView.findViewById(R.id.item_description);

    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo menuInfo) {
        contextMenu.setHeaderTitle("Select the action");
        contextMenu.add(0,0,getAdapterPosition(),"DELETE");
    }
}
public class ListItemAdapter extends RecyclerView.Adapter<ListItemViewHolder>{
    Todo_List todolistActivity;
    List<ToDo> todoList;

    public ListItemAdapter(Todo_List todolistActivity,List<ToDo>todoList)
    {
        this.todolistActivity=todolistActivity;
        this.todoList=todoList;
    }
    public ListItemViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(todolistActivity.getBaseContext());
        View view=inflater.inflate(R.layout.list_item,parent,false);
        return new ListItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListItemViewHolder holder, int position) {
        holder.item_title.setText(todoList.get(position).getTitle());
        holder.item_description.setText(todoList.get(position).getDescription());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                todolistActivity.title.setText(todoList.get(position).getTitle());
                todolistActivity.description.setText(todoList.get(position).getDescription());

                todolistActivity.isUpdate=true;
                todolistActivity.idUpdate=todoList.get(position).getId();
            }
        });

    }

    @Override
    public int getItemCount() {
        return todoList.size();
    }
}
