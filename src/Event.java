
public class Event {
	
	private String title;
	private String ort;
	private double eintritspreis;
	
	public Event(String title, String ort, double eintritspreis) {
		super();
		this.title = title;
		this.ort = ort;
		this.eintritspreis = eintritspreis;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public double getEintritspreis() {
		return eintritspreis;
	}
	public void setEintritspreis(double eintritspreis) {
		this.eintritspreis = eintritspreis;
	}
	@Override
	public String toString() {
		return "Event [title=" + title + ", ort=" + ort + ", eintritspreis=" + eintritspreis + "]";
	}

}
