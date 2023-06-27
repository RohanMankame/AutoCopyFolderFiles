package com.Rohan.AutoCopyFolderFiles;

import com.Rohan.AutoCopyFolderFiles.controller.Transfer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class AutoCopyFolderFilesApplication {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		Timer myTimer = new Timer ();
		TimerTask myTask = new TimerTask () {
			@Override
			public void run () {
				Start(); // Starts to execute program
			}
		};
		myTimer.scheduleAtFixedRate(myTask , 0l, 10 * (60*1000)); // Runs every 10 mins
	}

	public static void Start()
	{
		String orignalLocation = "C:\\Users\\Rohan_nu3d8wo\\OneDrive\\Desktop\\SorcTestFolder"; // SET SOURCE FOLDER PATH HERE
		String destinationLocation = "C:\\Users\\Rohan_nu3d8wo\\OneDrive\\Desktop\\DestTestFolder"; //SET DESTINATION FOLDER PATH HERE

		Transfer transFile = new Transfer();

		transFile.getFiles(orignalLocation , destinationLocation);

		System.out.println("Done Program, will restart in 5 minutes");
		//SpringApplication.run(AutoCopyFolderFilesApplication.class, args);

	}

}
