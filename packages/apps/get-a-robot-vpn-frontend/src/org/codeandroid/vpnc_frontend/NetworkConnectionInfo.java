package org.codeandroid.vpnc_frontend;

public class NetworkConnectionInfo
{

	private int id;
	private String networkName;
	private String ipSecGateway;
	private String ipSecId;
	private String ipSecSecret;
	private String xauth;
	private String password;
	private boolean numericToken;
	private int timeout;
	private long lastConnect;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getNetworkName()
	{
		return networkName;
	}

	public void setNetworkName(String networkName)
	{
		this.networkName = networkName;
	}

	public String getIpSecGateway()
	{
		return ipSecGateway;
	}

	public void setIpSecGateway(String ipSecGateway)
	{
		this.ipSecGateway = ipSecGateway;
	}

	public String getIpSecId()
	{
		return ipSecId;
	}

	public void setIpSecId(String ipSecId)
	{
		this.ipSecId = ipSecId;
	}

	public String getIpSecSecret()
	{
		return ipSecSecret;
	}

	public void setIpSecSecret(String ipSecSecret)
	{
		this.ipSecSecret = ipSecSecret;
	}

	public String getXauth()
	{
		return xauth;
	}

	public void setXauth(String xauth)
	{
		this.xauth = xauth;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public long getLastConnect()
	{
		return lastConnect;
	}

	public void setLastConnect(long lastConnect)
	{
		this.lastConnect = lastConnect;
	}

	public boolean isNumericToken()
	{
		return numericToken;
	}

	public void setNumericToken(boolean numericToken)
	{
		this.numericToken = numericToken;
	}

	public int getTimeout()
	{
		return timeout;
	}
	
	public void setTimeout(int timeout)
	{
		this.timeout = timeout;
	}
}
