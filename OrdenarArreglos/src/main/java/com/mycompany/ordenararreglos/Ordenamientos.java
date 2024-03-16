package com.mycompany.ordenararreglos;

public class Ordenamientos {
    int MAX, a[];
    public Ordenamientos(){
        MAX=10;
        a=new int[MAX];
    }
    void crearArreglo(){
        for(int i=0; i<MAX; i++)
            a[i] = (int)(Math.random()*100+1);//random genera numeros de 1-9  se multiplica por 100 para 99 y se le suma 1 para 100
    }
    String mostarArreglo(){
        String salida = "";
        for (int i = 0; i < MAX; i++)
            salida += " "+a[i]; 
        return salida;
    }
    void intercambio(int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]= temp;
    }
    void burbuja(){
        for(int i=0; i<MAX; i++)
            for(int j=0; j<MAX-i-1; j++)
                if(a[j]>a[j+1])
                    intercambio(j,j+1);
    }
    void insercion(){
        int x,j;
        for (int i = 1; i < MAX; i++){
            x = a[i];
            j = i-1;
            while(j>=0 && x<a[j]){
                a[j+1] = a[j];
                j = j-1; 
            }
            a[j+1]=x;
        }    
    }
    void shell(){
        int k,s = MAX/2;
        while(s>0){
            for (int i = 0; i < MAX-s; i++) {
                if (a[i]>a[i+s]) {
                    intercambio(i,i+s);
                    k = i-s;
                    while(k>=0 && a[k]>a[k+s]){
                        intercambio(k,k+s);
                        k=k-s;
                    }
                }
            }
            s=s/2;
        }
    }
    void shell2(){
        int k,s = MAX/2;
        while(s>0){
            for (int i = 0; i < MAX-s; i++) {
                if (a[i]>a[i+s]) {
                    intercambio(i,i+s);
                    k = i;
                    while(k-s>=0 && a[k]>a[k-s]){
                        intercambio(k,k-s);
                        k=k-s;
                    }
                }
            }
            s=s/2;
        }
    }
    //void quickSort(0,objeto.MAX-1)//
    
    //void mergeSort() //
            
    
}
