package com.proyecto.mintic;

import com.proyecto.mintic.entity.EmpresaEntity;
import com.proyecto.mintic.entity.EmpleadoEntity;
import com.proyecto.mintic.entity.MovimientoDineroEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoMinticApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoMinticApplication.class, args);

        MovimientoDineroEntity movimientoDinero = new MovimientoDineroEntity(); //instancia de movimiento de dinero
        movimientoDinero.setMonto(10000);
        movimientoDinero.setConcepto("prueba1");
        movimientoDinero.setUsuario("usuario1");

        System.out.println("dinero: "+ movimientoDinero.getMonto());
        System.out.println("concepto: "+ movimientoDinero.getConcepto());
        System.out.println("usuario: "+ movimientoDinero.getUsuario());

        EmpresaEntity Empresa1 = new EmpresaEntity();
        Empresa1.setNombreEmpresa("Big Data Company");
        Empresa1.setDireccionEmpresa("Av 28 N 21 83");
        Empresa1.setNitEmpresa("890319193");
        Empresa1.setTelefonoEmpresa("8888650");

        System.out.println("Nombre empresa es: "+ Empresa1.getNombreEmpresa());
        System.out.println("Direccion empresa es: "+ Empresa1.getDireccionEmpresa());
        System.out.println("Nit empresa es: "+ Empresa1.getNitEmpresa());
        System.out.println("Telefono empresa es: "+ Empresa1.getTelefonoEmpresa());

        EmpleadoEntity proyectoEmpleado = new EmpleadoEntity(); //instancia de empleado
        proyectoEmpleado.setNombre("juan osorio");
        proyectoEmpleado.setCorreo("ejemplo@gmail.com");
        proyectoEmpleado.setEmpresa("Empresa1");
        proyectoEmpleado.setRol("asistente");

        System.out.println("usuario2: "+ proyectoEmpleado.getNombre());
        System.out.println("correo: "+proyectoEmpleado.getCorreo());
        System.out.println("empresa: "+proyectoEmpleado.getEmpresa());
        System.out.println("rol: "+proyectoEmpleado.getRol());


    }

}
