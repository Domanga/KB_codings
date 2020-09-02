package application;

public class DTO {
	class Car {
		private String model;
		private String number;
		private String floor;
		private String color;
		private String time;

		public Car(String model, String number, String floor, String color, String time) {
			this.model = model;
			this.number = number;
			this.floor = floor;
			this.color = color;
			this.time = time;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getFloor() {
			return floor;
		}

		public void setFloor(String floor) {
			this.floor = floor;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}
	}
}
