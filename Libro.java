/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Libro {
    
public Libro(){
}    

public Libro(String t, String a, int el, int ep){
    
    this.titulo=t;
    this.autor=a;
    this.nroEjemplares=el;
    this.ejempPrestados=ep;
    this.saldoEjemplares=nroEjemplares;
}

public void setTitulo(String t){
    this.titulo=t;
}
    
public void setAutor(String a){
    this.autor=a;
}

public void setEjemLibro(int el){
    this.nroEjemplares=el;
}

public void setEjemPrestados(int ep){
    this.ejempPrestados=ep;
}

public String getTitulo(){
    return titulo;
}

public String getAutor(){
    return autor;
}

public int getNroEjemplares(){
    return nroEjemplares;
}

public int getEjempPrestados(){
    return ejempPrestados;
}

public boolean prestamo(int pl){
    this.ejempPrestados+=pl;
    this.saldoEjemplares-=pl;
    if(saldoEjemplares<=0){
        return false;
    }
    else return true;
}

public boolean devolucion(int ld, Libro l1){
    this.saldoEjemplares+=ld;
    this.ejempPrestados-=ld;
    if(l1.prestamo(1)){
        return true;
    }
    else return false;
}

@Override
public String toString(){
    
    return "Título: "+titulo+", Autor: "+autor+", Numero de ejemplares: "+nroEjemplares+", Ejemplares prestados: "+ejempPrestados; 
}
    
private String titulo;
private String autor;
private int nroEjemplares;
private int ejempPrestados;
private int saldoEjemplares;
}
