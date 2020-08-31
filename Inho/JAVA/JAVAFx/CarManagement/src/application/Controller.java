package application;

import java.net.URL;
import java.util.*;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller implements Initializable {
	@FXML
	private TextField i_model, i_number, i_color;;

	@FXML
	private TextArea parking_stat, parking_search, history;

	@FXML
	private TextField o_model, o_number;

	@FXML
	private Button enter_btn, out_btn, parking_btn, search_btn, db_conncetion;

	@FXML
	private TextField s_model, s_number;

	@FXML
	public ComboBox<String> floor, s_floor;

	ObservableList<String> list = FXCollections.observableArrayList("1", "2", "3", "4");

	Connection conn = null;
	String dbname = "parking";
	Statement stmt = null;
	ResultSet rs = null;
	String cur_floor, search_floor;

	PreparedStatement pstmt = null;

	String sql_stat = "select model, number, color, date, floor from " + dbname + ".parkingCar order by floor ASC";
	String sql_log = "select * from " + dbname + ".history order by floor ASC";
	int Charge;
	
	SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public void initialize(URL location, ResourceBundle resources) {

		floor.setItems(list);
		s_floor.setItems(list);

		enter_btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				String model = i_model.getText();
				String number = i_number.getText();
				String color = i_color.getText();
				cur_floor = floor.getValue();
				String sql = "insert into " + dbname + ".parkingCar values(?, ?, ?, ?, ?)";

				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("����");
				alert.setHeaderText("������ �����մϴ�.");
				alert.setContentText("�����Ͻðڽ��ϱ�?");
				alert.showAndWait().ifPresent(ra -> {
					if (ra == ButtonType.OK) {
						try {
							Date time = new Date();
							String time1 = format1.format(time);

							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, model);
							pstmt.setString(2, number);
							pstmt.setString(3, color);
							pstmt.setString(4, time1);
							pstmt.setString(5, cur_floor);

							pstmt.executeUpdate();

							printCarStatement(sql_stat, parking_stat);
							
							 initiateText();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});

		out_btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String model1 = o_model.getText();
				String number1 = o_number.getText();

				String sql1 = "delete from " + dbname + ".parkingCar where model = ? and number = ? ";

				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("����");
				alert.setHeaderText("������ �����մϴ�.");
				alert.setContentText("�����Ͻðڽ��ϱ�?");
				alert.showAndWait().ifPresent(ra -> {
					if (ra == ButtonType.OK) {
						try {
							String sql_temp = "select model, number, color, date, floor from " + dbname
									+ ".parkingCar where model = '" + model1 + "' order by floor ASC";
							pstmt = conn.prepareStatement(sql_temp);
							rs = pstmt.executeQuery();

							while (rs.next()) {
								Date time = new Date();
								String sql = "insert into " + dbname + ".history values(?, ?, ?, ?, ?, ?)";
								String intime = rs.getString(4);
								String outtime = format1.format(time);
								String floor = rs.getString(5);

								cal_Charge(intime, outtime);

								pstmt = conn.prepareStatement(sql);

								pstmt.setString(1, model1);
								pstmt.setString(2, number1);
								pstmt.setString(3, intime);
								pstmt.setString(4, outtime);
								pstmt.setString(5, floor);
								pstmt.setString(6, String.valueOf(Charge));

								pstmt.executeUpdate();
							}
							// delete
							pstmt = conn.prepareStatement(sql1);
							pstmt.setString(1, model1);
							pstmt.setString(2, number1);

							pstmt.executeUpdate();


							printCarStatement(sql_stat, parking_stat);
							printCarLog(sql_log, history);

							initiateText();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});

//		parking_btn.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//
//				Alert alert = new Alert(AlertType.INFORMATION);
//				alert.setTitle("���� ���� ����");
//				alert.setHeaderText("���� ���� ���¸� Ȯ���մϴ�.");
//				alert.setContentText("������ �������� ����Ͻðڽ��ϱ�?");
//				alert.showAndWait().ifPresent(ra -> {
//					if (ra == ButtonType.OK) {
//						printCarStatement(sql_stat, parking_stat);
//					}
//				});
//			}
//		});

		db_conncetion.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("DB����");
				alert.setHeaderText("DB ������ �����մϴ�.");
				alert.setContentText("�����Ͻðڽ��ϱ�?");
				alert.showAndWait().ifPresent(ra -> {
					if (ra == ButtonType.OK) {
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							String url = "jdbc:mysql://localhost/" + dbname
									+ "?serverTimezone=UTC&allowPublicKeyRetrieval=true" + "&useSSL=false";
							conn = DriverManager.getConnection(url, "root", "0506");
							System.out.println("�����ý��� ���� ����");

							stmt = conn.createStatement();

							printCarStatement(sql_stat, parking_stat);
							printCarLog(sql_log, history);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});

		search_btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				String smodel = s_model.getText();
				String snumber = s_number.getText();
				String sfloor = s_floor.getValue();

				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("������ȸ");
				alert.setHeaderText("�𵨸�" + smodel + "������ȣ" + snumber + "��" + sfloor);
				alert.setContentText("�˻��Ͻðڽ��ϱ�?");
				alert.showAndWait().ifPresent(ra -> {
					if (ra == ButtonType.OK) {
						try {
							if (!smodel.equals("")) {
								String sql3 = "select model, number, color, date, floor from " + dbname
										+ ".parkingCar where model = " + "'" + smodel + "'" + " order by floor ASC";
								rs = stmt.executeQuery(sql3);

								printCarStatement(sql3, parking_search);

							} else if (!snumber.equals("")) {
								String sql3 = "select model, number, color, date, floor from " + dbname
										+ ".parkingCar where number = " + "'" + snumber + "'" + " order by floor ASC";
								rs = stmt.executeQuery(sql3);

								printCarStatement(sql3, parking_search);
							} else if (!sfloor.equals("")) {
								String sql3 = "select model, number, color, date, floor from " + dbname
										+ ".parkingCar where floor = " + "'" + sfloor + "'" + " order by floor ASC";

								printCarStatement(sql3, parking_search);
							}
							 initiateText();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
	}

	public void printCarStatement(String sql, TextArea area) {
		String statements = "";
		try {
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				statements += rs.getString(1) + "  \t" + rs.getString(2) + "  \t" + rs.getString(3) + "  \t"
						+ rs.getString(4) + "  \t" + rs.getString(5) + "\n";
			}
			area.setText(
					"������  \t������ȣ  \t��������  \t�����ð�  \t                       ��\n -------------------------------------------------\n"
							+ statements);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void printCarLog(String sql, TextArea area) {
		String statements = "";
		try {
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				statements += rs.getString(1) + "  \t" + rs.getString(2) + "  \t" + rs.getString(3) + "  \t"
						+ rs.getString(4) + "  \t" + rs.getString(5) + "  \t" + rs.getString(6) + "\n";
			}
			area.setText(
					"������  \t������ȣ  \t�����ð�  			  \t�����ð�  \t	              ��\t��� \n -----------------------------------------------------------------------\n"
							+ statements);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void cal_Charge(String intime, String outtime) {
		try {
			Date first = format1.parse(intime);
			Date second = format1.parse(outtime);
			
			long CalDate = second.getTime() - first.getTime();
			long CalMins = CalDate / (60 * 1000);

			if(CalMins < 75) {
				Charge = 2000;
			}
			else if( CalMins > 75 ) {
				int temp = (int) CalMins -60;
				
				Charge = 2000 + ((temp / 15) * 500); 
			}
			System.out.println(String.valueOf(CalMins));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initiateText() {
		i_model.setText("");
		i_number.setText("");
		i_color.setText("");
		floor.setItems(list);  
		
		o_model.setText("");
		o_number.setText("");
		
		s_model.setText("");
		s_number.setText("");
		s_floor.setItems(list);  
	}
	public void comboChanged(ActionEvent event) {

	}

	public void comboChanged_1(ActionEvent event) {

	}
}
