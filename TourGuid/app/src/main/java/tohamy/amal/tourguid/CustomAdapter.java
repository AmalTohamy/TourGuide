package tohamy.amal.tourguid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Place> {
    public CustomAdapter(@NonNull Context context, ArrayList<Place> placeName) {
        super(context, 0, placeName);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View gridview = convertView;
        if (gridview == null) {
            gridview = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_place, parent, false);
        }

        Place currentArtist = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView artistTextView = gridview.findViewById(R.id.place_text_view);
        assert currentArtist != null;
        artistTextView.setText(currentArtist.getmDefaultPlace());
        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView = gridview.findViewById(R.id.attractions_image_view);
        imageView.setImageResource(currentArtist.getmImageResourceId());
        return gridview;
    }
}
