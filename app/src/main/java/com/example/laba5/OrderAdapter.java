package com.example.laba5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class OrderAdapter extends ArrayAdapter<Order> {

    private final Context context;
    private final Order[] orders;

    public OrderAdapter(Context context, Order[] orders) {
        super(context, R.layout.item, orders);
        this.context = context;
        this.orders = orders;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("ViewHolder") View view = inflater.inflate(R.layout.item, parent, false);

        TextView companyName = (TextView) view.findViewById(R.id.companyTV);
        companyName.setText(this.orders[position].getCompany().getName());

        TextView packageType = (TextView) view.findViewById(R.id.packageTypeTV);
        packageType.setText(this.orders[position].getaPackage().getPackageType());

        TextView sourceAddress = (TextView) view.findViewById(R.id.sourceAddressTV);
        sourceAddress.setText(this.orders[position].getSourceAddress());

        TextView destinationAddress = (TextView) view.findViewById(R.id.destinationAddressTV);
        destinationAddress.setText(this.orders[position].getDestinationAddress());

        TextView price = (TextView) view.findViewById(R.id.priceTV);
        price.setText(String.valueOf(this.orders[position].getPrice()));

        return view;
    }
}