package ni.edu.uca.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    RecyclerView mListContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListContainer = (RecyclerView)findViewById(R.id.listContainer);
        ListAdapter adapter = new ListAdapter(this, getDatasource());
        mListContainer.setLayoutManager(new LinearLayoutManager(this));
        mListContainer.setAdapter(adapter);
    }

    private List<Persona> getDatasource(){
        List<Persona> list = new ArrayList<>();
        for (int i=0; i<100; i++)
        {
            list.add(new Persona("Nombre "+ (i +1),"Apellido" +(i +1)));
        }

        return list;
    }

}
