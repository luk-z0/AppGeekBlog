package com.example.geekblog.cv;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.geekblog.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CVFragment extends Fragment {

    RecyclerView RvCv;
    CVAdapter adapter ;
    List<CVItem> items;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RvCv = view.findViewById(R.id.recyclerview_cv);

        // create a list of cv items
        items = new ArrayList<>();
        items.add(new CVItem("Spider-man no way home",getString(R.string.filme1)));
        items.add(new CVItem("Matrix Ressurection",getString(R.string.filme2)));
        items.add(new CVItem("Amor Sublime Amor",getString(R.string.filme3)));
        items.add(new CVItem("Being the Ricardos",getString(R.string.filme4)));

        adapter = new CVAdapter(items);

        RvCv.setLayoutManager(new LinearLayoutManager(getContext()));
        RvCv.setAdapter(adapter);



    }

    public CVFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cv, container, false);
    }

}
