package com.example.twitterfeedmvvm.view.mainactivity.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.twitterfeedmvvm.R;
import com.example.twitterfeedmvvm.model.Person;

import java.util.List;
import java.util.jar.Attributes;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private List<Person> personList;

    public PersonAdapter(List<Person>personList){this.personList=personList;}

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.person_item_view,
                parent,
                false);

        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.PersonViewHolder holder, int position) {
        Person staff = personList.get(position);

        String name = staff.getName();
        holder.tv_name.setText(name);

        String idTag = staff.getIdTag();
        holder.tv_idtag.setText(idTag);

        String tweet = staff.getTweet();
        holder.tv_tweet.setText(tweet);

        String time = staff.getTime();
        holder.tv_time.setText(time);

        String image = staff.getImage();
        holder.tv_image.setImageDrawable(Drawable.createFromPath(image));
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    class PersonViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name, tv_idtag, tv_tweet, tv_time;
        ImageView tv_image;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.name);
            tv_idtag = itemView.findViewById(R.id.idtag);
            tv_tweet = itemView.findViewById(R.id.tweet);
            tv_time = itemView.findViewById(R.id.time);
            tv_image = itemView.findViewById(R.id.image);

        }
    }


}
