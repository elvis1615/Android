package com.black.elvis1615.hola1.graficar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.LinkedList;

public class Main extends AppCompatActivity {
    public  static LinkedList<Circulo> objetos= new LinkedList<Circulo>();
    public static  LinkedList<String> errores= new LinkedList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void compilar(View view){
        EditText input=(EditText)findViewById(R.id.Input);
        Scanner1 scanner= new Scanner1(new BufferedReader( new StringReader(input.getText().toString())));

        parser1 Prcr= new parser1(scanner);

        try{
        Prcr.parse();
            System.out.println("completado con exito");
            int l=objetos.size();
            for(int i=0;i<l;i++) {
                System.out.println("numero: "+objetos.get(i).figura);
            }
            if(errores.isEmpty())
            {
                Intent hello=new Intent(this,dibujo.class);
                startActivity(hello);
            }
            else
            {
                ListView lista=(ListView)findViewById(R.id.Error);
                String []vectr= (String[]) errores.toArray();
                ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vectr);
                lista.setAdapter(adaptador);

            }

        }

        catch (Exception ex)
        {
            System.out.println(""+ex.getMessage());
        }
    }
}
