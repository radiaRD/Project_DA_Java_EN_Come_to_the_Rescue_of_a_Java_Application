package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	private static int headCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;

	public static void main(String args[]) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader(new FileReader(
				"D:\\projetoc1\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt"));
		String line = reader.readLine();

		int i = 0;

		while (line != null) {
			i++;

			if (line.equals("headache")) {
				headCount++;

			} else if (line.equals("rash")) {
				rashCount++;
			} else if (line.equals("dialated pupils")) {
				pupilCount++;
			}

			line = reader.readLine(); // get another symptom
		}
		System.out.println("number of headaches: " + headCount);
		System.out.println("number of rash: " + rashCount);
		System.out.println("number of dialated pupils: " + pupilCount);

		// next generate output
		FileWriter writer = new FileWriter("result.out");
		writer.write("headache: " + headCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		reader.close();
		writer.close();
	}
}
