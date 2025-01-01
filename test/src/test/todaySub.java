package test;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class todaySub {

	String sub;

	public void todaySubject() {

		String[] subjectarr = { "java Application 개발을 위한 프로그래밍 기초", "java Application 개발 실무 프로젝트",
				"Web Application 개발을 위한 풀스택 개발 기술", "Web Application 개발 실무 프로젝트", "실무프로젝트를 위한 클라우드 서비스 기술",
				"AWS기반 데이터 활용 실무 프로젝트" };
		String[] subchgday = { "2025년 01월 22일", "2025년 02월 11일", "2025년 03월 26일", "2025년 04월 23일", "2025년 06월 9일",
				"2025년 7월 7일" };

		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("y년 M월 d일");

		LocalDate today = LocalDate.now();

		int j = 0;
		for (String i : subchgday) {
			LocalDate d_date = LocalDate.parse(i, dateformat);
			long differenceDays = ChronoUnit.DAYS.between(today, d_date);
			if (differenceDays >= 0) {
				break;
			}
			j++;
		}

		String today2 = today.format(dateformat);

		System.out.println(today2 + " " + subjectarr[j]);
	}
}
