package co.getstark.starkandroidsample.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import co.getstark.starkandroidsample.R;
import co.getstark.starkandroidsample.model.DemoItem;

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.DemoViewHolder> {

    private List<DemoItem> demoItems;
    private Context context;

    public DemoAdapter(Context context, List<DemoItem> demoItems) {
        this.context = context;
        this.demoItems = demoItems;
    }

    @NonNull
    @Override
    public DemoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_demo, parent, false);
        return new DemoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DemoViewHolder holder, int position) {
        DemoItem item = demoItems.get(position);
        holder.titleText.setText(item.getTitle());
        holder.descriptionText.setText(item.getDescription());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, item.getActivityClass());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return demoItems.size();
    }

    static class DemoViewHolder extends RecyclerView.ViewHolder {
        TextView titleText;
        TextView descriptionText;

        public DemoViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.demo_title);
            descriptionText = itemView.findViewById(R.id.demo_description);
        }
    }
}
