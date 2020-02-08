package net.androidbootcamp.concerttickets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import net.androidbootcamp.concerttickets.R.id;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity
{

    double costPerTicket = 79.99;
    int numberOfTickets;
    double totalCost;
    String groupChoice;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tickets = findViewById(id.txtTickets);
        final Spinner group = findViewById(id.txtGroup);
        Button cost = findViewById(id.btnCost);
        cost.setOnClickListener(new View.OnClickListener()
        {

            final TextView result = (findViewById(id.txtResult));
            @Override
            public void onClick(View v)
            {
                numberOfTickets = Integer.parseInt(tickets.getText().toString());
                totalCost = costPerTicket   * numberOfTickets;
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                groupChoice = group.getSelectedItem().toString();
                result.setText("Cost for " + groupChoice + " is " + currency.format(totalCost));

            }
        });

    }
}