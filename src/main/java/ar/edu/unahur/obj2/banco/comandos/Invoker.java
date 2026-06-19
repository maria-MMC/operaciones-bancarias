package ar.edu.unahur.obj2.banco.comandos;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    //private IComando comando;

    private List<IComando> comandos = new ArrayList<>();
    private List<IComando> ultimosComandos = new ArrayList<>();
/* 
    public Invoker(List<IComando> comandos) {
        this.comandos = comandos;
    }
*/
    public void agregarComando(IComando comando) {
        this.comandos.add(comando);
    }

    public void ejecutarLote() {
        comandos.forEach(IComando::ejecutar);
        comandos.forEach(c-> ultimosComandos.add(c));        
        comandos.clear();
    }

    public void revertirUltimaEjecucion() {
        ultimosComandos.forEach(IComando::deshacer);
    }

}
