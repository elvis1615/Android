package com.black.elvis1615.hola1.graficar;

/**
 * Created by Elvis on 02/08/15.
 */
public class Circulo {
    //x es posicion x y es posicion y t es tamaño en cuadrado radio circulo alto en rectangulofinal x linea, a es ancho de retangulo final Y linea, l es lados y color es el color de la figura
    float figura,x,y,t,a,l,color;

    //poligono
    public Circulo(float figura,float x, float y, float t,float a,float l, float color)
    {
        this.figura=figura;
        this.x=x;
        this.y=y;
        this.t=t;
        this.a=a;
        this.l=l;
        this.color=color;
    }
    //circulo y cuadrado

    public Circulo(float figura, float x, float y,float t, float color)
    {
        this.figura=figura;
        this.x=x;
        this.y=y;
        this.color=color;
        this.t=t;
    }
    //rectangulos y lineas
    public Circulo(float figura, float x, float y, float t,float a, float color)
    {
        this.figura=figura;
        this.x=x;
        this.y=y;
        this.t=t;
        this.a=a;
        this.color=color;
    }

}
