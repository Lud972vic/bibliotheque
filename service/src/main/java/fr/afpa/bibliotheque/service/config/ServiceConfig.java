/**
 * 
 */
package fr.afpa.bibliotheque.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import fr.afpa.bibliotheque.repository.config.RepositoryConfig;

/**
 * @author bilonjea
 *
 */

/*
 * Spring peut automatiquement rechercher des beans dans un paquet si l’analyse de composant est activée.
 * @ ComponentScan configure les packages à analyser pour les classes avec une configuration d’annotation . 
 * Nous pouvons spécifier les noms de package de base directement avec l’un des arguments basePackages ou value 
 * ( value est un alias pour basePackages ):
 * @Configuration
 * @ComponentScan(basePackages = "com.baeldung.annotations")
 * class VehicleFactoryConfig {}
 */


@Configuration
@Import(value = {
RepositoryConfig.class
} )

@ComponentScan("fr.afpa.bibliotheque.service")
public class ServiceConfig {

}
