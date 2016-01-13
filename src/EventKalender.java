import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {
	
	private ArrayList<Event> events = new ArrayList<Event>();
	
	public void add(Event e) {
		events.add(e);
	}
	
	public Event getByTitle(String title) {
		for (Event e:events) {
			if (e.getTitle().equals(title)) {
				return e;
			}
		}
		return null;
	}
	
	public ArrayList<Event> getByOrt(String ort) {
		ArrayList<Event>ev = new ArrayList<Event>();
		for (Event e:events) {
			if (e.getOrt().equals(ort)) {
				ev.add(e);
			}
		}
		return ev;
	}
	
	public ArrayList<Event> getByEintrittsPreis(double min, double max) {
		ArrayList<Event>ev = new ArrayList<Event>();
		for (Event e:events) {
			if (e.getEintritspreis() <= max && e.getEintritspreis() >= min) {
				ev.add(e);
			}
		}
		return ev;
	}
	
	public Event getMostExpensiveByOrt(String ort) {
		Event ev = null;
		double preis = 0;
			for(Event e:events) {
				if(e.getEintritspreis() > preis && e.getOrt().equals(ort)) {
					preis = e.getEintritspreis();
					ev = e;
				}
				
			}
			return ev;		
	}
	
	public double getAvgPreisByOrt(String ort) {
		double preis = 0.0;
		int counter = 0;
			for(Event e:events) {
				if(e.getOrt().equals(ort)) {
					preis += e.getEintritspreis();
					counter++;
				}
				
			}
			return preis/counter;	
	}
	
	public HashMap<String, Integer>getCountByOrt(){
		HashMap<String, Integer> map = new HashMap<>();
		for (Event e : events) {
			Integer value = map.get(e.getOrt());
			if(value != null) {
				map.put(e.getOrt(), value+1);
			}
			else {
				map.put(e.getOrt(), 1);
			}
		}
		return map;
	}
	
}
