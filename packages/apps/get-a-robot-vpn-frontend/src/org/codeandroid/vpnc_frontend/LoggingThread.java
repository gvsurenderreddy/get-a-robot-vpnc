package org.codeandroid.vpnc_frontend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LoggingThread extends Thread
{

	private BufferedReader bufferedReader;
	private PrintWriter logWriter;
	private String prefix;
	private boolean quit = false;
	private int priority;

	public LoggingThread(InputStream inputStream, PrintWriter logWriter, String prefix, int priority)
	{
		this.prefix = prefix;
		this.logWriter = logWriter;
		bufferedReader = new BufferedReader( new InputStreamReader( inputStream ) );
		this.priority = priority;
	}

	@Override
	public void run()
	{
		try
		{
			for( String line = bufferedReader.readLine(); line != null && !quit; line = bufferedReader.readLine() )
			{
				Util.printLog( priority, prefix + line );
				if( logWriter != null )
				{
					logWriter.println( prefix + line );
				}
			}
		}
		catch( IOException e )
		{
			Util.error( prefix + e.getMessage(), e );
		}
		finally
		{
			logWriter.flush();
			logWriter.close();
		}
	}

	public void quit()
	{
		quit = true;
	}

}
