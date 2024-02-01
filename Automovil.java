import javax.swing.JOptionPane;

public class Automovil {
	// Atributos
		
		String marca;
		int modelo;
		String color;
		int km;
		int hp;
		
		
	// Constructor
		
		
		public Automovil(String marca, int modelo, String color, int km, int hp) {
			setMarca (marca);
			setModelo (modelo);
			setColor (color);
			setKm (km);
			setHp(hp);
		}
		
		//Metodos Set
		private void setMarca(String marca_s) {
			// TODO Auto-generated method stub
			this.marca=marca_s;
		}
		
		private void setModelo(int modelo_s) {
			// TODO Auto-generated method stub
			this.modelo=modelo_s;
		}

		private void setColor(String color_s) {
			// TODO Auto-generated method stub
			this.color=color_s;
		}
		private void setKm(int km_s) {
			// TODO Auto-generated method stub
			this.km=km_s;
		}

		private void setHp(int hp_s) {
			// TODO Auto-generated method stub
			this.hp=hp_s;
		}

		
		
		//Metodos Propios
		
		public void apagar() {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null,"Apagandose tu automovil "+ marca  );
		
			return;
		}
		
		public void arrancar(String marca) {
			// TODO Auto-generated method stub
			
			JOptionPane.showMessageDialog(null,"RRRRRRRRRRruuuuuuuuuuuun Esta encendido tu automovil "+ marca  );
			return;
		}
		
		
		
		public void datosAuto (String marca_e, int modelo_e, int km_e){
		JOptionPane.showMessageDialog(null,"Tu automovil es MARCA: "+ marca_e +
                "MODELO: "+ String.valueOf(modelo_e) + 
                '\n'+ "KILOMETRAJE "+ String.valueOf(km_e));
		return;
		}
	
}
