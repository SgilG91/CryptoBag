package au.edu.unsw.infs3634.cryptobag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView mDetailMessage;
    private Button mShowVideoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        mDetailMessage = findViewById(R.id.tvDetailMessage);
        mDetailMessage.setText(message);

        mShowVideoButton = findViewById(R.id.btShowVideo);
        mShowVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showVideo("https://www.youtube.com/watch?v=-iIbc-h9ijc");
            }
        });
    }

    private void showVideo(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
