package pagesTricentis;

import elementos.Elementos;

public class Insurance {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	public void dadosVeiculo( String make, String model, String cylinder, String engine, String manufacture, String numberSeats, String numberSea, String fuel, String payload, String weight, String price, String mileage ) {
		metodos.escrever(el.getElementoMake(), make);
		metodos.escrever(el.getElementoModel(), model);
		metodos.escrever(el.getElementoCylinder(), cylinder);
		metodos.escrever(el.getEnginePerformance(), engine);
		metodos.escrever(el.getDateofManufacture(), manufacture);
		metodos.escrever(el.getNumberofSeats(), numberSeats);
		metodos.escrever(el.getNumberofSea(), numberSea);
		metodos.escrever(el.getFuelType(), fuel);
		metodos.escrever(el.getPayLoad(), payload);
		metodos.escrever(el.getTotalWeight(), weight);
		metodos.escrever(el.getListPrice(), price);		
		metodos.escrever(el.getAnnualMileage(), mileage);
		metodos.screenShot("dados do veiculo");
		metodos.clicar(el.getBtnEnviar());
	
	}
	public void dadosSeguro(String first, String name, String birth, String country, String zipCode, String occupation) {
		metodos.escrever(el.getFirstName(), first);
		metodos.escrever(el.getLastName(), name);
		metodos.escrever(el.getDateofBirth(), birth);
		metodos.escrever(el.getCountry(), country);
		metodos.escrever(el.getZipCode(), zipCode);
		metodos.escrever(el.getOccupation(), occupation);
		metodos.clicar(el.getHobbies());
		metodos.screenShot("dados do seguro");
		metodos.clicar(el.getBtnNext());
	}
	
	public void dadosProduto(String startDate, String somaSeguro, String meritRating, String damageInsurance, String CourtesyCar) {
		metodos.escrever(el.getStartDate(), startDate);
		metodos.escrever(el.getInsuranceSum(), somaSeguro);
		metodos.escrever(el.getMeritRating(), meritRating);
		metodos.escrever(el.getDamageInsurance(), damageInsurance);
		metodos.clicar(el.getOptionalProducts());
		metodos.escrever(el.getCourtesyCar(), CourtesyCar);
		metodos.screenShot("dados do produto");
		metodos.clicar(el.getBtnProdutc());
	}
	
	public void dadosPreco() {
		metodos.clicar(el.getPrice());
		metodos.screenShot("dados do Preço");
		metodos.clicar(el.getBtnPrice());
	}
	
    public void enviarCotacao(String email, String userName, String Password, String confirmPassword, String Comments) {
    	metodos.escrever(el.getEmail(), email);
    	metodos.escrever(el.getUserName(), userName);
    	metodos.escrever(el.getPassword(), Password);
    	metodos.escrever(el.getConfirmPassword(), confirmPassword);
    	metodos.escrever(el.getComments(), Comments);
    	metodos.screenShot("Enviar cotação");
    	metodos.clicar(el.getSend());    	
    	metodos.pausa(10000);
    	
    }
    
    public void validarEnvio() {
    	
    	metodos.screenShot("Mensagem enviada com sucesso");
    	metodos.validarTexto(el.getSendEmail(), "Sending email success!" );
}
}