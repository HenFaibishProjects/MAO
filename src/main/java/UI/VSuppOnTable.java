//package UI;
//
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.scene.Scene;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//import people.DaysOfTheWeek;
//import people.Supplier;
//import people.VirtualSupplier;
//
//@SuppressWarnings("restriction")
//public class VSuppOnTable {
//
//
//	@SuppressWarnings("restriction")
//	public static class bain extends Application {
//		char[] days = {'a','b','c'};
//	    Stage window;
//	    TableView<Supplier> table;
//
//	    public static void runTables() {
//	        launch();
//	    }
//
//	    @SuppressWarnings("unchecked")
//		@Override
//	    public void start(Stage primaryStage) throws Exception {
//	        window = primaryStage;
//	        window.setTitle("thenewboston - JavaFX");
//	        
//	        //Name column
//	        TableColumn<Supplier, String> nameColumn = new TableColumn<>("Name");
//	        nameColumn.setMinWidth(200);
//	        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
//
//	        //Price column
//	        TableColumn<Supplier, Double> priceColumn = new TableColumn<>("ID");
//	        priceColumn.setMinWidth(100);
//	        priceColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
//
//	        //Quantity column
//	        TableColumn<Supplier, String> quantityColumn = new TableColumn<>("Phone");
//	        quantityColumn.setMinWidth(100);
//	        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
//	        
//	        //Quantity column
//	        TableColumn<Supplier, String> quantityColumdn = new TableColumn<>("Code");
//	        quantityColumn.setMinWidth(100);
//	        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
//
//	        table = new TableView<>();
//	        table.setItems(getProduct());
//	        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn,quantityColumdn);
//
//	        VBox vBox = new VBox();
//	        vBox.getChildren().addAll(table);
//
//	        Scene scene = new Scene(vBox);
//	        window.setScene(scene);
//	        window.show();
//	    }
//
//	    //Get all of the products
//	    public ObservableList<Supplier> getProduct(){
//	        ObservableList<Supplier> vp = FXCollections.observableArrayList();
//			vp.add(new Supplier( 123, "name1", "abcd",  "aaa",DaysOfTheWeek.daysOfTheWeek));
//			vp.add(new Supplier( 456, "name2", "efgh",  "bbb", DaysOfTheWeek.daysOfTheWeek));
//			vp.add(new Supplier( 789, "name3", "ijkl",  "ccc", DaysOfTheWeek.daysOfTheWeek));
//			vp.add(new Supplier( 190, "name4", "mnop",  "ddd" , DaysOfTheWeek.daysOfTheWeek));
//			vp.add(new Supplier( 222, "name5", "qrst",  "eee" , DaysOfTheWeek.daysOfTheWeek));
//	        
//	        
//	        return vp;
//	    }
//
//
//	}
//}
