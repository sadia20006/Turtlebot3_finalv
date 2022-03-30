package com.example.turtlebot;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Juristic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exit(View v){
        System.out.println("Exit du jeu");
    }

    public void bas(View v){
        System.out.println("Exit du jeu");
    }

    public void haut(View v){
        System.out.println("Exit du jeu");
    }

    public void droite(View v){
        System.out.println("Exit du jeu");
    }

    public void gauche(View v){
        System.out.println("Exit du jeu");
    }


}