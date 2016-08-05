package com.example.simpledoublefragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {

    private ImageView mImageView;
    private String[] imgArray = {
            "http://static4.fjcdn.com/thumbnails/comments/Obligatory+response+gif+_5002e44dafbdf953942f75be2f4c510d.gif",
            "http://static2.fjcdn.com/thumbnails/comments/Mandatory+boob+gif+_ff83e77a004a0322b8437254aa01b633.gif",
            "https://media.giphy.com/media/E8wPnDQR5Ubi8/giphy.gif",
            "https://media.giphy.com/media/HEGPEWesR1Ht6/giphy.gif",
            "http://images.thehollywoodgossip.com/iu/s--zl3lxCy3--/t_full/f_auto,fl_lossy,q_75/v1406900721/hot-kate-upton-bikini-gif.gif",
            "http://static4.fjcdn.com/thumbnails/comments/Obligatory+response+gif+_5002e44dafbdf953942f75be2f4c510d.gif",
            "http://static2.fjcdn.com/thumbnails/comments/Mandatory+boob+gif+_ff83e77a004a0322b8437254aa01b633.gif",
            "https://media.giphy.com/media/E8wPnDQR5Ubi8/giphy.gif",
            "https://media.giphy.com/media/HEGPEWesR1Ht6/giphy.gif",
            "http://images.thehollywoodgossip.com/iu/s--zl3lxCy3--/t_full/f_auto,fl_lossy,q_75/v1406900721/hot-kate-upton-bikini-gif.gif"
    };

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

    public void loadImage(int n) {
        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(mImageView);
        Glide
                .with(getContext())
                .load(imgArray[n])
                .into(imageViewTarget);
        //Picasso.with(getContext()).load(url).into(mImageView);
    }
}
