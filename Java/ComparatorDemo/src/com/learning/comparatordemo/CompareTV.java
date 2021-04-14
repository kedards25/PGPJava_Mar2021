package com.learning.comparatordemo;

import java.util.Comparator;

public class CompareTV implements Comparator<HDTV> {

	@Override
	public int compare(HDTV tv1, HDTV tv2) {
		if(tv1.size>tv2.size)
		{
			return 1;
		}
		else
		{
			if(tv1.size<tv2.size)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}

		//comparing String values
//		return (tv1.getBrand()).compareTo(tv2.getBrand());
	}

}
