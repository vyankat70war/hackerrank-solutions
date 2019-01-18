package com.vss.hackerrank.solutions.kangaroo;

import java.io.IOException;

public class Kangaroojump {

	// Complete the kangaroo function below.
	static String kangaroo(int x1, int v1, int x2, int v2) {
		String res = "NO";
		if(v1 == v2 || v2 > v1) {
			return res;
		}
		if (x2 > x1 && v2 > v1) {
			res = "NO";
		} else if (x1 > x2 && v1 > v2) {
			res = "NO";
		}else {
			int d1 = x1 + v1;
			int d2 = x2 + v2;
			while (true) {
				
				if (d1 == d2) {
					res = "YES";
					break;
				}else if((d1 > d2 && v1 > v2) || (d2 > d1 && v2 > v1)) {
					res = "NO";
					break;
				}
				d1 += v1;
				d2 += v2;
			}
		}
		return res;

	}
	


	public static void main(String[] args) throws IOException {
		System.out.println(kangaroo(0, 3, 4, 2));
	}
}
