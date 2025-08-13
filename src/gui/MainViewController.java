package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemCadastroProduto;
	@FXML
	private MenuItem menuItemCadastroFornecedor;
	@FXML
	private MenuItem menuItemCadastroCliente;
	@FXML
	private MenuItem menuItemConsultaProduto;
	@FXML
	private MenuItem menuItemConsultaFornecedor;
	@FXML
	private MenuItem menuItemConsultaCliente;
	@FXML
	private MenuItem menuItemSobre;
	
	
	@FXML
	public void onMenuItemCadastroProdutoAction() {
		System.out.println("onMenuItemCadastroProdutoAction");
	}
	
	@FXML
	public void onMenuItemCadastroFornecedorAction() {
		System.out.println("onMenuItemCadastroFornecedorAction");
	}
	
	@FXML
	public void onMenuItemCadastroClienteAction() {
		System.out.println("onMenuItemCadastroClienteAction");
	}
	
	@FXML
	public void onMenuItemConsultaProdutoAction() {
		System.out.println("onMenuItemConsultaProdutoAction");
	}
	
	@FXML
	public void onMenuItemConsultaFornecedorAction() {
		System.out.println("onMenuItemConsultaFornecedorAction");
	}
	
	
	@FXML
	public void onMenuItemConsultaClienteAction() {
		System.out.println("onMenuItemConsultaClienteAction");
	}
	
	
	@FXML
	public void onMenuItemSobreAction() {
		loadView("/gui/About.fxml");
	}
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	private synchronized void loadView(String absoluteName) {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVbox = loader.load();	
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent(); //pegando a referencia do VBox da mainview
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVbox.getChildren());
			
			
			
		}
		catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error Loading view", e.getMessage(), AlertType.ERROR);
		}
	}
	
	
	
	
}
