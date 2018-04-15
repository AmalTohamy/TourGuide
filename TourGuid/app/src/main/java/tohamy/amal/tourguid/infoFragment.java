package tohamy.amal.tourguid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class infoFragment extends Fragment {


    public infoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        TextView info = view.findViewById(R.id.info_text_view);
        TextView phone = view.findViewById(R.id.phone_text_view);

        if (placeInfo.placeName.equals(getString(R.string.pyramids_of_giza))) {
            info.setText(R.string.pyramids_info);
        }
        if (placeInfo.placeName.equals(getString(R.string.the_egyptian_museum))) {
            info.setText(R.string.egyptian_museum_info);
        }
        if (placeInfo.placeName.equals(getString(R.string.al_azhar))) {
            info.setText(R.string.azhar_info);
        }
        if (placeInfo.placeName.equals(getString(R.string.khan_el_khalili))) {
            info.setText(R.string.khan_el_khalili_info);
        }
        if (placeInfo.placeName.equals(getString(R.string.mohamed_ali_mosque))) {
            info.setText(R.string.mohamed_ali_mosque_info);
        }
        if (placeInfo.placeName.equals(getString(R.string.museum_of_islamic_art))) {
            info.setText(R.string.museum_of_islamic_art_info);
        }
        if (placeInfo.placeName.equals(getString(R.string.manial_palace))) {
            info.setText(R.string.manial_palace_info);
        }
        if (placeInfo.placeName.equals(getString(R.string.cairo_tower))) {
            info.setText(R.string.cairo_tower_info);
        }
        if (placeInfo.placeName.equals(getString(R.string.the_qalawun_complex))) {
            info.setText(R.string.the_qalawun_complex_info);
        }
        if (placeInfo.placeName.equals(getString(R.string.baron_palace))) {
            info.setText(R.string.baron_palace_info);
        }
        if (placeInfo.placeName.equals(getString(R.string.koshary_abou_tarek))) {
            info.setText(R.string.koshary_abou_tarek_info);
            phone.setText(R.string.koshary_abou_tarek_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.gad))) {
            info.setText(R.string.gad_info);
            phone.setText(R.string.gad_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.sobhy_kaber))) {
            info.setText(R.string.sobhy_kaber_info);
            phone.setText(R.string.sobhy_kaber_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.farahat))) {
            info.setText(R.string.farahat_info);
            phone.setText(R.string.farahata_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.felfela))) {
            info.setText(R.string.felfela_address);
            phone.setText(R.string.farahata_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.el_shabrawy))) {
            info.setText(R.string.el_shabrawy_info);
            phone.setText(R.string.farahata_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.kebdet_el_prince))) {
            info.setText(R.string.kebdet_el_prince_info);
            phone.setText(R.string.kebdet_el_prince_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.om_hasssan))) {
            info.setText(R.string.om_hassan_info);
            phone.setText(R.string.om_hassan_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.el_feshawy))) {
            info.setText(R.string.el_shabrawy_info);
            phone.setText(R.string.el_feshawy_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.groppi))) {
            info.setText(R.string.groppi_info);
            phone.setText(R.string.groppi_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.naguib_mahfouz_cafe))) {
            info.setText(R.string.naguib_mahfouz_cafe_info);
            phone.setText(R.string.naguib_mahfouz_cafe_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.left_bank))) {
            info.setText(R.string.left_bank_info);
            phone.setText(R.string.left_bank_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.cake_cafe))) {
            info.setText(R.string.cake_cafe_info);
            phone.setText(R.string.cake_cafe_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.kafein_cafe))) {
            info.setText(R.string.kafein_cafe_info);
            phone.setText(R.string.kafein_cafe_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.mena_house))) {
            info.setText(R.string.mena_house_info);
            phone.setText(R.string.mena_house_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.the_nile_ritz))) {
            info.setText(R.string.the_nile_ritz_info);
            phone.setText(R.string.the_nile_ritz_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.hilton))) {
            info.setText(R.string.hilton_info);
            phone.setText(R.string.hilton_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.conrad))) {
            info.setText(R.string.conrad_info);
            phone.setText(R.string.conrad_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.four_seasons))) {
            info.setText(R.string.four_seasons_info);
            phone.setText(R.string.four_seasons_phone);
        }
        if (placeInfo.placeName.equals(getString(R.string.sofitel_hotel))) {
            info.setText(R.string.sofitel_hotel_info);
            phone.setText(R.string.sofitel_hotel_phone);
        }
        return view;
    }

}
