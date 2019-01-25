package cc.openhome;

public interface CashCardDAO {
	public abstract void save(CashCard cashCard);
	public abstract CashCard load(String number);
}
