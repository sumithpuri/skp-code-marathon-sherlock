package me.sumithpuri.github.sherlock.biz.cep.app;

import java.util.Scanner;

import me.sumithpuri.github.sherlock.biz.vo.SherlockEvent;
import me.sumithpuri.github.sherlock.data.loader.SherlockDataLoaderThread;


/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri

 * GitHub URL 			https://github.com/sumithpuri
 * Blog Post URL		http://www.techilashots.com/2015/09/introduction-to-complex-event.html
 * Blog Short URL		https://goo.gl/ebAzZr
 * Package Prefix 		me.sumithpuri.github.sherlock
 * Project Codename		sherlock
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

/*
 * This is the demoable version of the Data  Loader to  continuously pump events into the core Sherlock! application. We 
 * demonstrate Sherlock!  Complex  Event Processing by using this data  loader. It  has  some  intelligence  in  that it 
 * creates data that is truly random but meets criteria so that we can  demo the use-cases  within  the  stipulated demo 
 * time of the hackathon.
 *    
 * Takes a Configurable Constant  for Number of Threads that can be Spawned. Spawns threads, Generates  Intelligent Data 
 * for Every Thread at  the Rate of 1 - 20 Java Objects Per Second. The Resulting Java Objects will be sent to Messaging 
 * Services
 */
public class Sherlock {

	/**
	 */
	public static void main(String[] args) {

		// SherlockEvent DataM1 = new SherlockEvent();
		System.out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		System.out.println();
		System.out.println("Project Codename      Sherlock");
		System.out.println("Project Description   Drools Fusion (Complex Event Processing) Demo Code");
		System.out.println("Technical Blog        http://www.techilashots.com");
		System.out.println("Technical Blog Post   https://goo.gl/hizRKA");
		System.out.println("[Developer Notes]     [01] Use Java Version 9.0+ Compiler");
		System.out.println();
		
		// System.out.println("\n Enter the usecase you want to try!!");
		// System.out.println("*****MENU*****\n" +
		// "1.Random Data Pumping \n" +
		// "2.Port & IP Scan-Usecase 1 \n " +
		// "3.Repeated Login -Usecase 2 \n" +
		// "4.Usecase 3 \n");
		// int usecase=sc.nextInt();
		//
		// [3] Applications or Devices or Appliances are continuously pumping  their Log or Security Data into Sherlock! 
		// for Analysis.
		
		// int Sherlock_NumOfThreads = 3;

		// We Planned to use Multi-Threading here - But since the Messaging remains Unused, So Does this Feature!
		
		// SherlockDataLoaderThread[] threadsOfData =
		// new SherlockDataLoaderThread[Sherlock_NumOfThreads];

		// for (int i = 0; i < threadsOfData.length; i++) {
		// threadsOfData[i] = new SherlockDataLoaderThread(i+1);
		// threadsOfData[i].start();
		// }
		
		// in a real-world production environment, the rules engine will be constantly running
		// either standalone or in enteprise mode - data loader will mostly be run as a multi-
		// threaded application - we have modeled this demo in the same way,  but note that we
		// are not starting a thread below - for demo, we invoke run() directly to load data
		SherlockDataLoaderThread dataLoader = new SherlockDataLoaderThread();
		dataLoader.run();
	}
}
