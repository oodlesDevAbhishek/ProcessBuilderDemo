package io.oodles.processBuilderDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class processBuilderDemo {

	public static void main(String[] args) {
		// creating the process(using List Constructor)
				ProcessBuilder processBuilder = new ProcessBuilder(System.getProperty("user.dir")+"/Resource/ffmpeg-batch-args.sh","http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4","/home/abhishek/Developer/stsWorkspace/processBuilderDemo/Resource/yb_output.mp4");
				
				try {
					Process process = processBuilder.start();

					StringBuilder output = new StringBuilder();

					BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

					String line;
					while ((line = reader.readLine()) != null) {
						output.append(line + "\n");
					}

					int exitVal = process.waitFor();
					
					if (exitVal == 0) {
						System.out.println("Success!");
						System.out.println(output);
						System.exit(0);
					} else {
						System.out.println("abnormal...! pls check !");
					}

				} catch (IOException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

	}

}
