package loac.com.loacapp.fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import loac.com.loacapp.ItemActivity;
import loac.com.loacapp.R;
import loac.com.loacapp.StoreActivity;

public class home extends Fragment implements DialogInterface.OnClickListener, AdapterView.OnItemClickListener{

    List<String> names;
    List<String> categoria;
    List<String> storeid;
    List<String> storesend;

    List<Map<String, String>> data = new ArrayList<Map<String, String>>();
    View myView;
    ListView ls;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_home, container, false);

        ls = (ListView) myView.findViewById(R.id.home_listview);

        names = new ArrayList<String>();
        categoria = new ArrayList<String>();
        storeid = new ArrayList<String>();
        storesend = new ArrayList<String>();

        names.add("teste1");
        names.add("teste2");
        names.add("teste3");
        names.add("teste4");
        names.add("teste5");
        names.add("teste6");
        names.add("teste7");
        names.add("teste8");
        names.add("teste9");
        names.add("teste10");
        names.add("teste11");
        names.add("teste12");


        categoria.add("categoria1");
        categoria.add("categoria2");
        categoria.add("categoria3");
        categoria.add("categoria4");
        categoria.add("categoria5");
        categoria.add("categoria6");
        categoria.add("categoria7");
        categoria.add("categoria8");
        categoria.add("categoria9");
        categoria.add("categoria10");
        categoria.add("categoria11");
        categoria.add("categoria12");

        storeid.add("0001");
        storeid.add("0002");
        storeid.add("0003");
        storeid.add("0004");
        storeid.add("0005");
        storeid.add("0006");
        storeid.add("0007");
        storeid.add("0008");
        storeid.add("0009");
        storeid.add("0011");
        storeid.add("0011");
        storeid.add("0013");

        storesend.add("loja virtual");
        storesend.add("loja virtual");
        storesend.add("loja virtual");
        storesend.add("loja virtual");
        storesend.add("loja virtual");
        storesend.add("loja virtual");
        storesend.add("loja virtual");
        storesend.add("loja virtual");
        storesend.add("loja virtual");
        storesend.add("loja virtual");
        storesend.add("loja virtual");
        storesend.add("loja virtual");

        home.UsuarioAdapter user = new home.UsuarioAdapter(myView.getContext(), names, categoria, storeid, storesend);
        ls.setAdapter(user);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent homeIntent = new Intent(getActivity(), StoreActivity.class);
                homeIntent.putExtra("nome", names.get(position));
                startActivity(homeIntent);
            }
        });

        return myView;
    }


    @Override
    public void onClick(DialogInterface dialog, int which) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }


    public class UsuarioAdapter extends BaseAdapter {

        private List<String> list;
        private List<String> list2;
        private List<String> list3;
        private List<String> list4;
        private Context context;

        public UsuarioAdapter(Context context, List<String> list, List<String> list2,
                              List<String> list3, List<String> list4) {
            this.list = list;
            this.list2 = list2;
            this.list3 = list3;
            this.list4 = list4;
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

            View rootView = LayoutInflater.from(context).inflate(R.layout.listview_home_layout,
                    parent, false);

            TextView text1 = (TextView) rootView.findViewById(R.id.home_store_name);
            TextView text2 = (TextView) rootView.findViewById(R.id.home_store_category);
            TextView text3 = (TextView) rootView.findViewById(R.id.home_storeid);
            TextView text4 = (TextView) rootView.findViewById(R.id.home_store_end);


            text1.setText(list.get(position));
            text2.setText(list2.get(position));
            text3.setText(list3.get(position));
            text4.setText(list4.get(position));

            return rootView;
        }


    }
}