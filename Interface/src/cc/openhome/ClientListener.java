package cc.openhome;

public interface ClientListener {
	public abstract void clientAdded(ClientEvent event); //�s�WClient�|�I�s�o�Ӥ�k
	public abstract void clientRemoved(ClientEvent event); //����Client�|�I�s�o�Ӥ�k
}
