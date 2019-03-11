package loac.com.loacapp.fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import loac.com.loacapp.R;

public class settings extends Fragment implements DialogInterface.OnClickListener, AdapterView.OnItemClickListener {
    List<Integer> opcoes;
    View myView;
    ListView ls;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_settings, container, false);

        ls = (ListView) myView.findViewById(R.id.settings_listview);

        opcoes = new ArrayList<Integer>();

        opcoes.add(R.string.confignotifications);
        opcoes.add(R.string.evaluate);
        opcoes.add(R.string.version);

        UsuarioAdapter user = new UsuarioAdapter(myView.getContext(), opcoes);
        ls.setAdapter(user);

        ls.setOnItemClickListener(this);

        return myView;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }


    public class UsuarioAdapter extends BaseAdapter {

        private List<Integer> list;
        private Context context;

        public UsuarioAdapter(Context context, List<Integer> list) {
            this.list = list;
            this.context = context;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int arg0) {
            return list.get(arg0);
        }

        @Override
        public long getItemId(int arg0) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View rootView = LayoutInflater.from(context).inflate(R.layout.listview_settings_layout,
                    parent, false);

            TextView text1 = (TextView) rootView.findViewById(R.id.setting_text1);
            TextView text2 = (TextView) rootView.findViewById(R.id.setting_text2);

            if(position == 2){
                text2.setText(R.string.versionnumber);
            }
            else {
                text2.setVisibility(rootView.INVISIBLE);
            }

            text1.setText(list.get(position));

            return rootView;
        }


    }




}

