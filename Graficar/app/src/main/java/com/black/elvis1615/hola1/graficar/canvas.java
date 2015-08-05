package com.black.elvis1615.hola1.graficar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;



/**
 * Created by Elvis on 01/08/15.
 */
public class canvas extends View {



    public canvas(Context context)
    {
        super(context);
    }

    //@Override
    protected void onDraw(Canvas canvas)
    {
        Paint paint= new Paint();

        int tamaño=Main.objetos.size();
        for(int i=0;i<tamaño;i++)
        {
            Circulo c=Main.objetos.get(i);
            switch ((int)Math.round(c.color))
            {
                case 1: paint.setColor(Color.BLUE);
                        break;
                case 2: paint.setColor(Color.RED);
                        break;
                case 3: paint.setColor(Color.GREEN);
                        break;
                case 4: paint.setColor(Color.YELLOW);
                        break;
                case 5: paint.setColor(Color.rgb(255,69,0));
                        break;
                case 6: paint.setColor(Color.rgb(75,0,130));
                        break;
                case 7: paint.setColor(Color.rgb(160,82,45));
                        break;
                case 8: paint.setColor(Color.BLACK);
                        break;
            }

            if((int)Math.round(c.figura)==1)
            {
                canvas.drawCircle(c.x, c.y, c.t, paint);
            }
            else if((int)Math.round(c.figura)==2)
            {
            canvas.drawRect(c.x, c.y, c.t, c.t, paint);
            }
            else if((int)Math.round(c.figura)==3)
            {
             canvas.drawRect(c.x,c.y,c.t,c.a,paint);
            }
            else if((int)Math.round(c.figura)==4)
            {
             canvas.drawLine(c.x,c.y,c.t,c.a,paint);
            }
            else if((int)Math.round(c.figura)==5)
            {

            }
        }
    }

}
