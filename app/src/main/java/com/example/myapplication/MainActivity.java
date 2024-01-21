package com.example.myapplication;

import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkboxItem1, checkboxItem2, checkboxItem3;
    private Button orderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkboxItem1 = findViewById(R.id.checkboxItem1);
        checkboxItem2 = findViewById(R.id.checkboxItem2);
        checkboxItem3 = findViewById(R.id.checkboxItem3);
        orderButton = findViewById(R.id.orderButton);

        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrder();
            }
        });
    }

    private void displayOrder() {
        StringBuilder orderMessage = new StringBuilder("Selected items:\n");

        if (checkboxItem1.isChecked()) {
            orderMessage.append("Pizza-10");
        }
        if (checkboxItem2.isChecked()) {
            orderMessage.append("Coffee-15");
        }
        if (checkboxItem3.isChecked()) {
            orderMessage.append("Burget20");
        }

        // Calculate total price
        int totalPrice = 0;
        if (checkboxItem1.isChecked()) {
            totalPrice += 10;
        }
        if (checkboxItem2.isChecked()) {
            totalPrice += 15;
        }
        if (checkboxItem3.isChecked()) {
            totalPrice += 20;
        }

        orderMessage.append("Total Price:").append(totalPrice);

        // Show a toast message with the selected items and total price
        Toast.makeText(this, orderMessage.toString(), Toast.LENGTH_SHORT).show();
    }
}
