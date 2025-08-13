package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
		System.out.println("onMenuItemSobreAction");
	}
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
