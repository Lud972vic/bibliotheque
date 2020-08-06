/**
 * 
 */
package fr.afpa.bibliotheque.ihm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import fr.afpa.bibliotheque.business.config.BusinessConfig;

/**
 * @author bilonjea
 *
 */

@Configuration
@Import(value = {
BusinessConfig.class
} )
@ComponentScan("fr.afpa.bibliotheque.ihm")
public class MainConfig {
	

}
