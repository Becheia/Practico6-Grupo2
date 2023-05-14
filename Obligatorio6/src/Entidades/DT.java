/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author estudiante
 */
public class DT {
    private Map<String, Cliente> directorio = new HashMap<String, Cliente>();

    public DT() {
    }

    public boolean agregarCliente(String tel, Cliente cliente) {
        boolean aux = false;

        if (!directorio.containsKey(tel)) {
            directorio.put(tel, cliente);
            aux = true;

        }
        return aux;
    }

    public Cliente buscarCliente(String tel) {
        // System.out.println(directorio.get(tel));

        Cliente c;
        if (directorio.containsKey(tel)) {
            c = directorio.get(tel);
        } else {
            c = null;
        }
        return c;
    }



public List<String> buscarTeléfono(String apell) {
        List<String> telEncontrados= new ArrayList();
        for (Map.Entry<String, Cliente> entry : directorio.entrySet()){
            String key =entry.getKey();
            Cliente value=entry.getValue();
            
            if(entry.getValue().getApellido().equals(apell)){
            telEncontrados.add(entry.getKey());
            }
}
        
        return telEncontrados;
    }

    public void buscarClientes(String ciudad) {
        int cont = 0;
        for (Map.Entry<String, Cliente> d : directorio.entrySet()) {
            if (ciudad == d.getValue().getCiudad()) {
                cont++;
                System.out.println(d);
            }
        }
        if (cont == 0) {
            System.out.println("No se encontro a nadie de esa ciudad");
        }
    }

    public void borrarCliente(String num) {
        directorio.remove(num);
    }

    @Override
        public String toString() {
        return " " + directorio;
    }
}
