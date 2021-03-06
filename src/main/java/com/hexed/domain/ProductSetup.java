package com.hexed.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hexed.model.Product;

public class ProductSetup {

	public static Map<String, List<Integer>> getSortedPackList(List<Product> lstProducts) {
		Map<String, List<Integer>> output = null;
		if (lstProducts != null && lstProducts.size() > 0) {
			output = new HashMap<String, List<Integer>>();
			List<Integer> packs = new ArrayList<Integer>();
			String productCode = "";
			for (Product product : lstProducts) {
				packs.add(product.getQuantity());
				productCode = product.getCode();
			}
			Collections.sort(packs);
			output.put(productCode, packs);
		}
		return output;
	}

	public static Map<Integer, Float> getPackPrice(List<Product> lstProducts) {
		Map<Integer, Float> mapPack = null;
		if (lstProducts != null && lstProducts.size() > 0) {
			if (lstProducts != null && lstProducts.size() > 0) {

				mapPack = new HashMap<Integer, Float>();

				for (Product product : lstProducts) {

					mapPack.put(product.getQuantity(), product.getPrice());
				}
			}
		}
		return mapPack;
	}

}
