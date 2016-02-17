package com.udacity.megan.builditbigger;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Megan on 2/15/2016.
 */
public class JokeViewerFragment extends Fragment {
    String joke;

    public JokeViewerFragment(){
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = this.getArguments();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1) {
            joke = bundle.getString("joke", "There is no joke available");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.joke_viewer_fragment, container, false);

        TextView tv = (TextView)root.findViewById(R.id.joke_textview);
        tv.setText(joke);

        return root;
    }
}
