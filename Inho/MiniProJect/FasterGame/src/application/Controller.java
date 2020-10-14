package application;

import java.net.URL;
import java.util.*;

import javafx.util.Duration;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.util.Random;

public class Controller implements Initializable {
	@FXML
	private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_10, btn_11, btn_12, btn_13,
			btn_14, btn_15, btn_16, btn_17, btn_18, btn_19, btn_20, btn_21, btn_22, btn_23, btn_24, btn_25;

	@FXML
	private Button start_btn, pause_btn;

	@FXML
	private Label time;

	@FXML
	private TextField text_time;

	int count = 1;

	public boolean isPause = false;
	
	public Button[] click_btn = new Button[25];
	int random[] = new int[25];
	int after[] = new int[25];
	Random rand = new Random();

	private Timeline timeLine;
	private DoubleProperty timeSeconds = new SimpleDoubleProperty();
	private Duration time1 = Duration.ZERO;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		timeLine = new Timeline(); // timeLine ��ü �ʱ�ȭ
		timeLine.setCycleCount(Timeline.INDEFINITE);
		timeLine.play();

		start_btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				setNumber();
				count = 1;
				
				for(int i=0;i<25;i++) {
					click_btn[i].setVisible(true);
				}
				
				timeLine.stop();
				time1 = Duration.ZERO;
				time.textProperty().bind(timeSeconds.asString());

				for (int i = 0; i < 25; i++) {

					after[i] = rand.nextInt(25) + 26;
					for (int j = 0; j < i; j++) {
						if (after[i] == (after[j])) {
							i--;
							break;
						}
					}
				}
				if (count < 51) {

					timeLine = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent t) {
							Duration duration = ((KeyFrame) t.getSource()).getTime();
							time1 = time1.add(duration);
							timeSeconds.set(time1.toSeconds());
						}
					}));
					timeLine.setCycleCount(Timeline.INDEFINITE);
					timeLine.play();
				}

			}
		});
		pause_btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				if(!isPause) {
					timeLine.pause();
					isPause = true;
				}
				else {
					timeLine.play();
					isPause = false;
				}
			}
		});
	}

	public void onClick(ActionEvent event) {
		if (count == Integer.parseInt(((Button) event.getSource()).getText())) {
			
			String id = ((Button) event.getSource()).getId();
			int index = Integer.parseInt(id.substring(4));

			if (count < 26) {
				click_btn[index - 1].setText(String.valueOf(after[count - 1]));
			} else {
				click_btn[index - 1].setVisible(false);
			}
			count++;

		} else {
			System.out.println("땡 ! " + String.valueOf(count));
		}
		if (count == 51) {
			timeLine.stop();
			 Alert alert = new Alert(AlertType.INFORMATION);
             alert.setTitle("클리어!");
             alert.setContentText("축하드립니다!.");
             alert.setHeaderText(null);
             alert.show();
		}
	}

	public void setNumber() {
		click_btn[0] = btn_1;
		click_btn[1] = btn_2;
		click_btn[2] = btn_3;
		click_btn[3] = btn_4;
		click_btn[4] = btn_5;
		click_btn[5] = btn_6;
		click_btn[6] = btn_7;
		click_btn[7] = btn_8;
		click_btn[8] = btn_9;
		click_btn[9] = btn_10;
		click_btn[10] = btn_11;
		click_btn[11] = btn_12;
		click_btn[12] = btn_13;
		click_btn[13] = btn_14;
		click_btn[14] = btn_15;
		click_btn[15] = btn_16;
		click_btn[16] = btn_17;
		click_btn[17] = btn_18;
		click_btn[18] = btn_19;
		click_btn[19] = btn_20;
		click_btn[20] = btn_21;
		click_btn[21] = btn_22;
		click_btn[22] = btn_23;
		click_btn[23] = btn_24;
		click_btn[24] = btn_25;

		for (int i = 0; i < click_btn.length; i++) {

			random[i] = rand.nextInt(25) + 1;
			for (int j = 0; j < i; j++) {
				if (random[i] == (random[j])) {
					i--;
					break;
				}
			}
			click_btn[i].setText(String.valueOf(random[i]));
		}

	}
}
