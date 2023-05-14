package com.example.homely;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{

    private Context context;
    private ArrayList<Product> listProduct;

    public ProductAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<Product> list) {
        listProduct = list;

        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

//    Hàm này set dữ liệu hiển thị lên
    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product p = listProduct.get(position);
        if(p == null) {
            return ;
        }
        holder.img.setImageResource(p.getResourceImage());
        holder.productName.setText(p.getName());
        holder.productPrice.setText("$"+p.getPrice());
    }

    @Override
    public int getItemCount() {
        return listProduct.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView productName;
        private TextView productPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.productImg);
            productName = itemView.findViewById(R.id.productName_tv);
            productPrice = itemView.findViewById(R.id.productPrice_tv);
        }
    }
}
