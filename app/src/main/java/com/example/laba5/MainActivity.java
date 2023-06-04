package com.example.laba5;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ListView mainLV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Courier courier = new Courier("Дмитриев Александр Владимирович", "Водитель");
        Order[] orders = {
                new Order(new Company("IlDeBeaute", "ул. Земляной Вал, д. 33"),
                        new SmallPackage(false, ""), "ул. Земляной Вал, д. 33",
                        "ул. 4-я Парковая, 25", 300),
                new Order(new Company("Подружка", "ул. Первомайская, д. 87"),
                        new BigPackage(true, 30), "ул. Первомайская, д. 87",
                        "ул. Амурская, д. 46", 600),
                new Order(new Company("РИВ ГОШ",
                        "ул. Щёлковская, д. 75"), new Document(false,
                        "Осторожно, хрупкое!",
                        "ГУМ"),
                        "ул. Щёлковская, д. 75",
                        "Красная площадь, д. 3", 1200)
        };

        setContentView(R.layout.activity_main);

        TextView mainTV = findViewById(R.id.mainTV);
        mainTV.setText(courier.getFullName().concat("\n").concat(courier.getCurrentAccount()));


        mainLV = findViewById(R.id.mainLV);
        OrderAdapter orderAdapter = new OrderAdapter(this, orders);

        mainLV.setAdapter(orderAdapter);
        mainLV.setOnItemClickListener((parent, view, position, id) -> {

            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(android.R.attr.colorPressedHighlight, typedValue, true);
            int colorOnClicked = typedValue.data;

            TypedValue typedValue1 = new TypedValue();
            getTheme().resolveAttribute(android.R.attr.background, typedValue1, true);
            int colorInitial = typedValue1.data;


            Drawable background = view.getBackground();

            if (background instanceof ColorDrawable) {
                Log.d("a", "a");
                int backgroundColor = ((ColorDrawable) background).getColor();
                if (backgroundColor == colorInitial) {
                    courier.getOrders().add((Order) parent.getAdapter().getItem(position));
                    view.setBackgroundColor(colorOnClicked);
                } else {
                    courier.getOrders().remove((Order) parent.getAdapter().getItem(position));
                    view.setBackgroundColor(colorInitial);
                }
            } else {
                Log.d("b", "b");
                int backgroundColor = view.getDrawingCacheBackgroundColor();
                if (backgroundColor == colorInitial) {
                    courier.getOrders().add((Order) parent.getAdapter().getItem(position));
                    view.setBackgroundColor(colorOnClicked);
                } else {
                    courier.getOrders().remove((Order) parent.getAdapter().getItem(position));
                    view.setBackgroundColor(colorInitial);
                }
            }


        });
        Button clean_button = findViewById(R.id.clean_button);
        clean_button.setOnClickListener(v -> {
            TypedValue typedValue1 = new TypedValue();
            getTheme().resolveAttribute(android.R.attr.background, typedValue1, true);
            int colorInitial = typedValue1.data;
            for (int i = 0; i < mainLV.getChildCount(); ++i) {
                View listItem = mainLV.getChildAt(i);

                listItem.setBackgroundColor(colorInitial);
            }
            courier.getOrders().clear();
        });

        Button ok_button = findViewById(R.id.ok_button);
        ok_button.setOnClickListener(v -> {
            int sum = 0;
            for (Order order : courier.getOrders()) {
                sum += order.getPrice();
            }
            if (sum > 0) {
                Toast.makeText(MainActivity.this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "No orders", Toast.LENGTH_SHORT).show();
            }
        });

    }
}