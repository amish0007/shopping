package com.example.shoppingapp.adapter;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppingapp.R;
import com.example.shoppingapp.databinding.CartItemBinding;
import com.example.shoppingapp.model.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    List<ProductModel> l2 = new ArrayList<>();

    public CartAdapter(List<ProductModel> l2)
    {
        this.l2=l2;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item,parent,false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {

        holder.cartItemBinding.imgCartProduct.setImageResource(l2.get(position).modelImage);
        holder.cartItemBinding.txtProduct.setText(l2.get(position).modelNames);
        holder.cartItemBinding.txtCartPrice.setText(l2.get(position).modelOriginal);
        holder.cartItemBinding.txtDisCartPrice.setText(l2.get(position).modelPrice);
        holder.cartItemBinding.txtCartPrice.setPaintFlags(holder.cartItemBinding.txtCartPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        holder.cartItemBinding.txtDeleteCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l2.remove(position);
                notifyItemRemoved(position);
                notifyDataSetChanged();
            }
        });

        holder.cartItemBinding.txtPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder.cartItemBinding.txtCount.setText(String.valueOf(Integer.parseInt(holder.cartItemBinding.txtCount.getText().toString())+1));
            }
        });

        holder.cartItemBinding.txtminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.cartItemBinding.txtCount.setText(String.valueOf(Integer.parseInt(holder.cartItemBinding.txtCount.getText().toString())-1));

                String count = holder.cartItemBinding.txtCount.getText().toString();
                int counts = Integer.parseInt(count);

                if (counts==0)
                {
                    l2.remove(position);
                    notifyItemRemoved(position);
                    notifyDataSetChanged();
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return l2.size();
    }

    public class CartViewHolder extends RecyclerView.ViewHolder{

        CartItemBinding cartItemBinding;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            cartItemBinding = CartItemBinding.bind(itemView);
        }
    }

}
