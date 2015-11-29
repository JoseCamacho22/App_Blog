package josecamacho.app_blog;

import android.app.ListActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;



public class MainActivity extends ListActivity {
    protected String[] mAndroidNames;
    ArrayAdapter<String> adapter;
    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=(TextView) findViewById(R.id.textView);


        Resources resources = getResources();
        mAndroidNames = resources.getStringArray(R.array.android_names);


        if (mAndroidNames != null) {
            textview.setVisibility(View.INVISIBLE);
        }


        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,mAndroidNames);
        setListAdapter(adapter);
    }
}