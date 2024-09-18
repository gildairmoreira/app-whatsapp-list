package com.example.whatsapp_list;

import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp_list.Adapter.AdapterUsuario;
import com.example.whatsapp_list.Model.Usuario;
import com.example.whatsapp_list.RecyclerItemClickListener.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_usuario;
    private List<Usuario> usuarioList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
                systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars()).toPlatformInsets();
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            }
            return insets;
        });

        recycler_usuario = findViewById(R.id.recycler_usuarios);
        recycler_usuario.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        recycler_usuario.setHasFixedSize(true);
        AdapterUsuario adapterUsuario = new AdapterUsuario(usuarioList);
        recycler_usuario.setAdapter(adapterUsuario);

        Usuarios();

        //Evento de Click na RecyclerView

        recycler_usuario.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(),
                recycler_usuario,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Usuario usuario = usuarioList.get(position);

                        Toast.makeText(getApplicationContext(), "Este é o usuário: " + usuario.getNome(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Usuario usuario = usuarioList.get(position);

                        Toast.makeText(getApplicationContext(), "Este é o usuário: " + usuario.getNome(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }
        ));
    }

    public void Usuarios() {
        Usuario usuario1 = new Usuario(R.drawable.usuario1, "Olá, Como vai?", "Marcos");
        usuarioList.add(usuario1);

        Usuario usuario2 = new Usuario(R.drawable.usuario2, "Vamos tomar um café?", "Maria");
        usuarioList.add(usuario2);

        Usuario usuario3 = new Usuario(R.drawable.usuario1, "Tudo bem?", "João");
        usuarioList.add(usuario3);

        Usuario usuario4 = new Usuario(R.drawable.usuario2, "Olá, Como vai?", "Mariana");
        usuarioList.add(usuario4);

        Usuario usuario5 = new Usuario(R.drawable.usuario1, "Vamos tomar um café?", "Marcelo");
        usuarioList.add(usuario5);

        Usuario usuario6 = new Usuario(R.drawable.usuario2, "Tudo bem?", "joana");
        usuarioList.add(usuario6);

        Usuario usuario7 = new Usuario(R.drawable.usuario1, "Olá, Como vai?", "jhon");
        usuarioList.add(usuario7);

        Usuario usuario8 = new Usuario(R.drawable.usuario2, "Vamos tomar um café?", "marta");
        usuarioList.add(usuario8);

        Usuario usuario9 = new Usuario(R.drawable.usuario1, "Tudo bem?", "Juca");
        usuarioList.add(usuario9);

        Usuario usuario10 = new Usuario(R.drawable.usuario2, "Olá, Como vai?", "Madalena");
        usuarioList.add(usuario10);

        Usuario usuario11 = new Usuario(R.drawable.usuario1, "Vamos tomar um café?", "Gilberto");
        usuarioList.add(usuario11);

        Usuario usuario12 = new Usuario(R.drawable.usuario2, "Tudo bem?", "Joaquina");
        usuarioList.add(usuario12);
    }
}