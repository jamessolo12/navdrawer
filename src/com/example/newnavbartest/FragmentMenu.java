package com.example.newnavbartest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;

public class FragmentMenu extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragmentmenu, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		getView().findViewById(R.id.fragment_menu_btn_animal)
		.setOnClickListener(new OnClickListener() { 
			public void onClick(View v) {  
				Toast.makeText(getActivity(), "Animal", Toast.LENGTH_SHORT).show();
			}
		});

		getView().findViewById(R.id.fragment_menu_btn_gonzo)
		.setOnClickListener(new OnClickListener() { 
			public void onClick(View v) {  
				Toast.makeText(getActivity(), "Gonzo", Toast.LENGTH_SHORT).show();
			}
		});
	
	}
	
}
