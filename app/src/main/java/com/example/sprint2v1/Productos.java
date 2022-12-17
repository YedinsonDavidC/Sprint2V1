package com.example.sprint2v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.sprint2v1.Adaptadores.ProductoAdapter;
import com.example.sprint2v1.Entidades.Producto;

import java.util.ArrayList;

public class Productos extends AppCompatActivity {
    private ListView listViewProductos;
    private ProductoAdapter productoAdapter;
    private ArrayList<Producto> arrayProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        listViewProductos =(ListView) findViewById(R.id.listViewProductos);
        arrayProductos = new ArrayList<>();

        Producto producto1 = new Producto("UnderArmour Shadow","Tenis de hombre para correr",190000, R.drawable.tennis1);
        Producto producto2 = new Producto("Nike Flex Experience","Tenis lifestyle",280000, R.drawable.tennis2);
        Producto producto3 = new Producto("Reebok Lite Plus","Tenis de hombre para correr",182000, R.drawable.tennis3);
        Producto producto4 = new Producto("Ralf Lifestyle","Tenis lifestyle",191000, R.drawable.tennis4);
        Producto producto5 = new Producto("Reebok Liquifect 90","Tenis de hombre para correr",220000, R.drawable.tennis5);
        Producto producto6 = new Producto("Adidas X9000L2 M","Tenis lifestyle",318000, R.drawable.tennis6);
        arrayProductos.add(producto1);
        arrayProductos.add(producto2);
        arrayProductos.add(producto3);
        arrayProductos.add(producto4);
        arrayProductos.add(producto5);
        arrayProductos.add(producto6);


        productoAdapter = new ProductoAdapter(this,arrayProductos);
        listViewProductos.setAdapter(productoAdapter);



    }
}