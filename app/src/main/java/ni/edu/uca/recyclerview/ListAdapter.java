package ni.edu.uca.recyclerview;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Administrador on 04/11/2016.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.CustomViewHoler>{

    List<Persona> dataSource;
    Activity mActivity;

    public ListAdapter(Activity activity, List<Persona> fuenteDeDatos){
        dataSource = fuenteDeDatos;
        mActivity = activity;
    }

    // inflar el list_iten
    @Override
    public CustomViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        CustomViewHoler customViewHoler= new CustomViewHoler(view);
        return customViewHoler;
    }

    //establecer los valores
    @Override
    public void onBindViewHolder(CustomViewHoler holder, int position) {
        holder.textView.setText(dataSource.get(position).getmNombre());
        holder.appellidoView.setText(dataSource.get(position).getmApellido());
        holder.nombreCompleto.setText(dataSource.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }

    class CustomViewHoler extends RecyclerView.ViewHolder
            implements AdapterView.OnClickListener{

        public TextView textView;
        public TextView appellidoView;
        public TextView nombreCompleto;

        public CustomViewHoler(View itemView) {
            super(itemView);
            ImageView image = (ImageView) itemView.findViewById(R.id.imagen);
            image.setOnClickListener(this);
            textView = (TextView) itemView.findViewById(R.id.texto);
            appellidoView = (TextView) itemView.findViewById(R.id.apellido);
            nombreCompleto = (TextView) itemView.findViewById(R.id.nombreComple);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(mActivity,nombreCompleto.getText().toString(),Toast.LENGTH_LONG).show();
            Intent intent = new Intent(mActivity, Main2Activity.class);
            mActivity.startActivity(intent);
            Log.d("ViewHolder", "onClick: " + nombreCompleto.getText().toString() );
        }
    }
}
