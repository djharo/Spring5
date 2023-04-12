package com.curso.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StartApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
    
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(StartApplication.class);
	}
    
    /*
    Para desplegar la aplicacion en un tomcat externo.
     
    1-Extender la clase StartApplication o la clase que tenga la anotacion
    @SpringBootApplication de SpringBootServletInitializer
    
    2-Sobrescribir el metodo SpringApplicationBuilder
    
    3-Si tengo un archivo de propiedades donde indico el puerto para levantar mi 
    	aplicacion en local lo tengo que comentar o quitar
    4-En el pom añair <packaging>war</packaging> por defecto genera un jar si no 
		se indica nada y añadir la dependencia
     	
     	<!-- tomcat -->
         <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>provided</scope>
        </dependency>
        
     5-Clean install para generar el .war el archivo tendra el nombre que se haya indicado en el artifactId
      <artifactId>testing-junit5-mockito</artifactId>
      seguido de un - mas la version del proyecto
      <version>1.0</version>
      
     6- Una vez generado el war nos vamos a nuestro tomcat lo levantamos y en Manager App nos logueamos tomcat-tomcat
       	y en Archivo WAR a desplegar buscamos donde esta nuestro war y damos en Desplegar
       	En Aplicaciones nos aparecera nuestro war ya despegado con el nombre testing-junit5-mockito-1.0 y pinchando
       	sobre el se nos habrira la pagina que tengamos de inicio en este caso 
       	http://localhost:8080/testing-junit5-mockito-1.0/ la ultima barra indica el path principal que en este caso devuelve un 
       	Hello Controller 
       	Tambien podriamos poner un http://localhost:8080/testing-junit5-mockito-1.0/getGreeting (ObtenerSaludo) y nos devolvera lo mismo.
       	
     7- Otra opcion es ir a la carpeta C:\apache-tomcat-9.0.73\webapps y añadir ahi nuestro war tomcat automaticamente lo desplegara
     	y podremos ver las peticiones como se indica en el punto 6
     	
     8- En el caso de querer realizar pruebas con postman 
     	Si lanzamos contra tomcat la url seria 
     	http://localhost:8080/testing-junit5-mockito-1.0/
     	o http://192.168.1.28:8080/testing-junit5-mockito-1.0/  ya que 192.... es
     	mi direccion IP 
     	Si lanzamos contra el servicio levantado en local como siempre
     	http://localhost:8081/
     	
     	***TOMCAT UTILIZARA SIEMPRE EL MISMO PUERTO 8080 O EL QUE CONFIGUREMOS
     	*Y PODEMOS TENER VARIOS SERVICIOS EN EL MISMO PUERTO YA QUE EL PATH CAMBIA 
     	*AL TENER QUE PONER EL NOMBRE DEL WAR EN EL PATH
     	*https://www.youtube.com/watch?v=k6rrzkdWykk
     	*
     	*Se puede tener la aplicacion levantada en local y en tomcat la configuracion
     	*no afecta para seguir levantandolo en local
     	
     */
}
