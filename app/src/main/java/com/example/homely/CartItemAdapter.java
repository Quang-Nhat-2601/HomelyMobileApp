package com.example.homely;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartItemAdapter extends RecyclerView.Adapter<CartItemAdapter.CartItemViewHolder> {
    private Context context;
    private ArrayList<CartItem> listCartItems;


    public CartItemAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<CartItem> list) {
        listCartItems = list;

        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CartItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart, parent, false);
        return new CartItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartItemViewHolder holder, int position) {
        CartItem c = listCartItems.get(position);
        if(c == null) {
            return;
        }
        holder.cartItemImg.setImageResource(c.getProduct().getResourceImage());
        holder.itemName.setText(c.getProduct().getName());
        holder.priceProduct.setText(""+c.getProduct().getPrice());
        holder.itemNo.setText(c.getNumberInCart()+"x");
        holder.priceTotal.setText("$"+c.getProduct().getPrice() * c.getNumberInCart());
    }

    @Override
    public int getItemCount() {
        return listCartItems.size();
    }

    public class CartItemViewHolder extends RecyclerView.ViewHolder {
        private ImageView cartItemImg;
        private TextView itemName;
        private TextView itemNo;
        private TextView priceProduct;
        private TextView priceTotal;

        public CartItemViewHolder(@NonNull View itemView) {
            super(itemView);

            cartItemImg = itemView.findViewById(R.id.itemImage);
            itemName = itemView.findViewById(R.id.productName_cart_tv);
            itemNo = itemView.findViewById(R.id.itemNum_tv);
            priceProduct = itemView.findViewById(R.id.priceProduct_cart_tv);
            priceTotal = itemView.findViewById(R.id.total_tv);
        }
    }

}
