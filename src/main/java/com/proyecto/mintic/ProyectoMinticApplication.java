package com.proyecto.mintic;

import com.proyecto.mintic.empleado.ProyectoEmpleado;
import com.proyecto.mintic.entity.MovimientoDineroEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoMinticApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoMinticApplication.class, args);

        MovimientoDineroEntity movimientoDinero = new MovimientoDineroEntity(); //instancia de movimiento de dinero
        movimientoDinero.monto = 10000;
        movimientoDinero.concepto = "prueba1";
        movimientoDinero.usuario = "usuario1";


       System.out.println("dinero: "+ movimientoDinero.monto);
        System.out.println("concepto: "+ movimientoDinero.concepto);
        System.out.println("usuario: "+ movimientoDinero.usuario);


        ProyectoEmpleado proyectoEmpleado = new ProyectoEmpleado(); //instancia de empleado
        proyectoEmpleado.nombre = "usuario2";
        proyectoEmpleado.correo = "correo";
        proyectoEmpleado.empresa = "empresa";
        proyectoEmpleado.rol = "rol";

        System.out.println("usuario2: "+ proyectoEmpleado.nombre);
        System.out.println("correo: "+proyectoEmpleado.correo);
        System.out.println("empresa: "+proyectoEmpleado.empresa);
        System.out.println("rol: "+proyectoEmpleado.rol);


    }

}
