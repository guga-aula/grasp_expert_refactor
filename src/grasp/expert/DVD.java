package grasp.expert;

public class DVD {

	private String t�tulo;
    private Tipo c�digoDePre�o;

    public DVD(String t�tulo, Tipo c�digoDePre�o) {
        this.t�tulo = t�tulo;
        this.c�digoDePre�o = c�digoDePre�o;
    }

    public String getT�tulo() {
        return t�tulo;
    }

    public Tipo getC�digoDePre�o() {
        return c�digoDePre�o;
    }

    public void setC�digoDePre�o(Tipo c�digoDePre�o) {
        this.c�digoDePre�o = c�digoDePre�o;
    }
	
	
	public enum Tipo {
	    normal, lancamento, infantil
	};
}


