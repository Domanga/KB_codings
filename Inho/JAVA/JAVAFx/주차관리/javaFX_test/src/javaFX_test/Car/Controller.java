package javaFX_test.Car;

import java.net.URL;
import java.util.*;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller implements Initializable {
	@FXML
	private TextField i_model;
	@FXML
	private TextField i_number;
	@FXML
	private TextField i_color;

	@FXML
	private TextArea parking_stat;

	@FXML
	private TextField o_model;
	@FXML
	private TextField o_number;

	@FXML
	private Button enter_btn, out_btn, parking_btn;

	@FXML
	private Button db_conncetion;

	Connection conn = null;
	String dbname = "parking";
	Statement stmt = null;
	ResultSet rs = null;

	PreparedStatement pstmt = null;

	public void initialize(URL location, ResourceBundle resources) {

		enter_btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				String model = i_model.getText();
				String number = i_number.getText();
				String color = i_color.getText();

				String sql = "insert into " + dbname + ".parkingCar values(?, ?, ?, ?)";

				SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date time = new Date();
				String time1 = format1.format(time);

				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("입차");
				alert.setHeaderText("입차를 실행합니다.");
				alert.setContentText("실행하시겠습니까?");
				alert.showAndWait().ifPresent(ra -> {
					if (ra == ButtonType.OK) {
						try {
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, model);
							pstmt.setString(2, number);
							pstmt.setString(3, color);
							pstmt.setString(4, time1);

							pstmt.executeUpdate();
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
				alert.setTitle("출차");
				alert.setHeaderText("출차를 실행합니다.");
				alert.setContentText("실행하시겠습니까?");
				alert.showAndWait().ifPresent(ra -> {
					if (ra == ButtonType.OK) {
						try {
							pstmt = conn.prepareStatement(sql1);
							pstmt.setString(1, model1);
							pstmt.setString(2, number1);

							pstmt.executeUpdate();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});

		parking_btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String sql2 = "select model, number, color, date from " + dbname + ".parkingCar";

				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("현재 주차 상태");
				alert.setHeaderText("현재 주차 상태를 확인합니다.");
				alert.setContentText("주차된 차량들을 출력하시겠습니까?");
				alert.showAndWait().ifPresent(ra -> {
					if (ra == ButtonType.OK) {

						String statements = "";
						try {
							rs = stmt.executeQuery(sql2);
							while (rs.next()) {
								statements += rs.getString(1) + "  \t" + rs.getString(2) + "  \t" + rs.getString(3)
										+ "  \t" + rs.getString(4) + "  \n";
							}
							parking_stat
									.setText("차량모델  \t차량번호  \t차량색상  \t입차시간\n -------------------------------------\n"
											+ statements);
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				});
			}
		});

		db_conncetion.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("DB연결");
				alert.setHeaderText("DB 연결을 실행합니다.");
				alert.setContentText("연결하시겠습니까?");
				alert.showAndWait().ifPresent(ra -> {
					if (ra == ButtonType.OK) {
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							String url = "jdbc:mysql://localhost/" + dbname
									+ "?serverTimezone=UTC&allowPublicKeyRetrieval=true" + "&useSSL=false";
							conn = DriverManager.getConnection(url, "root", "0506");
							System.out.println("주차시스템 연동 시작");

							stmt = conn.createStatement();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
	}
}
