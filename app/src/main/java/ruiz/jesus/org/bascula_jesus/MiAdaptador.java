package ruiz.jesus.org.bascula_jesus;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jesús Manuel Ruiz Verdejo on 10/12/2017.
 */

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder> {

    LayoutInflater inflador;
    ArrayList<Articulo> articulos = new ArrayList<Articulo>();

    public MiAdaptador(Context context, ArrayList<Articulo> articulos)
    {
        this.articulos = articulos;
        inflador = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public MiAdaptador.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflador.inflate(R.layout.lista,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MiAdaptador.ViewHolder holder, int position) {
        holder.titulo.setText(articulos.get(position).nombre.toString());
        holder.subtitulo.setText(String.valueOf(articulos.get(position).cantidad));
        holder.imageView.setImageResource(articulos.get(position).idFoto);
    }

    @Override
    public int getItemCount() {
        return articulos.size();
    }


    public class ViewHolder extends  RecyclerView.ViewHolder{
        public TextView titulo,subtitulo,precio;
        public ImageView imageView;

        ViewHolder(View itemView)
        {
            super(itemView);
            titulo = (TextView) itemView.findViewById(R.id.Titulo);
            subtitulo = (TextView) itemView.findViewById(R.id.SubTitulo);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

}
