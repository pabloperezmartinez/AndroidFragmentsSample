package com.pabloperezmartinez.fragmentaactivity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapters.RepositoryAdapter;
import models.Repository;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Repository> repositories;
    private RepositoryAdapter repositoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);
        repositories = new ArrayList<>();
        repositories.add(new Repository("Repo 1", "Java", "Pablo", ""));
        repositories.add(new Repository("Repo 2", "Java", "Pablo", ""));
        repositories.add(new Repository("Repo 3", "Java", "Pablo", ""));
        repositories.add(new Repository("Repo 4", "Java", "Pablo", ""));

        repositoryAdapter = new RepositoryAdapter(repositories, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(repositoryAdapter);
    }
}