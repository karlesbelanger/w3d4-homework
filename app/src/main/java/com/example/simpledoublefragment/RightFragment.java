package com.example.simpledoublefragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {

    private ImageView mImageView;

    public RightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_right, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mImageView = (ImageView) view.findViewById(R.id.f_right_img);
    }

    public void loadImage(String name) {
        String url = name.contains("Edwin")
                ? "http://ichef-1.bbci.co.uk/news/660/cpsprodpb/025B/production/_85730600_monkey2.jpg"
                : "http://kids.nationalgeographic.com/content/dam/kids/photos/animals/Mammals/H-P/pig-full-body.jpg.adapt.945.1.jpg";

        Picasso.with(getContext()).load(url).into(mImageView);
    }
}
