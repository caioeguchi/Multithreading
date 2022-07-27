package com.caionilson.core.tema04;

import java.util.Random;

class B implements Runnable
{	
	public void run()
	{
		Random ran = new Random();
		while (true)
		{
			int numero = ran.nextInt(100);
			if (numero%2==1) 
			{
				System.out.println("Ímpar "+numero);
				try {Thread.sleep(501);} catch (Exception e) {}	
			}
		}
	}
}