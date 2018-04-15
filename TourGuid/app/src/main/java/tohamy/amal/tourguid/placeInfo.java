package tohamy.amal.tourguid;

import android.os.Bundle;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class placeInfo extends AppCompatActivity {

    static String placeName;
    int imageResourceId;
    TabLayout tabLayout;
    TabItem infoTab;
    TabItem locationTab;
    PageAdapter pageAdapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info);

        imageResourceId = getIntent().getIntExtra("placeImage", 0);
        placeName = getIntent().getStringExtra("placeName");
        getSupportActionBar().setTitle(placeName);

        ImageView placeImageView = findViewById(R.id.place_image_view);
        placeImageView.setImageResource(imageResourceId);
        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);
        infoTab = findViewById(R.id.info_tab);
        locationTab = findViewById(R.id.location_tab);
        pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

}
