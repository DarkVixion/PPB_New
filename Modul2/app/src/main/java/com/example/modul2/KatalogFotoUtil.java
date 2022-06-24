package com.example.modul2;

import java.util.ArrayList;
import java.util.List;

public class KatalogFotoUtil {
    private static int[] ridArray = {
            R.drawable.cs19,
            R.drawable.genshin,
            R.drawable.ip,
            R.drawable.ipberanda,
            R.drawable.iptugas,
            R.drawable.milf_meme,

    };

    private  static String[] filenameArray ={
            "cs19",
            "genshin",
            "ip",
            "ipberanda",
            "iptugas",
            "milf_meme",

    };

    private static List<KatalogFoto> katalogFotoList;

    public static void init(){
        katalogFotoList = new ArrayList<>();
        int nArray = ridArray.length;
        for(int i=0;i<nArray;i++){
            katalogFotoList.add(new KatalogFoto(ridArray[i], filenameArray[i]));
        }
    }
    public static List<KatalogFoto> getKatalogFotoList(){
        return katalogFotoList;
    }
    public static KatalogFoto getKatalogFotoAt(int i){
        return katalogFotoList.get(i);
    }
}
