package com.example.exerciciorecyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.exerciciorecyclerview.R;
import com.example.exerciciorecyclerview.adapters.Adapter;
import com.example.exerciciorecyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerWiew);

        //configurar lista
        this.criarFilmes();


        // configurar adapter
        Adapter adapter = new Adapter(listaFilmes);


        //cofigurar recyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);


    }

    public void criarFilmes(){


        Filme filme = new Filme("homem aranha", "avantura ", "2010");
        listaFilmes.add(filme);

        filme = new Filme("Senhor dos aneis", "fantasia", "2005");
        listaFilmes.add(filme);
       filme = new Filme("hanniball", "suspense", "2007");
        this.listaFilmes.add(filme);
        filme = new Filme("avatar", "aventura", "2008");
        this.listaFilmes.add(filme);
        filme = new Filme("corra que a policia vem ai ", "comedia", "1998");
        this.listaFilmes.add(filme);
        filme = new Filme("diamantes de sangue", "drama", "2012");
        this.listaFilmes.add(filme);
        filme = new Filme("guerra nas estrelas", "ficcao", "1976");
        this.listaFilmes.add(filme);
        filme = new Filme("a mosca", "terror", "1983");
        this.listaFilmes.add(filme);
        filme = new Filme("escola de rock", "comedia", "2006");
        this.listaFilmes.add(filme);


    }


}