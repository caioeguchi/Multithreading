package com.caionilson.core.tema04;

import java.util.Random;

class A implements Runnable
{
	public void run()
	{
		Random ran = new Random();
		while (true)
		{
			int numero = ran.nextInt(100);
			if (numero%2==0)
			{
				System.out.println("Par "+numero);
				try {Thread.sleep(100);} catch (Exception e) {}
			}
		}
	}
}