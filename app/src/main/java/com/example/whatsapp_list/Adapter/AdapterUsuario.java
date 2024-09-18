package com.example.whatsapp_list.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp_list.Model.Usuario;
import com.example.whatsapp_list.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterUsuario extends RecyclerView.Adapter<AdapterUsuario.UsuarioViewHolder> {

    private List<Usuario> usuarioList = new ArrayList<>();

    public AdapterUsuario(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    //Cria o ViewHolder
    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View ItemLista;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemLista = layoutInflater.inflate(R.layout.usuario_item, parent, false);
        return new UsuarioViewHolder(ItemLista);
    }

    //Exibe os dados do ViewHolder
    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {
        holder.foto.setImageResource(usuarioList.get(position).getFoto());
        holder.nome.setText(usuarioList.get(position).getNome());
        holder.mensagem.setText(usuarioList.get(position).getMensagem());
    }

    //Retorna a quantidade de itens 'vê a quantidade de itens que existem na lista'
    @Override
    public int getItemCount() {
        return usuarioList.size();
    }

    //Classe ViewHolder
    public static class UsuarioViewHolder extends RecyclerView.ViewHolder {

        private ImageView foto;
        private TextView nome;
        private TextView mensagem;

        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);
            foto =itemView.findViewById(R.id.fotoUsuario);
            nome = itemView.findViewById(R.id.nomeUsuario);
            mensagem = itemView.findViewById(R.id.mensagemUsuario);
        }
    }
}
