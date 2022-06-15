package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.parse.ParseFile;

public class PostDetailsActivity extends AppCompatActivity {

    public static final String TAG = "PostDetailsActivity";

    Post post;

    TextView tvDetailUsername;
    ImageView ivDetailImage;
    TextView tvDetailDescription;
    TextView tvTimestamp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_details);

        tvDetailUsername = findViewById(R.id.tvDetailUsername);
        ivDetailImage = findViewById(R.id.ivDetailImage);
        tvDetailDescription = findViewById(R.id.tvDetailDescription);
        tvTimestamp = findViewById(R.id.tvTimestamp);

        post = getIntent().getParcelableExtra("PARSE_OBJECT_EXTRA");
        tvDetailUsername.setText(post.getUser().getUsername());
        tvDetailDescription.setText(post.getDescription());
        tvTimestamp.setText(post.getTimestamp());
        ParseFile image = post.getImage();
        if (image != null) {
            Glide.with(this).load(image.getUrl()).into(ivDetailImage);
        }
    }
}