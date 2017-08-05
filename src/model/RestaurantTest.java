package model;

import static org.junit.Assert.*;

import org.json.JSONArray;
import org.junit.Test;

public class RestaurantTest {
	Restaurant restaurant;

	@Test
	public void testJsonArrayToString() {
		JSONArray jsonArray = new JSONArray();
		jsonArray.put("Chinese");
		jsonArray.put("Japanese");
		jsonArray.put("Italian");
		assertEquals("Chinese,Japanese,Italian", 
			Restaurant.jsonArrayToString(jsonArray));
	}
}
