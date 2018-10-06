package abhiint.com.scrollablebackground;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import abhiint.com.scrollableback.ScrolBackViewPagerActivity;

public class MainActivity extends AppCompatActivity {
    ScrolBackViewPagerActivity scrolBackViewPagerActivity;
    String[] images = {"https://img.purch.com/w/660/aHR0cDovL3d3dy5saXZlc2NpZW5jZS5jb20vaW1hZ2VzL2kvMDAwLzA5OS83NTgvb3JpZ2luYWwvc3RhcnMtdW5pdmVyc2UuanBn",
            "https://3c1703fe8d.site.internapcdn.net/newman/gfx/news/2016/57e3d4dbd417f.jpg", "https://img.purch.com/w/660/aHR0cDovL3d3dy5saXZlc2NpZW5jZS5jb20vaW1hZ2VzL2kvMDAwLzA5OS83NTgvb3JpZ2luYWwvc3RhcnMtdW5pdmVyc2UuanBn",
            "https://3c1703fe8d.site.internapcdn.net/newman/gfx/news/2016/57e3d4dbd417f.jpg", "https://img.purch.com/w/660/aHR0cDovL3d3dy5saXZlc2NpZW5jZS5jb20vaW1hZ2VzL2kvMDAwLzA5OS83NTgvb3JpZ2luYWwvc3RhcnMtdW5pdmVyc2UuanBn",
            "https://3c1703fe8d.site.internapcdn.net/newman/gfx/news/2016/57e3d4dbd417f.jpg"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrolBackViewPagerActivity = (ScrolBackViewPagerActivity) findViewById(R.id.a);
        scrolBackViewPagerActivity.setStaticImages(images,images);
    }
}
