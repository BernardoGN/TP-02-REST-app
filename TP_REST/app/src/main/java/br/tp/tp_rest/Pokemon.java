package br.tp.tp_rest;

import android.graphics.Bitmap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Pokemon {
    @SerializedName("name")
    private static String nome;

    @SerializedName("stats")
    private static ArrayList<Stat> stats;

    @SerializedName("sprites")
    private static Sprite sprite;

    @SerializedName("types")
    private static ArrayList<PokeType> types;



    private Bitmap imagem = null;

    public Pokemon(String nome, ArrayList<Stat> stats, Sprite sprite, ArrayList<PokeType> types) {
        this.nome = nome;
        this.stats = stats;
        this.sprite = sprite;
        this.types = types;
    }

    public String getName() {
        return this.nome;
    }

    public ArrayList<Stat> getStats(){
        return this.stats;
    }

    public Sprite getSprite() {
        return this.sprite;
    }

    public ArrayList<PokeType> getPokeTypes(){
        return this.types;
    }

    public Bitmap getImagem() {
        return this.imagem;
    }

    public void setBitmap(Bitmap imagem){
        this.imagem = imagem;
    }
}
