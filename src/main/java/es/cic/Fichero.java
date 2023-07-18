package es.cic;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public interface Fichero {
	BufferedReader abrirFichero(String nombreFichero) throws IOException;

}
