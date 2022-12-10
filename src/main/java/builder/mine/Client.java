package builder.mine;


import builder.mine.Car.CarBuilder;

public class Client {

	public static void main(String[] args) {

		Car car = new CarBuilder("3-12", new Motor())
				.setOnSale(true)
				.setColor(new Color("Blue"))
				.setCharachteristics("Convertible")
				.buildCar();

		System.out.println(car);




		//Example in java lib

		StringBuilder sb = new StringBuilder()
				.append(3)
				.append(11)
				.append(1001L)
				.append("c")
				.append("ss");
		System.out.println(sb.toString());


	}






}
