package com.revature.eval.java.core;

import java.time.temporal.Temporal;
import java.util.List;
import java.util.Map;

public class TestExecute {

	public static void main(String[] args) {
		
		EvaluationService test = new EvaluationService();
		
		//System.out.println(test.reverse("esample"));
		System.out.println(test.acronym("secret agent girl."));
	}

}
