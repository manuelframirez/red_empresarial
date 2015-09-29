package com.kcumendigital.redempresarial.models;

import android.content.Context;

import com.kcumendigital.redempresarial.EmpresasActivity;
import com.kcumendigital.redempresarial.TabsActivity;
import com.kcumendigital.redempresarial.Util.Util;
import com.orm.SugarContext;
import com.orm.SugarRecord;

import java.util.List;


public class Empresas extends SugarRecord {

    public static Integer SELECCION;

    String nombre;
    String descripcion;
    Integer imagen;
    String url;
//region Getters and Setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static void init(Context context) {
        SugarContext.init(context);

        if (Empresas.count(Empresas.class) < 24) {

            Empresas kcumen = new Empresas();
            kcumen.setNombre("Kcumen");
            kcumen.setDescripcion("Esta es la descripción de Kcumen");
            kcumen.setImagen(Util.KCUMEN);
            kcumen.setUrl("http://www.kcumendigital.com");
            kcumen.save();

            Empresas ecotecma = new Empresas();
            ecotecma.setNombre("Ecotecma");
            ecotecma.setDescripcion("esta es la descripción de Ecotecma");
            ecotecma.setImagen(Util.ECOTECMA);
            ecotecma.save();


            Empresas smartsoftPlay = new Empresas();
            smartsoftPlay.setNombre("SmartSoft Play");
            smartsoftPlay.setDescripcion("esta es la descripción de SmartSoft Play  ");
            smartsoftPlay.setImagen(Util.SMARTSOFTPLAY);
            smartsoftPlay.save();

            Empresas inteligentemente = new Empresas();
            inteligentemente.setNombre("Inteligente Mente");
            inteligentemente.setDescripcion("esta es la descripción de Inteligente Mente  ");
            inteligentemente.setImagen(Util.INTELIGENTEMENTE);
            inteligentemente.save();

            Empresas supernatural = new Empresas();
            supernatural.setNombre("Super Natural");
            supernatural.setDescripcion("esta es la descripción de Super Natural ");
            supernatural.setImagen(Util.SUPERNATURAL);
            supernatural.save();

            Empresas ideti = new Empresas();
            ideti.setNombre("Ideti");
            ideti.setDescripcion("esta es la descripción de Ideti");
            ideti.setImagen(Util.IDETI);
            ideti.save();

            Empresas big = new Empresas();
            big.setNombre("The Big Bang Company");
            big.setDescripcion("esta es la descripción de big bang");
            big.setImagen(Util.THEBIGBANGCOMPANY);
            big.save();

            Empresas buxtar = new Empresas();
            buxtar.setNombre("Buxtar");
            buxtar.setDescripcion("esta es la descripción de Buxtar");
            buxtar.setImagen(Util.BUXTAR);
            buxtar.save();

            Empresas celeste = new Empresas();
            celeste.setNombre("Celeste");
            celeste.setDescripcion("esta es la descripción de Celeste");
            celeste.setImagen(Util.CELESTE);
            celeste.save();

            Empresas creazion = new Empresas();
            creazion.setNombre("Creazion");
            creazion.setDescripcion("esta es la descripción de Creazion");
            creazion.setImagen(Util.CREAZION);
            creazion.save();

            Empresas egob = new Empresas();
            egob.setNombre("EGOB");
            egob.setDescripcion("esta es la descripción de EGOB");
            egob.setImagen(Util.EGOB);
            egob.save();

            Empresas eteknik = new Empresas();
            eteknik.setNombre("Eteknik");
            eteknik.setDescripcion("esta es la descripción de Eteknik");
            eteknik.setImagen(Util.ETEKNIK);
            eteknik.save();

            Empresas health = new Empresas();
            health.setNombre("Health");
            health.setDescripcion("esta es la descripción de Health");
            health.setImagen(Util.HEALTH);
            health.save();

            Empresas human = new Empresas();
            human.setNombre("Human");
            human.setDescripcion("esta es la descripción de Human");
            human.setImagen(Util.HUMAN);
            human.save();

            Empresas inet = new Empresas();
            inet.setNombre("Inet");
            inet.setDescripcion("esta es la descripción de Inet");
            inet.setImagen(Util.INET);
            inet.save();

            Empresas jump = new Empresas();
            jump.setNombre("Jump");
            jump.setDescripcion("esta es la descripción de Jump");
            jump.setImagen(Util.JUMP);
            jump.save();

            Empresas sadmin = new Empresas();
            sadmin.setNombre("Sadmin");
            sadmin.setDescripcion("esta es la descripción de Sadmin");
            sadmin.setImagen(Util.SADMIN);
            sadmin.save();

            Empresas somos = new Empresas();
            somos.setNombre("Somos");
            somos.setDescripcion("esta es la descripción de Somos");
            somos.setImagen(Util.SOMOS);
            somos.save();

            Empresas sunset = new Empresas();
            sunset.setNombre("Sunset");
            sunset.setDescripcion("esta es la descripción de Sunset");
            sunset.setImagen(Util.SUNSET);
            sunset.save();

            Empresas tics = new Empresas();
            tics.setNombre("Tics");
            tics.setDescripcion("esta es la descripción de Tics");
            tics.setImagen(Util.TICS);
            tics.save();

            Empresas taio = new Empresas();
            taio.setNombre("Taio");
            taio.setDescripcion("esta es la descripción de Taio");
            taio.setImagen(Util.TAIO);
            taio.save();

            Empresas totems = new Empresas();
            totems.setNombre("Totems Consulting");
            totems.setDescripcion("esta es la descripción de Totems");
            totems.setImagen(Util.TOTEMS);
            totems.save();

            Empresas vigilax = new Empresas();
            vigilax.setNombre("Vigilax");
            vigilax.setDescripcion("esta es la descripción de Vigilax");
            vigilax.setImagen(Util.VIGILAX);
            vigilax.save();

            Empresas winet = new Empresas();
            winet.setNombre("Winet");
            winet.setDescripcion("esta es la descripción de Winet");
            winet.setImagen(Util.WINET);
            winet.save();
        }
    }

    public static List<Empresas> getAllEmpresas(Context context) {
        SugarContext.init(context);
        List<Empresas> data = Empresas.listAll(Empresas.class);
        return data;
    }

    public static Empresas findEmpresaById(Context context, Long id_empresa) {
        SugarContext.init(context);
        Empresas e = Empresas.findById(Empresas.class,id_empresa);
        return e;

    }

    //endregion
}
