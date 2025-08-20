package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Estoque;
import model.services.EstoqueService;

public class EstoqueListController implements Initializable{

	private EstoqueService service;
	
	
	@FXML
	private TableView<Estoque> tableViewEstoque;
	
	@FXML
	private TableColumn<Estoque, String> tableColumnCodigo;
	
	@FXML
	private TableColumn<Estoque, String> tableColumnBarras;
	
	@FXML
	private TableColumn<Estoque, String> tableColumnDescricao;
	
	@FXML
	private TableColumn<Estoque, Integer> tableColumnQtde;
	
	@FXML
	private TableColumn<Estoque, String> tableColumnUnidade;
	
	@FXML
	private TableColumn<Estoque, Double> tableColumnValor;
	
	@FXML
	private TableColumn<Estoque, String> tableColumnLocal;
	
	
	@FXML
	private Button btNew;
	
	private ObservableList<Estoque> obsList;
	
	
	
	@FXML
	public void onBtNewAction() {
		System.out.println("OnBtNewAction");
	}
	
	
	public void setEstoqueService(EstoqueService service) {
		this.service = service;
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		tableColumnCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		tableColumnBarras.setCellValueFactory(new PropertyValueFactory<>("barras"));
		tableColumnDescricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
		tableColumnQtde.setCellValueFactory(new PropertyValueFactory<>("qtde"));
		tableColumnUnidade.setCellValueFactory(new PropertyValueFactory<>("unidade"));
		tableColumnValor.setCellValueFactory(new PropertyValueFactory<>("precov"));
		tableColumnLocal.setCellValueFactory(new PropertyValueFactory<>("local"));
		
		//faz o tableview acompanhar o tamanho da janela:
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewEstoque.prefHeightProperty().bind(stage.heightProperty());
		
		
	}
	
	public void updateTableView() {
		if (service == null) {
			throw new IllegalStateException("Service was null");
		}
		
		List<Estoque> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewEstoque.setItems(obsList);
		
	}
	
	
}
