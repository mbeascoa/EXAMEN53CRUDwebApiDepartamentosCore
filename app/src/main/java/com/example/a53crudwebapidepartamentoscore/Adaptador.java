package com.example.a53crudwebapidepartamentoscore;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class Adaptador  extends RecyclerView.Adapter<Adaptador.ViewHolder>{

    private List<Departamentos> listaDepartamentos;
    int posicionseleccionada = 0;
    public Adaptador(List<Departamentos> ListaDepartamento) {
        this.listaDepartamentos= ListaDepartamento;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_simple_nombredepartamento,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String nombredept= listaDepartamentos.get(position).getNombre();
        holder.txtNombreDepartamento.setText(nombredept);

        holder.txtNombreDepartamento.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                posicionseleccionada = position;

                if (posicionseleccionada == position) {
                    holder.txtNombreDepartamento.setTextColor(Color.RED);


                } else {
                    holder.txtNombreDepartamento.setTextColor(Color.DKGRAY);
                }
                notifyDataSetChanged();
                //Notificamos cambios para que el contenedr se entere y refresque los datos
                Intent i = new Intent(holder.itemView.getContext(), Detalle_departamento.class);

                i.putExtra("NUMERODEPARTAMENTO", listaDepartamentos.get(position).getNumero());
                holder.itemView.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount(){
        return listaDepartamentos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNombreDepartamento;
        public ViewHolder(View v){
            super(v);
            txtNombreDepartamento=(TextView) v.findViewById(R.id.tv_Nombre_Departamento);
        }
    }
}

