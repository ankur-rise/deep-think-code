package com.health.testfragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * to handle interaction events.
 * Use the {@link FragmentA#} factory method to
 * create an instance of this fragment.
 */
public class FragmentA extends Fragment {

    private int i=0;






    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
private TextView tv;;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_, container, false);
        tv = (TextView)view.findViewById(R.id.frag_a);

        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getActivity().getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.add(R.id.container, new FragmentB());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });


        view.findViewById(R.id.increase_no).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i++;
                tv.setText(i+"number");

            }
        });


        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        i++;
        tv.setText(i+"Number");

    }

    @Override
    public void onPause() {
        super.onPause();

    }



    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }




    @Override
    public void onDetach() {
        super.onDetach();

    }


}
