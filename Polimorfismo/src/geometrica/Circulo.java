package geometrica;

public class Circulo extends FormaGeometrica {
		private double raio;

		public Circulo( String nome, double raio) {
			super(nome);
			this.raio = raio;
		}

		public Circulo() {
			super();

		}

		public double getRaio() {
			return raio;
		}

		public void setRaio(double raio) {
			this.raio = raio;
		}

		@Override
		public double calcularArea() {
			return (Math.sqrt(raio) * Math.PI);

		}

		@Override
		public double calcularPerimetro() {
			return (raio * 2 * Math.PI);

}
}

	