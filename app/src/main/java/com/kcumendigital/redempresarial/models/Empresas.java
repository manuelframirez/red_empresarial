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
    String correo;
    String numero;
    String numero2;
    String numero3;




    //region Getters and Setters
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public String getNumero3() {
        return numero3;
    }

    public void setNumero3(String numero3) {
        this.numero3 = numero3;
    }

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
            kcumen.setDescripcion("En Kcumen Digital nos esforzamos por brindarles la mejores solución a medida, es por esto que desarrollamos el producto en base a sus necesidades con las mejores herramientas; creatividad e innovación.");
            kcumen.setImagen(Util.KCUMEN);
            kcumen.setUrl("http://www.kcumendigital.com");
            kcumen.setNumero("+573182572324");
            kcumen.setCorreo("kcumen@gmail.com");
            kcumen.save();

            Empresas ecotecma = new Empresas();
            ecotecma.setNombre("Ecotecma");
            ecotecma.setDescripcion("Ecotecma S.A.S es una empresa que opera en el marco del desarrollo sostenible haciendo uso de las tecnologías de la información y la comunicación TIC, y que presta servicios dirigidos a la gestión ambiental y fitosanitaria. Ecotecma S.A.S tiene por objeto la adquisición, generación, procesamiento, análisis e integración de información relevante para atender las necesidades de los diferentes sectores, brindando soporte a los procesos de toma de decisiones en las entidades públicas y privadas para el mejoramiento de su productividad, incremento de la competitividad y la implementación de estrategias de prevención, adaptación y mitigación frente a eventos que afecten sus procesos.");
            ecotecma.setImagen(Util.ECOTECMA);
            ecotecma.setUrl("http://www.ecotecma.com.co");
            ecotecma.setNumero("+573188839290");
            ecotecma.setCorreo("jfcasanova845@gmail.com");
            ecotecma.save();


            Empresas smartsoftPlay = new Empresas();
            smartsoftPlay.setNombre("SmartSoft Play");
            smartsoftPlay.setDescripcion("Somos un estudio de desarrollo de aplicaciones de entretenimiento. Nuestra Misión: Sencillez y creatividad para entretener a la gente.");
            smartsoftPlay.setImagen(Util.SMARTSOFTPLAY);
            smartsoftPlay.setUrl("http://www.smartsoftplay.com");
            smartsoftPlay.setNumero("+573188804081");
            smartsoftPlay.setCorreo("angelicatui@gmail.com");
            smartsoftPlay.save();

            Empresas inteligentemente = new Empresas();
            inteligentemente.setNombre("Inteligente Mente");
            inteligentemente.setDescripcion("Somos una empresa de base tecnológica especializada en proveer soluciones de información estratégica como insumos para la innovación a través de la utilización de herramientas de inteligencia competitiva, big data e inteligencia artificial.");
            inteligentemente.setImagen(Util.INTELIGENTEMENTE);
            inteligentemente.setUrl("http://www.inteligentemente.co");
            inteligentemente.setNumero("+573116118166");
            inteligentemente.setCorreo("jriveracaicedo@gmail.com");
            inteligentemente.save();

            Empresas supernatural = new Empresas();
            supernatural.setNombre("Super Natural");
            supernatural.setDescripcion("esta es la descripción de Super Natural ");
            supernatural.setImagen(Util.SUPERNATURAL);
            supernatural.save();

            Empresas ideti = new Empresas();
            ideti.setNombre("Ideti");
            ideti.setDescripcion("IDETI es una empresa orgullosamente Caucana, dedicada al desarrollo de soluciones innovadoras basadas en las Tecnologías de la Información y las Comunicaciones – TIC. Nuestra empresa tiene experiencia en el desarrollo de software para aplicaciones Móviles, Web, y de Escritorio, y actualmente cuenta con dos líneas de trabajo; la primera enfocada al desarrollo de soluciones a la medida, acorde a las necesidades de nuestros clientes que buscan fortalecer sus empresas utilizando las TIC, y la segunda línea y principal quehacer de IDETI, es el desarrollo de soluciones innovadoras que generen impacto positivo en el sector al cuál están dirigidas.");
            ideti.setImagen(Util.IDETI);
            ideti.setUrl("http://www.ideti.com.co/");
            ideti.setNumero("+573116372242");
            ideti.setCorreo("alexromero1985@gmail.com");
            ideti.save();

            Empresas big = new Empresas();
            big.setNombre("The Big Bang Company");
            big.setDescripcion("Somos una compañía integrada por un equipo de profesionales con un avanzado nivel de formación, quienes cuentan con amplia experiencia en investigación y desarrollo de sistemas y plataformas para la gestión de grandes volúmenes de información, descubrimiento de conocimiento y aplicaciones relacionadas. Estamos comprometidos con brindar productos y servicios de altísima calidad, que satisfagan efectiva y oportunamente las necesidades de nuestros clientes. El mejoramiento continuo, la comunicación activa, la confianza y la flexibilidad son parte de nuestros valores corporativos.");
            big.setImagen(Util.THEBIGBANGCOMPANY);
            big.setUrl("http://bitbang-stag.cloudapp.net/");
            big.setNumero("+573007919297");
            big.setCorreo("luisrojasmainmail@gmailc.om");
            big.save();

            Empresas buxtar = new Empresas();
            buxtar.setNombre("Buxtar");
            buxtar.setDescripcion("esta es la descripción de Buxtar");
            buxtar.setImagen(Util.BUXTAR);
            buxtar.setUrl("http://www.buxtar.co");
            buxtar.setNumero("+573007832157");
            buxtar.setCorreo("gerencia@buxtar.co");
            buxtar.save();

            Empresas celeste = new Empresas();
            celeste.setNombre("Celeste");
            celeste.setDescripcion("CELESTE TECHNOLOGY es una empresa Caucana que se distingue por contribuir al desarrollo empresarial, a través de la implementación de procesos Administrativos, utilizando y desarrollando herramientas flexibles y a la medida basadas en las TICs (tecnologías de la información y las comunicaciones) para mejorar la calidad de vida de la población empresarial.");
            celeste.setImagen(Util.CELESTE);
            celeste.setUrl("http://www.celeste.com.co/");
            celeste.setNumero("+573159269949");
            celeste.setCorreo("contacto@celeste.com.co");
            celeste.save();

            Empresas creazion = new Empresas();
            creazion.setNombre("Creazion");
            creazion.setDescripcion("Somos una Startup innovadora en el desarrollo y diseño de sitios web, aplicaciones móviles, software a la medida y estamos incursionando en el Developer Games.");
            creazion.setImagen(Util.CREAZION);
            creazion.setUrl("http://creazionsoftware.com");
            creazion.setNumero("+573217879743");
            creazion.setCorreo("info@creazionsoftware.com");
            creazion.save();

            Empresas egob = new Empresas();
            egob.setNombre("EGOB");
            egob.setDescripcion("esta es la descripción de EGOB");
            egob.setImagen(Util.EGOB);
            egob.setUrl("http://www.egobconsultoria.com");
            egob.setNumero("+573207596657");
            egob.setCorreo("alejocampos85@gmail.com");
            egob.save();

            Empresas eteknik = new Empresas();
            eteknik.setNombre("Eteknik");
            eteknik.setDescripcion("Fundada en Mayo de 2014, E-TEKNIK es una empresa especializada en el desarrollo de soluciones y servicios tecnológicos dirigidos principalmente al mercado empresarial y académico, buscando resolver necesidades de información útil para la toma de decisiones estratégicas, contribuyendo a a satisfacción de nuestros clientes en forma sostenible. E-Teknik SAS, es una empresa que se logró consolidar para brindar el servicio Plataforma SIGIA, gracias al apoyo del FONDO EMPRENDER y a las instituciones educativas que han confiado en nosotros.");
            eteknik.setImagen(Util.ETEKNIK);
            eteknik.setUrl("http://www.eteknik.co");
            eteknik.setNumero("+573114549644");
            eteknik.setCorreo("contactenos@eteknik.co");
            eteknik.save();

            Empresas health = new Empresas();
            health.setNombre("Health");
            health.setDescripcion("esta es la descripción de Health");
            health.setImagen(Util.HEALTH);
            health.setUrl("http://www.parquesoftpopayan.com");
            health.setNumero("+573182572324");
            health.setCorreo("kcumen@gmail.com");
            health.save();

            Empresas human = new Empresas();
            human.setNombre("Human");
            human.setDescripcion("Somos un equipo calificado, con experiencia de más de 10 años en la selección de gente clave, y con tecnología que nos permite proyectarnos al futuro y resolver el presente en tiempo real, trabajando con “Socios Estratégicos”, más que clientes. Ofrecemos una opción ágil, dinámica y eficaz en la búsqueda de líderes que mejoren la competitividad de las empresas.");
            human.setImagen(Util.HUMAN);
            human.setUrl("http://www.humanteamqa.com");
            human.setNumero("+573107820078");
            human.setCorreo("heldersoft@gmail.com");
            human.save();

            Empresas inet = new Empresas();
            inet.setNombre("Inet");
            inet.setDescripcion("INET ofrece servicios de consultoría y de implementación de soluciones tecnológicas para la implementación de Entornos Virtuales de Aprendizaje, orientados a instituciones de educación o a eorganizaciones interesadas en desarrollar sus porgramas de capacitación. Los acompñamos en: Implementación de una platafora de educación virtual, Construcción de Objetos Virtuales de Aprendizaje para impartir formación, Acompañamiento en la implementación de programas de capacitación.");
            inet.setImagen(Util.INET);
            inet.setUrl("http://www.inetcol.com");
            inet.setNumero("+573176352347");
            inet.setCorreo("ximenaerazo0911@gmail.com");
            inet.save();

            Empresas jump = new Empresas();
            jump.setNombre("Jump");
            jump.setDescripcion("Jump Gerencia Creativa tiene como misión idear oportunidades de progreso para las organizaciones mediante la formulación, gestión de proyectos y negocios de alto impacto económico y social que puedan ser promovidos y financiados a nivel nacional e internacional. Jump Gerencia Creativa desarrolla acciones desde el año 2002, período en el que ha podido gestionar recursos nacionales e internacionales para el sector de las Tecnologías Informáticas y de la Comunicación; el Desarrollo Empresarial y las Industrias Culturales por más de US $ 12 MM, que han permitido beneficiar un grupo importante de instituciones y empresas en diversas regiones del País: Nariño, Chocó, Cauca, Valle, Risaralda, Quindío, Caldas, Bogotá, Sucre, Magdalena, Atlántico, Guaviare y Meta.");
            jump.setImagen(Util.JUMP);
            jump.setUrl("http://www.jump-gc.com");
            jump.setNumero("+573154157085");
            jump.setCorreo("contacto@jump-gc.com");
            jump.save();

            Empresas sadmin = new Empresas();
            sadmin.setNombre("Sadmin");
            sadmin.setDescripcion("esta es la descripción de Sadmin");
            sadmin.setImagen(Util.SADMIN);
            sadmin.setUrl("http://www.sadmin.co");
            sadmin.setNumero("+573007802072");
            sadmin.setCorreo("proyectos@sadmin.net");
            sadmin.save();

            Empresas somos = new Empresas();
            somos.setNombre("Somos");
            somos.setDescripcion("Ofrecer soluciones TIC (Tecnologías de la Información y las Comunicaciones), integrales y de excelencia a nivel local y global, para responder a las necesidades de comunicación, información, conocimiento, movilidad y ubicuidad de los seres humanos y sus organizaciones. SoMoS construye sus soluciones a partir de procesos de innovación y desarrollo que emprende al interior de la organización o en alianza con centros de investigación e instituciones de educación superior regionales e internacionales.");
            somos.setImagen(Util.SOMOS);
            somos.setUrl("http://www.somos.biz");
            somos.setNumero("+573155781496");
            somos.setCorreo("info@somos.biz");
            somos.save();

            Empresas sunset = new Empresas();
            sunset.setNombre("Sunset");
            sunset.setDescripcion("SUNSET SOFTWARE HOUSE S.A.S es una empresa de software comprometida con la calidad y las mejores prácticas de Ingeniería de Software, enfocada en acompañar y solucionar las necesidades de nuestros clientes, tanto en etapas específicas del desarrollo como en soluciones complejas y a la medida, buscando siempre ofrecer la mejor relación costo-beneficio. Así mismo, es una empresa generadora de empleo para profesionales y conocimiento para progreso del país.");
            sunset.setImagen(Util.SUNSET);
            sunset.setUrl("http://www.sunsetswh.com");
            sunset.setNumero("+573014286718");
            sunset.setCorreo("julian.bermudez@sunsetswh.com");
            sunset.save();

            Empresas tics = new Empresas();
            tics.setNombre("Tics");
            tics.setDescripcion("Somos una empresa conformada por profesionales especialistas en tecnologías de la información y las comunicaciones (TICS) que surgió para dar soluciones tecnológicas a medianas y pequeñas empresas o emprendedores, ofreciendo experiencia, calidad, flexibilidad y optimización de los recursos tecnológicos. Nos ponemos a su disposición con nuestro enfoque directo a la búsqueda de éxito. El desarrollo de la comunicación y la gestión de proyectos. ");
            tics.setImagen(Util.TICS);
            tics.setUrl("http://www.tics.co");
            tics.setNumero("+573113532415");
            tics.setCorreo("cgomez@tics.co");
            tics.save();

            Empresas taio = new Empresas();
            taio.setNombre("Taio");
            taio.setDescripcion("Nowadays, the technology is changing quickly; faster and smaller devices are driving the future of people daily lives. According to this landscape, the efforts of companies like Intel® to improve its design and hardware developments are very important so these forecasts become a reality. However, this is only a piece of the puzzle because the firmware development and Integrated Development Environments production are the required support to close these efforts to developers and common people: this is the target of TaIO Systems.");
            taio.setImagen(Util.TAIO);
            taio.setUrl("http://www.taiosystems.com");
            taio.setNumero("+573006735009");
            taio.setCorreo("francisco.martinez@taiossystems.com");
            taio.save();

            Empresas totems = new Empresas();
            totems.setNombre("Totems Consulting");
            totems.setDescripcion("esta es la descripción de Totems");
            totems.setImagen(Util.TOTEMS);
            totems.setUrl("http://www.totemsconsulting.com");
            totems.setNumero("+573014129947");
            totems.setCorreo("aljegoram@gmail.com");
            totems.save();

            Empresas vigilax = new Empresas();
            vigilax.setNombre("Vigilax");
            vigilax.setDescripcion("Ayudar a nuestros clientes a fortalecer sus procesos empresariales mediante la utilización de herramientas tecnológicas modernas e intuitivas. ");
            vigilax.setImagen(Util.VIGILAX);
            vigilax.setUrl("http://www.actiont.net");
            vigilax.setNumero("+573158369481");
            vigilax.setCorreo("difesanchez@gmail.com");
            vigilax.save();

            Empresas winet = new Empresas();
            winet.setNombre("Winet");
            winet.setDescripcion("esta es la descripción de Winet");
            winet.setImagen(Util.WINET);
            winet.setUrl("http://www.parquesoftpopayan.com");
            winet.setNumero("+573017718090");
            winet.setCorreo("williamd79@gmail.com");
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
