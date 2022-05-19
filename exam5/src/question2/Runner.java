package question2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.util.ArrayList;
import java.util.List;



public class Runner {

	public static void main(String[] args) {
		
		File file = new File("myFiles/myFile.json");
		
		try (FileReader fileReader1 = new FileReader(file);
				FileReader fileReader2 = new FileReader(file)) {
			JsonReader jsonReader = new JsonReader(fileReader1);
			Gson gson = new Gson();
			
			House[] houses = gson.fromJson(jsonReader, House[].class);
			
			for(House house : houses) {
				System.out.println(house);
			}
			
			jsonReader = new JsonReader(fileReader2);
			Type housesListType = new TypeToken<ArrayList<House>>(){}.getType();
			List<House> housesList = gson.fromJson(jsonReader,housesListType);
			housesList.forEach(System.out::println);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

	}

}
