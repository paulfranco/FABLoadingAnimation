package co.paulfran.paulfranco.fabloadinganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.saeid.fabloading.LoadingView;

public class MainActivity extends AppCompatActivity {

    LoadingView mLoadingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoadingView = findViewById(R.id.loadingView);

        mLoadingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLoadingView.addAnimation(R.color.colorPrimary, R.drawable.hulk, LoadingView.FROM_BOTTOM);
                mLoadingView.addAnimation(R.color.colorPrimary, R.drawable.ironman, LoadingView.FROM_LEFT);
                mLoadingView.addAnimation(R.color.colorPrimary, R.drawable.spiderman, LoadingView.FROM_RIGHT);
                mLoadingView.startAnimation();
            }
        });
    }
}
