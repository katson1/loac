package loac.com.loacapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import loac.com.loacapp.fragments.home;

public class StoreActivity extends AppCompatActivity implements DialogInterface.OnClickListener,
        AdapterView.OnItemClickListener{

    List<String> names;
    List<String> namesitem;
    List<String> price;
    String extraData;

    List<Map<String, String>> data = new ArrayList<Map<String, String>>();
    GridView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle b = getIntent().getExtras();

        if(b != null){
            extraData = (String) b.get("nome");
        }

        ls = (GridView) findViewById(R.id.gridstore);

        names = new ArrayList<String>();
        namesitem = new ArrayList<String>();
        price = new ArrayList<String>();

        names.add(extraData);
        names.add(extraData);
        names.add(extraData);
        names.add(extraData);
        names.add(extraData);
        names.add(extraData);
        names.add(extraData);
        names.add(extraData);
        names.add(extraData);
        names.add(extraData);
        names.add(extraData);
        names.add(extraData);


        namesitem.add("item numero1");
        namesitem.add("item numero2");
        namesitem.add("item numero3");
        namesitem.add("item numero4");
        namesitem.add("item numero5");
        namesitem.add("item numero6");
        namesitem.add("item numero7");
        namesitem.add("item numero8");
        namesitem.add("item numero9");
        namesitem.add("item numero10");
        namesitem.add("item numero11");
        namesitem.add("item numero12");

        price.add("1000,00 R$");
        price.add("2000,00 R$");
        price.add("3000,00 R$");
        price.add("4000,00 R$");
        price.add("5000,00 R$");
        price.add("6000,00 R$");
        price.add("7000,00 R$");
        price.add("8000,00 R$");
        price.add("9000,00 R$");
        price.add("1000,00 R$");
        price.add("1100,00 R$");
        price.add("1200,00 R$");


        StoreActivity.UsuarioAdapter user = new StoreActivity.UsuarioAdapter(this, names,
                namesitem, price);
        ls.setAdapter(user);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent homeIntent = new Intent(StoreActivity.this, ItemActivity.class);
                startActivity(homeIntent);
            }
        });

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
        private Context context;

        public UsuarioAdapter(Context context, List<String> list, List<String> list2,
                              List<String> list3) {
            this.list = list;
            this.list2 = list2;
            this.list3 = list3;
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

            View rootView = LayoutInflater.from(context).inflate(R.layout.gridview_store_layout,
                    parent, false);

            TextView text1 = (TextView) rootView.findViewById(R.id.store_txt_seller);
            TextView text2 = (TextView) rootView.findViewById(R.id.store_txt_nameitem);
            TextView text3 = (TextView) rootView.findViewById(R.id.store_txt_priceitem);


            text1.setText(list.get(position));
            text2.setText(list2.get(position));
            text3.setText(list3.get(position));

            return rootView;
        }


    }


    @Override
    public boolean onSupportNavigateUp(){
        this.finish();
        return true;
    }
}
