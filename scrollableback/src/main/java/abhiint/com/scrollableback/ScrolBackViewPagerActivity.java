package abhiint.com.scrollableback;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

public class ScrolBackViewPagerActivity extends RelativeLayout implements ViewPager.OnPageChangeListener {
    private View view;
    private Context context;
    private AttributeSet attrs;
    private int styleAttr;
    private RecyclerView recyclerView;
    private ViewPager viewPager;
    String[] recyclerImages;
    String[] pagerImages;
    ViewPagerAdapter viewPagerAdapter;
    RecyclerAdapter recyclerAdapter;
    RecyclerView.LayoutManager layoutManager;
    int pos;

    public ScrolBackViewPagerActivity(Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public ScrolBackViewPagerActivity(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        this.attrs = attrs;
        initView();
    }

    public ScrolBackViewPagerActivity(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        this.attrs = attrs;
        this.styleAttr = defStyleAttr;
        initView();
    }

    private void initView() {
        this.view = this;
        inflate(context, R.layout.viewpagerwithback, this);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
    }

    public void setStaticImages(String[] recyclerImages, String[] pagerImages) {
        this.recyclerImages = recyclerImages;
        this.pagerImages = pagerImages;
        setViewPager();
        setRecycler();
    }

    private void setRecycler() {
        layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerAdapter = new RecyclerAdapter(recyclerImages, context);
        recyclerView.setAdapter(recyclerAdapter);
    }

    private void setViewPager() {
        viewPagerAdapter = new ViewPagerAdapter(context, pagerImages);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        this.pos = position;
        recyclerView.smoothScrollToPosition(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }
}
