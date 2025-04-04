package com.company.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor(force=true)    // final이 붙어있어서 오류  (force=true) 강제로 만드는거라 오류날수있음
@RequiredArgsConstructor   // final이 붙어야 함  TestDto(String)  default 생성자가 깨짐
public class TestDto {
	private final String company;
	private int year;
}