package com.example.sys1.splitmoney;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by sys1 on 1/13/2018.
 */
public class tab1 extends Fragment {
    @Nullable

  //  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myview=inflater.inflate(R.layout.tab1_frag,container,false);
        return myview;
    }
   /* public void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == CONTACT_PICK_REQUEST && resultCode == RESULT_OK){

            ArrayList<Contact> selectedContacts = data.getParcelableArrayListExtra("SelectedContacts");

            String display="";
            for(int i=0;i<selectedContacts.size();i++){

                display += (i+1)+". "+selectedContacts.get(i).toString()+"\n";

            }
            contactsDisplay.setText("Selected Contacts : \n\n"+display);

        }

    }*/

}
