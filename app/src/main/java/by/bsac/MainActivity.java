package by.bsac;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Current count
    private int count = 0;
    private TextView count_printer; //Count printer view

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.count_printer = this.findViewById(R.id.prtinter_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_msg_text, Toast.LENGTH_SHORT);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void incrementCount(View view) {
        ++this.count;
        this.count_printer.setText(Integer.toString(this.count));

    }

    @SuppressLint("SetTextI18n")
    public void decrementCount(View view) {
        --this.count;
        this.count_printer.setText(Integer.toString(this.count));
    }
}
