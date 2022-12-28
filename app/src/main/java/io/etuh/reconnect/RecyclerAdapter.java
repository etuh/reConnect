package io.etuh.reconnect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import io.etuh.reconnect.model.Typicode;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
{
    private Context context;
    private List<Typicode> postsList;
    private Typicode typicode;
    public RecyclerAdapter(Context context, List<Typicode> postsList){
        this.context = context;
        this.postsList = postsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemlist,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        typicode = postsList.get(position);
//        viewHolder.userId.setText(typicode.getPosts().getUserId());
        viewHolder.username.setText(typicode.getUsers().getUsername());
        viewHolder.postTitle.setText(typicode.getPosts().getTitle());
        viewHolder.postBody.setText(typicode.getPosts().getBody());
        viewHolder.postComments.setText(typicode.getComments().getBody());

    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private AppCompatTextView username,postTitle,postBody,postComments;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            username = (AppCompatTextView)itemView.findViewById(R.id.username);
            postTitle = (AppCompatTextView)itemView.findViewById(R.id.postTitle);
            postBody = (AppCompatTextView)itemView.findViewById(R.id.postBody);
            postComments = (AppCompatTextView)itemView.findViewById(R.id.postComments);
        }
    }


}
