package com.pabloperezmartinez.fragmentaactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import  android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import models.Repository;

public class RepositoryItem {

    private ImageView image;
    private TextView repositoryName, repositoryLanguage, repositoryOwner;

    private Repository repository;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.repository_item, container, false);
            repositoryName = view.findViewById(R.id.repositoryName);
            repositoryLanguage = view.findViewById(R.id.repositoryLanguage);
            repositoryOwner = view.findViewById(R.id.repositoryOwner);

            repositoryName.setText(repository.getRepositoryName());
            repositoryLanguage.setText(repository.getRepositoryLanguaje());
            repositoryOwner.setText(repository.getRepositoryOwner());

            return view;
    }
}
