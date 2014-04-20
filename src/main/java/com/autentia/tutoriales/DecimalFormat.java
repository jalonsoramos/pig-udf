package com.autentia.tutoriales;

import java.io.IOException;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

public class DecimalFormat extends EvalFunc<String> {

	public String exec(Tuple input) throws IOException {
		if (null == input || input.size() != 1) {
			return null;
		}

		final Double number = (Double) input.get(0);

		try {
			return new java.text.DecimalFormat("#.##").format(input.get(0));
		} catch (Exception e) {
			return String.valueOf(number);
		}
	}
}