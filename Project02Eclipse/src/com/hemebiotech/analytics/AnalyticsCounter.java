package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AnalyticsCounter {

	public static void main(String args[]) throws FileNotFoundException, IOException {

		String filepath = "D:\\projetoc1\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt";

		ReadSymptomDataFromFile file = new ReadSymptomDataFromFile(filepath);

		// System.out.println(file.GetSymptoms());

		SymptomAnalyse hm = new SymptomAnalyse(file.GetSymptoms());

		hm.occurencesSortedSymptoms();

		for (int i = 0; i < hm.occurencesSortedSymptoms().size(); i++) {

			System.out.println(hm.occurencesSortedSymptoms().keySet().toArray()[i] + " = "
					+ hm.occurencesSortedSymptoms().values().toArray()[i]);

		}

		SymptomAnalyse result = new SymptomAnalyse(hm.occurencesSortedSymptoms());
		result.writeSymptoms();

	}
}
