package application;

import java.net.URL;
import java.util.*;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.util.Timer;
import java.util.TimerTask;

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

	public Button[] click_btn = new Button[25];
	int random[] = new int[25];
	int after[] = new int[25];
	int index1[] = new int[25];
	Random rand = new Random();
	Random rand1 = new Random();
	int flag = 1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		start_btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				setNumber();
				count = 1;
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
					Timer timer = new Timer();
					TimerTask task = new TimerTask() {
						int sec = 0;

						@Override
						public void run() {
							// TODO Auto-generated method stub
							try {
								sec++;
//						System.out.println(String.valueOf(sec));
//						String second = String.valueOf(sec);
								text_time.setText(String.valueOf(sec));
//						System.out.println(String.valueOf(sec));
							} catch (Exception e) {
								e.printStackTrace();
							}
						}

					};
					timer.schedule(task, 1000, 1000);
				}
			}
		});
	}

	public void onClick(ActionEvent event) {
		if (count == Integer.parseInt(((Button) event.getSource()).getText())) {

			String id = ((Button) event.getSource()).getId();
			int index = Integer.parseInt(id.substring(4));
//			if (flag == 1) {
//				for (int i = 0; i < 25; i++) {
//
//					after[i] = rand.nextInt(25) + 26;
//					for (int j = 0; j < i; j++) {
//						if (after[i] == (after[j])) {
//							i--;
//							break;
//						}
//					}
//
////					click_btn[index - 1].setText(String.valueOf(after[i]));
//				}
//			}
			if (count < 26) {
				click_btn[index - 1].setText(String.valueOf(after[count - 1]));
			} else {
				click_btn[index - 1].setVisible(false);
			}
			for (int i = 0; i < 25; i++) {
				System.out.print(after[i] + " ");
			}
			System.out.println();
			count++;
			flag = 2;

		} else {
			System.out.println("´Ù½Ã °í¸£¼À" + String.valueOf(count));
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

		for (int i = 0; i < 25; i++) {
			System.out.print(random[i] + " ");
		}
		System.out.println();
	}
}
