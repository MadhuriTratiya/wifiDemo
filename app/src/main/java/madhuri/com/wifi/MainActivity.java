package madhuri.com.wifi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void check(View view) {
        if(Settings.Global.getInt(this.getContentResolver(),
                Settings.Global.BLUETOOTH_ON,0)!=0){
            textView.setText("Wifi On");
        }
        else
        {
            textView.setText("Wifi Off");
        }
    }
}