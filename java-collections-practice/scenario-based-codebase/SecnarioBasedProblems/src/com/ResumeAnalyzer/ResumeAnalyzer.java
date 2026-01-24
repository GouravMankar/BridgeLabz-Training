package com.ResumeAnalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResumeAnalyzer {
	public static void main(String[] args) {
		File folder = new File(
				"C:/Users/goura/Desktop/java programming workspace/java-collections-practice/scenario-based-codebase/SecnarioBasedProblems/src/com/ResumeAnalyzer/resumes");
		File[] files = folder.listFiles();
		HashMap<String, ResumeData> map = new HashMap<String, ResumeData>();
		String regexEmailString = "[A-Za-z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
		String regexNumber = "(\\+91[-]?)?[6-9]\\d{9}";
		Pattern pattern;
		Matcher matcher;
		for (File file : files) {
			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				String line;
				ResumeData rd = new ResumeData();
				while ((line = br.readLine()) != null) {
					pattern = Pattern.compile(regexEmailString);
					matcher = pattern.matcher(line);
					if (matcher.find()) {
						rd.setEmail(matcher.group());
					}
					pattern = Pattern.compile(regexNumber);
					matcher = pattern.matcher(line);
					if (matcher.find()) {
						rd.setPhoneNumber(matcher.group());
					}

				}
				if (rd.getEmail() != null) {
					map.put(rd.getEmail(), rd);
				}
			} catch (Exception e) {
				System.out.println("unKnown Exception Occured ..!!");
			}

		}

		for (ResumeData rData : map.values()) {
			System.out.println(rData);
		}

	}
}
