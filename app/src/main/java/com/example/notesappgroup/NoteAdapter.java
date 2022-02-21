package com.example.notesappgroup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {
    private List<NoteModel> list = new ArrayList<>();
    private LayoutInflater inflater;

    public void setList(Context context, NoteModel model) {
        this.list.add(model);
        this.inflater = LayoutInflater.from(context);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_notes, parent, false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class NoteViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle, tvDescription;
        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.txt_title);
            tvDescription = itemView.findViewById(R.id.txt_description);
        }
        public void onBind(NoteModel s) {
            tvTitle.setText(s.getTitle());
            tvDescription.setText(s.getDescription());
        }
    }
}
