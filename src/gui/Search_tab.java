package gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Search_tab extends Tab{
	
	Button room_but;
	Button per_but;
	Button res_but;
	NumberTextField room_field;
	TextField name_field;
	NumberTextField id_field;
	@SuppressWarnings("rawtypes")
	TableView table;
	
	public Button get_room_but(){
		return room_but;
	}
	public Button get_per_but(){
		return per_but;
	}
	public Button get_res_but(){
		return res_but;
	}
	public TextField get_room_field(){
		return room_field;
	}
	public TextField get_name_field(){
		return name_field;
	}
	public TextField get_id_field(){
		return id_field;
	}
	@SuppressWarnings("rawtypes")
	public TableView get_display(){
		return table;
	}
	
	 
	 Search_tab(){
		setText("Search");
		VBox ver_b=new VBox();
		Create(ver_b);
		setContent(ver_b);	
	}
	 
	 
	@SuppressWarnings("rawtypes")
	void Create(VBox ver_b){
		table=new TableView();
		GridPane grid_p=new GridPane();
		
		
		
		Label room_label=new Label("Room number:");
		NumberTextField room_field=new NumberTextField();
		Label name_label=new Label("Name:");
		TextField name_field=new TextField();
		Label id_label=new Label("Identity number:");
		NumberTextField id_field=new NumberTextField();
		room_but=new Button("Room");
		per_but=new Button("Person");
		res_but=new Button("Reservation");
		room_but.setPrefSize(120, 65);
		per_but.setPrefSize(120, 65);
		res_but.setPrefSize(120, 65);
		//grid_p.setGridLinesVisible(true);
		grid_p.add(room_label, 0, 0);
		grid_p.add(room_field, 0, 1);
		grid_p.add(name_label, 0, 2);
		grid_p.add(name_field, 0, 3);
		grid_p.add(id_label, 0, 4);
		grid_p.add(id_field, 0, 5);
		
		grid_p.add(room_but, 1,2,1,3);
		grid_p.add(per_but, 2, 2,1,3);
		grid_p.add(res_but, 3, 2,1,3);
		
		
		grid_p.setAlignment(Pos.CENTER);
		grid_p.setMinHeight(200);
		grid_p.setVgap(10);
		grid_p.setHgap(10);
		grid_p.setPadding(new Insets(10));
		table.setPrefHeight(5000);
		table.setEditable(true);
		table.setPlaceholder(new Label(""));
		ver_b.getChildren().addAll(grid_p,table);
	}
	 
	 
	 
}
