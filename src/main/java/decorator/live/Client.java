package decorator.live;


import decorator.refactoringguru.DataSource;
import decorator.refactoringguru.FileDataSource;
import decorator.refactoringguru.decorators.CompressionDecorator;
import decorator.refactoringguru.decorators.DataSourceDecorator;
import decorator.refactoringguru.decorators.EncryptionDecorator;

import java.io.*;

public class Client {


    public static void main(String[] args) {

        //Tenemos una clase StringPrinter
        //Quermeos poder modificar su comportamiento, cosa de que imprima de las siguientes formas:
        //1) todo en mayusculas
        //2) sacando todos los espacios en blanco del String
        //3) cortando el string hasta cierta cantidad de letras
        //4) removiendo todas las vocales de la palabra
        //5) eliminando una letra en particular

        //El desadfio es que queremos combinar TODOS estos comportamientos de la manera que queramos
        //Sin crear 10000 funciones o clases distintas para cada caso


        StringPrinter stringPrinter = new StringPrinter();
        stringPrinter.print("hola como estas");


        Printer decoradorSinEspaciosEnBlanco = new DecoradorHastaCiertaCantidadDeLetras(new DecoradorSinVocales(new DecoradorSinEspaciosEnBlanco(stringPrinter)), 2);
        decoradorSinEspaciosEnBlanco.print("hola como estas");


    }



}
