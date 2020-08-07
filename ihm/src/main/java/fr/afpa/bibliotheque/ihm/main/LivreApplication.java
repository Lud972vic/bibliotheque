package fr.afpa.bibliotheque.ihm.main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LivreApplication extends Application {

	Group root = new Group();
	Scene scene = new Scene(root, 500, 400, Color.YELLOW);

	@Override

	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(scene);
		primaryStage.setTitle("Bibliothèque");

//		LivreBusinessImpl lb = new LivreBusinessImpl();
//		List<Livre> monLivre = lb.getBusinessRechercherLivreParTitre("");
//		
//		Label label1 = new Label("Mon livre :");
//		TextField textField = new TextField (monLivre.toString());
//		HBox hb = new HBox();
//		
//		textField.getText();
//		
//		hb.getChildren().addAll(label1, textField);
//		hb.setSpacing(10);

		primaryStage.show();
	}
}
