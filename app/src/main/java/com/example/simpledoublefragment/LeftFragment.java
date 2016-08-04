package com.example.simpledoublefragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeftFragment extends Fragment {

    private CallbackComponent mCallbackComponent;
    private Button mButtonEdwin;
    private Button mButtonGaudencio;

    interface CallbackComponent {
        void buttonClicked(String name);
    }

    public LeftFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mCallbackComponent = (CallbackComponent) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_left, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mButtonEdwin = (Button) view.findViewById(R.id.f_left_btne);
        mButtonGaudencio = (Button) view.findViewById(R.id.f_left_btng);

        mButtonEdwin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbackComponent.buttonClicked("Edwin");
            }
        });

        mButtonGaudencio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbackComponent.buttonClicked("Gaudencio");
            }
        });

    }
}
