package cc.openhome;

public interface ClientListener {
	public abstract void clientAdded(ClientEvent event); //新增Client會呼叫這個方法
	public abstract void clientRemoved(ClientEvent event); //移除Client會呼叫這個方法
}
