package builder.mine;

public class Car {

	/** mandatory fields **/
	private Color Color;
	private String model;
	private Motor motor;
	/** optional fields **/
	private Boolean onSale;
	private String charachteristics;





	private Car(CarBuilder carBuilder) {
		this.Color = carBuilder.color;
		this.model = carBuilder.model;
		this.motor = carBuilder.motor;
		this.onSale = carBuilder.onSale;
		this.charachteristics = carBuilder.charachteristics;

	}


	public static class CarBuilder{

		private Color color;
		private String model;
		private Motor motor;
		private Boolean onSale;
		private String charachteristics;

		public CarBuilder setCharachteristics(String caracteristicas){
			this.charachteristics = caracteristicas;
			return this;
		}

		public CarBuilder(String model, Motor motor) {
			this.model = model;
			this.motor = motor;
		}

		public CarBuilder setColor(builder.mine.Color color) {
			this.color = color;
			return this;
		}

		public CarBuilder setOnSale(Boolean onSale){
			this.onSale = onSale;
			return this;
		}


		public Car buildCar(){
			return new Car(this);
		}

	}


	@Override
	public String toString() {
		return "Car{" +
				"Color=" + Color +
				", model='" + model + '\'' +
				", motor=" + motor +
				", onSale=" + onSale +
				", charachteristics='" + charachteristics + '\'' +
				'}';
	}
}
