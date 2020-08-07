/**
 * 
 */
package fr.afpa.bibliotheque.business.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import fr.afpa.bibliotheque.service.config.ServiceConfig;

/**
 * @author bilonjea
 *
 */

@Configuration
@Import(value = {
ServiceConfig.class
} )
@ComponentScan("fr.afpa.bibliotheque.business")
public class BusinessConfig {


}
