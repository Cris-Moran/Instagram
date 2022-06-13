package com.example.instagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {

    MenuItem miLogout;
    EditText etDescription;
    Button btnTakePic;
    ImageView ivPostImage;
    Button btnPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDescription = findViewById(R.id.etDescription);
        btnTakePic = findViewById(R.id.btnTakePic);
        ivPostImage = findViewById(R.id.ivPostImage);
        btnPost = findViewById(R.id.btnPost);

        queryPosts();
    }

    private void queryPosts() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        miLogout = menu.findItem(R.id.miLogout);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.miLogout) {
            // Compose icon has been selected
            // Navigate to the compose activity
            ParseUser.logOut();
            ParseUser currentUser = ParseUser.getCurrentUser();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}